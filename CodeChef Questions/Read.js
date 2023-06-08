

str = "This is string";

//.txt

const fs = require('fs');

fs.writeFile('a.txt', str, () =>
{
    console.log('file written');
})