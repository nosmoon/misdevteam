var ZTransferXObjectElement = document.createElement('<OBJECT width = "0" height = "0" ID="ZTransferX" CLASSID="CLSID:C7C7225A-9476-47AC-B0B0-FF3B79D55E67" codebase="http://127.0.0.1/CustomNameSpace/ZTransferX.cab#version=2,1,0,3"></OBJECT>');
var ZTransferXParamElement1 = document.createElement('<PARAM NAME="download.Server" VALUE="http://127.0.0.1/CustomNameSpace/">');
var ZTransferXParamElement2 = document.createElement('<PARAM NAME="download.Port" VALUE="80">');
var ZTransferXParamElement3 = document.createElement('<PARAM NAME="download.Instruction" VALUE="ozrviewer.idf">');
var ZTransferXParamElement4 = document.createElement('<PARAM NAME="install.Base" VALUE="<PROGRAMS>/Forcs">');
var ZTransferXParamElement5 = document.createElement('<PARAM NAME="install.Namespace" VALUE="CustomNameSpace">');

ZTransferXObjectElement.appendChild(ZTransferXParamElement1);
ZTransferXObjectElement.appendChild(ZTransferXParamElement2);
ZTransferXObjectElement.appendChild(ZTransferXParamElement3);
ZTransferXObjectElement.appendChild(ZTransferXParamElement4);
ZTransferXObjectElement.appendChild(ZTransferXParamElement5);


OZEmbedControlLocation.appendChild(ZTransferXObjectElement);
