//Boolean ���ڿ�
var BOOLEAN_TRUE			=	"true";
var	BOOLEAN_FALSE			=	"false";
//��Ÿ�� ���ڿ�
var STYLE_TEXT_ALIGN		=	"text-align";
var STYLE_VERTICAL_ALIGN	=	"vertical-align";
var STYLE_FORMAT			=	"format";
var STYLE_MAXLENGTH			=	"maxlength";
//��Ÿ�� ���� ��ġ
var STYLE_SEQ_FORMAT		=	0;
var STYLE_SEQ_ALIGN			=	1;
var STYLE_SEQ_VALIGN		=	2;
//���� ���� ��� ���ڿ�
var ALIGN_RIGHT				=	"right";
var ALIGN_LEFT				=	"left";
var ALIGN_CENTER			=	"center";
var ALIGN_JUSTIFY			=	"justify";
//���� ���� ��� ���ڿ�
var VALIGN_TOP				=	"top";
var VALIGN_MIDDLE			=	"middle";
var VALIGN_BOTTOM			=	"bottom";
//�����ͱ׸��� �⺻ ������ ��� �� ��
var DATAGRID_COLSEP			=	"#";
var DATAGRID_ROWSEP			=	"|";
//value list�� ��� �� value ������
var VALUE_LIST_ITEMSEP		=	"{|}";
var VALUE_LIST_VALUESEP		=	"{=}";
var VALUE_LIST_TYPE_TEXT	=	0;
var VALUE_LIST_TYPE_NODE	=	1;
var VALUE_LIST_TYPENAME_TEXT	=	"VALUELISTTYPE=TEXT";
var VALUE_LIST_TYPENAME_NODE	=	"VALUELISTTYPE=NODE";
var VALUE_LIST_NODESEP		=	"/";
//item ������
var PARSE_ITEMSEP			=	",";
//�������� �� ��Ÿ�� ��
//����Ģ
//	STYLE_stylename_[a][b][c]
//	��)
//		STYLE_NUMBER_000	�������,��������,0�ڸ��Ҽ�
//		STYLE_NUMBER_153	���,5�ڸ�����,3�ڸ��Ҽ�
//������ ������ ������ ������ ��� ������ ������ �´� �̸����θ� ����
//	��)
//		STYLE_BIZ_NO		����ڹ�ȣ
//		STYLE_REG_NO		�ֹε�Ϲ�ȣ
//[a]
//	0���� �����ϸ� ������� ����
//	1�� �����ϸ� ����� �Է°���
//	2�� �����ϸ� ������ �Է°���
//[b]
//	�����ڸ���
//	0�̸� ����, #
//[c]
//	�Ҽ��������ڸ���
//	0�̸� 0�ڸ�
//	9�̸� ����, #
var STYLE_NUMBER0			=	new Array ("(-)#,##0"				,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_NUMBER0_1			=	new Array ("(-)#,##0.0"	    		,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_NUMBER0_2			=	new Array ("(-)#,##0.00"			,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_NUMBER0_3			=	new Array ("(-)#,##0.000"			,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_NUMBER1			=	new Array ("(-)#,###"				,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_NUMBER1_1 		=	new Array ("(-)#,###.0"	    		,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_NUMBER1_2 		=	new Array ("(-)#,###.00"			,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_NUMBER1_3 		=	new Array ("(-)#,###.000"			,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_NUMBER1_4         =   new Array ("(-)#,###.0000"          ,ALIGN_RIGHT            ,VALIGN_MIDDLE);
var STYLE_NUMBER3			=	new Array ("(-)#,##0"				,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_NUMBER3_1 		=	new Array ("(-)#,##0.9"	    		,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_NUMBER3_2 		=	new Array ("(-)#,##0.99"			,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_NUMBER3_3 		=	new Array ("(-)#,##0.999"			,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_NUMBER4			=	new Array ("(-)#,###"				,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_NUMBER4_1 		=	new Array ("(-)#,###.#"	    		,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_NUMBER5			=	new Array ("#,###"					,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_NUMBER5_1 		=	new Array ("#,###.#"	    		,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_NUMBER5_2         =   new Array ("#,###.##"               ,ALIGN_RIGHT            ,VALIGN_MIDDLE);
var STYLE_STRING			=	new Array (""						,ALIGN_LEFT				,VALIGN_MIDDLE);
var STYLE_STRING_L			=	new Array (""						,ALIGN_LEFT				,VALIGN_MIDDLE);
var STYLE_STRING_R			=	new Array (""						,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_STRING_C			=	new Array (""						,ALIGN_CENTER			,VALIGN_MIDDLE);
var STYLE_CODE				=	new Array (""						,ALIGN_CENTER			,VALIGN_MIDDLE);
var STYLE_DATE_1			=	new Array ("yyyy-mm-dd"				,ALIGN_CENTER			,VALIGN_MIDDLE);
var STYLE_DATE_2			=	new Array ("yyyy+\"��\"+mm+\"��\"+dd+\"��\""			,ALIGN_CENTER			,VALIGN_MIDDLE);
var STYLE_DATE_3			=	new Array ("yyyy/mm/dd"				,ALIGN_CENTER			,VALIGN_MIDDLE);
var STYLE_MONTH_1			=	new Array ("yyyy-mm"				,ALIGN_CENTER			,VALIGN_MIDDLE);
var STYLE_MONTH_2			=	new Array ("yyyy+\"��\"+mm+\"��\""	,ALIGN_CENTER			,VALIGN_MIDDLE);
var STYLE_MONTH_3			=	new Array ("yyyy/mm"				,ALIGN_CENTER			,VALIGN_MIDDLE);
var	STYLE_RATE_1			=	new Array ("(-)#.#"					,ALIGN_RIGHT			,VALIGN_MIDDLE);
//���� �߰��ϴ� ������ ��� ����� ����Ģ�����ֻ�
var STYLE_RATE_000			=	new Array ("(-)#"					,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_009			=	new Array ("(-)#.#"					,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_001          =   new Array ("(-)#.9"                 ,ALIGN_RIGHT            ,VALIGN_MIDDLE);
var STYLE_RATE_002			=	new Array ("(-)#.99"				,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_003			=	new Array ("(-)#.999"				,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_004          =   new Array ("(-)#.9999"              ,ALIGN_RIGHT            ,VALIGN_MIDDLE);
var STYLE_RATE_011          =   new Array ("(-)9.9"                 ,ALIGN_RIGHT            ,VALIGN_MIDDLE);
var STYLE_RATE_020			=	new Array ("(-)99"					,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_029			=	new Array ("(-)99.#"				,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_022			=	new Array ("(-)99.99"				,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_023			=	new Array ("(-)99.999"				,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_030			=	new Array ("(-)999"					,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_039			=	new Array ("(-)999.#"				,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_032			=	new Array ("(-)999.99"				,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_033			=	new Array ("(-)999.999"				,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_100			=	new Array ("#"						,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_109			=	new Array ("#.#"					,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_102			=	new Array ("#.99"					,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_103			=	new Array ("#.999"					,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_120			=	new Array ("99"						,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_129			=	new Array ("99.#"					,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_122			=	new Array ("99.99"					,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_123			=	new Array ("99.999"					,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_130			=	new Array ("999"					,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_139			=	new Array ("999.#"					,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_132			=	new Array ("999.99"					,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_133			=	new Array ("999.999"				,ALIGN_RIGHT			,VALIGN_MIDDLE);
var STYLE_RATE_134          =   new Array ("#,###.99999999"         ,ALIGN_RIGHT            ,VALIGN_MIDDLE);
var STYLE_RATE_135          =   new Array ("999.9999999999"         ,ALIGN_RIGHT            ,VALIGN_MIDDLE);
//-----------------------------------------------------------------------
//[a]
//0���� �����ϸ� �ѱ�
//1�� �����ϸ� ����
//3���� �����ϸ� ������
//[b]
//0���� �����ϸ� ����� ��ü
//1�� �����ϸ� ���
//2�� �����ϸ� ��
//3���� �����ϸ� ��
//4�� �����ϸ� ��
//[c]
//������ ����
//1�̸� '/'
//2�̸� '-'
//�����ڰ� �ƴϰų� ���� ������ ��� 0
var STYLE_DATE_320			=	new Array ("yyyy"					,ALIGN_CENTER			,VALIGN_MIDDLE);
var STYLE_DATE_330          =   new Array ("mm"                     ,ALIGN_CENTER           ,VALIGN_MIDDLE);
var STYLE_DATE_020			=	new Array ("yyyy \"��\""			,ALIGN_CENTER			,VALIGN_MIDDLE);
var STYLE_DATE_302			=	new Array ("yyyy-mm-dd"				,ALIGN_CENTER			,VALIGN_MIDDLE);
var STYLE_BIZ_NO			=	new Array ("999-99-99999"			,ALIGN_CENTER			,VALIGN_MIDDLE);
var STYLE_REGI_NO			=	new Array ("999999-9999999"			,ALIGN_CENTER			,VALIGN_MIDDLE);

//POPUP�� ����� �⺻ �ν��Ͻ� ����
var SEND_DATA_REF			=	"/root/reqData/fwdData";
var RCVS_DATA_REF			=	"/root/resData/rcvData";

//datagrid�� explorerbar �Ӽ�
var DATAGRID_EXPLORERBAR_SORT			=	"sort";
var DATAGRID_EXPLORERBAR_MOVE			=	"move";
var DATAGRID_EXPLORERBAR_SORTSHOW		=	"sortshow";
var DATAGRID_EXPLORERBAR_SORTMOVE		=	"sortmove";
var DATAGRID_EXPLORERBAR_SORTSHOWMOVE	=	"sortshowmove";
//datagrid�� rowheader �Ӽ�
var DATAGRID_ROWHEADER_SEQ				=	"seq";
var DATAGRID_ROWHEADER_REVERSESEQ		=	"reverseseq";
var DATAGRID_ROWHEADER_SELECT			=	"select";
var DATAGRID_ROWHEADER_UPDATE			=	"update";
//datagrid�� selectionmode
var DATAGRID_SELECTION_BYROW			=	"byrow";
var DATAGRID_SELECTION_BYCOL			=	"bycol";
var DATAGRID_SELECTION_LISTBOX			=	"listbox";
var DATAGRID_SELECTION_FREE				=	"free";
//rowstatus
var DATAGRID_ROWSTATUS_NONE				=	0;
var DATAGRID_ROWSTATUS_INSERT			=	1;
var DATAGRID_ROWSTATUS_UPDATE			=	2;
var DATAGRID_ROWSTATUS_INSERTNEW		=	3;
var DATAGRID_ROWSTATUS_DELETE			=	4;
var DATAGRID_ROWSTATUS_DELETEINSERT		=	5;
var DATAGRID_ROWSTATUS_DELETEUPDATE		=	6;
//col type
var DATAGRID_COLTYPE_NONE				=	"";
var DATAGRID_COLTYPE_OUTPUT				=	"output";
var DATAGRID_COLTYPE_INPUT				=	"input";
var DATAGRID_COLTYPE_INPUTBUTTON		=	"inputbutton";
var DATAGRID_COLTYPE_INPUTDATE			=	"inputdate";
var DATAGRID_COLTYPE_COMBO				=	"combo";
var DATAGRID_COLTYPE_CHECKBOX			=	"checkbox";
var DATAGRID_COLTYPE_RADIO				=	"radio";

//combo �� �Ӽ�
var COMBO_ITEMCOUNT						=	10;

//�޽����ڽ� ����
var MB_ABORTRETRYIGNORE					=	0x2;
var MB_APPLMODAL						=	0x0;
var MB_COMPOSITE						=	0x2;
var MB_DEFAULT_DESKTOP_ONLY				=	0x20000;
var MB_DEFBUTTON1						=	0x0;
var MB_DEFBUTTON2						=	0x100;
var MB_DEFBUTTON3						=	0x200;
var MB_DEFMASK							=	0xF00;
var MB_ICONASTERISK						=	0x40;
var MB_ICONEXCLAMATION					=	0x30;
var MB_ICONHAND							=	0x10;
var MB_ICONINFORMATION					=	MB_ICONASTERISK;
var MB_ICONMASK							=	0xF0;
var MB_ICONQUESTION						=	0x20;
var MB_ICONSTOP							=	MB_ICONHAND;
var MB_MISCMASK							=	0xC000;
var MB_MODEMASK							=	0x3000;
var MB_NOFOCUS							=	0x8000;
var MB_OK								=	0x0;
var MB_OKCANCEL							=	0x1;
var MB_PRECOMPOSED						=	0x1;
var MB_RETRYCANCEL						=	0x5;
var MB_SETFOREGROUND					=	0x10000;
var MB_SYSTEMMODAL						=	0x1000;
var MB_TASKMODAL						=	0x2000;
var MB_TYPEMASK							=	0xF;
var MB_YESNO							=	0x4;
var MB_USEGLYPHCHARS					=	0x4;
var MB_YESNOCANCEL						=	0x3;
var MB_ICONASTERISK						=	0x40;
var MB_ICONEXCLAMATION					=	0x30;
var MB_ICONHAND							=	0x10;
var MB_ICONINFORMATION					=	MB_ICONASTERISK;
var MB_ICONMASK							=	0xF0;
var MB_ICONQUESTION						=	0x20;
var MB_ICONSTOP							=	MB_ICONHAND;
//�޽����ڽ� ����
var IDABORT								=	3;
var IDCANCEL							=	2;
var IDCONTINUE							=	11;
var IDIGNORE							=	5;
var IDNO								=	7;
var IDOK								=	1;
var IDRETRY								=	4;
var IDTRYAGAIN							=	10;
var IDYES								=	6;

//�� ����
var VALIDATION_LENGTH					=	0;
var VALIDATION_GTEQ						=	1;
var VALIDATION_LTEQ						=	2;

//��������
var DEFAULT_COLOR_DISABLE				=	"#eaeaea";
var DEFAULT_COLOR_REQ					=	"#fefae2";
var DEFAULT_COLOR_NONEREQ				=	"#ffffff";
var DEFAULT_DATAGRID_BG_COLOR_DISABLE	=	"#c0c0c0";
var DEFAULT_DATAGRID_BG_COLOR_ENABLE	=	"#ffffff";
var DEFAULT_DATAGRID_TEXT_COLOR_NORMAL	=	"#555555";
var DEFAULT_DATAGRID_TEXT_COLOR_ERROR	=	"#ff0000";

//type���ڿ�
var DATA_TYPE_STRING					=	"string";
var DATA_TYPE_OBJECT					=	"object";
var DATA_TYPE_BOOLEAN					=	"boolean";
var DATA_TYPE_NUMBER					=	"number";
var DATA_TYPE_NULL						=	"null";
var DATA_TYPE_UNDEFINED					=	"undefined";

//xforms control name string
var XFORMS_CONTROL_SELECT1				=	"xforms:select1";
var XFORMS_CONTROL_SELECT				=	"xforms:select";
var XFORMS_CONTROL_SUBMISSION			=	"xforms:submission";
var XFORMS_CONTROL_COMBO				=	"xforms:select1";
var XFORMS_CONTROL_INPUT				=	"xforms:input";
var XFORMS_CONTROL_DATAGRID				=	"xforms:datagrid";
var XFORMS_CONTROL_RADIO				=	"xforms:select1";
var XFORMS_CONTROL_IMAGE				=	"xforms:img";
var XFORMS_CONTROL_CAPTION				=	"xforms:caption";
var XFORMS_CONTROL_OUTPUT				=	"xforms:output";
var XFORMS_CONTROL_SECRET				=	"xforms:secret";
var XFORMS_CONTROL_TEXTAREA				=	"xforms:textarea";
var XFORMS_CONTROL_BUTTON				=	"xforms:button";
var XFORMS_CONTROL_CHECKBOX				=	"xforms:select";
var XFORMS_CONTROL_LISTBOX				=	"xforms:select";
var XFORMS_CONTROL_TREEVIEW				=	"xforms:treeview";
var XFORMS_CONTROL_CALENDAR				=	"xforms:calendar";
var XFORMS_CONTROL_LINE					=	"xforms:line";
var XFORMS_CONTROL_RECTANGLE			=	"xforms:shape";
var XFORMS_CONTROL_ELLIPSE				=	"xforms:shape";
var XFORMS_CONTROL_OBJECT				=	"xforms:object";
var XFORMS_CONTROL_BROWSER				=	"xforms:browser";
var XFORMS_CONTROL_GROUP				=	"xforms:group";
var XFORMS_CONTROL_SWITCH				=	"xforms:switch";
var XFORMS_CONTROL_IMPORT				=	"xforms:import";
var XFORMS_CONTROL_IVIEWER				=	"xforms:iviewer";
var XFORMS_CONTROL_MULTILINEGRID		=	"xforms:multilinegrid";
var XFORMS_CONTROL_BOOL					=	"xforms:bool";
var XFORMS_CONTROL_UPLOAD				=	"xforms:upload";
//xforms control appearance string
var XFORMS_APPEARANCE_COMBO				=	"minimal";
var XFORMS_APPEARANCE_RADIO				=	"full";
var XFORMS_APPEARANCE_CHECKBOX			=	"full";
var XFORMS_APPEARANCE_LISTBOX			=	"compact";
var XFORMS_APPEARANCE_RECTANGLE			=	"rectangle";
var XFORMS_APPEARANCE_ELLIPSE			=	"ellipse";

//trim type string
var TRIM_TYPE_TRIM						=	"TRIM";
var TRIM_TYPE_RTRIM						=	"RTRIM";
var TRIM_TYPE_LTRIM						=	"LTRIM";
var TRIM_TYPE_NONE						=	"NONE";

//focus type string
var FOCUS_TYPE_FOCUS					=	"FOCUS";
var FOCUS_TYPE_NONE						=	"NONE";

//updown string
var UPDOWN_UP							=	"up";
var UPDOWN_DN							=	"dn";

//popup return value
var POPUP_RETURN_NORMAL					=	1;			//true
var POPUP_RETURN_ERROR					=	0;			//false
var POPUP_RETURN_USERCANCLE				=	-1;			//true

//ep connect web address
//var XFORMS_EP_WEB_ADDRESS               =   "http://eipt.chosun.com:7777";
var XFORMS_EP_WEB_ADDRESS               =   "http://eip.chosun.com";
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	������ instance path�� ���� �ʼ��Է� �׸� üũ�� �Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	
//--------------------------------------------------------------------------------------------------
//���
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function check_req_instance(p_ref,p_trimType) {
	//true ����
	//false ����
	p_ref = p_ref.Trim();
	
	if (p_ref == "") {
		return false;
	}
	
	var value = remove_space(model.getValue(p_ref),p_trimType);
	
	if (value == "") {
		return false;
	}
	else {
		return true;
	}
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	select control�� ���� �ʼ��Է� �׸� üũ�� �Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	
//--------------------------------------------------------------------------------------------------
//���
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function check_req_select1(p_obj,p_trimType) {
	var value = "";
	var index = -1;
	var index_value = "";
	
	if (p_obj.attribute("appearance") == XFORMS_APPEARANCE_RADIO) {
		//radio
		index = p_obj.focusIndex;
		if (p_obj.item(index) != null) {
			index_value = p_obj.item(index).value;
			value = p_obj.value;
		}
		else {
			index = -1;
		}
	}
	else if (p_obj.attribute("appearance") == XFORMS_APPEARANCE_COMBO) {
		//combo
		index = p_obj.focusIndex;

		if (p_obj.value == "") {
			index = -1;
		}
		else {
			if (p_obj.item(index) != null) {
				index_value = p_obj.item(index).value;
				value = p_obj.value;
			}
			else {
				index = -1;
			}
		}
	}
	
	
	if (index == -1 || value != index_value) {
		return false;
	}
	else {
		return true;
	}
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	input control�� ���� �ʼ��Է� �׸� üũ�� �Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	
//--------------------------------------------------------------------------------------------------
//���
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function check_req_input(p_obj,p_trimType) {
	var value = remove_space(p_obj.value,p_trimType);
	if (value == "") {
		return false;
	}
	else {
		return true;
	}
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	object�� ���� �ʼ��Է� �׸� üũ�� �Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	
//--------------------------------------------------------------------------------------------------
//���
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function check_req_object(p_obj,p_trimType) {
	var flag = true;
	switch (p_obj.elementName) {
		case XFORMS_CONTROL_COMBO:
			flag = check_req_select1(p_obj,p_trimType);
			break;
		case XFORMS_CONTROL_INPUT:
			flag = check_req_input(p_obj,p_trimType);
			break;
		default:
			show_message("üũ �� �� ���� ���Դϴ�.");
			flag = false;
			break;
	}
	return flag;
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�ʼ��Է� �׸� üũ�� �Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	1:object			üũ�� instance path Ȥ�� control
//	2:string			���ڿ� ��,���� ������ ���� �� �� ����, "TRIM","LTRIM","RTRIM","NONE"
//	3:string			�ʼ��׸� üũ�� ���� ���� ��� focus�� ���� ����, "FOCUS", "NONE"
//	4:string			�ʼ��׸� üũ�� ���� ���� ��� ���� �� �޽���, �����̸� �޽��� â�� ����� ����
//--------------------------------------------------------------------------------------------------
//���
//	true				���� ó��
//	false				�ʼ��׸� üũ�� ����, �׸��� ������ ���
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function check_reqItem(p_obj,p_trimType) {
	var flag = true;
	if (arguments.length < 1) {
		show_message("�ʼ����θ� üũ�� �׸��� �������� �ʾҽ��ϴ�.");
		return false;
	}
	
	var type = typeof(arguments[0]);
	
	//trim ����
	if (arguments[1] == null || arguments[1].Trim() == "") {
		arguments[1] = TRIM_TYPE_NONE;
	}
	arguments[1] = arguments[1].toUpperCase();

	//focus�� object�� �ƴ� ���� ó��
	//focus�� object��� focus�� ������ object�� �̵���Ų��.
	if (typeof(arguments[2]) != DATA_TYPE_OBJECT) {
		//focus ����
		if (arguments[2] == null || arguments[2].Trim() == "") {
			arguments[2] = FOCUS_TYPE_NONE;
		}
		arguments[2] = arguments[2].toUpperCase();		
	}

	if (typeof(arguments[3]) != DATA_TYPE_OBJECT) {
		//message ����
		if (arguments[3] == null || arguments[3].Trim() == "") {
			arguments[3] = "";
		}
	}
	
	//���ڿ��� ��� üũ�� �ν��Ͻ� ��ġ��� ����
	if (type == DATA_TYPE_STRING) {
		flag = check_req_instance(arguments[0],arguments[1]);
	}
	else if (type == DATA_TYPE_OBJECT) {
		flag = check_req_object(arguments[0],arguments[1]);
	}
	else {
		flag = false;
		show_message("üũ�� �� ���� ���Դϴ�.");
	}
	
	if (!flag) {
		if (typeof(arguments[3]) != DATA_TYPE_OBJECT) {
			if (arguments[3] != "") {
				show_message(arguments[3], "�Է��׸����");
			}
		}
		else {
			show_message(arguments[3].attribute("caption") + "��(��) �ʼ��Է��׸��Դϴ�.","�Է��׸����");
		}
		
		if (typeof(arguments[2]) != DATA_TYPE_OBJECT) {
			if (arguments[2] == FOCUS_TYPE_FOCUS) {
				model.setFocus(arguments[0].attribute("id"));
			}
		}
		else {
			model.setFocus(arguments[2].attribute("id"));
		}
	}

	return flag;
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�޽����ڽ��� ����.
//--------------------------------------------------------------------------------------------------
//�Է�
//	arguments		
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//	model.alert�� ����ؼ� �޽��� �ڽ��� ����.
//	[ Integer = ] model.alert(String message, [String title], [Integer type]) 
//--------------------------------------------------------------------------------------------------
//����
//	show_message("msg");
//	show_message("msg","title");
//	show_message("msg","title",16);
//==================================================================================================
function show_message(message) {
	var title = arguments[1];
	var type = arguments[2];
	
	//�ν��Ͻ��� /root/initData/pageInfo/pageTitle ���� ""�� �ƴϸ�
	//message box title�� �����Ѵ�.
	if(title == ""){
		title = model.getValue("/root/initData/pageInfo/pageTitle");
	}

	if (title != "" && type != "") {
		return model.alert(message, title, type);
	}
	else if (title != "") {
		return model.alert(message, title);
	}
	else {
		return model.alert(message);
	}
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	���޹��� ���ڿ����� ���鹮�� space, tab ���� ������ ���ڿ��� ��ȯ�Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	
//--------------------------------------------------------------------------------------------------
//���
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function remove_space(str,opt) {
	opt = opt.toUpperCase();
	if(opt == TRIM_TYPE_TRIM) {
		return str.Trim();
	}
	else if(opt == TRIM_TYPE_LTRIM) {
		return str.TrimLeft();
	}
	else if(opt == TRIM_TYPE_RTRIM) {
		return str.TrimRight();
	}
	else {
		return str;
	} 
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�Է� ���� ��¥�� ��¥ ���Ŀ� �´��� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_date				������ ��¥ ��, ����, "20090101" ����
//--------------------------------------------------------------------------------------------------
//���
//	true				�Էµ� ��¥�� ��¥ ���Ŀ� �´� ���
//	false				�Էµ� ��¥�� ��¥ ���İ� ���� ���� ���
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	if(validate_date("20091301")) {
//		alert("����");
//	}
//	else {
//		alert("����");
//	}
//==================================================================================================
function validate_date(pDate) {
	if (pDate.length < 8)
		return false;
	var year = pDate.substr(0,4);
	var month = pDate.substr(4,2);
	var day = pDate.substr(6,2);
	var monthArr = new Array(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
	if(month == 2) {
		if ((( year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			monthArr[1] = "29";
		}
	}
	if(year < 9999 && year > 0 && month <= 12 && month > 0 && day <= monthArr[month-1] && day > 0 ) {
		return true;
	}
	return false;
}

//��¥�������� üũ�ϰ� �ƴϸ� ���� �����͸� ����
function control_is_date(p_obj,p_errclear,p_errfocus,p_errmsg) {
	//�����Ƽ� ��� ���� ���������� �Ѿ�´ٰ� �����ع��ȴ�.
	var obj = eval(p_obj);
	var msg = "";
	
	var cdata = get_refvalue(obj);
	if (true == validate_date(cdata)) {
		return true;
	}
	else {
		if (true == p_errclear) {
			set_refvalue(obj,"");
		}
		if ("" != p_errmsg.Trim()) {
			show_message(p_errmsg);
		}
		else {
			if (true == p_errfocus) {
				msg = obj.attribute("caption").Trim();

				if (msg != "") {
					msg += "��(��) ";
				}
				msg += "�߸��� ��¥ �����Դϴ�.";
				
				show_message(msg);
			}
		}
		if (true == p_errfocus) {
			model.setFocus(obj.attribute("id"));
		}
	}
	return false;
}

//��¥�������� üũ�ϰ� �ƴϸ� ���� �����͸� ����
//�� �Լ��� ������ �ϱ� ���ؼ�(focus�� true�� ��쿡 ���ؼ�)
//grid�� onnext() �Լ��� �������� �̺�Ʈ ��ȿȭ�� �ʿ��ϴ�.
function datagrid_is_date(p_obj,p_errclear,p_errfocus,p_errmsg) {
	//�����Ƽ� ��� ���� ���������� �Ѿ�´ٰ� �����ع��ȴ�.
	var obj = eval(p_obj);
	var msg = "";
	var cdata = obj.valueMatrix(obj.row,obj.col);
	
	if (true == validate_date(cdata)) {
		return true;
	}
	else {
		if (true == p_errclear) {
			obj.valueMatrix(obj.row,obj.col) = "";
		}
		if ("" != p_errmsg.Trim()) {
			show_message(p_errmsg);
		}
		else {
			if (true == p_errfocus) {
				msg = obj.attribute("caption").Trim();

				if (msg != "") {
					msg += "��(��) ";
				}
				msg += "�߸��� ��¥ �����Դϴ�.";
				
				show_message(msg);
			}
		}
		if (true == p_errfocus) {
			obj.editCell();
		}
	}
	return false;
}

//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�������� submission�� �����ϰ� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_submission_id		������ submission�� id
//						�����ؾ� �ϸ� �̹� �����ϴ� ��� ���� submission�̶�� �Ǵ��ϰ� �����ϴ� submission�� �����
//	p_ref				���� �����Ͱ� �ִ� instance path
//	p_resultref			���� �����͸� ���� �� instance path
//	p_action			������ ���
//	p_method			���۹��
//	p_mediatype			����Ÿ��
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	send_submission(
//			"auto_fc_co_8000_s"
//		,	"/root/tempData/auto_fc_co_8000_s"
//		,	"/root/tempData/fc_co_8000_s/dataSet"
//		,	"/fc/co8000/8000"
//		,	"urlencoded-post"
//		,	"application/x-www-form-urlencoded"
//	);
//==================================================================================================
function send_submission(p_submission_id,p_ref,p_resultref,p_action,p_method,p_mediatype) {
	//����� submission control�� ���� ����	
	if(!model.isChild(p_submission_id)) {
		//�ش� submission�� �������� �ʾҴٸ� ���� �����ϰ�
		model.createChild(XFORMS_CONTROL_SUBMISSION, "id:" + p_submission_id + "; ");
	}
	else {
		//�̹� ������ submission�̶�� �״�� ����Ѵ�.
	}
	
	//���� �ν��Ͻ� ������ ���� ��� �����Ѵ�.
	if (instance1.selectSingleNode(p_resultref) == null) {
		model.makeNode(p_resultref);
	}
	
	//submission ����
	eval(p_submission_id).attribute("ref") = p_ref;
	eval(p_submission_id).attribute("resultref") = p_resultref;
	eval(p_submission_id).attribute("action") = p_action;
	eval(p_submission_id).attribute("method") = p_method;
	eval(p_submission_id).attribute("mediatype") = p_mediatype;

	//����			
	model.send(p_submission_id);

	return submit_completed();
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	��ȸ�� �����ڵ��� �Է°��� ������ instance path�� ���޹޾�
//	�Է°��� ���� �� submisstion ����
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_submission_id		������ submission�� id
//						�����ؾ� �ϸ� �̹� �����ϴ� ��� ���� submission�̶�� �Ǵ��ϰ� �����ϴ� submission�� �����
//	p_ref					���� �����Ͱ� �ִ� instance path
//	p_resultref				���� �����͸� ���� �� instance path
//	p_action				������ ���
//	p_method				���۹��
//	p_mediatype			����Ÿ��
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//	�ڵ� �̸��� ��ȸ�ϴ� �ٸ� script�� ���� ����
//	������ ���� ���� ���� �޴� argument ������
//	���� ���� ������ instance�� �����ϴ� �κи� �����ؼ� �����ϸ� �˴ϴ�.
//--------------------------------------------------------------------------------------------------
//����
//	function get_medi_nm() {
//		//�����ڵ带 ��ȸ�ϴ� �Լ� ȣ��
//		get_comn_nm("/root/tempData/fc_co_8000_s/dataSet","00","01", medi_cd.value)
//		//�޾��� �����͸� ������ ��ġ�� �����Ѵ�.
//		medi_nm.value = model.getValue("/root/tempData/fc_co_8000_s/dataSet/CURLIST/record/cdnm");
//	}
//==================================================================================================
function get_comn_nm(p_resultref,p_job_clsf,p_cd_clsf,p_cd) {
	//����̼� �̸� ����
	var submission_id = "auto_fc_co_8000_s";
	//���� �������� �⺻ ��ġ ����
	var ref = "/root/tempData/" + submission_id;	
	//������ ���
	var action = "/fc/co8000/8000";
	//���۹��
	var method = "urlencoded-post";
	//����Ÿ��
	var mediatype = "application/x-www-form-urlencoded";	
					
	//������ ���� �������� �⺻ ��ġ�� �ش��ϴ� ���� �����Ѵ�.			
	model.removenode(ref);
	
	//�����͸� ���� �ν��Ͻ� ��� ����
	model.makeNode(p_resultref);
	
	//���� �����Ϳ� ���� ����, ���� �ڵ����� ����
	model.makeValue(ref + "/" + "job_clsf", p_job_clsf);
	model.makeValue(ref + "/" + "cd_clsf", p_cd_clsf);
	model.makeValue(ref + "/" + "cd", p_cd);
	
	//����̼��� �����ϰ� �����Ѵ�.
	send_submission(submission_id, ref, p_resultref, action, method, mediatype);

	//���� �� ����� �ν��Ͻ��� ����
	model.removenode(ref);
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	������ datagrid�� ��� �÷��� ���� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	
//--------------------------------------------------------------------------------------------------
//���
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function hide_all_columns(p_grid) {
	grid = eval(p_grid);

	for(i=0; i<grid.cols; i++ ) {
		if (i >= grid.fixedcols) {
			grid.colHidden(i) = true;
		}
	}
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	������ �׸����� ������ �÷� ����� ���� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	
//--------------------------------------------------------------------------------------------------
//���
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function show_columns(p_grid, p_cols) {
	grid = eval(p_grid);
	//p_cols�� �����̸� ����
	if (p_cols.Trim() == "") {
		return;
	}
	p_cols = datagrid_colname_to_colid(grid,p_cols);
	var col_list = p_cols.Trim().split(PARSE_ITEMSEP);
	for(i=0;i<col_list.length;i++) {
		if (Number(col_list[i]) >= grid.fixedcols) {
			grid.colHidden(Number(col_list[i])) = false;
		}
	}
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	������ �׸����� ������ �÷� ����� ���� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	
//--------------------------------------------------------------------------------------------------
//���
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function hide_columns(p_grid,p_cols) {
	grid = eval(p_grid);
	//p_cols�� �����̸� ����
	if (p_cols.Trim() == "") {
		return;
	}
	p_cols = datagrid_colname_to_colid(grid,p_cols);
	var col_list = p_cols.Trim().split(PARSE_ITEMSEP);
	for(i=0;i<col_list.length;i++) {
		if (Number(col_list[i]) >= grid.fixedcols) {
			grid.colHidden(Number(col_list[i])) = true;
		}
	}				
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	������ datagrid�� ��� �÷��� ���� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	
//--------------------------------------------------------------------------------------------------
//���
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function show_all_columns(p_grid) {
	grid = eval(p_grid);
	
	for(i=0; i<grid.cols; i++ ) {
		if (i >= grid.fixedcols) {
			grid.colHidden(i) = false;
		}
	}				
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	������ datagrid�� ��� �÷��� Disable �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	
//--------------------------------------------------------------------------------------------------
//���
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function disable_all_columns(p_grid) {
	var cols = "";
	var col_color = "";
	
	//color
	if (arguments[1] == null || arguments[1].Trim() == "") {
		col_color = DEFAULT_DATAGRID_BG_COLOR_DISABLE;
	}
	else {
		col_color = arguments[1];
	}
	
	grid = eval(p_grid);

	for(i=0; i<grid.cols; i++ ) {
		if (i >= grid.fixedcols) {
			cols = cols + PARSE_ITEMSEP + i;
		}
	}
	
	if (cols != "") {
		disable_columns(p_grid,cols.substr(PARSE_ITEMSEP.length),col_color);
	}
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	������ �׸����� ������ �÷� ����� Disable �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	
//--------------------------------------------------------------------------------------------------
//���
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function enable_columns(p_grid, p_cols) {
	var col_color = "";
	
	//color
	if (arguments[2] == null || arguments[2].Trim() == "") {
		col_color = DEFAULT_DATAGRID_BG_COLOR_ENABLE;
	}
	else {
		col_color = arguments[2];
	}
	
	grid = eval(p_grid);
	//p_cols�� �����̸� ����
	if (p_cols.Trim() == "") {
		return;
	}
	p_cols = datagrid_colname_to_colid(grid,p_cols);
	var col_list = p_cols.Trim().split(PARSE_ITEMSEP);
	for(i=0;i<col_list.length;i++) {
		if (Number(col_list[i]) >= grid.fixedcols) {
			if (
					grid.colAttribute(Number(col_list[i]),"type") != DATAGRID_COLTYPE_CHECKBOX
			) {
				grid.colAttribute(Number(col_list[i]),"background-color") = col_color;
			}
			grid.colDisabled(Number(col_list[i])) = false;
		}
	}
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	������ �׸����� ������ �÷� ����� Disable �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	
//--------------------------------------------------------------------------------------------------
//���
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function disable_columns(p_grid,p_cols) {
	var col_color = "";
	
	//color
	if (arguments[2] == null || arguments[2].Trim() == "") {
		col_color = DEFAULT_DATAGRID_BG_COLOR_DISABLE;
	}
	else {
		col_color = arguments[2];
	}
	
	grid = eval(p_grid);
	p_cols = datagrid_colname_to_colid(grid,p_cols);
	var col_list = p_cols.split(PARSE_ITEMSEP);
	for(i=0;i<col_list.length;i++) {
		if (Number(col_list[i]) >= grid.fixedcols) {
			if (
					grid.colAttribute(Number(col_list[i]),"type") != DATAGRID_COLTYPE_CHECKBOX
			) {
				grid.colAttribute(Number(col_list[i]),"background-color") = col_color;
			}
			grid.colDisabled(Number(col_list[i])) = true;
		}
	}				
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	������ datagrid�� ��� �÷��� Disable �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	
//--------------------------------------------------------------------------------------------------
//���
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function enable_all_columns(p_grid) {
	var cols = "";
	var col_color = "";
	
	//color
	if (arguments[1] == null || arguments[1].Trim() == "") {
		col_color = DEFAULT_DATAGRID_BG_COLOR_ENABLE;
	}
	else {
		col_color = arguments[1];
	}
	
	grid = eval(p_grid);

	for(i=0; i<grid.cols; i++ ) {
		if (i >= grid.fixedcols) {
			cols = cols + PARSE_ITEMSEP + i;
		}
	}
	
	if (cols != "") {
		enable_columns(p_grid,cols.substr(PARSE_ITEMSEP.length),col_color);
	}			
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	������ ��Ʈ�ѿ� �⺻ ������ �Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_obj			�⺻ ������ ���� ��ų ��Ʈ���� ���
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//	set_default() �Լ����� ���� ���
//	datagrid, input, group, caption, select1(combo) ��(�߰� ����)�� ������ ��Ʈ�ѿ� ���ؼ�
//	�⺻ �������� ����� attribute�� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function set_default_control(p_obj) {
	if (typeof(p_obj) != DATA_TYPE_OBJECT) {
		return;
	}
	
	var obj = eval(p_obj);
	
	switch (obj.elementName) {
		case XFORMS_CONTROL_DATAGRID:
			//obj.attribute("autoresize")		=	BOOLEAN_TRUE;
			obj.attribute("autosizemouse")	=	BOOLEAN_TRUE;
			obj.attribute("colsep")			=	DATAGRID_COLSEP;
			obj.attribute("rowsep")			=	DATAGRID_ROWSEP;
			obj.attribute("explorerbar")	=	DATAGRID_EXPLORERBAR_SORTSHOWMOVE;
			obj.attribute("extendlastcol")	=	BOOLEAN_FALSE;
			obj.attribute("selectionmode")	=	DATAGRID_SELECTION_FREE;
//rowheader�� ���� ��ȯ�� ���� ����
//			if ("" == obj.attribute("rowheader")) {
//				obj.attribute("rowheader")	=	DATAGRID_ROWHEADER_SEQ;
//			}
			//�������·� �׸��带 ����ϴ� ��� ����ڵ����� ���� true�� ����
			//attribute �������ָ� row �ʱ�ȭ���� ���ܵȴ�.
			if(obj.attribute("userdata") != BOOLEAN_TRUE) {
				datagrid_data_clear(obj);
			}
			set_default_datagrid_columns(obj);
			
			break;
		case XFORMS_CONTROL_INPUT:
			break;
		case XFORMS_CONTROL_GROUP:
			break;
		case XFORMS_CONTROL_OUTPUT:
			break;
		case XFORMS_CONTROL_CAPTION:
			break;
		case XFORMS_CONTROL_SELECT1:
			if (obj.attribute("appearance") == XFORMS_APPEARANCE_RADIO) {
				//radio
			}
			else if (obj.attribute("appearance") == XFORMS_APPEARANCE_COMBO) {
				//combo
				obj.attribute("itemcount") = COMBO_ITEMCOUNT;
			}
			break;
		case XFORMS_CONTROL_SELECT:
			break;
		default:
			break;
	}	
}

function set_default_datagrid_columns(p_obj) {
	if (typeof(p_obj) != DATA_TYPE_OBJECT || eval(p_obj).elementName != XFORMS_CONTROL_DATAGRID) {
		return;
	}
	
	var obj = eval(p_obj);
	
	//col ����
	for(var i = 0;i < obj.cols;i++) {
		switch(obj.colType(i)) {
			case DATAGRID_COLTYPE_CHECKBOX:
				break;
			case DATAGRID_COLTYPE_COMBO:
				obj.colAttribute(i,"itemcount") = COMBO_ITEMCOUNT;
				break;
			case DATAGRID_COLTYPE_INPUT:
				break;
			case DATAGRID_COLTYPE_INPUTBUTTON:
				break;
			case DATAGRID_COLTYPE_INPUTDATE:
				break;
			case DATAGRID_COLTYPE_NONE:
				break;
			case DATAGRID_COLTYPE_OUTPUT:
				break;
			case DATAGRID_COLTYPE_RADIO:
				break;
			default:
				break;
		}
	}
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	������ ��Ʈ�� ��Ͽ� �⺻ ������ �Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	arguments		�⺻ ������ ���� ��ų ��Ʈ���� ���
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	set_default(datagrid1,input2);
//==================================================================================================
function set_default() {
	if (arguments.length <= 0) {
		return;
	}
	
	for(i=0;i<arguments.length;i++) {
		set_default_control(arguments[i]);
	}
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	������ ��Ʈ�� ��Ͽ� �ش� ���˿� �ش��ϴ� ��Ÿ���� �����Ų��.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_format		���ڿ��� ������ ��Ÿ���� �̸�
//					����, ����, ��¥ ����� ��Ÿ���� ���� ���� �� ���� �����
//	arguments		���� �̿ܿ� ������ ���� ��ų ������Ʈ ����Ʈ�� �����ϸ� �ȴ�.
//					Ư���� ���� datagrid�� ��� ������ ���� ���� object�� �ƴ϶�
//					�����ų �÷��� ����̶�� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	set_format("STRING_C",datagrid1,"1,6,8,11,12,13");
//	set_format("STRING_L",datagrid1,"2,3,4,5,7,9,10,14,15,16,17");
//	set_format("DATE_1", input1, input5, datagrid2, "6,7");
//==================================================================================================
function set_format(p_format) {
	//format�� �������� ������ ����
	if (p_format.Trim() == "") {
		return;
	}
	
	//argument�� 1�� �����̸� ����
	if (arguments.length <= 1) {
		return;		
	}
	
	//������ objects�� ������ŭ �ݺ��Ѵ�.
	//�� datagrid�� ��� ������ ���� ���� object�� �ƴ϶� ���� �� �÷��� ����̴�.
	var skip = 0;
	var i = 1;
	
	while(i < arguments.length) {
		obj = eval(arguments[i]);
		skip = 0;
		cols = "";
		//������ ���� ��ġ�� argument�� object���� �Ѵ�.
		//datagrid�� ��� ���� �׸��� ����ϰ� i�� 1���ؼ� ���� object�� ������ �Ѵ�.
		if (typeof obj == DATA_TYPE_OBJECT) {
			switch (obj.elementName) {
				case XFORMS_CONTROL_DATAGRID:
					cols = arguments[i+1];
					skip=1;
					set_format_datagrid(p_format,obj,cols);
					break;
				default:
					set_format_control(p_format,obj);
					break;
			}
			obj.refresh();
		}
		i = i + 1 + skip;
	}
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	��Ʈ�ѿ� ������ ��Ÿ���� �����Ų��.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_format		���ڿ��� ������ ��Ÿ���� �̸�
//					����, ����, ��¥ ����� ��Ÿ���� ���� ���� �� ���� �����
//	p_obj			������ �׸��� ������Ʈ
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//	set_format() �Լ����� ���� ����ϴ� �Լ�
//--------------------------------------------------------------------------------------------------
//����
//
//==================================================================================================
function set_format_control(p_format,p_obj) {
	//format�� �������� ������ ����
	if (p_format.Trim() == "") {
		return;
	}
	
	obj.attribute(STYLE_FORMAT) = get_style_string(STYLE_FORMAT,p_format);
	obj.attribute(STYLE_TEXT_ALIGN) = get_style_string(STYLE_TEXT_ALIGN,p_format);
	obj.attribute(STYLE_VERTICAL_ALIGN) = get_style_string(STYLE_VERTICAL_ALIGN,p_format);
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	������ �׸����� ������ �÷��� ���ؼ� ��Ÿ���� �����Ų��.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_format		���ڿ��� ������ ��Ÿ���� �̸�
//					����, ����, ��¥ ����� ��Ÿ���� ���� ���� �� ���� �����
//	p_obj			������ �׸��� ������Ʈ
//	p_cols			�����ų �÷��� ���
//					"1,5,6,8" ���·� ","�� �����Ͽ� �÷� �ε��� ����
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//	set_format() �Լ����� ���� ����ϴ� �Լ�
//--------------------------------------------------------------------------------------------------
//����
//
//==================================================================================================
function set_format_datagrid(p_format,p_obj,p_cols) {
	//format�� �������� ������ ����
	if (p_format.Trim() == "") {
		return;
	}
	//p_cols�� �����̸� ����
	if (p_cols.Trim() == "") {
		return;
	}

	obj = eval(p_obj);
	p_cols = datagrid_colname_to_colid(obj,p_cols);
	col_list = p_cols.Trim().split(PARSE_ITEMSEP);
	
	for(i=0;i<col_list.length;i++) {
		obj.colAttribute(Number(col_list[i]),STYLE_FORMAT) = get_style_string(STYLE_FORMAT,p_format);
		obj.colAttribute(Number(col_list[i]),STYLE_TEXT_ALIGN) = get_style_string(STYLE_TEXT_ALIGN,p_format);
		obj.colAttribute(Number(col_list[i]),STYLE_VERTICAL_ALIGN) = get_style_string(STYLE_VERTICAL_ALIGN,p_format);
	}
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�Էµ� ���� �´� ���� ��Ÿ���� ��ȯ�Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_type			STYLE_FORMAT,STYLE_TEXT_ALIGN,STYLE_VERTICAL_ALIGN ���� (�߰��� �� ����)
//					� Ÿ���� ��Ÿ���� ������� ����
//	p_format		���ڿ��� ������ ��Ÿ���� �̸�
//					����, ����, ��¥ ����� ��Ÿ���� ���� ���� �� ���� �����
//--------------------------------------------------------------------------------------------------
//���
//	String			attribute�� ������ ��Ÿ���� ���ڿ� ��
//--------------------------------------------------------------------------------------------------
//����
//	set_format() �Լ����� ���� ����ϴ� �Լ�
//--------------------------------------------------------------------------------------------------
//����
//
//==================================================================================================
function get_style_string(p_type,p_format) {
	p_type = p_type.toLowerCase();
	p_format = p_format.toUpperCase();
	p_stylename = "STYLE_" + p_format;
	
	if (p_type == STYLE_FORMAT) {
		vPosition = STYLE_SEQ_FORMAT;
	}
	else if (p_type == STYLE_TEXT_ALIGN) {
		vPosition = STYLE_SEQ_ALIGN;
	}
	else if (p_type == STYLE_VERTICAL_ALIGN) {
		vPosition = STYLE_SEQ_VALIGN;
	}
	else {
		return "";
	}
	
	var style_item = null;
	var style_value = "";
    try
    {
         style_item = eval(p_stylename);
         style_value = style_item[vPosition];
    }
    catch(ex)
    {
    	style_value = "";
    }
    finally {
    	
    }
	
	return style_value;
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�˾��� �����ش�. (������)
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			popup ��ų xrw id
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//
//==================================================================================================
function show_popup(p_popid) {
	show_popupEx(p_popid,"modal","width:950px; height:756px; ");
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�˾��� �����ش�. (640*480)
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			popup ��ų xrw id
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//
//==================================================================================================
function show_popup640(p_popid) {
	show_popupEx(p_popid,"modal","width:640px; height:480px; ");
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�˾��� �����ش�. (400*300)
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			popup ��ų xrw id
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//
//==================================================================================================
function show_popup400(p_popid) {
	show_popupEx(p_popid,"modal","width:400px; height:300px; ");
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�˾��� �����ش�. (Ȯ����)
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			popup ��ų xrw id
//	p_properties	â�� ���¿� ���õ� property
//					"width:640px; height:480px; " �� ���� �ַ� ũ�� ���õ� �Ӽ��� �����ϸ� �ȴ�.
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	show_popupEx(p_popid,"modal","width:640px; height:480px; ")
//	show_popupEx(p_popid,"modal","");
//==================================================================================================
function show_popupEx(p_popid,p_mode,p_properties) {
	p_properties += "caption:hidden; ";
	p_properties += "align:center; ";
	p_properties += "resize:false; ";
	
	viewer("mainFrame").window.javaScript.onLoadPopupPageEx(p_popid,p_mode,p_properties);
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	������ popid�� ���ؼ� xrw ������ load�ϰ� ���� �����Ͱ� �ִ� �ν��Ͻ� ��ġ�� �����͸� ����
//	�ν��Ͻ� ��ġ�� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			popup ��ų xrw id
//	p_properties	â�� ���¿� ���õ� property
//					"640","400","" �� ������ ���̰ų�
//					���� ������ property�� ���� �� �ִ�.
//	p_ref			������ �����Ͱ� �ִ� �ν��Ͻ� ��ġ
//	p_resultref		�����͸� ���� �ν��Ͻ� ��ġ
//--------------------------------------------------------------------------------------------------
//���
//	true			�˾����� ���޵� �����Ͱ� ���� ��
//	false			�˾����� ���޵� �����Ͱ� ���� ��
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	open_popupEx(p_popid, p_properties, "/root/reqData/fwdData/" + p_popid.toLowerCase(), "/root/resData/rcvData/" + p_popid.toLowerCase());
//==================================================================================================
function open_popupEx(p_popid,p_properties,p_ref,p_resultref) {
	send_name = get_popup_send_property_name(p_popid);
	rcvs_name = get_popup_rcvs_property_name(p_popid);
	model.property(send_name) = make_value_list(p_ref);
	switch (p_properties) {
		case "640":
			show_popup640(p_popid.toUpperCase());
			break;
		case "400":
			show_popup400(p_popid.toUpperCase());
			break;
		case "":
			//�����̸� ǥ���� ũ�� 946*765�� �������� �Ѵ�.
			show_popup(p_popid.toUpperCase());
			break;
		default:
			//���鵵 �ƴϰ� ������ ����� �ƴ϶�� "width:640px; height:480px; " ���·� ���� ����� �Ѿ�Դٰ� �����Ѵ�.
			show_popupEx(p_popid.toUpperCase(),"modal",p_properties);
			break;
	}

	var rcvs_value_list = model.property(rcvs_name);

	model.property(send_name) = "";
	model.property(rcvs_name) = "";
	
	return save_value_list(p_resultref,rcvs_value_list);
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	������ popid�� ���ؼ� xrw ������ load�ϰ� ���� �����Ͱ� �ִ� �ν��Ͻ� ��ġ�� �����͸� ����
//	�ν��Ͻ� ��ġ�� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			popup ��ų xrw id
//	p_properties	â�� ���¿� ���õ� property
//					"640","400","" �� ������ ���̰ų�
//					���� ������ property�� ���� �� �ִ�.
//--------------------------------------------------------------------------------------------------
//���
//	true			�˾����� ���޵� �����Ͱ� ���� ��
//	false			�˾����� ���޵� �����Ͱ� ���� ��
//--------------------------------------------------------------------------------------------------
//����
//	ǥ������ ����ϱ� ���� �����Լ�
//	���� �������� ��ġ�� "/root/reqData/fwdData/" �Ʒ��� p_popid�� �ҹ��� ��ȯ �̸��� ���ٰ� �����ϰ�
//	���� �������� ��ġ�� "/root/resData/rcvData/" �Ʒ��� p_popid�� �ҹ��� ��ȯ �̸��� ���ٰ� ����
//	pop_id�� "fc_acct_1180" �� ���
//	ref = "/root/reqData/fwdData/fc_acct_1180"
//	resultref = "/root/resData/rcvData/fc_acct_1180"
//	�� ����.
//--------------------------------------------------------------------------------------------------
//����
//	MODE
//		'S' �ڵ� �˻�
//		'C' 1���� ��� �ڵ� �ݱ�	<- �ð����� ���� ������ ��� �� �� ����
//
//	function open_fc_acct_1180(mode) {_
//		var popid = "fc_acct_1180";
//		set_popup_send_data(popid		,"mode"			,mode			);
//		set_popup_send_data(popid		,"clsf_cd"		,dlco_clsf_cd.value	);
//		set_popup_send_data(popid		,"cd_f"			,dlco_cd.value		);
//		set_popup_send_data(popid		,"cd_t"			,dlco_cd.value		);
//		set_popup_send_data(popid		,"cd_abrv_nm"	,dlco_cd.value		);
//		
//		open_popup(popid,"640");
//		
//		if (get_popup_rcvs_data(popid,"clsf_cd") != "")		dlco_clsf_cd.value		=	get_popup_rcvs_data(popid,"clsf_cd");
//		if (get_popup_rcvs_data(popid,"cd") != "")			dlco_cd.value			=	get_popup_rcvs_data(popid,"cd");
//		if (get_popup_rcvs_data(popid,"cd_abrv_nm") != "")	dlco_nm.value			=	get_popup_rcvs_data(popid,"cd_abrv_nm");
//	}
//==================================================================================================
function open_popup(p_popid, p_properties) {
	return open_popupEx(p_popid, p_properties, get_popup_send_ref(p_popid), get_popup_rcvs_ref(p_popid));
}

//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�˾��� ����� ������Ƽ �̸��� p_popid �������� ��ȯ�Ѵ�. (�˾��� �޴� ���� ���� ������Ƽ)
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			popup ��ų xrw id
//--------------------------------------------------------------------------------------------------
//���
//	String			�˾��� ����� ������Ƽ �̸�
//--------------------------------------------------------------------------------------------------
//����
//
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function get_popup_send_property_name(p_popid) {
	return ("POP_SEND_" + p_popid.toUpperCase());
}

//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�˾��� ���� �� ���� ����ִ� ������Ƽ�� ���� �����´�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			popup ��ų xrw id
//--------------------------------------------------------------------------------------------------
//���
//	String			�˾��� ����� ������Ƽ �̸�
//--------------------------------------------------------------------------------------------------
//����
//	ǥ����ġ�� ����ϴ� ���
//	p_popid�� ����� ������Ƽ�� �̸��� Ȯ���ϰ�
//	�ش� ������Ƽ�� ���� �������� �Լ�
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function get_popup_send_property(p_popid) {
	return model.property(get_popup_send_property_name(p_popid)).Trim();
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�˾��� ���� �� ���� ������Ƽ�� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			popup ��ų xrw id
//--------------------------------------------------------------------------------------------------
//���
//	String			�˾��� ����� ������Ƽ �̸�
//--------------------------------------------------------------------------------------------------
//����
//	ǥ����ġ�� ����ϴ� ���
//	p_popid�� ����� ������Ƽ�� �̸��� Ȯ���ϰ�
//	�ش� ������Ƽ�� ���� �����ϴ� �Լ�
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function set_popup_send_property(p_popid,p_value) {
	model.property(get_popup_send_property_name(p_popid)) = p_value;
}

//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�˾��� ����� ������Ƽ �̸��� p_popid �������� ��ȯ�Ѵ�. (�˾��� ������ ���� ���� ������Ƽ)
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			popup ��ų xrw id
//--------------------------------------------------------------------------------------------------
//���
//	String			�˾��� ����� ������Ƽ �̸�
//--------------------------------------------------------------------------------------------------
//����
//
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function get_popup_rcvs_property_name(p_popid) {
	return ("POP_RCVS_" + p_popid.toUpperCase());
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�˾����� ���� �� ���� ����ִ� ������Ƽ�� ���� �����´�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			popup ��ų xrw id
//--------------------------------------------------------------------------------------------------
//���
//	String			�˾��� ����� ������Ƽ �̸�
//--------------------------------------------------------------------------------------------------
//����
//	ǥ����ġ�� ����ϴ� ���
//	p_popid�� ����� ������Ƽ�� �̸��� Ȯ���ϰ�
//	�ش� ������Ƽ�� ���� �������� �Լ�
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function get_popup_rcvs_property(p_popid) {
	return model.property(get_popup_rcvs_property_name(p_popid)).Trim();
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�˾����� ���� �� ���� ������Ƽ�� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			popup ��ų xrw id
//--------------------------------------------------------------------------------------------------
//���
//	String			�˾��� ����� ������Ƽ �̸�
//--------------------------------------------------------------------------------------------------
//����
//	ǥ����ġ�� ����ϴ� ���
//	p_popid�� ����� ������Ƽ�� �̸��� Ȯ���ϰ�
//	�ش� ������Ƽ�� ���� �����ϴ� �Լ�
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function set_popup_rcvs_property(p_popid,p_value) {
	model.property(get_popup_rcvs_property_name(p_popid)) = p_value;
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�˾��� ���� �� ���� ����ִ� �ν��Ͻ��� ǥ�� ��ġ�� p_popid�� �߰��Ͽ�
//	��ȯ�Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			popup ��ų xrw id
//--------------------------------------------------------------------------------------------------
//���
//	String			�˾��� ���� ���� �ִ� �ν��Ͻ� ��ġ
//--------------------------------------------------------------------------------------------------
//����
//
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function get_popup_send_ref(p_popid) {
	return (SEND_DATA_REF + "/" + p_popid.toLowerCase() + "/record");
	//return (SEND_DATA_REF + "/" + p_popid.toLowerCase());
}

//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�˾����� ���� ���� ���� ��ġ�� �ν��Ͻ��� ǥ�� ��ġ�� p_popid�� �߰��Ͽ�
//	��ȯ�Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			popup ��ų xrw id
//--------------------------------------------------------------------------------------------------
//���
//	String			�˾����� ���� ���� ���� ������ �ν��Ͻ� ��ġ
//--------------------------------------------------------------------------------------------------
//����
//
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function get_popup_rcvs_ref(p_popid) {
	return (RCVS_DATA_REF + "/" + p_popid.toLowerCase() + "/record");
	//return (RCVS_DATA_REF + "/" + p_popid.toLowerCase());
}

//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�˾��� ���� �� ���� �����ϴ� �Լ�
//	�⺻��ġ�� ��������ʴ� ��� �����ڰ� ���� ���� �����ϰ� ��������
//	model.getValue(), model.setValue() �Լ��� ����Ͽ� �ڵ��ϸ� ��
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			popup ��ų xrw id
//	p_name			������ element �̸�
//	p_value			������ ��
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//	�˾�ȣ��� ǥ����ġ�� ����� ��츸 ����� �� �ִ� �Լ�
//	�⺻��ġ + p_popid �� �ش��ϴ� �ν��Ͻ���
//	p_name�� ������ �̸����� p_value�� ���� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function set_popup_send_data(p_popid,p_name,p_value) {
	var ref = get_popup_send_ref(p_popid);
	model.makeValue(ref + "/" + p_name, p_value);
}

//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�˾��� �����ϱ����� ����� ���� �����ϴ� �Լ�
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			popup ��ų xrw id
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//	�˾����� ��� �۾��� �����ϰ� ȣ��
//	�Է°��� ������ �׻� ���� ��쿡�� ���� ȣ�� ���� �ʾƵ�
//	set_popup_send_data() �Լ��� ���� �����ϸ� override �Ǳ� ������
//	������ ȣ�� �� �ʿ�� ����.
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function reset_popup_send_data(p_popid) {
	reset_refnode(get_popup_send_ref(p_popid));
}

//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�˾����� ���޵� ������� �����ϴ� �Լ�
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			popup ��ų xrw id
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function reset_popup_rcvs_data(p_popid) {
	reset_refnode(get_popup_rcvs_ref(p_popid));
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�˾��� ���� �� ���� �������� �Լ�
//	�⺻��ġ�� ��������ʴ� ��� �����ڰ� ���� ���� �����ϰ� ��������
//	model.getValue(), model.setValue() �Լ��� ����Ͽ� �ڵ��ϸ� ��
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			popup ��ų xrw id
//	p_name			������ element �̸�
//--------------------------------------------------------------------------------------------------
//���
//	String			p_name�� �ش��ϴ� ��
//--------------------------------------------------------------------------------------------------
//����
//	�˾�ȣ��� ǥ����ġ�� ����� ��츸 ����� �� �ִ� �Լ�
//	�⺻��ġ + p_popid �� �ش��ϴ� �ν��Ͻ�����
//	p_name�� ������ �̸����� ����� ���� �����´�.
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function get_popup_send_data(p_popid,p_name) {
	return model.getValue(get_popup_send_ref(p_popid) + "/" + p_name).Trim();
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�˾����� ������ ���� �����ϴ� �Լ�
//	�⺻��ġ�� ��������ʴ� ��� �����ڰ� ���� ���� �����ϰ� ��������
//	model.getValue(), model.setValue() �Լ��� ����Ͽ� �ڵ��ϸ� ��
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			popup ��ų xrw id
//	p_name			������ element �̸�
//	p_value			������ ��
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//	�˾�ȣ��� ǥ����ġ�� ����� ��츸 ����� �� �ִ� �Լ�
//	�⺻��ġ + p_popid �� �ش��ϴ� �ν��Ͻ���
//	p_name�� ������ �̸����� p_value�� ���� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function set_popup_rcvs_data(p_popid,p_name,p_value) {
	var ref = get_popup_rcvs_ref(p_popid);
	model.makeValue(ref + "/" + p_name, p_value);
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�˾����� ���޵� ���� �������� �Լ�
//	�⺻��ġ�� ��������ʴ� ��� �����ڰ� ���� ���� �����ϰ� ��������
//	model.getValue(), model.setValue() �Լ��� ����Ͽ� �ڵ��ϸ� ��
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			popup ��ų xrw id
//	p_name			������ element �̸�
//--------------------------------------------------------------------------------------------------
//���
//	String			p_name�� �ش��ϴ� ��
//--------------------------------------------------------------------------------------------------
//����
//	�˾�ȣ��� ǥ����ġ�� ����� ��츸 ����� �� �ִ� �Լ�
//	�⺻��ġ + p_popid �� �ش��ϴ� �ν��Ͻ�����
//	p_name�� ������ �̸����� ����� ���� �����´�.
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function get_popup_rcvs_data(p_popid,p_name) {
	return model.getValue(get_popup_rcvs_ref(p_popid) + "/" + p_name).Trim();
}


//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	������ ���� value_list ���·� ������Ƽ�� �����ϰ� popup�� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			���� �˾��� xrw id
//	p_resultref		������ ���� �ִ� �ν��Ͻ��� ��ġ
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//	�˾�â ���忡�� ȣ���� â�� ����� ������ �Լ�
//	�⺻���� ��ġ�� ����Ѵ�.
//	/root/reqData/fwdData/p_popid ��ġ�� ���� ���� �ִٸ� �� �Լ��� ����ϰ�
//	�����ͱ׸����� Ư�� row�� ���� ��ȯ�ϰų� �ٸ� ��ġ�� ����Ϸ���
//	close_popupEx() �Լ��� ����ϸ� �ȴ�.
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function close_popup(p_popid) {
	close_popupEx(p_popid, get_popup_send_ref(p_popid));
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	iv_Title �̸����� ����ϴ� import�� xrw ������ Ÿ��Ʋ�� �����ϴ� �Լ�
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_title			������ Ÿ��Ʋ
//--------------------------------------------------------------------------------------------------
//���
//--------------------------------------------------------------------------------------------------
//����
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function set_popup_title(p_title) {
	iv_Title.group_tit.maintitle.value = p_title;
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	iv_Title �̸����� ����ϴ� import�� xrw ������ Ÿ��Ʋ�� ��ȯ�ϴ� �Լ�
//--------------------------------------------------------------------------------------------------
//�Է�
//--------------------------------------------------------------------------------------------------
//���
//	String			Ÿ��Ʋ
//--------------------------------------------------------------------------------------------------
//����
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function get_popup_title() {
	return iv_Title.group_tit.maintitle.value;
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	iv_Title �̸����� ����ϴ� import�� xrw ������ min ��ư�� visible ����
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_bool			true�̸� ��ư�� ���̰�
//					false�̸� ��ư�� ������ �ʴ´�.
//--------------------------------------------------------------------------------------------------
//���
//--------------------------------------------------------------------------------------------------
//����
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function set_popup_min(p_bool) {
	iv_Title.group_tit.btnMin.visible = p_bool;
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	iv_Title �̸����� ����ϴ� import�� xrw ������ max ��ư�� visible ����
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_bool			true�̸� ��ư�� ���̰�
//					false�̸� ��ư�� ������ �ʴ´�.
//--------------------------------------------------------------------------------------------------
//���
//--------------------------------------------------------------------------------------------------
//����
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function set_popup_max(p_bool) {
	iv_Title.group_tit.btnMax.visible = p_bool;
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	iv_Title �̸����� ����ϴ� import�� xrw ������ close ��ư�� visible ����
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_bool			true�̸� ��ư�� ���̰�
//					false�̸� ��ư�� ������ �ʴ´�.
//--------------------------------------------------------------------------------------------------
//���
//--------------------------------------------------------------------------------------------------
//����
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function set_popup_close(p_bool) {
	iv_Title.group_tit.btnClose.visible = p_bool;
}

//==================================================================================================
//�ۼ�
//  ������
//--------------------------------------------------------------------------------------------------
//���
//  �μ��� ���� ������ üũ��.
//--------------------------------------------------------------------------------------------------
//�Է�
//  dept_cd         �μ���
//--------------------------------------------------------------------------------------------------
//���
//  ����
//--------------------------------------------------------------------------------------------------
//����
//
//--------------------------------------------------------------------------------------------------
//����
//  if (fn_cmpcMgmt(clam_dept_cd.value) == false) {
//      return;
//  }
//  
//==================================================================================================

function fn_cmpcMgmt(dept_cd) {
    
    model.removeNodeset("/root/cmpcSrchData");  
    
    model.makeNode("/root/cmpcSrchData/cmpy_cd");
    model.makeNode("/root/cmpcSrchData/acct_cd");
    model.makeNode("/root/cmpcSrchData/dept_cd");
    model.makeNode("/root/cmpcSrchData/result");
    
    model.setValue("/root/cmpcSrchData/cmpy_cd", getProperty("ss_cmpycd"));
    model.setValue("/root/cmpcSrchData/acct_cd", getProperty("ss_uid"));
    model.setValue("/root/cmpcSrchData/dept_cd", dept_cd);
    
    send_submission(
            "fc_co_8003_s"
        ,   "/root/cmpcSrchData"
        ,   "/root/cmpcSrchData/result"
        ,   "/fc/co8000/8003"
        ,   "urlencoded-post"
        ,   "application/x-www-form-urlencoded"
    );
    
    if (model.getValue("/root/cmpcSrchData/errData/errcode") != "") {
        return false;
    }
    
    return true;
}

//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	submit_completed()�Լ��� ��������� submission�� ����/���� ���θ� Ȯ���ϰ�
//	������ ������ �޽���, ���н� ������ �޽����� ���� �����ش�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_success_msg			������ ����ڿ��� ������ �޽���
//	p_faild_msg				���н� ����ڿ��� ������ �޽���
//--------------------------------------------------------------------------------------------------
//���
//	Boolean					submit_completed()�� �����
//--------------------------------------------------------------------------------------------------
//����
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function check_submit_completed(p_success_msg, p_faild_msg) {
	if (p_success_msg == null) {
		p_success_msg = "";
	}
	if (p_faild_msg == null) {
		p_faild_msg = "";
	}	

	//Ȯ��
	if(submit_completed()) {
		//����
		if (p_success_msg != "") show_message(p_success_msg,"������ ó�� Ȯ��");
		return true;
	}
	else {
		//����
		if (p_faild_msg != "") show_message(p_faild_msg,"������ ó�� Ȯ��");
		return false;
	}
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�Է� �׸��� ���� ���� �Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	1:object			üũ�� instance path Ȥ�� control
//	2:string			���ڿ� ��,���� ������ ���� �� �� ����, "TRIM","LTRIM","RTRIM","NONE"
//	3:string			�ʼ��׸� üũ�� ���� ���� ��� focus�� ���� ����, "FOCUS", "NONE"
//	4:string			�ʼ��׸� üũ�� ���� ���� ��� ���� �� �޽���, �׸��� �̸��� �ѱ�� ��.
//	5:string			üũ�� �׸� ���� ����(�����ڴ� ',' ���)
//						5-1:	����
//						5-2:	n���� ũ�ų� ����.
//						5-3:	n���� �۰ų� ����.
//--------------------------------------------------------------------------------------------------
//���
//	true				���� ó��
//	false				�Է��׸� ������ ����, �׸��� ������ ���
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	check_reqValue(srch_cd,"trim","focus","6,10,20");
//==================================================================================================
function check_valItem(p_obj) {
	var flag = false;
	var val = "";
	var focus_target = "";
	var focus_type = "";
	var trim_type = "";
	var item_name = "";
	var validation_itemList = null;

	if (arguments.length < 1) {
		show_message("������ ���� �׸��� �������� �ʾҽ��ϴ�.");
		return flag;
	}

	//trim ����
	if (arguments[1] == null || arguments[1].Trim() == "") {
		trim_type = TRIM_TYPE_NONE;
	}
	trim_type = arguments[1].toUpperCase();	
	
	//focus ��� Ȯ��
	if (typeof(arguments[2]) == DATA_TYPE_OBJECT) {
		//���� focus type�� object�� �Ѿ�� ��� �ش� ������Ʈ�� focus�Ѵ�.
		//arguments[0]�� arguments[2]�� ���ÿ� object��� 2���� �켱
		focus_target = eval(arguments[2]).attribute("id");
		focus_type = FOCUS_TYPE_FOCUS;
	}
	else if (typeof(arguments[0]) == DATA_TYPE_OBJECT) {
		//���� focus type�� object�� �ƴ� focus ���� ���ڿ��� �����ȴٸ�
		//ù��° �μ��� focus �Ѵ�.
		focus_target = eval(arguments[0]).attribute("id");
	}
	else {
		//���� focus type�� ���ڿ� ������ focus ���η� �Ѿ����
		//üũ�� ���� object�� �ƴ� instance ���·� �Ѿ�Դٸ�
		//��Ŀ���� �� �ʿ䰡 ����.
		focus_target = "";
	}
	
	//focus�� object�� �ƴ� ���� ó��
	//focus�� object��� focus�� ������ object�� �̵���Ų��.
	if (typeof(arguments[2]) != DATA_TYPE_OBJECT) {
		//focus ����
		if (arguments[2] == null || arguments[2].Trim() == "") {
			focus_type = FOCUS_TYPE_NONE;
		}
		focus_type = arguments[2].toUpperCase();		
	}

	//message ����
	//�Է±������� Ȯ���ϰ� ��Ʈ�ѿ� caption attribute�� �ִ� ��� �ϴܿ��� �ٽ� ����
	if (arguments[3] == null || arguments[3].Trim() == "") {
		item_name = "";
	}
	else {
		item_name = arguments[3];
	}

	//�� ��������
	//���ڿ��� ��� üũ�� �ν��Ͻ� ��ġ��� ����
	if (typeof(arguments[0]) == DATA_TYPE_STRING) {
		val = get_validation_value_instance(arguments[0]);
	}
	else if (typeof(arguments[0]) == DATA_TYPE_OBJECT) {
		val = get_validation_value_object(arguments[0]);
		if (item_name == "") {
			item_name = eval(arguments[0]).attribute("caption");
		}
	}
	else {
		show_message("üũ�� �� ���� ���Դϴ�.");
		return flag;
	}
	//������ trim���·� �� ��ȯ
	val = remove_space(val,trim_type);

	//validation item
	if (arguments[4] == null || arguments[4].Trim() == "") {
		arguments[4] = "";
	}
	
	validation_itemList = arguments[4].Trim().split(PARSE_ITEMSEP);

	//�ݺ����� �����ϱ��� true�� �����س���
	//�ݺ��߿� validation ������ false�� ����
	flag = true;
	for(var i = 0;i < validation_itemList.length;i++) {
		if (validation_itemList[i].Trim() == "") {
			continue;
		}
		
		if(!check_validation_item(i,item_name,val,validation_itemList[i].Trim())) {
			flag = false;
			break;
		}
	}
	
	if (!flag) {
		if (focus_type == FOCUS_TYPE_FOCUS && focus_target != "") {
			model.setFocus(focus_target);
		}
	}

	return flag;
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	����, ���񱳸� ���ؼ� �־��� ���� ���ذ��� �մ����� ����
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_mode				number, üũ���
//							VALIDATION_LENGTH		����üũ
//							VALIDATION_GTEQ			greater than or equal
//							VALIDATION_LTEQ			less than or equal
//	p_itemname			string, ���� üũ�ϰ� �ִ� �������� �̸�, �޽����� ���
//	p_item				string, ���� üũ�ϰ��� �ϴ� ���� ���ڿ�
//	p_check				string, üũ�ϰ��� �ϴ� ���ذ�
//							VALIDATION_LENGTH		p_item�� ���̿� ���� ����
//							VALIDATION_GTEQ			p_item < p_check�� �� �� ��, p_item >= p_check 
//							VALIDATION_LTEQ			p_item > p_check�� �� �� ��, p_item <= p_check 
//--------------------------------------------------------------------------------------------------
//���
//	boolean, true		������ ������ ���
//	boolean, false		������ ������ ���
//--------------------------------------------------------------------------------------------------
//����
//--------------------------------------------------------------------------------------------------
//����
//==================================================================================================
function check_validation_item(p_mode,p_itemname,p_item,p_check) {
	var flag = true;
	var msg_title = "�Է��׸����";
	
	switch(p_mode) {
		case VALIDATION_LENGTH:
			if (p_item.length != Number(p_check)) {
				//���̰� �ٸ� ���
				flag = false;
				if ("" != p_itemname.Trim()) {
					show_message(p_itemname + "�� ���̴� " + Number(p_check) + "�ڸ��� �Է��ϼ���.",msg_title);
				}
			}
			break;
		case VALIDATION_GTEQ:
			if (p_item < p_check) {
				//���� �� ���� ���
				flag = false;
				if ("" != p_itemname.Trim()) {
					show_message(p_itemname + "�� ����" + p_check + "���� ũ�� �Է��ϼ���.",msg_title);
				}
			}
			break;
		case VALIDATION_LTEQ:
			if (p_item > p_check) {
				//���� �� ū ���
				flag = false;
				if ("" != p_itemname.Trim()) {
					show_message(p_itemname + "�� ����" + p_check + "���� �۰� �Է��ϼ���.",msg_title);
				}
			}
			break;
		default:
			//�׿��� ��� ó������ �ʴ´�, true�� ��ȯ
			break;
	}
	
	return flag;
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	�Էµ� p_ref path���� ���� �����´�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_ref				string, ���� ����� instance path
//--------------------------------------------------------------------------------------------------
//���
//	string				�ν��Ͻ��� ��
//--------------------------------------------------------------------------------------------------
//����
//	model.getValue()�� ����Ͽ� ���� ��ȯ�Ѵ�.
//	p_ref�� "" �� ��� ������ "" ��ȯ
//--------------------------------------------------------------------------------------------------
//����
//==================================================================================================
function get_validation_value_instance(p_ref) {
	var return_value = "";
	p_ref = p_ref.Trim();
	
	if (p_ref == "") {
		return return_value;
	}
	
	return_value = model.getValue(p_ref);

	return return_value;
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	p_obj control�� ���� ��ȯ�Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_obj				object, ���� ����� control
//--------------------------------------------------------------------------------------------------
//���
//	string				control�� ��
//--------------------------------------------------------------------------------------------------
//����
//	control�� ���� ����� property�� ����Ͽ� ���� �����ͼ� ��ȯ
//--------------------------------------------------------------------------------------------------
//����
//==================================================================================================
function get_validation_value_object(p_obj) {
	var return_value = "";
	var obj = eval(p_obj);
	
	switch (p_obj.elementName) {
		case XFORMS_CONTROL_COMBO:
			return_value = obj.value;
			break;
		case XFORMS_CONTROL_INPUT:
			return_value = obj.value;
			break;
		default:
			show_message("üũ �� �� ���� ���Դϴ�.");
			break;
	}
	return return_value;
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	p_obj�� ������ control�� ref�� �����Ͽ� mapping�� instance�� ���� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_obj				object, instance�� ���ε� control
//	p_value				string, ������ ��
//	p_refresh			boolean, true�� ��� control�� refresh, false�� ��� ��ó��
//--------------------------------------------------------------------------------------------------
//���
//--------------------------------------------------------------------------------------------------
//����
//--------------------------------------------------------------------------------------------------
//����
//==================================================================================================
function set_object_value(p_obj,p_value,p_refresh,p_raise) {
	if (typeof(p_obj) != DATA_TYPE_OBJECT) {
		return;
	}

	var obj = eval(p_obj);
	var ref = obj.attribute("ref");
	
	if (ref == "") {
		return;
	}

	
	try {
		model.setValue(ref,p_value);
	}
	catch(ex) {
		model.makeValue(ref,p_value);
	}
	
	if (p_refresh == true) {
		obj.refresh();
	}
	if (true == p_raise) {
		obj.dispatch("xforms-value-changed");
	}
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	p_obj�� ������ control�� ref�� �����Ͽ� mapping�� instance�� ���� ��ȯ�Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_obj				object, instance�� ���ε� control
//--------------------------------------------------------------------------------------------------
//���
//	string				ref�� ��
//--------------------------------------------------------------------------------------------------
//����
//--------------------------------------------------------------------------------------------------
//����
//==================================================================================================
function get_object_value(p_obj) {
	var return_value = "";
	
	if (typeof(p_obj) != DATA_TYPE_OBJECT) {
		return return_value;
	}
	
	var obj = eval(p_obj);
	var ref = obj.attribute("ref");
	
	if (ref == "") {
		return return_value;
	}
	
	return_value = model.getValue(ref);
	
	return return_value;
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	p_ref �����Ͽ� mapping�� instance�� ���� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_ref				instance path
//	p_value				������ ��
//--------------------------------------------------------------------------------------------------
//���
//--------------------------------------------------------------------------------------------------
//����
//--------------------------------------------------------------------------------------------------
//����
//==================================================================================================
function set_instance_value(p_ref,p_value) {
	if (typeof(p_ref) != DATA_TYPE_STRING) {
		return return_value;
	}	
	
	var ref = p_ref;
	
	if (ref == "") {
		return;
	}
	
	try {
		model.setValue(ref,p_value);
	}
	catch(ex) {
		model.makeValue(ref,p_value);
	}
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	p_ref �����Ͽ� mapping�� instance�� ���� ��ȯ�Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_ref				instance path
//--------------------------------------------------------------------------------------------------
//���
//	string				ref�� ��
//--------------------------------------------------------------------------------------------------
//����
//--------------------------------------------------------------------------------------------------
//����
//==================================================================================================
function get_instance_value(p_ref) {
	var return_value = "";

	if (typeof(p_ref) != DATA_TYPE_STRING) {
		return return_value;
	}	

	var ref = p_ref;
	
	if (ref == "") {
		return return_value;
	}

	return_value = model.getValue(ref);
	
	return return_value;
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	control���� ������ instance path�� ã�ų� ����� ������ instance path��
//	p_value�� ���� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_item				object(control) Ȥ�� instance path
//	p_value				������ ��
//	string,boolean		control�� refresh����
//--------------------------------------------------------------------------------------------------
//���
//--------------------------------------------------------------------------------------------------
//����
//	�ν��Ͻ��� ��� refresh�� ���ܵǰ�, control�� ��� �Էµ� ���� ����Ͽ� refresh���θ�
//	Ȯ���Ͽ� �μ��� ������, �⺻�� false
//--------------------------------------------------------------------------------------------------
//����
//==================================================================================================
function set_refvalue(p_item,p_value) {
	var refresh = true;
	var raise = false;

	//refresh ����
	if (arguments[2] != null) {
		if (typeof(arguments[2]) == DATA_TYPE_STRING) {
			refresh = convert_to_bool(arguments[2],true);
		}
		else if  (typeof(arguments[2]) == DATA_TYPE_BOOLEAN) {
			refresh = eval(arguments[2]);
		}
		else {
			alert("program error else case");	
		}
	}

	//value-changed ����
	if (arguments[3] != null) {
		if (typeof(arguments[3]) == DATA_TYPE_STRING) {
			raise = convert_to_bool(arguments[3],true);
		}
		else if  (typeof(arguments[3]) == DATA_TYPE_BOOLEAN) {
			raise = eval(arguments[3]);
		}
		else {
			alert("program error else case");	
		}
	}
	
	if (typeof(p_item) == DATA_TYPE_STRING) {
		set_instance_value(p_item,p_value);
	}
	else if (typeof(p_item) == DATA_TYPE_OBJECT) {
		set_object_value(p_item,p_value,refresh,raise);
	}
	else {
		show_message("�߸��� item ����");
	}
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	control���� ������ instance path�� ã�ų� ����� ������ instance path����
//	���� ã�Ƽ� ��ȯ�Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_item				object(control) Ȥ�� instance path
//--------------------------------------------------------------------------------------------------
//���
//	string				instance�� ��
//--------------------------------------------------------------------------------------------------
//����
//--------------------------------------------------------------------------------------------------
//����
//==================================================================================================
function get_refvalue(p_item) {
	if (typeof(p_item) == DATA_TYPE_STRING) {
		return get_instance_value(p_item);
	}
	else if (typeof(p_item) == DATA_TYPE_OBJECT) {
		return get_object_value(p_item);
	}
	else {
		show_message("�߸��� item ����");
	}
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	���ڿ��� ������ �� ��¥�� ���̸� ����ؼ� ��ȯ�Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_from				string, ������
//	p_to				string, ������
//--------------------------------------------------------------------------------------------------
//���
//	number				��¥���� ���� ��
//						����� �Ұ����� ���� ���´ٸ� 0���� ��ȯ�Ѵ�.
//--------------------------------------------------------------------------------------------------
//����
//	p_to ���� p_from �� �� ���� ����Ѵ�.
//--------------------------------------------------------------------------------------------------
//����
//==================================================================================================
function get_datediff(p_from,p_to) {
	var diff = 0;
	var error_disp = false;

	//����ǥ�ÿ���
	if (arguments[2] != null) {
		if (typeof(arguments[2]) == DATA_TYPE_STRING) {
			error_disp = convert_to_bool(arguments[2],false);
		}
		else if  (typeof(arguments[2]) == DATA_TYPE_BOOLEAN) {
			error_disp = eval(arguments[2]);
		}
	}
	
	//������ üũ
	if (typeof(p_from) != DATA_TYPE_STRING) {
		if (error_disp) {
			show_message("get_datediff()\n������ �Է� �� ����");
		}
		return diff;
	}
	
	//������ üũ
	if (typeof(p_to) != DATA_TYPE_STRING) {
		if (error_disp) {
			show_message("get_datediff()\n������ �Է� �� ����");
		}
		return diff;
	}
	
	var from_dt = p_from.ToDate();
	var to_dt =	p_to.ToDate();
	
	//������ üũ
	if (from_dt == null) {
		if (error_disp) {
			show_message("get_datediff()\n������ �Է� �� ����");
		}
		return diff;
	}
	
	//������ üũ
	if (to_dt == null) {
		if (error_disp) {
			show_message("get_datediff()\n������ �Է� �� ����");
		}
		return diff;
	}
	
	return to_dt.Diff(from_dt);
}

//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	���ڿ��� boolean ������ ��ȯ�ϰ� ��ȯ�ϸ�, ��ȯ�� ������ ��� default ������ ��ȯ�Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_str				��ȯ�� ���ڿ�
//	p_default			��ȯ���н� ������ �⺻��
//--------------------------------------------------------------------------------------------------
//���
//	true
//	false
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//==================================================================================================
function convert_to_bool(p_str,p_default) {
	var b;
		
	try {
		b = eval(p_str.toLowerCase());
	}
	catch(ex) {
		b = p_default;
	}
	finally {
		
	}
	
	return b;
}

function string_to_bool(p_str,p_default) {
	return convert_to_bool(p_str,p_default);
}

function number_to_bool(p_num,p_default) {
	var b;
	
	try {
		b = Boolean(p_num);
	}
	catch(ex) {
		b = p_default;
	}
	finally {
		
	}
	
	return b;
}

//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	��� obj(datagrid)�� p_row�� p_col ��ġ�� cell text color�� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_obj				datagrid, ��� datagrid
//	p_row				��� rowid
//	p_col				��� colid
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//	������ ��ġ�� �� �ؽ�Ʈ ������ ���� ������ �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//����
//==================================================================================================
function add_datagrid_error(p_obj,p_row,p_col) {
	var obj = eval(p_obj);
	obj.cellStyle("color",p_row,p_col) = DEFAULT_DATAGRID_TEXT_COLOR_ERROR;
}

//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	��� obj(datagrid)�� p_row�� p_col ��ġ�� cell text color�� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_obj				datagrid, ��� datagrid
//	p_row				��� rowid
//	p_col				��� colid
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//	������ ��ġ�� �� �ؽ�Ʈ ������ �⺻ ������ �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//����
//==================================================================================================
function del_datagrid_error(p_obj,p_row,p_col) {
	var obj = eval(p_obj);
	obj.cellStyle("color",p_row,p_col) = DEFAULT_DATAGRID_TEXT_COLOR_NORMAL;
}

//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	p_obj�� �Ѿ�� datagrid�� p_colid�� �������� ������ Ȯ���ϰ�
//	Ư�� row�� p_colid�� �ش��ϴ� ���� ���� ��ġ�� ������ �۰ų�, �Ʒ� ��ġ�� ������ ū ���
//	�ش� row�� p_colid cell�� text ������ �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_obj				datagrid, ��� datagrid
//	p_colid				Number, ��� column
//	arguments[2]		Number, ��� row
//--------------------------------------------------------------------------------------------------
//���
//	Array[2]			Number[2],	Array(0)�� ���� ������ ���� ����� ����,
//									Array(1)�� �Ʒ� ������ ū ����� ����
//--------------------------------------------------------------------------------------------------
//����
//	��ȯ�� �迭�� ����ؼ� ������ �޽����� ����ϴ� ���·� ����ϸ� ��
//	�� �޼��带 ��� �� ����
//	�׸��忡 ������ �ٽ� ��ȸ�ǰų� ����Ǵ� ��� datagrid.rebuildStyle() �Լ���
//	Ư�� ���� ������ ��Ÿ���� �ʱ�ȭ ���Ѿ� �Ѵ�.
//--------------------------------------------------------------------------------------------------
//����
//==================================================================================================
function check_datagrid_data_sequence(p_obj,p_colid) {
	var obj = eval(p_obj);
	var rowid = -1;
	var colid = -1;
	var base_value = "";
	var curr_value = "";
	var gcount = 0;
	var lcount = 0;
	
	colid = Number(p_colid);
	
	//rowid ���� ����
	if (arguments[2] != null) {
		rowid = Number(arguments[2]);
	}
	
	for (var j = obj.fixedRows;j < obj.rows;j++) {
		if (rowid != j && rowid >= obj.fixedRows) {
			continue;
		}
		
		del_datagrid_error(obj,j,colid);
		
		base_value = obj.valueMatrix(j,colid).Trim();
		
		if (base_value == "") {
			continue;
		}

		//���� �����Ͱ� ���������ͺ��� ������ ����
		for (var i = obj.fixedRows; i < j;i++) {
			curr_value = obj.valueMatrix(i,colid).Trim();
			
			if (curr_value == "") {
				continue;
			}
			
			if (base_value < curr_value) {
				add_datagrid_error(obj,j,colid);
				//���絥���Ͱ� ���������ͺ��� �۴ٸ� -1�� ��ȯ
				lcount++;
				break;
			}
		}
		
		//���� �����Ͱ� ���������ͺ��� ū�� ����
		for (var i = j + 1; i < obj.rows;i++) {
			curr_value = obj.valueMatrix(i,colid).Trim();
			
			if (curr_value == "") {
				continue;
			}
			
			if (base_value > curr_value) {
				add_datagrid_error(obj,j,colid);
				//���絥���Ͱ� ���������ͺ��� �۴ٸ� -1�� ��ȯ
				gcount++;
				break;
			}
		}
	}
	
	return new Array (lcount,gcount);
}

//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	p_obj�� ������ datagrid���� �ʼ���(class==req) Ȥ�� ������ column�� ��� ������ ��쿡
//	�ش� rowstatus�� clear ��Ų��.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_obj				datagrid,üũ�� datagrid
//	arguments[1]		string, üũ�� col list. �������� req �ʵ带 ������� �˻��Ѵ�. 
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//	��� datagrid�� �Է�,����,������ ��󿡼� ������ row�� Ȯ���ϱ� ���� �Լ�
//--------------------------------------------------------------------------------------------------
//����
//	
//==================================================================================================
function del_datagrid_reqdata_empty(p_obj) {
	var obj = eval(p_obj);
	var rowstatus = 0;
	var need_del = false;
	var cell_value = "";
	var col_list = null;
	var req_mode = true;	//req_mode �� true�̸� req�� üũ�ϰ�, �ƴϸ� ������ col_list�� �ش��ϴ� column�� �������
	var key_flag = false;
	var key_mode = false;

	//�÷���� ���� ����
	if (arguments[1] != null && arguments[1] != "") {
		col_list = datagrid_colname_to_colid(obj,arguments[1]).split(PARSE_ITEMSEP);
		req_mode = false;
	}
	else {
		col_list = "-1".split(PARSE_ITEMSEP);
		req_mode = true;
	}

	//Ű��� ���� ����
	if (arguments[2] != null && arguments[2] != "") {
		key_list = datagrid_colname_to_colid(obj,arguments[2]).split(PARSE_ITEMSEP);
		key_mode = true;
	}
	else {
		key_list = "-1".split(PARSE_ITEMSEP);
		key_mode = false;
	}	
	
	for(var row = obj.fixedRows;row < obj.rows;row++) {
		rowstatus = obj.rowStatus(row);
		if (rowstatus == DATAGRID_ROWSTATUS_NONE) {
			continue;
		}
		
		need_del = true;
		
		for(var col = obj.fixedCols;col < obj.cols;col++) {
			if ((obj.colAttribute(col,"class").indexOf("req") != -1 && req_mode) || (array_contains(col_list,col) && !req_mode)) {
				cell_value = obj.valueMatrix(row,col).Trim();
				if (cell_value != "") {
					need_del = false;
					break;
				}
			}
		}

		key_flag = true;
		
		for(var col = obj.fixedCols;col < obj.cols;col++) {
			if (array_contains(key_list,col)) {
				cell_value = obj.valueMatrix(row,col).Trim();
				if (cell_value == "") {
					key_flag = false;
					break;
				}
			}
		}
		
		if (key_mode && key_flag) {
			rowstatus = DATAGRID_ROWSTATUS_UPDATE;
		}
		else {
			rowstatus = DATAGRID_ROWSTATUS_NONE;
		}
		
		if (need_del) {
			obj.rowStatus(row) = rowstatus;
		}
	}
}

function add_datagrid_reqdata_empty(p_obj) {
	var obj = eval(p_obj);
	var rowstatus = 0;
	var need_add = false;
	var cell_value = "";
	var col_list = null;
	var key_list = null;
	var req_mode = true;	//req_mode �� true�̸� req�� üũ�ϰ�, �ƴϸ� ������ col_list�� �ش��ϴ� column�� �������
	var key_flag = false;

	//�÷���� ���� ����
	if (arguments[1] != null && arguments[1] != "") {
		col_list = datagrid_colname_to_colid(obj,arguments[1]).split(PARSE_ITEMSEP);
		req_mode = false;
	}
	else {
		col_list = "-1".split(PARSE_ITEMSEP);
		req_mode = true;
	}
	
	//Ű��� ���� ����
	if (arguments[2] != null && arguments[2] != "") {
		key_list = datagrid_colname_to_colid(obj,arguments[2]).split(PARSE_ITEMSEP);
		key_mode = true;
	}
	else {
		key_list = "-1".split(PARSE_ITEMSEP);
		key_mode = false;
	}
	
	for(var row = obj.fixedRows;row < obj.rows;row++) {
		rowstatus = obj.rowStatus(row);
		if (rowstatus != DATAGRID_ROWSTATUS_NONE) {
			continue;
		}
		
		need_add = true
		
		for(var col = obj.fixedCols;col < obj.cols;col++) {
			if ((obj.colAttribute(col,"class").indexOf("req") != -1 && req_mode) || (array_contains(col_list,col) && !req_mode)) {
				cell_value = obj.valueMatrix(row,col).Trim();
				if (cell_value != "") {
					need_add = false;
					break;
				}
			}
		}
		
		key_flag = true;
		
		for(var col = obj.fixedCols;col < obj.cols;col++) {
			if (array_contains(key_list,col)) {
				cell_value = obj.valueMatrix(row,col).Trim();
				if (cell_value == "") {
					key_flag = false;
					break; 
				}
			}
		}
		
		if (key_mode && key_flag) {
			rowstatus = DATAGRID_ROWSTATUS_UPDATE;
		}
		else {
			rowstatus = DATAGRID_ROWSTATUS_INSERT;
		}
		
		if (need_add) {
			obj.rowStatus(row) = rowstatus;
		}
	}
}

//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	p_array�� ���޵� �迭�� p_value ���� �ִ��� üũ�Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_array				Array, ���� ����ִ� �迭
//	p_value				String,Number, �迭�� �ִ��� üũ�� ��
//--------------------------------------------------------------------------------------------------
//���
//	true				�迭�� ������ p_value�� ����
//	false				�迭�� ������ p_value�� ����
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	array_contains(col_list,col));
//==================================================================================================
function array_contains(p_array,p_value) {
	for (var i = 0;i < p_array.length;i++) {
		if (p_array[i] == p_value) {
			return true;
		}
	}	
	return false;
}

//==================================================================================================
//�ۼ�
//	����ȣ
//--------------------------------------------------------------------------------------------------
//���
//	datagrid ����,�Է»��� üũ
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_obj				üũ�� datagrid
//--------------------------------------------------------------------------------------------------
//���
//	true				����,�Է»����� ����
//	false				����,�Է»����� ����
//--------------------------------------------------------------------------------------------------
//����
//	
//--------------------------------------------------------------------------------------------------
//����
//	datagrid_data_check("datagrid1");
//==================================================================================================
function datagrid_data_check(p_obj){
	var obj = eval(p_obj);
	var t_ctn = 0;
	for(i = obj.fixedRows;i<obj.rows;i++){
		t_ctn = t_ctn + obj.rowStatus(i);
	}
	if(t_ctn<1){
		return false;
	}
	return true;
}

//�⵵�� spin control ������ ��� �� �Լ�
function change_yyyy(p_target,p_mode) {
	var yyyy = get_refvalue(p_target);
	var add_value = 0;
	if (p_mode == UPDOWN_UP) {
		add_value = 1;
	}
	else if (p_mode == UPDOWN_DN) {
		add_value = -1;
	}
	yyyy = Number(yyyy) + add_value;
	set_refvalue(p_target,yyyy);
}

/* 
//input event���� onbuttonclick �̺�Ʈ�� ������ �ٸ� �̺�Ʈ�� �ߺ��� ���
//��ư�� �������� Ȯ���Ѵ�. �� ���� onbuttonclick �̺�Ʈ�� �߻����� �ʰ� �ٸ� �̺�Ʈ�� ���� �����ϸ鼭
//onbuttonclick event�� ���� �������� �ʴ� ��츦 Ȯ���ϱ� ���� �Լ�
function check_dup_input_event() {
	if (event == null || event.button <= 0 || event.down == "" || event.name != "xforms-value-changed") {
		return false;
	}

	//������ ��ư�� ���� value-changed �̺�Ʈ�� currentTarget�� ������ Ȯ���ؾ���.
	//���� ����� ��Ʈ�Ѱ� ������ ��Ʈ���� Ʋ���ٸ�
	//������ ��Ʈ���� buttonclick event�� �����ϰ���
	//false�� ��ȯ���� value change �̺�Ʈ�� �����ؾ��ϰ�
	//���ٸ� ��ư Ŭ�� �̺�Ʈ�� �����ϰ�
	//value-changed�� ������ ���� �ʵ��� true�� ��ȯ�ؾ���.

    var downcontrol = "";
    var targetcontrol = "";
	if (eval(event.currentTarget).elementName == XFORMS_CONTROL_DATAGRID) {
		targetcontrol = event.currentTarget;
		downcontrol = eval(event.down).parent.parent.attribute("id");
	}
	else if (eval(event.currentTarget).elementName == XFORMS_CONTROL_INPUT) {
		targetcontrol = event.currentTarget;
		downcontrol = eval(event.down).parent.attribute("id");
	}
	else {
		targetcontrol = "";
		downcontrol = "";
	}
	
	if (targetcontrol == "" || downcontrol == "") {
		return false;
	}

	if (targetcontrol == downcontrol) {
		//alert("raise " + downcontrol + ".onbuttonclick");
		eval(downcontrol).dispatch("onbuttonclick");
		//���� �̺�Ʈ�� ������� �ʵ��� ���´�.
		event.preventDefault();
		return true;
	}
	
	return false;
}
*/

function check_dup_input_event() {
	if (event.button > 0 && event.down == event.currentTarget + ".button" && event.name != "onbuttonclick") {
		//onbuttonclick event�� ������Ű��
		eval(event.currentTarget).dispatch("onbuttonclick");
		//���� �̺�Ʈ�� ������� �ʵ��� ���´�.
		event.preventDefault();
		return true;
	}
	
	return false;
}

//�˾��� ȣ���ϴ� ���� �Լ�
//���ο��� trustform�� event�� Ȯ���ؼ�
//�ʿ��� ��� �˾� ȣ�� ��� ���� �����͸� ã�Ƽ� ��ȯ�ϴ� ���·� �����ǰ�
//value-changed�� buttonclick �̺�Ʈ�� ���ÿ� �߻����� ���
//buttonclick �̺�Ʈ�� Ÿ���� �����Ѵ�.
//p_more�� value-changed�� 2�� �̻��� �����Ͱ� ���� ��� popup�� �������� ����
function call_popup(p_popid,p_subid,p_cursor,p_properties,p_more) {
	//�˾�â�� ����� �� �� ���� ���� ����
	var need_popup = true;
	//�˾����� �����Ͱ� ���޵Ǿ����� ���� ���� ����
	var rcvs_flag = false;
	var actionid = "";
	var totalcnt = 0;
	var more = true;
	
	//more ����
	if (p_more != null) {
		if (typeof(p_more) == DATA_TYPE_STRING) {
			more = convert_to_bool(p_more,true);
		}
		else if  (typeof(p_more) == DATA_TYPE_BOOLEAN) {
			more = eval(p_more);
		}
		else {

		}
	}
	
	p_subid = (p_subid == null) ? "" : p_subid;
	p_cursor = (p_cursor == null) ? "" : p_cursor;
	
	//��ưŬ������ �̺�Ʈ�� �߻��ϱ� ����
	//value-changed �̺�Ʈ�� ���� �߻��� ���
	//input button�� ���� ��ư�� Ŭ���ƴ��� ���θ� Ȯ���Ѵ�.
	if (event != null && event.name == "xforms-value-changed") {
		if (check_dup_input_event()) {
			//�̹� buttonclick���� �ʿ��� �۾��� �������Ƿ� false�� ��ȯ�ؼ� �ߺ��۾��� ���ش�.
			return rcvs_flag;
		}
	}
	
	//������ ��ȸ�Ǿ��� �ڷḦ �����Ѵ�.
	//reset_popup_rcvs_data(p_popid);

	//p_subid�� �����Ǿ��� ���� �����Ѵ�.
	if (p_subid.Trim() != "") {
		//���� �Լ��� ������ �̺�Ʈ�� value-changed���� Ȯ���Ѵ�.
		if (event != null && event.name == "xforms-value-changed") {
			var act_info = p_subid.split("_");
			var system_cd = act_info[0];
			var part_cd = act_info[1];
			var servlet_id = act_info[2];
			var servlet_cd = servlet_id.substr(0,1) + "000";
			
			//�ʼ��׸��� �ԷµǾ����� Ȯ���ϰ� �Էµ��� ���� �ʼ� �׸��� �ִ� ��� 
			var required = true;
			var require_list = get_popup_send_data(p_popid,"require").split(PARSE_ITEMSEP);
			for(var i = 0;i < require_list.length;i++) {
				var require_item = require_list[i].Trim();
				if (require_item != "" && get_popup_send_data(p_popid,require_item) == "") {
					required = false;
					break;
				}
			}

			if (required) {
				actionid = "/" + system_cd + "/" + part_cd + servlet_cd + "/" + servlet_id;

				reset_popup_rcvs_data(p_popid);

				send_submission(
						"auto_" + p_subid
					,	get_popup_send_ref(p_popid)
					,	get_popup_rcvs_ref(p_subid) + "/dataSet"
					,	actionid
					,	"urlencoded-post"
					,	"application/x-www-form-urlencoded"
				);
			
				totalcnt = get_refvalue(get_popup_rcvs_ref(p_subid) + "/dataSet" + "/" + p_cursor + "/totalcnt");

				if (totalcnt == 1) {
					copy_refnode(get_popup_rcvs_ref(p_popid),get_popup_rcvs_ref(p_subid) + "/dataSet/" + p_cursor + "/record");
					need_popup = false;
					rcvs_flag = true;
				}
				else if (totalcnt == 0) {
					need_popup = false;	
					rcvs_flag = false;
				}
				else {
					// �����Ͱ� �������� ��� �˾��� ���� ��Ҵ� ����� ����������
					// �˾��� ����� ������ ������·� ��ȯ�Ǿ�� �Ѵ�.
					// ���� �⺻ ��ȯ���� false�� �����Ѵ�.
					// �˾��� ���� ����� ���ÿ� ���� true�� ����Ǳ⵵ �Ѵ�.
					rcvs_flag = false;
					need_popup = more;
				}
			}
			else {
				need_popup = false;	
				rcvs_flag = false;
			}
		}
	}
	
	//�׿� ��ư�� ���� ��� ����
	if (need_popup) {
		rcvs_flag = open_popup(p_popid,p_properties);
	}
	
//	if (!rcvs_flag) {
//		reset_popup_rcvs_data(p_popid);
//	}
	
	//��ȸ�� ���� �����ߴ� �����͵��� �����Ѵ�.
	reset_popup_send_data(p_popid);
	//�˾����� �����Ͱ� ���������� ���޵Ǿ����� ���θ� ��ȯ�Ѵ�.
	return rcvs_flag;	
}


function call_mc_co_1010(p_more) {
	var more = true;
	
	//more ����
	if (p_more != null) {
		if (typeof(p_more) == DATA_TYPE_STRING) {
			more = convert_to_bool(p_more,true);
		}
		else if  (typeof(p_more) == DATA_TYPE_BOOLEAN) {
			more = eval(p_more);
		}
		else {

		}
	}
	
	return call_popup("mc_co_1010","mc_co_1011_l","CURLIST1","640",more);
}

function call_mc_co_1020(p_subid,p_subid_cur,p_more) {
	var more = true;
	
	//more ����
	if (p_more != null) {
		if (typeof(p_more) == DATA_TYPE_STRING) {
			more = convert_to_bool(p_more,true);
		}
		else if  (typeof(p_more) == DATA_TYPE_BOOLEAN) {
			more = eval(p_more);
		}
		else {

		}
	}

	return call_popup("mc_co_1020",p_subid,p_subid_cur,"640",more);
}

function call_fc_acct_1180(p_more) {
	var more = true;
	
	//more ����
	if (p_more != null) {
		if (typeof(p_more) == DATA_TYPE_STRING) {
			more = convert_to_bool(p_more,true);
		}
		else if  (typeof(p_more) == DATA_TYPE_BOOLEAN) {
			more = eval(p_more);
		}
		else {

		}
	}

	return call_popup("fc_acct_1180","fc_acct_1181_l","CURLIST1","640",more);
}

function call_fc_co_1030(p_more) {
	var more = true;
	
	//more ����
	if (p_more != null) {
		if (typeof(p_more) == DATA_TYPE_STRING) {
			more = convert_to_bool(p_more,true);
		}
		else if  (typeof(p_more) == DATA_TYPE_BOOLEAN) {
			more = eval(p_more);
		}
		else {

		}
	}
	
	return call_popup("fc_co_1030","fc_co_1031_l","CURLIST","640",more);
}
function call_fc_co_1040(p_more) {
    var more = true;
    
    //more ����
    if (p_more != null) {
        if (typeof(p_more) == DATA_TYPE_STRING) {
            more = convert_to_bool(p_more,true);
        }
        else if  (typeof(p_more) == DATA_TYPE_BOOLEAN) {
            more = eval(p_more);
        }
        else {

        }
    }
    
    return call_popup("fc_co_1040","fc_co_1041_l","CURLIST","640",more);
}
function call_fc_co_1050(p_more) {
	var more = true;
	
	//more ����
	if (p_more != null) {
		if (typeof(p_more) == DATA_TYPE_STRING) {
			more = convert_to_bool(p_more,true);
		}
		else if  (typeof(p_more) == DATA_TYPE_BOOLEAN) {
			more = eval(p_more);
		}
		else {

		}
	}
	
	return call_popup("fc_co_1050","fc_co_1051_l","CURLIST","640",more);
}

function call_fc_co_1010(p_more) {
	var more = true;
	
	//more ����
	if (p_more != null) {
		if (typeof(p_more) == DATA_TYPE_STRING) {
			more = convert_to_bool(p_more,true);
		}
		else if  (typeof(p_more) == DATA_TYPE_BOOLEAN) {
			more = eval(p_more);
		}
		else {

		}
	}
	
	return call_popup("fc_co_1010","fc_co_1011_l","CURLIST","640",more);
}

function call_fc_co_1020(p_more) {
	var more = true;
	
	//more ����
	if (p_more != null) {
		if (typeof(p_more) == DATA_TYPE_STRING) {
			more = convert_to_bool(p_more,true);
		}
		else if  (typeof(p_more) == DATA_TYPE_BOOLEAN) {
			more = eval(p_more);
		}
		else {

		}
	}
	
	return call_popup("fc_co_1020","fc_co_1021_l","CURLIST","640",more);
}

function call_fc_func_1360(p_more) {
	var more = true;
	
	//more ����
	if (p_more != null) {
		if (typeof(p_more) == DATA_TYPE_STRING) {
			more = convert_to_bool(p_more,true);
		}
		else if  (typeof(p_more) == DATA_TYPE_BOOLEAN) {
			more = eval(p_more);
		}
		else {

		}
	}
	
	return call_popup("fc_func_1360","fc_func_1361_l","CURLIST","640",more);
}
function call_mc_budg_5150(p_more) {
    var more = true;
    
    //more ����
    if (p_more != null) {
        if (typeof(p_more) == DATA_TYPE_STRING) {
            more = convert_to_bool(p_more,true);
        }
        else if  (typeof(p_more) == DATA_TYPE_BOOLEAN) {
            more = eval(p_more);
        }
        else {

        }
    }
    
    return call_popup("mc_budg_5150","mc_budg_5151_l","CURLIST","",more);
}
function call_mc_budg_5020(p_more) {
    var more = true;
    
    //more ����
    if (p_more != null) {
        if (typeof(p_more) == DATA_TYPE_STRING) {
            more = convert_to_bool(p_more,true);
        }
        else if  (typeof(p_more) == DATA_TYPE_BOOLEAN) {
            more = eval(p_more);
        }
        else {

        }
    }
    
    return call_popup("mc_budg_5020","mc_budg_5021_l","CURLIST","",more);
}
function call_mc_budg_5021(p_more) {
    var more = true;
    
    //more ����
    if (p_more != null) {
        if (typeof(p_more) == DATA_TYPE_STRING) {
            more = convert_to_bool(p_more,true);
        }
        else if  (typeof(p_more) == DATA_TYPE_BOOLEAN) {
            more = eval(p_more);
        }
        else {

        }
    }
    
    return call_popup("mc_budg_5021","mc_budg_5072_l","CURLIST","640",more);
}

// ��������ڵ���ȸ �˾�
function call_mc_co_1030(p_more) {
    var more = true;
    
    //more ����
    if (p_more != null) {
        if (typeof(p_more) == DATA_TYPE_STRING) {
            more = convert_to_bool(p_more,true);
        }
        else if  (typeof(p_more) == DATA_TYPE_BOOLEAN) {
            more = eval(p_more);
        }
        else {

        }
    }
    
    return call_popup("mc_co_1030","mc_co_1030_l","CURLIST","640",more);
}

//����󼼳�����ȸ �˾�
function call_mc_co_1040(p_more) {
    var more = true;
    
    //more ����
    if (p_more != null) {
        if (typeof(p_more) == DATA_TYPE_STRING) {
            more = convert_to_bool(p_more,true);
        }
        else if  (typeof(p_more) == DATA_TYPE_BOOLEAN) {
            more = eval(p_more);
        }
        else {

        }
    }
    
    return call_popup("mc_co_1040","mc_co_1040_l","CURLIST","640",more);
}

//������ datagrid control�� ��� row�� �����Ѵ�.
function datagrid_data_clear(p_obj){
	var obj = eval(p_obj);

	remove_refnodeset(obj.nodeset);
	
	obj.refresh();
}

function datagrid_addrow(p_obj,p_num,p_refresh) {
	var obj = eval(p_obj);
	var refresh = true;

	//row�� �߰��ϰ� refresh ���� ����
    if (p_refresh != null) {
        if (typeof(p_refresh) == DATA_TYPE_STRING) {
        	refresh = convert_to_bool(p_refresh,true);
        }
        else if  (typeof(p_refresh) == DATA_TYPE_BOOLEAN) {
        	refresh = eval(p_refresh);
        }
    }
    
	for (var i = 0; i < p_num; i++) {
		obj.addRow(false);
	}
	
	if (refresh) {
		obj.refresh();
	}
}

//�ش� ��带 �����Ѵ� ������ ������ false
//�����Ǿ����� true;
function make_refnode(p_ref) {
	p_ref = p_ref.Trim();
	
	if (p_ref == "") {
		return false;
	}
	
	//���� �ν��Ͻ� ������ ���� ��� �����Ѵ�.
	if (instance1.selectSingleNode(p_ref) == null) {
		model.makeNode(p_ref);
		return true;
	}
	return false;
}

//��ΰ� �ְ� ������ ����ó���Ǹ� true
//��ΰ� ���� ��� false;
function reset_refnode(p_ref) {
	p_ref = p_ref.Trim();

	if (p_ref != "") {
		model.removenode(p_ref);
		model.makeNode(p_ref);
		return true;
	}	
	return false;
}

//��ΰ� �ְ� ����ó���Ǹ� true
//��ΰ� ���� ��� false;
function copy_refnode(p_target,p_source) {
	p_target = p_target.Trim();
	p_source = p_source.Trim();
	
	if (p_source == "" || p_target == "") {
		return false;
	}
	
	make_refnode(p_source);
	make_refnode(p_target);
	
	model.copyNode(p_target,p_source);
	
	return true;
}

function string_lpad(p_str,p_len,p_char) {
    var r_str = "";
    if (typeof(p_str) == DATA_TYPE_STRING) {
        r_str = p_str;
    }
    else if (typeof(p_str) == DATA_TYPE_NUMBER) {
        r_str = p_str.toString();
    }
    else {
        alert("���� ���� ����");
        return r_str;
    }
    
	//���̰� 0���� �۰ų� ������ ���� ��ȯ
	if (p_len <= 0) {
		return r_str;
	}
	//���ڿ��� ������ ���̺��� ũ�ų� ������ ���� ��ȯ
	if (r_str.length >= p_len) {
		return r_str;
	}
	//p_char�� null�̰ų� �����̸� �⺻���� space�� �����Ѵ�.
	if (p_char == null || p_char == "") {
		p_char = " ";
	}
	
	//�ݺ��ϸ鼭 p_len���� Ŀ���ų� ���� ������ p_char�� ���δ�.
	while(p_len > r_str.length) {
		r_str = p_char + r_str;
	}
	
	return r_str.substr(r_str.length - p_len,r_str.length);
}

function string_rpad(p_str,p_len,p_char) {
    var r_str = "";
    if (typeof(p_str) == DATA_TYPE_STRING) {
        r_str = p_str;
    }
    else if (typeof(p_str) == DATA_TYPE_NUMBER) {
        r_str = p_str.toString();
    }
    else {
        alert("���� ���� ����");
        return r_str;
    }
	
	//���̰� 0���� �۰ų� ������ ���� ��ȯ
	if (p_len <= 0) {
		return r_str;
	}
	//���ڿ��� ������ ���̺��� ũ�ų� ������ ���� ��ȯ
	if (r_str.length >= p_len) {
		return r_str;
	}
	//p_char�� null�̰ų� �����̸� �⺻���� space�� �����Ѵ�.
	if (p_char == null || p_char == "") {
		p_char = " ";
	}
	
	//�ݺ��ϸ鼭 p_len���� Ŀ���ų� ���� ������ p_char�� ���δ�.
	while(p_len > r_str.length) {
		r_str = r_str + p_char;
	}
	
	return r_str.substr(0,p_len);
}

//�����Լ��� CIISComm.js�� ���� ������
//�����Ƽ� �츮�� �����
/* ���� ���� datagrid�� sort�� ��� �� ��� �ν��Ͻ��� ������ �������� rowid����
 * ������ �����Ƿ� sort�ÿ� grid������ instance�� �ݿ��ϵ��� ����
 */
function onaftersort() {
	if (event == null) {
		return;
	}

	if (eval(event.target) == null || eval(event.currentTarget) == null) {
		return;
	}

	if (event.target != event.currentTarget || eval(event.target).elementName != "xforms:datagrid") {
		//���� ����, datagrid Ȯ��
		return;
	}
	
	var obj = eval(event.target);

	try {
		//���� �� rowid�� ���� instance�� ������ Ʋ�����Ƿ�
		//���� �� ������ �ν��Ͻ��� ����ȭ ��Ų��.
		obj.gridToInstance();
	}
	catch(ex) {
		
	}
	finally {
		
	}
}

//�޺��� ��� ������ ����
function combo_data_clear(p_obj){
	var obj = eval(p_obj);

	remove_refnodeset(obj.choices.itemset.attribute("nodeset"));
	
	obj.refresh();
}

//���õ� item�� ���������ϰ� ���� ������ item�� index ���� ��ȯ�Ѵ�.
function combo_data_init(p_obj) {
	var obj = eval(p_obj);
	var prev_index = obj.focusIndex;
	
	if (prev_index < 0) {
		return prev_index;
	}
	
	obj.deselect(prev_index);
	
	return prev_index;
}

//�޺��� �����͸� �߰��Ѵ�.
function combo_data_add(p_obj,p_label,p_value,p_dupinsert,p_refresh) {
	var obj = eval(p_obj);
	var nodeset = obj.choices.itemset.attribute("nodeset").Trim();
	var label_name = obj.choices.itemset.label.attribute("ref").Trim();
	var value_name = obj.choices.itemset.value.attribute("ref").Trim();
	var refresh = true;
	var dupinsert = true;
	var dupexist = false;
	var len = 0;
	
	if (nodeset == "" || label_name == "" || value_name == "") {
		return false;
	}
	
	//refresh ����
	if (p_refresh != null) {
		if (typeof(p_refresh) == DATA_TYPE_STRING) {
			refresh = convert_to_bool(p_refresh,true);
		}
		else if  (typeof(p_refresh) == DATA_TYPE_BOOLEAN) {
			refresh = eval(p_refresh);
		}
		else {
			//alert("program error else case");
			return false;
		}
	}
	
	//�ߺ��߰� ���� ����
	if (p_dupinsert != null) {
		if (typeof(p_dupinsert) == DATA_TYPE_STRING) {
			dupinsert = convert_to_bool(p_dupinsert,true);
		}
		else if  (typeof(p_dupinsert) == DATA_TYPE_BOOLEAN) {
			dupinsert = eval(p_dupinsert);
		}
		else {
			//alert("program error else case");
			return false;
		}
	}
	
	len = count_refnodeset(nodeset);
	
	if (combo_data_contains(obj,p_value) >= 1) {
		dupexist = true;
	}

	if ((dupinsert) || (!dupinsert && !dupexist)) {
		set_refvalue(nodeset + "[" + (len + 1) + "]/" + label_name, p_label);
		set_refvalue(nodeset + "[" + (len + 1) + "]/" + value_name, p_value);
	}
	else {
		//�ߺ����� �߰� �� �� ���� ���
		return false;
	}
	
	if (refresh) {
		obj.refresh();
	}
	
	return true;
}

//�޺��� ������ ���� �ִ��� Ȯ���Ѵ�.
// return -1 ã�� �� ���ų� ã�� ���� ���
// return i ã�� node�� ����
function combo_data_contains(p_obj,p_value) {
	var obj = eval(p_obj);
	var nodeset = obj.choices.itemset.attribute("nodeset").Trim();
	var label_name = obj.choices.itemset.label.attribute("ref").Trim();
	var value_name = obj.choices.itemset.value.attribute("ref").Trim();
	var len = 0;
	var label = "";
	var value = "";
	
	len = count_refnodeset(nodeset);
	
	if (len <= 0) {
		return -1;
	}
	
	for(var i = 1;i <= len;i++) {
		label = get_refvalue(nodeset + "[" + i + "]/" + label_name);
		value = get_refvalue(nodeset + "[" + i + "]/" + value_name);

		if (value == p_value) {
			return i;
		}
	}
	
	return -1;
}

function count_refnodeset(p_ref) {
	p_ref = p_ref.Trim();
	
	if (p_ref != "") {
		return Number(model.getXPathValue("count(" + p_ref + ")"));
	}	
	return -1;
}

//combo�� datagrid� ���̴� nodeset ������ �����͸� �Ѳ����� reset�����Ѵ�.
function remove_refnodeset(p_ref) {
	p_ref = p_ref.Trim();
	
	if (p_ref != "") {
		model.removeNodeset(p_ref);
		return true;
	}	
	return false;	
}	

//combo�� datagrid� ���̴� nodeset ������ �����͸� �Ѳ����� reset
function reset_refnodeset(p_ref) {
	p_ref = p_ref.Trim();

	if (p_ref != "") {
		remove_refnodeset(p_ref);
		make_refnode(p_ref);
		return true;
	}	
	return false;
}

//������ ���ڿ��� ���ڷ� ��ȯ�Ѵ�.
//���� Ȯ�� �� �� ���� ��� 0���� ó���ؼ� ��ȯ
function convert_to_number(p_str) {
	var return_value = 0;

	if (string_is_number(p_str)) {
		return_value = Number(p_str.replace(/\,/g, ""));
	}
	
	return return_value;
}

function number_to_string(p_num,p_null2zero) {
	var null2zero = true;
	var return_value = "";
	var nullvalue = "";
	
	//null�̰� �����̸� ���� 0���� ��ȯ���� ���� �⺻��:true
    if (p_null2zero != null) {
        if (typeof(p_null2zero) == DATA_TYPE_STRING) {
        	null2zero = convert_to_bool(p_null2zero,true);
        }
        else if  (typeof(p_null2zero) == DATA_TYPE_BOOLEAN) {
        	null2zero = eval(p_null2zero);
        }
    }
    
    if (null2zero) {
    	nullvalue = "0";
    }
    else {
    	nullvalue = "";
    }
    
    if (typeof(p_val) == DATA_TYPE_STRING) {
    	if (p_val == "") {
    		return_value = nullvalue;
    	}
    	else {
    		return_value = p_val;
    	}
    }
    else if (typeof(p_val) == DATA_TYPE_BOOLEAN) {
    	if (p_val) {
    		return_value = BOOLEAN_TRUE;
    	}
    	else {
    		return_value = BOOLEAN_FALSE;
    	}
    }
    else if (typeof(p_val) == DATA_TYPE_OBJECT) {
    	if (p_val == null) {
    		return_value = nullvalue;
    	}
    	else {
    		return_value = nullvalue;
    	}
    }
    else if (typeof(p_val) == DATA_TYPE_NUMBER) {
    	return_value = p_val.toString();
    }
    else {
    	return_value = nullvalue;
    }
alert("return_value=" + return_value);    
    return return_value;	
}

//������ row1,col1,row2,col2 ������ �հ踦 ���ؼ� ��ȯ�Ѵ�.
//p_refcondition�� ����� check_valitem�� validate_item�� ���� "����,�ּ�,�ִ�"
function datagrid_data_sum(p_obj,p_row1,p_col1,p_row2,p_col2,p_refcolid,p_refcondition) {
	var obj = eval(p_obj);
	var return_value = 0;
	var row1 = 0;
	var col1 = 0;
	var row2 = 0;
	var col2 = 0;
	
	//row�� col�� ������ 1,2�� ���� ū ���� �ڿ� ������ ����
	if (p_row1 > p_row2) {
		row1 = p_row2;
		row2 = p_row1;
	}
	else {
		row1 = p_row1;
		row2 = p_row2;
	}
	
	if (p_col1 > p_col2) {
		col1 = p_col2;
		col2 = p_col1;
	}
	else {
		col1 = p_col1;
		col2 = p_col2;
	}
	
	//���� row ����
	//����row���� ���� ���� ���� row�� ������ ��� fixedRows�� ����
	if (row1 < obj.fixedRows) {
		row1 = obj.fixedRows;
	}
	
	//�� row ����
	if (row2 > obj.rows) {
		row2 = obj.rows;
	}
	
	//���� col ����
	if (col1 < obj.fixedCols) {
		col1 = obj.fixedCols;
	}
	
	//�� col ����
	if (col2 > obj.cols) {
		col2 = obj.cols;
	}
	
	//column�� ��� ������ ù ��°�� 1�̶�� ������ ���
	//fixedCols�� 0�϶��� 0��°�� 1���̵ǹǷ� column�� �����������.
	col1 = col1 - 1 + obj.fixedCols;
	col2 = col2 - 1 + obj.fixedCols;

//alert("row1 = "+row1+", col1 = "+col1+", row2 = "+row2+", col2 = "+col2);	
	var total_sum = 0;
	var row_sum = 0;
	var valstr = "";
	var val = 0;
	var need_check_condition = true;
	var refcolid = "";
	var refcondition = "";
	
	if (p_refcolid == null || p_refcolid.Trim() == "") {
		refcolid = -1;
	}
	else {
		refcolid = datagrid_colname_to_colid(obj,p_refcolid.Trim());
	}

	//colid�� ���� �ٱ��� ������ ���Ǻ񱳸� ���� �ʴ´�.
	if (refcolid < obj.fixedCols || refcolid > obj.cols) {
		need_check_condition = false;
	}

	if (p_refcondition == null || p_refcondition.Trim() == "") {
		refcondition = "";
		need_check_condition = false;
	}
	else {
		refcondition = p_refcondition.Trim();
	}
	
	var refclist = refcondition.split(PARSE_ITEMSEP);

	for(var i = row1;i <= row2;i++) {
		row_sum = 0;
		for(var j = col1;j <= col2;j++) {
			valstr = obj.valueMatrix(i,j);
			val = convert_to_number(valstr);
//alert("row=" + i + ",col=" + j + ",val=" + val + ",valuematrix=" + obj.valueMatrix(i,j));

			//row������ ���� ���������� �׳� cell������ �����ϵ��� �ۼ�
			var sumflag = true;
			var cellv = obj.valueMatrix(i,refcolid).Trim();
			if (true == need_check_condition) {
				for(var k = 0;k < refclist.length;k++) {
					if (refclist[k].Trim() == "") {
						continue;
					}
					
					if(!check_validation_item(k,"",cellv,refclist[k].Trim())) {
						sumflag = false;
						break;
					}
				}
			}
			
			if (true == sumflag) {
				row_sum += val;
			}
		}
		total_sum += row_sum;
	}
	
	return total_sum;
}

function string_bytelength(p_str) {
    var len = 0;
    var str = "";

    if (p_str == null) {
    	return 0;
    }
    else {
    	str = p_str.substring(0);
    }

    for(var i=0; i < str.length; i++) {
        var ch = escape(str.charAt(i));

        if(ch.length == 1) {
        	len++;
        }
        else if(ch.indexOf("%u") != -1) {
        	len += 2; //Db�� �ѱ��� 3byte�� �ν��Ͽ� 2->3
        }
        else if(ch.indexOf("%") != -1) {
        	len += ch.length/3;
        }
    }

    return len;
}

function control_set_backcolor(p_obj,p_color) {
	var obj = eval(p_obj);
	
	obj.attribute("background-color") = p_color;
}

function control_get_backcolor() {
	var obj = eval(p_obj);
	
	return obj.attribute("background-color");
}

function control_set_textcolor(p_obj,p_color) {
	var obj = eval(p_obj);
	
	obj.attribute("color") = p_color;
}

function control_get_textcolor() {
	var obj = eval(p_obj);
	
	return obj.attribute("color");
}

function control_mark_req(p_obj) {
	var obj = eval(p_obj);
	obj.attribute("class") = "req";
	control_set_backcolor(obj,DEFAULT_COLOR_REQ);
}

function control_unmark_req(p_obj) {
	var obj = eval(p_obj);
	obj.attribute("class") = "";
	control_set_backcolor(obj,DEFAULT_COLOR_NONEREQ);
}
function control_unmark_req1(p_obj) {
    var obj = eval(p_obj);
    obj.attribute("class") = "";
    control_set_backcolor(obj,DEFAULT_COLOR_DISABLE);
}
function control_all_unmark_req(group1) {
    if( typeof group1 == 'string' ) group1 = document.controls(group1);
    var cnt = group1.children.length;
    
    for(i=0 ; i<cnt ; i++) {
        var ctr = group1.children.item(i);
        if(ctr.elementName=="xforms:input" || ctr.elementName=="xforms:select1") {
            ctr.attribute("class") = "";
            if(ctr.attribute("background-color") != DEFAULT_COLOR_DISABLE){
            	control_set_backcolor(ctr,DEFAULT_COLOR_NONEREQ);
            }
        }
    }
}
function datagrid_colname_to_colid(p_obj,p_cols) {
	var obj = eval(p_obj);
	var return_value = "";
	//p_cols�� �����̸� ����
	if (p_cols.Trim() == "") {
		return "";
	}
	var col_list = p_cols.Trim().split(PARSE_ITEMSEP);
	var col_name = "";
	var col_id = -1;
	for(i=0;i<col_list.length;i++) {
		col_name = col_list[i].Trim();
		col_id = obj.colRef(col_name);
		
		if (-1 == col_id && string_is_number(col_name)) {
			//�ش� �̸��� �÷��� ����
			col_id = string_to_number(col_name);
		}
		
		return_value += col_id.toString() + ",";
	}
	return return_value.substr(0,return_value.length - 1);
}


function control_is_maxlength(p_obj,p_errclear,p_errfocus,p_errmsg) {
	//�����Ƽ� ��� ���� ���������� �Ѿ�´ٰ� �����ع��ȴ�.
	var obj = eval(p_obj);
	var msg = "";
	
	var cdata = get_refvalue(obj);
	if (obj.attribute("maxlength") == cdata.length) {
		return true;
	}
	else {
		if (true == p_errclear) {
			set_refvalue(obj,"");
		}
		if ("" != p_errmsg.Trim()) {
			show_message(p_errmsg);
		}
		else {
			if (true == p_errfocus) {
				msg = obj.attribute("caption").Trim();

				if (msg != "") {
					msg += "��(��) ";
				}
				msg += obj.attribute("maxlength") + "�ڸ� �����Դϴ�.";
				
				show_message(msg);
			}
		}
		if (true == p_errfocus) {
			model.setFocus(obj.attribute("id"));
		}
	}
	return false;
}

//�� �Լ��� ������ �ϱ� ���ؼ�(focus�� true�� ��쿡 ���ؼ�)
//grid�� onnext() �Լ��� �������� �̺�Ʈ ��ȿȭ�� �ʿ��ϴ�.
function datagrid_is_maxlength(p_obj,p_errclear,p_errfocus,p_errmsg) {
	//�����Ƽ� ��� ���� ���������� �Ѿ�´ٰ� �����ع��ȴ�.
	var obj = eval(p_obj);
	var msg = "";
	var cdata = obj.valueMatrix(obj.row,obj.col);

	if (obj.colAttribute(obj.col,"maxlength") == cdata.length) {
		return true;
	}
	else {
		if (true == p_errclear) {
			obj.valueMatrix(obj.row,obj.col) = "";
		}
		if ("" != p_errmsg.Trim()) {
			show_message(p_errmsg);
		}
		else {
			if (true == p_errfocus) {
				msg = obj.colAttribute(obj.col,"caption").Trim();

				if (msg != "") {
					msg += "��(��) ";
				}
				msg += obj.colAttribute(obj.col,"maxlength") + "�ڸ� �����Դϴ�.";
				
				show_message(msg);
			}
		}
		if (true == p_errfocus) {
			obj.editCell();
		}
	}
	return false;
}

function datagrid_data_rebuild(p_obj) {
	var obj = eval(p_obj);
	var temp_node = "/root/tempData/tempGrid" + get_random_string_by_datetime();
	var temp_nodeset = temp_node + "/record";
	remove_refnode(temp_node);
	copy_refnodeset(temp_nodeset,obj.nodeset);
	remove_refnodeset(obj.nodeset);
	copy_refnodeset(obj.nodeset,temp_nodeset);
	//remove_refnode(temp_node);
	obj.refresh();
}

function copy_refnodeset(p_target,p_source) {
	p_target = p_target.Trim();
	p_source = p_source.Trim();
	
	if (p_source == "" || p_target == "") {
		return false;
	}
	
	var scount = count_refnodeset(p_source);
	var tcount = count_refnodeset(p_target);
	
	if (tcount == -1) {
		tcount = 0;
	}
	
	for(var i = 1;i <= scount;i++) {
		copy_refnode(p_target + "[" + (tcount + i) + "]", p_source + "[" + i + "]");
	}	
}

function get_random_string_by_datetime() {
	var return_value = "";
	var tdate = new Date();
	return_value += string_lpad(tdate.getYear().toString(),4,"0");
	return_value += string_lpad(tdate.getMonth().toString(),2,"0");
	return_value += string_lpad(tdate.getDate().toString(),2,"0");
	return_value += string_lpad(tdate.getHours().toString(),2,"0");
	return_value += string_lpad(tdate.getMinutes().toString(),2,"0");
	return_value += string_lpad(tdate.getSeconds().toString(),2,"0");
	return_value += string_lpad(tdate.getMilliseconds().toString(),3,"0");
	return return_value;
}

function remove_refnode(p_ref) {
	p_ref = p_ref.Trim();
	
	if (p_ref != "") {
		model.removeNode(p_ref);
		return true;
	}	
	return false;	
}


function string_is_number(p_str) {
	var p = new RegExp("^([ \t]*)?([+-])?([0-9]{1,3}((\,[0-9]{3})*|[0-9]*))(\\.[0-9]+)?([ \t]*)?$");
	return p.test(p_str);
}

function string_to_number(p_str) {
	var return_value = 0;

	if (string_is_number(p_str)) {
		return_value = Number(p_str.replace(/\,/g, ""));
	}
	
	return return_value;
}

function var_is_number(p_var) {
	var return_value = false;
	
	if (DATA_TYPE_NUMBER == typeof(p_var)) {
		return_value = true;
	}
	else {
		return_value = false;
	}
	
	return return_value;
}

function var_to_number(p_var,p_default) {
	var return_value = 0;

	if (true == var_is_number(p_default)) {
		return_value = p_default;
	}
	else {
		return_value = var_to_number(p_default,0);
	}
	
	if (null == p_var) {

	}
	else if (DATA_TYPE_NUMBER == typeof(p_var)) {
		return_value = p_var;
	}
	else if (DATA_TYPE_STRING == typeof(p_var) && true == string_is_number(p_var)) {
		return_value = string_to_number(p_var);
	}
	else if (DATA_TYPE_BOOLEAN == typeof(p_var)) {
		return_value = (p_var) ? 1 : 0;
	}
	else {
		
	}
	
	return return_value;
}

function var_is_string(p_var) {
	var return_value = false;
	
	if (DATA_TYPE_STRING == typeof(p_var)) {
		return_value = true;
	}
	else {
		return_value = false;
	}
	
	return return_value;
}

function var_to_string(p_var,p_default,p_trim) {
	var return_value = "";
	var do_trim = false;

	if (true == var_is_string(p_default)) {
		return_value = p_default;
	}
	else {
		return_value = var_to_string(p_default,"");
	}
	
	if (true == var_is_boolean(p_trim)) {
		do_trim = p_trim;
	}
	else {
		do_trim = var_to_boolean(p_trim,false);
	}
	
	if (null == p_var) {

	}
	else if (DATA_TYPE_NUMBER == typeof(p_var)) {
		return_value = p_var.toString();
	}
	else if (DATA_TYPE_STRING == typeof(p_var)) {
		return_value = p_var;
	}
	else if (DATA_TYPE_BOOLEAN == typeof(p_var)) {
		return_value = (p_var) ? BOOLEAN_TRUE : BOOLEAN_FALSE;
	}
	else {
		
	}
	
	if (true == do_trim) {
		return_value = return_value.Trim();
	}
	
	return return_value;
}

function var_is_boolean(p_var) {
	var return_value = false;
	
	if (DATA_TYPE_BOOLEAN == typeof(p_var)) {
		return_value = true;
	}
	else {
		return_value = false;
	}
	
	return return_value;
}

function var_to_boolean(p_var,p_default) {
	var return_value = false;

	if (true == var_is_boolean(p_default)) {
		return_value = p_default;
	}
	else {
		return_value = var_to_boolean(p_default,false);
	}
	
	if (null == p_var) {

	}
	else if (DATA_TYPE_NUMBER == typeof(p_var)) {
		return_value = (0 == p_var) ? false : true;
	}
	else if (DATA_TYPE_STRING == typeof(p_var)) {
		return_value = (p_var.toUpperCase() == BOOLEAN_TRUE.toUpperCase()) ? true : false;
	}
	else if (DATA_TYPE_BOOLEAN == typeof(p_var)) {
		return_value = p_var;
	}
	else {
		
	}
	
	return return_value;
}

function var_is_object(p_var) {
	var return_value = false;
	
	if (DATA_TYPE_OBJECT == typeof(p_var)) {
		return_value = true;
	}
	else {
		return_value = false;
	}
	
	return return_value;
}

function copy_child_nodes(p_parent,p_source,p_degree) {
	var return_value = null;
	var parent = null;
	var source = null;
	var degree = var_to_number(p_degree,99);
	var child_nodes = null;
	var child_node = null;
	var copy_node = null;
	
	if (null == p_source || null == p_parent) {
		return return_value;
	}
	
	if (true == var_is_string(p_source)) {
		//���ڿ� ref
		source = instance1.selectSingleNode(p_source.Trim());
	}
	else if (true == var_is_object(p_source)) {
		//object node ��� ����
		source = p_source;
	}
	
	if (true == var_is_string(p_parent)) {
		//���ڿ� ref
		parent = instance1.selectSingleNode(p_parent.Trim());
	}
	else if (true == var_is_object(p_parent)) {
		//object node ��� ����
		parent = p_parent;
	}
	
	if (null == source || null == parent) {
		return return_value;
	}
	
	return_value = parent;

	if (0 < degree && 1 == source.hasChildNodes()) {
		child_nodes = source.childNodes;
		while (null != (child_node = child_nodes.nextNode())) {
			copy_node = child_node.cloneNode(false);
			if (1 == child_node.hasChildNodes()) {
				copy_node = copy_child_nodes(copy_node,child_node,degree - 1);
			}
			return_value.appendChild(copy_node);
		}
	}
	
	return return_value;
}
			
function get_clone_node(p_source,p_degree) {
	var return_value = null;
	var source = null;
	var degree = var_to_number(p_degree,99);
	
	if (null == p_source) {
		return return_value;
	}
	
	if (true == var_is_string(p_source)) {
		//���ڿ� ref
		source = instance1.selectSingleNode(p_source.Trim());
	}
	else if (true == var_is_object(p_source)) {
		//object node ��� ����
		source = p_source;
	}
	
	if (null == source) {
		return return_value;
	}
	
	return_value = source.cloneNode(false);
	
	if (0 < degree) {
		return_value = copy_child_nodes(return_value,source,degree);
	}
	
	return return_value;
}
			
function instance_to_node(p_source,p_degree) {
	var source = null;//var_to_string(p_source,"",true);
	var degree = var_to_number(p_degree,99);
	var return_value = null;

	if (null == p_source) {
		return return_value;
	}
	
	if (true == var_is_string(p_source)) {
		//���ڿ� ref
		source = instance1.selectSingleNode(p_source.Trim());
	}
	else if (true == var_is_object(p_source)) {
		//object node ��� ����
		source = p_source;
	}
	
	if (source != null) {
		return_value = get_clone_node(source,degree);
	}
	
	return return_value;
}

function instance_to_nodes(p_source,p_degree) {
	var source = null;//var_to_string(p_source,"",true);
	var degree = var_to_number(p_degree,99);
	var return_value = null;

	if (null == p_source) {
		return return_value;
	}
	
	if (true == var_is_string(p_source)) {
		//���ڿ� ref
		source = instance1.selectNodes(p_source.Trim());
		if (0 < source.length) {
			return_value = new Array(source.length);
			for(var i = 0;i < source.length;i++) {
				return_value[i] = source.item(i);
			}
		}
	}
	else if (true == var_is_object(p_source)) {
		//object node ��� ����
		return_value = new Array(1);
		return_value[0] = p_source;
	}
	
	for(var i = 0;i < return_value.length;i++) {
		return_value[i] = get_clone_node(return_value[i],degree);
	}
	
	return return_value;
}

function node_to_instance(p_ref,p_node,p_degree) {
	var ref = var_to_string(p_ref,"",true);
	var node = null;
	var degree = var_to_number(p_degree,99);
	var return_value = false;
	var root_node = null;
	var child_node = null;
	
	if ("" == ref || null == p_node) {
		return return_value;
	}
	
	try {
		node = p_node;
	
		reset_refnode(ref);
		
		root_node = instance1.selectSingleNode(ref);
		child_node = node.cloneNode(false);
		root_node.appendChild(child_node);
		
		if (0 < degree) {
			child_node = copy_child_nodes(child_node,node,degree);
		}
		
		return_value = true;
	}
	catch(e) {
		return_value = false;
	}
	
	return return_value;
}

//p_nodes�� node�� array ������
function nodes_to_instance(p_ref,p_nodes,p_degree) {
	var ref = var_to_string(p_ref,"",true);
	var nodes = null;
	var degree = var_to_number(p_degree,99);
	var return_value = false;
	var root_node = null;
	var child_node = null;
	
	if ("" == ref || null == p_nodes) {
		return return_value;
	}

	try {
		nodes = p_nodes;
	
		reset_refnode(ref);
		
		root_node = instance1.selectSingleNode(ref);
		
		for(var i = 0; i < nodes.length;i++) {
			child_node = nodes[i].cloneNode(false);
			root_node.appendChild(child_node);
				
			if (0 < degree) {
				child_node = copy_child_nodes(child_node,nodes[i],degree);
			}
		}
		
		return_value = true;
	}
	catch(e) {
		return_value = false;
	}
	
	return return_value;
}

function array_add(p_obj,p_value,p_dupinsert) {
	var obj = eval(p_obj);
	var return_value = -1;
	var dupinsert = var_to_boolean(p_dupinsert,true);
	
	if (!(obj instanceof Array)) {
		return return_value;
	}
	
	return_value = array_contains(obj,p_value);

	if (-1 < return_value && false == dupinsert) {
		//�̹� �����Ͱ� �����ϰ� dupinsert�� false�̸�
		//�ش� item�� ���� ���� ���� ù ��° ���� ��ȯ
		return return_value;
	}
	
	return_value = obj.length;
	obj[return_value] = p_value;
	
	return return_value;
}

function array_contains(p_obj,p_value,p_index) {
	var obj = eval(p_obj);
	var return_value = -1;
	var index = var_to_number(p_index,0);
	
	if (!(obj instanceof Array)) {
		return return_value;
	}
	
	for (var i = index;i < obj.length;i++) {
		if (obj[i] == p_value) {
			return_value = i;
			break;
		}
	}
	
	return return_value;
}

function datagrid_selected_row(p_obj,p_sort) {
	var obj = eval(p_obj);
	var return_value = new Array();
	var cellrow = -1;
	var cellcol = -1;
	var selection_mode = obj.selectionMode;
	var sort = var_to_boolean(p_sort,false);
	
	switch(selection_mode) {
		case DATAGRID_SELECTION_BYCOL:
			break;
		case DATAGRID_SELECTION_FREE:
			for(var i = 0;i < obj.selectedCells.length;i++) {
				cellrow = obj.selectedCells.item(i).row;
		
				if (-1 == array_contains(return_value,cellrow)) {
					array_add(return_value,cellrow,false);
				}
			}
			break;
		case DATAGRID_SELECTION_BYROW:
		case DATAGRID_SELECTION_LISTBOX:
			for(var i = 0;i < obj.selectedRows;i++) {
				cellrow = obj.selectedRow(i);
				
				if (-1 == array_contains(return_value,cellrow)) {
					array_add(return_value,cellrow,false);
				}
			}
			break;
	}
	
	if (true == sort) {
		return_value = return_value.sort();
	}

	return return_value;
}
			
function datagrid_selected_rows(p_obj) {
	var obj = eval(p_obj);
	var selection_mode = obj.selectionMode;
	var return_value = 0;
	
	switch(selection_mode) {
		case DATAGRID_SELECTION_BYCOL:
			return_value = 0;
			break;
		case DATAGRID_SELECTION_BYROW:
			return_value = obj.selectedRows;
			break;
		case DATAGRID_SELECTION_FREE:
			return_value = datagrid_selected_row(p_obj).length;
			break;
		case DATAGRID_SELECTION_LISTBOX:
			return_value = obj.selectedRows;
			break;
	}

	return return_value;
}

function datagrid_to_nodes(p_obj,p_multiselection) {
	var obj = eval(p_obj);
	var multiselection = var_to_boolean(p_multiselection);
	var row_array = new Array();
	var return_value = new Array();
	
	if (obj.row >= obj.fixedRows) {
		if (true == multiselection) {
			row_array = datagrid_selected_row(obj);
		}
		else {
			row_array[0] = obj.row;
		}
	}
	
	for (var i = 0;i < row_array.length;i++) {
		return_value[i] = obj.getNode(row_array[i]);
	}
	
	return return_value;
}


//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	p_ref �ν��Ͻ� ��ġ�� �ִ� 1�� �ڽ� ������ �� ����� �����.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_ref			������ ����� �ۼ� �� �ν��Ͻ� ��ġ
//--------------------------------------------------------------------------------------------------
//���
//	String			�� ���
//--------------------------------------------------------------------------------------------------
//����
//	�⺻���� ������ VALUE_LIST_ITEMSEP = "|", VALUE_LIST_VALUESEP = "=" �� ����Ͽ�
//	clsf_cd=92|cd=|cd_abrv_nm=ȫ�浿
//	������ �� ����� �����.
//==================================================================================================
function make_value_list(p_ref) {
	var is_array = (p_ref instanceof Array);
	var value_list = "";

	if (false == is_array) {
		if("" == var_to_string(p_ref,"",true)) {
			return "";
		}
	
		var ref_node = instance1.selectSingleNode(p_ref);
		if (ref_node != null && ref_node.hasChildNodes()) {
			child_list = ref_node.childNodes;
			
			while(n = child_list.nextNode()) {
				value_list += VALUE_LIST_ITEMSEP + n.nodename + VALUE_LIST_VALUESEP + n.value;
			}
		}
		
		value_list = VALUE_LIST_TYPENAME_TEXT + value_list.substr(VALUE_LIST_ITEMSEP.length);
	}
	else {
		if(0 == p_ref.length) {
			return "";
		}
		
		value_list += VALUE_LIST_TYPENAME_NODE;
		value_list += nodes_to_value_list(p_ref);
	}
	return value_list;
}
//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	p_value_list�� ���ؼ� ���� �����͸� p_ref �ν��Ͻ� ��ġ�� �����Ѵ�.
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_ref			������ �ν��Ͻ� ��ġ
//	p_value_list	������ �������� ���
//--------------------------------------------------------------------------------------------------
//���
//	false			�˾��� ���� ���޵� �����Ͱ� ���� ��
//	true			�˾��� ���� ���޵� �����Ͱ� ���� ��
//--------------------------------------------------------------------------------------------------
//==================================================================================================
//������ p_value_list�� �̿��ؼ� p_ref �Ʒ��� �����Ѵ�.
function save_value_list(p_ref,p_value_list) {
	var listtype = -1;
	var value_list = "";
	var ref = var_to_string(p_ref,"",true);
	
	if (0 == p_value_list.indexOf(VALUE_LIST_TYPENAME_TEXT)) {
		listtype = VALUE_LIST_TYPE_TEXT;
		value_list = p_value_list.substr(VALUE_LIST_TYPENAME_TEXT.length);
	}
	else if (0 == p_value_list.indexOf(VALUE_LIST_TYPENAME_NODE)) {
		listtype = VALUE_LIST_TYPE_NODE;
		value_list = p_value_list.substr(VALUE_LIST_TYPENAME_NODE.length);
	}
	else {
		return false;
	}
	
	if ("" == ref || "" == value_list.Trim()) {
		return false;
	}
	
	if (VALUE_LIST_TYPE_TEXT == listtype) {	
		if (instance1.selectSingleNode(ref) == null) {
			model.makeNode(ref);
		}

		var node_name = "";
		var node_value = "";
	
		var sep_pos = -1;
		var arr_value = value_list.split(VALUE_LIST_ITEMSEP);
	
		for(i=0;i<arr_value.length;i++) {
			arr_value[i] = arr_value[i].Trim();
			sep_pos = arr_value[i].indexOf(VALUE_LIST_VALUESEP);
	
			if (sep_pos < 1) {		
				continue;
			}
			
			node_name = arr_value[i].substr(0,sep_pos).Trim();
			node_value = arr_value[i].substr(sep_pos + VALUE_LIST_VALUESEP.length).Trim();
			if (node_value == "") {
				model.makeNode(p_ref + "/" + node_name);
			}
			else {
				model.makeValue(p_ref + "/" + node_name, node_value);
			}
		}
		
		return true;
	}
	else {
		//VALUE_LIST_TYPE_NODE
		return value_list_to_instance(ref,value_list);
	}
	
	return false;
}
		
function nodes_to_value_list(p_nodes) {
	var return_value = "";

	if (!(p_nodes instanceof Array)) {
		return return_value;
	}

	var nodes = p_nodes;
	var child_node = null;

	for(var i = 0; i < nodes.length;i++) {
		return_value += VALUE_LIST_ITEMSEP + node_to_value_list(nodes[i]);
	}
	
	return return_value.substr(VALUE_LIST_ITEMSEP.length);
}

function node_to_value_list(p_node) {
	var return_value = "";

	if (DATA_TYPE_OBJECT != typeof(p_node)) {
		return return_value;
	}
	
	var node = p_node;
	var node_name = VALUE_LIST_NODESEP + node.nodename;
	var node_value = node.value;
	
	return_value += VALUE_LIST_ITEMSEP + node_name + VALUE_LIST_VALUESEP + node_value;
	return_value += VALUE_LIST_ITEMSEP + childnodes_to_value_list(node,node_name);

	return return_value.substr(VALUE_LIST_ITEMSEP.length);
}

function childnodes_to_value_list(p_node,p_node_path) {
	var return_value = "";
	
	if (DATA_TYPE_OBJECT != typeof(p_node)) {
		return return_value;
	}

	var node = p_node;
	var child_nodes = null;
	var node_path = var_to_string(p_node_path,"");
	var node_name = "";
	var node_value = "";
	
	if (1 == node.hasChildNodes()) {
		child_nodes = node.childNodes;
		while (null != (child_node = child_nodes.nextNode())) {
			node_name = node_path + VALUE_LIST_NODESEP + child_node.nodename;
			node_value = child_node.value;
			
			return_value += VALUE_LIST_ITEMSEP + node_name + VALUE_LIST_VALUESEP + node_value;
			
			if (1 == child_node.hasChildNodes()) {
				return_value += VALUE_LIST_ITEMSEP + childnodes_to_value_list(child_node,node_name);
			}
		}
	}
	
	return return_value.substr(VALUE_LIST_ITEMSEP.length);
}

function value_list_to_instance(p_ref,p_value_list) {
	var ref = var_to_string(p_ref,"",true);
	var value_list = var_to_string(p_value_list,"",true);
	
	if ("" == ref || "" == value_list.Trim()) {
		return false;
	}
	
	var node_name = "";
	var node_value = "";
	var node_level = 0;

	var sep_pos = -1;
	var arr_value = value_list.split(VALUE_LIST_ITEMSEP);

	for(i=0;i<arr_value.length;i++) {
		arr_value[i] = arr_value[i].Trim();
		sep_pos = arr_value[i].indexOf(VALUE_LIST_VALUESEP);

		if (sep_pos < 1) {		
			continue;
		}
		
		node_name = arr_value[i].substr(0,sep_pos).Trim();
		node_value = arr_value[i].substr(sep_pos + VALUE_LIST_VALUESEP.length).Trim();
		
		node_string_to_instance(ref,node_name,node_value);
		
	}	
	
	return true;
}

function node_string_to_instance(p_ref,p_node_string,p_node_value) {
	var ref = var_to_string(p_ref,"",true);
	var node_string = var_to_string(p_node_string,"",true);
	var node_value = var_to_string(p_node_value,"",true);
	var node_level = -1;
	var node_path = "";
	var node_count = 0;
	
	if ("" == ref || "" == node_string) {
		return false;
	}
	
	var arr_value = node_string.split(VALUE_LIST_NODESEP);
	//depth���� �ּ� ������ ���� /nodename �� ��� 0 /nodename/nodechild1 �� ��� 1�� �ǵ��� ���� ����
	node_level = arr_value.length - 2;
//alert("ref="+ref+",node_string="+node_string+",node_value="+node_value);
	//������ 0�ΰ��� ������ ��带 �����
	//�ƴ� ���� �θ� ������ ������ ������ ���� ��带 ����Ű���� �����Ѵ�.
	if (0 == node_level) {
		node_path = ref + node_string;
		make_refnodeset(node_path);
	}
	else {
		node_path = ref;
		for (var i = 1;i <= node_level;i++) {
			node_path += VALUE_LIST_NODESEP + arr_value[i];
			node_count = count_refnodeset(node_path);
			if (0 == node_count) {
				//�׻� ������ �θ� ��尡 ��������� �ǹǷ�
				//1�̻��� ���� �Ѿ���� �ȴ�.
//alert("node_count is zero, node_path="+node_path);
				//node_path = node_path + "[" + 1 + "]";
			}
			else {
				node_path += "[" + node_count + "]";
			}
		}
		//������ ����̸��� �߰��Ͽ� full path ����
		node_path += VALUE_LIST_NODESEP + arr_value[i];
		node_count = make_refnodeset(node_path);
		set_refvalue(node_path + "[" + node_count + "]",node_value);
	}
	
	return true;
}

function make_refnodeset(p_ref) {
	var ref = var_to_string(p_ref,"",true);
	var return_value = -1;	//nodeset count
	
	if (ref == "") {
		return return_value;
	}
	
	return_value = count_refnodeset(ref) + 1;
	ref = ref + "[" + return_value + "]";
	model.makeNode(ref);
		
	return return_value;
}

//==================================================================================================
//�ۼ�
//	����
//--------------------------------------------------------------------------------------------------
//���
//	������ ���� value_list ���·� ������Ƽ�� �����ϰ� popup�� �����Ѵ�. (Ȯ��)
//--------------------------------------------------------------------------------------------------
//�Է�
//	p_popid			���� �˾��� xrw id
//	p_resultref		������ ���� �ִ� �ν��Ͻ��� ��ġ
//--------------------------------------------------------------------------------------------------
//���
//	����
//--------------------------------------------------------------------------------------------------
//����
//	�˾�â ���忡�� ȣ���� â�� ����� ������ �Լ�
//==================================================================================================
function close_popupEx(p_popid,p_resultref) {
	rcvs_name = get_popup_rcvs_property_name(p_popid);
	if (p_resultref == "") {
		model.property(rcvs_name) = "";
	}
	else {
		model.property(rcvs_name) = make_value_list(p_resultref);
	}
	formClose();
}

function close_popupExNode(p_popid,p_resultnodes) {
	rcvs_name = get_popup_rcvs_property_name(p_popid);
	if (p_resultnodes.length == 0) {
		model.property(rcvs_name) = "";
	}
	else {
		model.property(rcvs_name) = make_value_list(p_resultnodes);
	}
	formClose();
}

function get_popup_rcvs_dataset(p_popid,p_name,p_seq,p_record) {
	p_seq = var_to_number(p_seq,1);
	p_record = var_to_string(p_record,"record");
	
	return model.getValue(get_popup_rcvs_ref(p_popid) + "/" + p_record + "[" + p_seq + "]" + "/" + p_name).Trim();
}

function get_popup_send_dataset(p_popid,p_name,p_seq,p_record) {
	p_seq = var_to_number(p_seq,1);
	p_record = var_to_string(p_record,"record");
	
	return model.getValue(get_popup_send_ref(p_popid) + "/" + p_record + "[" + p_seq + "]" + "/" + p_name).Trim();
}

function set_popup_rcvs_dataset(p_popid,p_name,p_value,p_seq,p_record) {
	p_seq = var_to_number(p_seq,1);
	p_record = var_to_string(p_record,"record");
	
	var ref = get_popup_rcvs_ref(p_popid) + "/" + p_record + "[" + p_seq + "]";
	model.makeValue(ref + "/" + p_name, p_value);
}

function set_popup_send_dataset(p_popid,p_name,p_value,p_seq,p_record) {
	p_seq = var_to_number(p_seq,1);
	p_record = var_to_string(p_record,"record");
	
	var ref = get_popup_send_ref(p_popid) + "/" + p_record + "[" + p_seq + "]";
	model.makeValue(ref + "/" + p_name, p_value);
}

function datagrid_edit_cell(p_obj,p_row,p_col) {
	var grid = eval(p_obj);
	var row = var_to_number(p_row,grid.row);
	var col = datagrid_colname_to_colid(grid,var_to_string(p_col,grid.col));
	
	grid.row = row;
	grid.col = col;
	grid.editCell();
}

function checkref(ctr){
	var chk =true;
	if(ctr.elementName=="xforms:input" || ctr.elementName=="xforms:select1") {
        if(ctr.attribute("class").substring(0,3)=="req" && model.getValue(ctr.attribute("ref"))=="") {
            commMsgBox(ctr.attribute("caption") + "��(��) �ʼ��Է��׸��Դϴ�.");
            model.setFocus(ctr.attribute("id"));    
            chk =false;
        }
    }
	return chk;
}


function select_amt(code_cd, mang_cd){
	var ref_var = "/root/resData/fc_acct_2016_s/dataSet/CURLIST/"
	var total_cnt = get_refvalue(ref_var + "totalcnt");
	var ch_num;
	for(i = 1 ; i <= total_cnt ; i++){
		if(code_cd == get_refvalue(ref_var + "/record[" + i + "]/cd")){
			ch_num = get_refvalue(ref_var + "/record[" + i + "]/" + mang_cd );
			break;
		}
	}
	return Number(ch_num);
}

function grid_combo_data_contains(p_value,p_nodeset,p_combo_value) {
	var nodeset = p_nodeset.Trim();
	var value_name = p_combo_value.Trim();
	var len = 0;
	var value = "";
	
	len = count_refnodeset(nodeset);
	
	if (len <= 0) {
		return -1;
	}
	
	for(var i = 1;i <= len;i++) {
		value = get_refvalue(nodeset + "[" + i + "]/" + value_name);

		if (value == p_value) {
			return i;
		}
	}
	
	return -1;
}

function loadRcpmDtlsPop_fc(sys_clsf
                         ,acct_mang_no
                         ,biz_reg_no_ref
                         ,bank_id_ref
                         ,acct_num_ref
                         ,tran_date_ref
                         ,tran_date_seq_ref
                         ,current_clsf_ref
                         ,fwdData){

    model.makeNode("/root/reqData/fwdData/sys_clsf");
    model.makeNode("/root/reqData/fwdData/acct_mang_no");
    model.makeNode("/root/reqData/fwdData/biz_reg_no_ref");
    model.makeNode("/root/reqData/fwdData/bank_id_ref");
    model.makeNode("/root/reqData/fwdData/acct_num_ref");
    model.makeNode("/root/reqData/fwdData/tran_date_ref");
    model.makeNode("/root/reqData/fwdData/tran_date_seq_ref");
    model.makeNode("/root/reqData/fwdData/current_clsf_ref");
    
    model.setValue("/root/reqData/fwdData/sys_clsf"         ,sys_clsf); 
    model.setValue("/root/reqData/fwdData/acct_mang_no"     ,acct_mang_no); 
    model.setValue("/root/reqData/fwdData/biz_reg_no_ref"   ,biz_reg_no_ref);   
    model.setValue("/root/reqData/fwdData/bank_id_ref"      ,bank_id_ref);  
    model.setValue("/root/reqData/fwdData/acct_num_ref"     ,acct_num_ref); 
    model.setValue("/root/reqData/fwdData/tran_date_ref"    ,tran_date_ref);    
    model.setValue("/root/reqData/fwdData/tran_date_seq_ref",tran_date_seq_ref);
    model.setValue("/root/reqData/fwdData/current_clsf_ref" ,current_clsf_ref);

    window.load("/xrw/fc/co/FC_CO_1070.xrw"
                , "modal"
                , ""
                , "align:center; left:100; top:100; width:770; height:490; sysmenu:visible; min:visible; max:true; resize:true; caption:hidden;"
                ,"/root/reqData/fwdData"
                ,"/root/reqData/fwdData"
    );  
}
