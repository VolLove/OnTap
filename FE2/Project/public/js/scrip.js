const slider = document.getElementById("slider");
for (var index = 1; index <= 20; index++) {
    var item = document.createElement("div");
    item.classList.add("item");
    item.innerHTML = index;
    slider.appendChild(item);
}
const content = document.querySelector(".container");
const wrapper = document.querySelector(".slider");

let posX = 0;

content.addEventListener("mousemove", function (event) {
    posX = event.clientX;
    let exactPosX = (100 / window.innerWidth) * posX;
    if (exactPosX > 75) {
        exactPosX = 75;
    }
    wrapper.style.transform = `translateX(-${exactPosX}%)`;
});
let items = document.querySelectorAll(".item");
items.forEach((element) => {
    element.addEventListener("click", function () {
        let box = document.getElementById("box");

        box.style.display = "block";
        document.getElementById("box-content").innerText = element.innerText;
    });
});
document.getElementById("btn-close").addEventListener("click", function () {
    document.getElementById("box").style.display = "none";
});
