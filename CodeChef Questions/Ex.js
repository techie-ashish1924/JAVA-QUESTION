


function func(func2 = (a) =>
{




})





const express = require('express');

const app = express();


product = [];


app.get('/read', (req, res) =>
{
    res.render('read', { product });
})


app.get('/delete/:id', (req, res) =>
{
    const { id } = req.params;

})

app.get('/update/:id', (req, res) =>
{
    const { name, price } = req.body;
    
})






app.listen(3000, () =>
{
    console.log('Server is runnint at 3000');
})







console.log(a);
// console.log(b);
// console.log(c);



// let c = 30;
var a = 10;
// const b = 20;

const userLogin = true;







const person = new Promise((res, rej) =>
{
    if (userLogin)
    {
        // if(userLogin)
        // console.log('Promise Resolve');
        res('');
    }
    
})


person.then((res) =>
{


})
    .catch((rej) =>
    {
        console.log('');
        
})


