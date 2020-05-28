const request = new XMLHttpRequest();

request.open('GET', window.location.href + '/movies');

request.onload = function () {
    if (request.status >= 200 && request.status < 400) {
        const data = JSON.parse(this.response);
        data.forEach((item) => {
            const element = document.createElement('div');
            element.textContent = item.name;

            document.getElementById('list-container').appendChild(element);
        });
    } else {
        console.log('api error');
    }
};

request.send();
