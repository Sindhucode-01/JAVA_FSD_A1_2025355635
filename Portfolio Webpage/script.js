// ================= CURRENT YEAR =================

const year = document.getElementById("year");

year.textContent = new Date().getFullYear();


// ================= NAVBAR SCROLL EFFECT =================

const header = document.querySelector("header");

window.addEventListener("scroll", function () {

    if (window.scrollY > 50) {
        header.style.backgroundColor = "#070b14";
    } 
    else {
        header.style.backgroundColor = "#111827";
    }

});


// ================= PROJECT CARD CLICK EFFECT =================

const projectCards = document.querySelectorAll(".project-card");

projectCards.forEach(function (card) {

    card.addEventListener("mouseenter", function () {
        card.style.transform = "translateY(-8px)";
    });

    card.addEventListener("mouseleave", function () {
        card.style.transform = "translateY(0)";
    });

});