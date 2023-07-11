// Pulse animation at menu click
const menuItem = document.querySelectorAll('.menu-item');
const card = document.querySelectorAll('.card');

menuItem.forEach((singleItem) => {
    singleItem.addEventListener('click', () => {
        var array = Array.prototype.slice.call(menuItem);

        card[array.indexOf(singleItem)].classList.add('pulse');
    
        setTimeout(() => {
            card[array.indexOf(singleItem)].classList.remove('pulse');
        }, 1001);
    });
});