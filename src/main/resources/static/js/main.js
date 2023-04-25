
const loader = document.getElementById("loader");
const formNewMessage = document.getElementById('formNewMessage');
const formInputs = document.querySelectorAll('#newName, #newEmail, #newSubject, #newMessage')
const submitBtn = document.getElementById('submitBtn');

window.addEventListener("load", () => {
    loader.style.display = "none";
});

/* 
    Contact
*/

formNewMessage.addEventListener('submit', function (event) {
    event.preventDefault();


    if (!formNewMessage.checkValidity()) {
        formNewMessage.classList.add('was-validated');
    } else {
        submitBtn.value = 'Enviando...';
        const serviceID = 'default_service';
        const templateID = 'portfolio_form';

        emailjs.sendForm(serviceID, templateID, this)
            .then(() => {
                submitBtn.value = 'Enviar Mensaje!';
                clearInputs(formInputs);
                formNewMessage.classList.remove('was-validated');
                alert('Mensaje Enviado!');
            }, (err) => {
                submitBtn.value = 'Enviar Mensaje!';
                clearInputs(formInputs);
                formNewMessage.classList.remove('was-validated');
                alert(JSON.stringify(err));
            });
    }
});

function clearInputs(inputs) {
    inputs.forEach(input => {
        input.value = '';
    });
}