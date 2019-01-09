<!--

var iCount	= 0;

function count(){
	++iCount;
}

function changeForm(sTitle) {
	var firstYear	= sTitle.substr(0,4).concat('Ò´ ');
	var firstMonth	= sTitle.substr(4,2).concat('êÅ ');
	var firstDay	= sTitle.substr(6,2).concat('ìíí® ~ ');

	var lastYear	= sTitle.substr(9,4).concat('Ò´ ');
	var lastMonth	= sTitle.substr(13,2).concat('êÅ ');
	var lastDay		= sTitle.substr(15,2).concat('ìíí® ');

	var artTitle	= firstYear+firstMonth+firstDay+lastYear+lastMonth+lastDay;
	document.write(artTitle);

	}

function printTrTd(){
	var i ;
	var sTrTd	='<tr><td align=center class=lee>&nbsp;</td></tr>';
	if(iCount==0){
		for(i=0;i<5;i++){
			document.write(sTrTd);
		}
	}else if(iCount==1){

		for(i=0;i<4;i++){
			document.write(sTrTd);
		}
	}else if(iCount==2){

		for(i=0;i<3;i++){
			document.write(sTrTd);
		}
	}else if(iCount==3){

		for(i=0;i<2;i++){
			document.write(sTrTd);
		}
	}else if(iCount==4){

			document.write(sTrTd);
	}
	iCount = 0;
}

//-->