document.addEventListener("keydown", function (e) {
    let key = e.key.toLowerCase();
    if (e.ctrlKey && (key === "v" || key==="c")) {
        e.preventDefault();
        alert("Copy and Paste Not Allowed.");
    }
});

document.addEventListener("copy", function(e){
    e.preventDefault();
    alert("Copy Not Allowed in this Page");
});

document.addEventListener("paste", function(e){
    e.preventDefault();
    alert("Paste is Not Allowed in this Page");
});
