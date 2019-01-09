function TFMenuWrite(divID, id, src, width, height)
{					
	var myObjectElement = document.createElement('<OBJECT ID="' + id + '" WIDTH="' + width +'" HEIGHT="' + height + '" CLASSID="CLSID:3A39A58E-3AAE-4EB5-A9C7-7F140FA2052A"></object>');
	var myParamElement1 = document.createElement('<PARAM NAME="_Version" VALUE="65536">');  
	var myParamElement2 = document.createElement('<PARAM NAME="_ExtentX" VALUE="2646">'); 
	var myParamElement3 = document.createElement('<PARAM NAME="_ExtentY" VALUE="1323">');
	var myParamElement4 = document.createElement('<PARAM NAME="_StockProps" VALUE="0">');	
	var myParamElement5 = document.createElement('<PARAM NAME="MenuItem" VALUE="' + src + '"/>');
	var myParamElement6 = document.createElement('<PARAM NAME="SizeX" VALUE="100">');
	var myParamElement7 = document.createElement('<PARAM NAME="SizeY" VALUE="100">');
	
	myObjectElement.appendChild(myParamElement1);
	myObjectElement.appendChild(myParamElement2);
	myObjectElement.appendChild(myParamElement3);
	myObjectElement.appendChild(myParamElement4);
	myObjectElement.appendChild(myParamElement5);
	myObjectElement.appendChild(myParamElement6);
	myObjectElement.appendChild(myParamElement7);

	divID.appendChild(myObjectElement);
}

function TFViewerWrite(divID, id, src , width, height, domainName)
{
	var myObjectElement = document.createElement('<OBJECT ID="' + id + '" CLASSID="CLSID:4DA55DF4-4825-44CF-9790-4D29E8F02AC7" WIDTH="'+width+'" HEIGHT="'+height+'"></OBJECT>');
	var myParamElement1 = document.createElement('<PARAM NAME="controlName" VALUE= "' + id + '"/>');  
	var myParamElement2 = document.createElement('<PARAM NAME="src" VALUE="' + src + '"/>');
	var myParamElement3 = document.createElement('<PARAM NAME="domainName" VALUE="' + domainName + '"/>');

	myObjectElement.appendChild(myParamElement1);
	myObjectElement.appendChild(myParamElement2);
	myObjectElement.appendChild(myParamElement3);

	divID.appendChild(myObjectElement);
}
