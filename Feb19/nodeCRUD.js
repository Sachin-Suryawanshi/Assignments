var mysql = require('mysql8');
var express = require('express');
var app = express();
bodypareser = require('body-parser');

app.use(bodypareser.json());




var con = mysql.createConnection({ host: 'localhost', user: 'root', password: 'sachin', database: 'mydb' });

con.connect(function(err) {
    if (err) throw err;
    console.log("Connection established!!!!!!");
});
app.listen(8100, () => console.log("Express server is running at port number :8100"));


app.get('/getemployee', (request, response) => {
    con.query("select * from nodeemp", (err, result) => {
        if (!err)
            response.send(result);
        else
            console.log(err);
    })

});

app.get('/getemployee/:id', (request, response) => {
    con.query("select * from nodeemp where id=?", [request.params.id], (err, result) => {
        if (!err)
            response.send(result);
        else
            console.log(err);
    })

});

app.get('/deleteemployee/:id', (request, response) => {
    con.query("delete from nodeemp where id=?", [request.params.id], (err, result) => {
        if (!err)
            response.send("Deleted Successfully");
        else
            console.log(err);
    })

});


app.post('/insertEmployee', (request, response) => {
    let emp = request.body;
    con.query('insert into nodeemp set ?', emp, (err, result) => {
        if (!err)
            response.send("inserted Successfully");
        else
            console.log(err);
    })

});


app.post('/updateemployee', (request, response) => {
    const { id, name, salary } = request.body;
    con.query('update nodeemp set name=?, salary=? where id=?', [name, salary, id], (err, result) => {
        if (!err)
            response.send("Updated Successfully");
        else
            console.log(err);
    })

});