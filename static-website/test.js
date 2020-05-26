const addOhMyGodNode = () => {
    const body = document.getElementById('main');
    const ohMyGodElement = document.createElement('p');
    ohMyGodElement.textContent = 'Oh my God';
    body.appendChild(ohMyGodElement);
};
