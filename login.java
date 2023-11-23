function validateLogin() {
    var username = document.getElementById('Luck').value;
    var password = document.getElementById('0').value;

    // Check if the username and password are correct (replace this with your authentication logic)
    if (username === 'Luck' && password === '0') {
        // Redirect to the main page after successful login
        window.location.href = 'Calculator useing html, CSS.html';
    } else {
        document.getElementById('error-message').innerText = 'Invalid username or password';
    }
}
