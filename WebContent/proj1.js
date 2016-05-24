var timerid = 0;
var images = new Array(	"./images/img1.jpg","./images/img2.jpg","./images/img3.jpg","./images/img4.jpg");
var countimages = 0;
function startTime()
{
	if(timerid)
	{
		timerid = 0;
	}
	var tDate = new Date();

	if(countimages == images.length)
	{
		countimages = 0;
	}
	if(tDate.getSeconds() % 5 == 0)
	{
		document.getElementById("img1").src = images[countimages];
	}
	countimages++;

	timerid = setTimeout("startTime()", 1000);
}