//  The user have to enter a date with a prompt and the program show the weekday of that date
let date = window.prompt("Enter a date (mm/dd/yy):");
let day = new Date(date).getDay();

switch(day){
    case 0:
        alert("It's Sunday");
        break;
    case 1:
        alert("It's Monday");
        break;
    case 2:
        alert("It's Tuesday");
        break;
    case 3:
        alert("It's Wednesday");
        break;
    case 4:
        alert("It's Thursday");
        break;
    case 5: 
        alert("It's Friday");
        break;
    case 6: 
        alert("It's Saturday");
        break;
}
