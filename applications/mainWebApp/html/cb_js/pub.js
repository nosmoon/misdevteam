<!--

var iCount	= 0;

function count(){
	++iCount;
}

function changeForm(sTitle) {
	var firstYear	= sTitle.substr(0,4).concat('Ҵ ');
	var firstMonth	= sTitle.substr(4,2).concat('�� ');
	var firstDay	= sTitle.substr(6,2).concat('��� ~ ');

	var lastYear	= sTitle.substr(9,4).concat('Ҵ ');
	var lastMonth	= sTitle.substr(13,2).concat('�� ');
	var lastDay		= sTitle.substr(15,2).concat('��� ');

	var artTitle	= firstYear+firstMonth+firstDay+lastYear+lastMonth+lastDay;
	document.write(artTitle);

	}

function printTrTd(){
	var i ;
	var sTrTd	='<tr><td align=center class=lee>&nbsp;</td></tr>';

	for(i=0;i<(5-iCount);i++){
		document.write(sTrTd);
	}
	iCount = 0;
}

//-->