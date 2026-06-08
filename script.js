/**
 * 
 */

function validateForm() {
    let name = document.getElementById("name").value.trim();
    let email = document.getElementById("email").value.trim();

    if (name === "") {
        alert("Please enter your name");
        return false;
    }

    if (email === "") {
        alert("Please enter your email");
        return false;
    }

    alert("Registration Submitted Successfully!");
    return false;
}