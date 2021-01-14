
let id =document.getElementsByClassName('greeting-id').content;

fetch("http://localhost:8080/greeting")
    .then(response => response.json())
    .then(data => {
        console.log(data);
        console.log(data.id);
        console.log(data.content);
        let id = document.getElementsByClassName('greeting-id');
        id[0].innerHTML += data.id;
        let content = document.getElementsByClassName('greeting-content');
        content[0].innerHTML += data.content;
    });