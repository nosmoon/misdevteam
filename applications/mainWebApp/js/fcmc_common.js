//Boolean 문자열
var BOOLEAN_TRUE			=	"true";
var	BOOLEAN_FALSE			=	"false";
//스타일 문자열
var STYLE_TEXT_ALIGN		=	"text-align";
var STYLE_VERTICAL_ALIGN	=	"vertical-align";
var STYLE_FORMAT			=	"format";
var STYLE_MAXLENGTH			=	"maxlength";
//스타일 값의 위치
var STYLE_SEQ_FORMAT		=	0;
var STYLE_SEQ_ALIGN			=	1;
var STYLE_SEQ_VALIGN		=	2;
//가로 정렬 방법 문자열
var ALIGN_RIGHT				=	"right";
var ALIGN_LEFT				=	"left";
var ALIGN_CENTER			=	"center";
var ALIGN_JUSTIFY			=	"justify";
//세로 정렬 방법 문자열
var VALIGN_TOP				=	"top";
var VALIGN_MIDDLE			=	"middle";
var VALIGN_BOTTOM			=	"bottom";
//데이터그리드 기본 설정에 사용 할 값
var DATAGRID_COLSEP			=	"#";
var DATAGRID_ROWSEP			=	"|";
//value list에 사용 할 value 구분자
var VALUE_LIST_ITEMSEP		=	"{|}";
var VALUE_LIST_VALUESEP		=	"{=}";
var VALUE_LIST_TYPE_TEXT	=	0;
var VALUE_LIST_TYPE_NODE	=	1;
var VALUE_LIST_TYPENAME_TEXT	=	"VALUELISTTYPE=TEXT";
var VALUE_LIST_TYPENAME_NODE	=	"VALUELISTTYPE=NODE";
var VALUE_LIST_NODESEP		=	"/";
//item 구분자
var PARSE_ITEMSEP			=	",";
//공통적용 할 스타일 값
//명명규칙
//	STYLE_stylename_[a][b][c]
//	예)
//		STYLE_NUMBER_000	음수양수,무한정수,0자리소수
//		STYLE_NUMBER_153	양수,5자리정수,3자리소수
//유일한 고정된 형태의 포맷의 경우 유일한 목적에 맞는 이름으로만 지정
//	예)
//		STYLE_BIZ_NO		사업자번호
//		STYLE_REG_NO		주민등록번호
//[a]
//	0으로 시작하면 음수양수 공용
//	1로 시작하면 양수만 입력가능
//	2로 시작하면 음수만 입력가능
//[b]
//	정수자리수
//	0이면 무한, #
//[c]
//	소숫점이하자리수
//	0이면 0자리
//	9이면 무한, #
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
var STYLE_DATE_2			=	new Array ("yyyy+\"년\"+mm+\"월\"+dd+\"일\""			,ALIGN_CENTER			,VALIGN_MIDDLE);
var STYLE_DATE_3			=	new Array ("yyyy/mm/dd"				,ALIGN_CENTER			,VALIGN_MIDDLE);
var STYLE_MONTH_1			=	new Array ("yyyy-mm"				,ALIGN_CENTER			,VALIGN_MIDDLE);
var STYLE_MONTH_2			=	new Array ("yyyy+\"년\"+mm+\"월\""	,ALIGN_CENTER			,VALIGN_MIDDLE);
var STYLE_MONTH_3			=	new Array ("yyyy/mm"				,ALIGN_CENTER			,VALIGN_MIDDLE);
var	STYLE_RATE_1			=	new Array ("(-)#.#"					,ALIGN_RIGHT			,VALIGN_MIDDLE);
//이하 추가하는 포맷의 경우 상단의 명명규칙지켜주삼
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
//0으로 시작하면 한글
//1로 시작하면 영문
//3으로 시작하면 구분자
//[b]
//0으로 시작하면 년월일 전체
//1로 시작하면 년월
//2로 시작하면 년
//3으로 시작하면 월
//4로 시작하면 월
//[c]
//구분자 종류
//1이면 '/'
//2이면 '-'
//구분자가 아니거나 단일 단위인 경우 0
var STYLE_DATE_320			=	new Array ("yyyy"					,ALIGN_CENTER			,VALIGN_MIDDLE);
var STYLE_DATE_330          =   new Array ("mm"                     ,ALIGN_CENTER           ,VALIGN_MIDDLE);
var STYLE_DATE_020			=	new Array ("yyyy \"년\""			,ALIGN_CENTER			,VALIGN_MIDDLE);
var STYLE_DATE_302			=	new Array ("yyyy-mm-dd"				,ALIGN_CENTER			,VALIGN_MIDDLE);
var STYLE_BIZ_NO			=	new Array ("999-99-99999"			,ALIGN_CENTER			,VALIGN_MIDDLE);
var STYLE_REGI_NO			=	new Array ("999999-9999999"			,ALIGN_CENTER			,VALIGN_MIDDLE);

//POPUP에 사용할 기본 인스턴스 정보
var SEND_DATA_REF			=	"/root/reqData/fwdData";
var RCVS_DATA_REF			=	"/root/resData/rcvData";

//datagrid의 explorerbar 속성
var DATAGRID_EXPLORERBAR_SORT			=	"sort";
var DATAGRID_EXPLORERBAR_MOVE			=	"move";
var DATAGRID_EXPLORERBAR_SORTSHOW		=	"sortshow";
var DATAGRID_EXPLORERBAR_SORTMOVE		=	"sortmove";
var DATAGRID_EXPLORERBAR_SORTSHOWMOVE	=	"sortshowmove";
//datagrid의 rowheader 속성
var DATAGRID_ROWHEADER_SEQ				=	"seq";
var DATAGRID_ROWHEADER_REVERSESEQ		=	"reverseseq";
var DATAGRID_ROWHEADER_SELECT			=	"select";
var DATAGRID_ROWHEADER_UPDATE			=	"update";
//datagrid의 selectionmode
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

//combo 의 속성
var COMBO_ITEMCOUNT						=	10;

//메시지박스 종류
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
//메시지박스 응답
var IDABORT								=	3;
var IDCANCEL							=	2;
var IDCONTINUE							=	11;
var IDIGNORE							=	5;
var IDNO								=	7;
var IDOK								=	1;
var IDRETRY								=	4;
var IDTRYAGAIN							=	10;
var IDYES								=	6;

//값 검증
var VALIDATION_LENGTH					=	0;
var VALIDATION_GTEQ						=	1;
var VALIDATION_LTEQ						=	2;

//색상지정
var DEFAULT_COLOR_DISABLE				=	"#eaeaea";
var DEFAULT_COLOR_REQ					=	"#fefae2";
var DEFAULT_COLOR_NONEREQ				=	"#ffffff";
var DEFAULT_DATAGRID_BG_COLOR_DISABLE	=	"#c0c0c0";
var DEFAULT_DATAGRID_BG_COLOR_ENABLE	=	"#ffffff";
var DEFAULT_DATAGRID_TEXT_COLOR_NORMAL	=	"#555555";
var DEFAULT_DATAGRID_TEXT_COLOR_ERROR	=	"#ff0000";

//type문자열
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	지정된 instance path에 대한 필수입력 항목 체크를 한다.
//--------------------------------------------------------------------------------------------------
//입력
//	
//--------------------------------------------------------------------------------------------------
//출력
//	
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function check_req_instance(p_ref,p_trimType) {
	//true 정상
	//false 오류
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	select control에 대한 필수입력 항목 체크를 한다.
//--------------------------------------------------------------------------------------------------
//입력
//	
//--------------------------------------------------------------------------------------------------
//출력
//	
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	input control에 대한 필수입력 항목 체크를 한다.
//--------------------------------------------------------------------------------------------------
//입력
//	
//--------------------------------------------------------------------------------------------------
//출력
//	
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	object에 대한 필수입력 항목 체크를 한다.
//--------------------------------------------------------------------------------------------------
//입력
//	
//--------------------------------------------------------------------------------------------------
//출력
//	
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
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
			show_message("체크 할 수 없는 값입니다.");
			flag = false;
			break;
	}
	return flag;
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	필수입력 항목 체크를 한다.
//--------------------------------------------------------------------------------------------------
//입력
//	1:object			체크할 instance path 혹은 control
//	2:string			문자열 앞,뒤의 공백을 제거 할 지 여부, "TRIM","LTRIM","RTRIM","NONE"
//	3:string			필수항목 체크에 실패 했을 경우 focus를 줄지 여부, "FOCUS", "NONE"
//	4:string			필수항목 체크에 실패 했을 경우 보여 줄 메시지, 공백이면 메시지 창을 띄우지 않음
//--------------------------------------------------------------------------------------------------
//출력
//	true				정상 처리
//	false				필수항목 체크에 실패, 항목이 공백인 경우
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function check_reqItem(p_obj,p_trimType) {
	var flag = true;
	if (arguments.length < 1) {
		show_message("필수여부를 체크할 항목이 지정되지 않았습니다.");
		return false;
	}
	
	var type = typeof(arguments[0]);
	
	//trim 여부
	if (arguments[1] == null || arguments[1].Trim() == "") {
		arguments[1] = TRIM_TYPE_NONE;
	}
	arguments[1] = arguments[1].toUpperCase();

	//focus가 object가 아닐 때만 처리
	//focus가 object라면 focus를 지정된 object로 이동시킨다.
	if (typeof(arguments[2]) != DATA_TYPE_OBJECT) {
		//focus 여부
		if (arguments[2] == null || arguments[2].Trim() == "") {
			arguments[2] = FOCUS_TYPE_NONE;
		}
		arguments[2] = arguments[2].toUpperCase();		
	}

	if (typeof(arguments[3]) != DATA_TYPE_OBJECT) {
		//message 여부
		if (arguments[3] == null || arguments[3].Trim() == "") {
			arguments[3] = "";
		}
	}
	
	//문자열인 경우 체크할 인스턴스 위치라고 가정
	if (type == DATA_TYPE_STRING) {
		flag = check_req_instance(arguments[0],arguments[1]);
	}
	else if (type == DATA_TYPE_OBJECT) {
		flag = check_req_object(arguments[0],arguments[1]);
	}
	else {
		flag = false;
		show_message("체크할 수 없는 값입니다.");
	}
	
	if (!flag) {
		if (typeof(arguments[3]) != DATA_TYPE_OBJECT) {
			if (arguments[3] != "") {
				show_message(arguments[3], "입력항목검증");
			}
		}
		else {
			show_message(arguments[3].attribute("caption") + "은(는) 필수입력항목입니다.","입력항목검증");
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	메시지박스를 띄운다.
//--------------------------------------------------------------------------------------------------
//입력
//	arguments		
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//	model.alert를 사용해서 메시지 박스를 띄운다.
//	[ Integer = ] model.alert(String message, [String title], [Integer type]) 
//--------------------------------------------------------------------------------------------------
//예제
//	show_message("msg");
//	show_message("msg","title");
//	show_message("msg","title",16);
//==================================================================================================
function show_message(message) {
	var title = arguments[1];
	var type = arguments[2];
	
	//인스턴스의 /root/initData/pageInfo/pageTitle 값이 ""이 아니면
	//message box title로 설정한다.
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	전달받은 문자열에서 공백문자 space, tab 등을 제외한 문자열을 반환한다.
//--------------------------------------------------------------------------------------------------
//입력
//	
//--------------------------------------------------------------------------------------------------
//출력
//	
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	입력 받은 날짜가 날짜 형식에 맞는지 검증한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_date				검증할 날짜 값, 문자, "20090101" 형태
//--------------------------------------------------------------------------------------------------
//출력
//	true				입력된 날짜가 날짜 형식에 맞는 경우
//	false				입력된 날짜가 날짜 형식과 맞지 않은 경우
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
//	if(validate_date("20091301")) {
//		alert("정상");
//	}
//	else {
//		alert("오류");
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

//날짜형식인지 체크하고 아니면 기존 데이터를 삭제
function control_is_date(p_obj,p_errclear,p_errfocus,p_errmsg) {
	//귀찮아서 모든 값은 정상적으로 넘어온다고 가정해버렸다.
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
					msg += "은(는) ";
				}
				msg += "잘못된 날짜 형식입니다.";
				
				show_message(msg);
			}
		}
		if (true == p_errfocus) {
			model.setFocus(obj.attribute("id"));
		}
	}
	return false;
}

//날짜형식인지 체크하고 아니면 기존 데이터를 삭제
//이 함수가 정상동작 하기 위해서(focus가 true인 경우에 한해서)
//grid의 onnext() 함수에 선택적인 이벤트 무효화가 필요하다.
function datagrid_is_date(p_obj,p_errclear,p_errfocus,p_errmsg) {
	//귀찮아서 모든 값은 정상적으로 넘어온다고 가정해버렸다.
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
					msg += "은(는) ";
				}
				msg += "잘못된 날짜 형식입니다.";
				
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	동적으로 submission을 생성하고 실행한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_submission_id		생성할 submission의 id
//						유일해야 하며 이미 존재하는 경우 같은 submission이라고 판단하고 존재하는 submission을 사용함
//	p_ref				보낼 데이터가 있는 instance path
//	p_resultref			받은 데이터를 저장 할 instance path
//	p_action			수행할 명령
//	p_method			전송방식
//	p_mediatype			전송타입
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
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
	//사용할 submission control을 동적 생성	
	if(!model.isChild(p_submission_id)) {
		//해당 submission이 생성되지 않았다면 새로 생성하고
		model.createChild(XFORMS_CONTROL_SUBMISSION, "id:" + p_submission_id + "; ");
	}
	else {
		//이미 생성된 submission이라면 그대로 사용한다.
	}
	
	//받을 인스턴스 구조가 없는 경우 생성한다.
	if (instance1.selectSingleNode(p_resultref) == null) {
		model.makeNode(p_resultref);
	}
	
	//submission 설정
	eval(p_submission_id).attribute("ref") = p_ref;
	eval(p_submission_id).attribute("resultref") = p_resultref;
	eval(p_submission_id).attribute("action") = p_action;
	eval(p_submission_id).attribute("method") = p_method;
	eval(p_submission_id).attribute("mediatype") = p_mediatype;

	//실행			
	model.send(p_submission_id);

	return submit_completed();
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	조회할 공통코드의 입력값과 저장할 instance path를 전달받아
//	입력값을 설정 후 submisstion 수행
//--------------------------------------------------------------------------------------------------
//입력
//	p_submission_id		생성할 submission의 id
//						유일해야 하며 이미 존재하는 경우 같은 submission이라고 판단하고 존재하는 submission을 사용함
//	p_ref					보낼 데이터가 있는 instance path
//	p_resultref				받은 데이터를 저장 할 instance path
//	p_action				수행할 명령
//	p_method				전송방식
//	p_mediatype			전송타입
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//	코드 이름을 조회하는 다른 script를 만들 때는
//	서버로 보낼 변수 값을 받는 argument 설정과
//	전달 받은 값으로 instance를 구성하는 부분만 수정해서 배포하면 됩니다.
//--------------------------------------------------------------------------------------------------
//예제
//	function get_medi_nm() {
//		//공통코드를 조회하는 함수 호출
//		get_comn_nm("/root/tempData/fc_co_8000_s/dataSet","00","01", medi_cd.value)
//		//받아진 데이터를 지정한 위치로 복사한다.
//		medi_nm.value = model.getValue("/root/tempData/fc_co_8000_s/dataSet/CURLIST/record/cdnm");
//	}
//==================================================================================================
function get_comn_nm(p_resultref,p_job_clsf,p_cd_clsf,p_cd) {
	//서브미션 이름 지정
	var submission_id = "auto_fc_co_8000_s";
	//보낼 데이터의 기본 위치 설정
	var ref = "/root/tempData/" + submission_id;	
	//수행할 명령
	var action = "/fc/co8000/8000";
	//전송방식
	var method = "urlencoded-post";
	//전송타입
	var mediatype = "application/x-www-form-urlencoded";	
					
	//기존에 보낼 데이터의 기본 위치에 해당하는 노드는 삭제한다.			
	model.removenode(ref);
	
	//데이터를 받을 인스턴스 노드 생성
	model.makeNode(p_resultref);
	
	//보낼 데이터에 값을 설정, 노드는 자동으로 생성
	model.makeValue(ref + "/" + "job_clsf", p_job_clsf);
	model.makeValue(ref + "/" + "cd_clsf", p_cd_clsf);
	model.makeValue(ref + "/" + "cd", p_cd);
	
	//서비미션을 생성하고 실행한다.
	send_submission(submission_id, ref, p_resultref, action, method, mediatype);

	//보낼 때 사용한 인스턴스는 삭제
	model.removenode(ref);
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	지정된 datagrid의 모든 컬럼을 숨김 설정한다.
//--------------------------------------------------------------------------------------------------
//입력
//	
//--------------------------------------------------------------------------------------------------
//출력
//	
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	지정된 그리드의 지정된 컬럼 목록을 숨김 해제한다.
//--------------------------------------------------------------------------------------------------
//입력
//	
//--------------------------------------------------------------------------------------------------
//출력
//	
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function show_columns(p_grid, p_cols) {
	grid = eval(p_grid);
	//p_cols가 공백이면 종료
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	지정된 그리드의 지정된 컬럼 목록을 숨김 설정한다.
//--------------------------------------------------------------------------------------------------
//입력
//	
//--------------------------------------------------------------------------------------------------
//출력
//	
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function hide_columns(p_grid,p_cols) {
	grid = eval(p_grid);
	//p_cols가 공백이면 종료
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	지정된 datagrid의 모든 컬럼을 숨김 해제한다.
//--------------------------------------------------------------------------------------------------
//입력
//	
//--------------------------------------------------------------------------------------------------
//출력
//	
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	지정된 datagrid의 모든 컬럼을 Disable 설정한다.
//--------------------------------------------------------------------------------------------------
//입력
//	
//--------------------------------------------------------------------------------------------------
//출력
//	
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	지정된 그리드의 지정된 컬럼 목록을 Disable 해제한다.
//--------------------------------------------------------------------------------------------------
//입력
//	
//--------------------------------------------------------------------------------------------------
//출력
//	
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
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
	//p_cols가 공백이면 종료
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	지정된 그리드의 지정된 컬럼 목록을 Disable 설정한다.
//--------------------------------------------------------------------------------------------------
//입력
//	
//--------------------------------------------------------------------------------------------------
//출력
//	
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	지정된 datagrid의 모든 컬럼을 Disable 해제한다.
//--------------------------------------------------------------------------------------------------
//입력
//	
//--------------------------------------------------------------------------------------------------
//출력
//	
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	지정된 컨트롤에 기본 설정을 한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_obj			기본 설정을 적용 시킬 컨트롤의 목록
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//	set_default() 함수에서 간접 사용
//	datagrid, input, group, caption, select1(combo) 등(추가 가능)의 지정된 컨트롤에 대해서
//	기본 설정으로 사용할 attribute를 지정한다.
//--------------------------------------------------------------------------------------------------
//예제
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
//rowheader는 동적 변환이 되지 않음
//			if ("" == obj.attribute("rowheader")) {
//				obj.attribute("rowheader")	=	DATAGRID_ROWHEADER_SEQ;
//			}
			//고정형태로 그리드를 사용하는 경우 사용자데이터 값을 true로 직접
			//attribute 설정해주면 row 초기화에서 제외된다.
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
	
	//col 지정
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	지정된 컨트롤 목록에 기본 설정을 한다.
//--------------------------------------------------------------------------------------------------
//입력
//	arguments		기본 설정을 적용 시킬 컨트롤의 목록
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	지정된 컨트롤 목록에 해당 포맷에 해당하는 스타일을 적용시킨다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_format		문자열로 지정된 스타일의 이름
//					숫자, 문자, 날짜 등등의 스타일을 사전 정의 해 놓고 사용함
//	arguments		포맷 이외에 포맷을 적용 시킬 오브젝트 리스트를 나열하면 된다.
//					특이한 경우로 datagrid의 경우 다음에 오는 값은 object가 아니라
//					적용시킬 컬럼의 목록이라고 가정한다.
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
//	set_format("STRING_C",datagrid1,"1,6,8,11,12,13");
//	set_format("STRING_L",datagrid1,"2,3,4,5,7,9,10,14,15,16,17");
//	set_format("DATE_1", input1, input5, datagrid2, "6,7");
//==================================================================================================
function set_format(p_format) {
	//format이 지정되지 않으면 종료
	if (p_format.Trim() == "") {
		return;
	}
	
	//argument가 1개 이하이면 종료
	if (arguments.length <= 1) {
		return;		
	}
	
	//지정된 objects의 갯수만큼 반복한다.
	//단 datagrid의 경우 다음에 오는 값은 object가 아니라 지정 할 컬럼의 목록이다.
	var skip = 0;
	var i = 1;
	
	while(i < arguments.length) {
		obj = eval(arguments[i]);
		skip = 0;
		cols = "";
		//무조껀 현재 위치의 argument는 object여야 한다.
		//datagrid의 경우 다음 항목을 사용하고 i를 1더해서 다음 object가 오도록 한다.
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	컨트롤에 지정된 스타일을 적용시킨다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_format		문자열로 지정된 스타일의 이름
//					숫자, 문자, 날짜 등등의 스타일을 사전 정의 해 놓고 사용함
//	p_obj			데이터 그리드 오브젝트
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//	set_format() 함수에서 간접 사용하는 함수
//--------------------------------------------------------------------------------------------------
//예제
//
//==================================================================================================
function set_format_control(p_format,p_obj) {
	//format이 지정되지 않으면 종료
	if (p_format.Trim() == "") {
		return;
	}
	
	obj.attribute(STYLE_FORMAT) = get_style_string(STYLE_FORMAT,p_format);
	obj.attribute(STYLE_TEXT_ALIGN) = get_style_string(STYLE_TEXT_ALIGN,p_format);
	obj.attribute(STYLE_VERTICAL_ALIGN) = get_style_string(STYLE_VERTICAL_ALIGN,p_format);
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	데이터 그리드의 지정된 컬럼에 대해서 스타일을 적용시킨다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_format		문자열로 지정된 스타일의 이름
//					숫자, 문자, 날짜 등등의 스타일을 사전 정의 해 놓고 사용함
//	p_obj			데이터 그리드 오브젝트
//	p_cols			적용시킬 컬럼의 목록
//					"1,5,6,8" 형태로 ","로 구분하여 컬럼 인덱스 지정
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//	set_format() 함수에서 간접 사용하는 함수
//--------------------------------------------------------------------------------------------------
//예제
//
//==================================================================================================
function set_format_datagrid(p_format,p_obj,p_cols) {
	//format이 지정되지 않으면 종료
	if (p_format.Trim() == "") {
		return;
	}
	//p_cols가 공백이면 종료
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	입력된 값에 맞는 실제 스타일을 반환한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_type			STYLE_FORMAT,STYLE_TEXT_ALIGN,STYLE_VERTICAL_ALIGN 등의 (추가될 수 있음)
//					어떤 타입의 스타일을 사용할지 여부
//	p_format		문자열로 지정된 스타일의 이름
//					숫자, 문자, 날짜 등등의 스타일을 사전 정의 해 놓고 사용함
//--------------------------------------------------------------------------------------------------
//출력
//	String			attribute로 지정될 스타일의 문자열 값
//--------------------------------------------------------------------------------------------------
//설명
//	set_format() 함수에서 간접 사용하는 함수
//--------------------------------------------------------------------------------------------------
//예제
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	팝업을 보여준다. (미지정)
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			popup 시킬 xrw id
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
//
//==================================================================================================
function show_popup(p_popid) {
	show_popupEx(p_popid,"modal","width:950px; height:756px; ");
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	팝업을 보여준다. (640*480)
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			popup 시킬 xrw id
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
//
//==================================================================================================
function show_popup640(p_popid) {
	show_popupEx(p_popid,"modal","width:640px; height:480px; ");
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	팝업을 보여준다. (400*300)
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			popup 시킬 xrw id
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
//
//==================================================================================================
function show_popup400(p_popid) {
	show_popupEx(p_popid,"modal","width:400px; height:300px; ");
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	팝업을 보여준다. (확장기능)
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			popup 시킬 xrw id
//	p_properties	창의 형태에 관련된 property
//					"width:640px; height:480px; " 와 같이 주로 크기 관련된 속성을 지정하면 된다.
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	지정된 popid를 통해서 xrw 파일을 load하고 보낼 데이터가 있는 인스턴스 위치와 데이터를 받을
//	인스턴스 위치를 지정한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			popup 시킬 xrw id
//	p_properties	창의 형태에 관련된 property
//					"640","400","" 의 고정된 값이거나
//					직접 지정한 property의 값일 수 있다.
//	p_ref			보내는 데이터가 있는 인스턴스 위치
//	p_resultref		데이터를 받을 인스턴스 위치
//--------------------------------------------------------------------------------------------------
//출력
//	true			팝업에서 전달된 데이터가 있을 때
//	false			팝업에서 전달된 데이터가 없을 때
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
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
			//공백이면 표준폼 크기 946*765로 열리도록 한다.
			show_popup(p_popid.toUpperCase());
			break;
		default:
			//공백도 아니고 규정된 사이즈도 아니라면 "width:640px; height:480px; " 형태로 직접 사이즈가 넘어왔다고 가정한다.
			show_popupEx(p_popid.toUpperCase(),"modal",p_properties);
			break;
	}

	var rcvs_value_list = model.property(rcvs_name);

	model.property(send_name) = "";
	model.property(rcvs_name) = "";
	
	return save_value_list(p_resultref,rcvs_value_list);
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	지정된 popid를 통해서 xrw 파일을 load하고 보낼 데이터가 있는 인스턴스 위치와 데이터를 받을
//	인스턴스 위치를 지정한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			popup 시킬 xrw id
//	p_properties	창의 형태에 관련된 property
//					"640","400","" 의 고정된 값이거나
//					직접 지정한 property의 값일 수 있다.
//--------------------------------------------------------------------------------------------------
//출력
//	true			팝업에서 전달된 데이터가 있을 때
//	false			팝업에서 전달된 데이터가 없을 때
//--------------------------------------------------------------------------------------------------
//설명
//	표준으로 사용하기 위한 래핑함수
//	보낼 데이터의 위치는 "/root/reqData/fwdData/" 아래의 p_popid의 소문자 변환 이름과 같다고 가정하고
//	받을 데이터의 위치는 "/root/resData/rcvData/" 아래의 p_popid의 소문자 변환 이름과 같다고 가정
//	pop_id가 "fc_acct_1180" 인 경우
//	ref = "/root/reqData/fwdData/fc_acct_1180"
//	resultref = "/root/resData/rcvData/fc_acct_1180"
//	와 같다.
//--------------------------------------------------------------------------------------------------
//예제
//	MODE
//		'S' 자동 검색
//		'C' 1건인 경우 자동 닫기	<- 시간차이 문제 때문에 사용 할 수 없음
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	팝업에 사용할 프로퍼티 이름을 p_popid 기준으로 반환한다. (팝업이 받는 값에 대한 프로퍼티)
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			popup 시킬 xrw id
//--------------------------------------------------------------------------------------------------
//출력
//	String			팝업에 사용할 프로퍼티 이름
//--------------------------------------------------------------------------------------------------
//설명
//
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function get_popup_send_property_name(p_popid) {
	return ("POP_SEND_" + p_popid.toUpperCase());
}

//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	팝업에 전달 할 값이 들어있는 프로퍼티의 값을 가져온다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			popup 시킬 xrw id
//--------------------------------------------------------------------------------------------------
//출력
//	String			팝업에 사용할 프로퍼티 이름
//--------------------------------------------------------------------------------------------------
//설명
//	표준위치를 사용하는 경우
//	p_popid를 사용해 프로퍼티의 이름을 확인하고
//	해당 프로퍼티의 값을 가져오는 함수
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function get_popup_send_property(p_popid) {
	return model.property(get_popup_send_property_name(p_popid)).Trim();
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	팝업에 전달 할 값을 프로퍼티에 설정한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			popup 시킬 xrw id
//--------------------------------------------------------------------------------------------------
//출력
//	String			팝업에 사용할 프로퍼티 이름
//--------------------------------------------------------------------------------------------------
//설명
//	표준위치를 사용하는 경우
//	p_popid를 사용해 프로퍼티의 이름을 확인하고
//	해당 프로퍼티의 값을 설정하는 함수
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function set_popup_send_property(p_popid,p_value) {
	model.property(get_popup_send_property_name(p_popid)) = p_value;
}

//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	팝업에 사용할 프로퍼티 이름을 p_popid 기준으로 반환한다. (팝업이 보내는 값에 대한 프로퍼티)
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			popup 시킬 xrw id
//--------------------------------------------------------------------------------------------------
//출력
//	String			팝업에 사용할 프로퍼티 이름
//--------------------------------------------------------------------------------------------------
//설명
//
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function get_popup_rcvs_property_name(p_popid) {
	return ("POP_RCVS_" + p_popid.toUpperCase());
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	팝업에서 전달 된 값이 들어있는 프로퍼티의 값을 가져온다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			popup 시킬 xrw id
//--------------------------------------------------------------------------------------------------
//출력
//	String			팝업에 사용할 프로퍼티 이름
//--------------------------------------------------------------------------------------------------
//설명
//	표준위치를 사용하는 경우
//	p_popid를 사용해 프로퍼티의 이름을 확인하고
//	해당 프로퍼티의 값을 가져오는 함수
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function get_popup_rcvs_property(p_popid) {
	return model.property(get_popup_rcvs_property_name(p_popid)).Trim();
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	팝업에서 전달 될 값을 프로퍼티에 설정한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			popup 시킬 xrw id
//--------------------------------------------------------------------------------------------------
//출력
//	String			팝업에 사용할 프로퍼티 이름
//--------------------------------------------------------------------------------------------------
//설명
//	표준위치를 사용하는 경우
//	p_popid를 사용해 프로퍼티의 이름을 확인하고
//	해당 프로퍼티의 값을 설정하는 함수
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function set_popup_rcvs_property(p_popid,p_value) {
	model.property(get_popup_rcvs_property_name(p_popid)) = p_value;
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	팝업에 전달 할 값이 들어있는 인스턴스의 표준 위치를 p_popid를 추가하여
//	반환한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			popup 시킬 xrw id
//--------------------------------------------------------------------------------------------------
//출력
//	String			팝업에 보낼 값이 있는 인스턴스 위치
//--------------------------------------------------------------------------------------------------
//설명
//
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function get_popup_send_ref(p_popid) {
	return (SEND_DATA_REF + "/" + p_popid.toLowerCase() + "/record");
	//return (SEND_DATA_REF + "/" + p_popid.toLowerCase());
}

//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	팝업에서 전달 받을 값이 위치할 인스턴스의 표준 위치를 p_popid를 추가하여
//	반환한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			popup 시킬 xrw id
//--------------------------------------------------------------------------------------------------
//출력
//	String			팝업에서 전달 받을 값을 저장할 인스턴스 위치
//--------------------------------------------------------------------------------------------------
//설명
//
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function get_popup_rcvs_ref(p_popid) {
	return (RCVS_DATA_REF + "/" + p_popid.toLowerCase() + "/record");
	//return (RCVS_DATA_REF + "/" + p_popid.toLowerCase());
}

//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	팝업에 전달 할 값을 저장하는 함수
//	기본위치를 사용하지않는 경우 개발자가 직접 값을 설정하고 가져오는
//	model.getValue(), model.setValue() 함수를 사용하여 코딩하면 됨
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			popup 시킬 xrw id
//	p_name			저장할 element 이름
//	p_value			저장할 값
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//	팝업호출시 표준위치를 사용할 경우만 사용할 수 있는 함수
//	기본위치 + p_popid 에 해당하는 인스턴스에
//	p_name에 지정된 이름으로 p_value의 값을 설정한다.
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function set_popup_send_data(p_popid,p_name,p_value) {
	var ref = get_popup_send_ref(p_popid);
	model.makeValue(ref + "/" + p_name, p_value);
}

//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	팝업에 전달하기위해 저장된 값을 삭제하는 함수
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			popup 시킬 xrw id
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//	팝업관련 모든 작업을 종료하고 호출
//	입력값의 갯수가 항상 같은 경우에는 따로 호출 하지 않아도
//	set_popup_send_data() 함수를 통해 설정하면 override 되기 때문에
//	별도로 호출 할 필요는 없다.
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function reset_popup_send_data(p_popid) {
	reset_refnode(get_popup_send_ref(p_popid));
}

//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	팝업에서 전달된 결과값을 삭제하는 함수
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			popup 시킬 xrw id
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function reset_popup_rcvs_data(p_popid) {
	reset_refnode(get_popup_rcvs_ref(p_popid));
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	팝업에 전달 할 값을 가져오는 함수
//	기본위치를 사용하지않는 경우 개발자가 직접 값을 설정하고 가져오는
//	model.getValue(), model.setValue() 함수를 사용하여 코딩하면 됨
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			popup 시킬 xrw id
//	p_name			저장할 element 이름
//--------------------------------------------------------------------------------------------------
//출력
//	String			p_name에 해당하는 값
//--------------------------------------------------------------------------------------------------
//설명
//	팝업호출시 표준위치를 사용할 경우만 사용할 수 있는 함수
//	기본위치 + p_popid 에 해당하는 인스턴스에서
//	p_name에 지정된 이름으로 저장된 값을 가져온다.
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function get_popup_send_data(p_popid,p_name) {
	return model.getValue(get_popup_send_ref(p_popid) + "/" + p_name).Trim();
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	팝업에서 전달할 값을 저장하는 함수
//	기본위치를 사용하지않는 경우 개발자가 직접 값을 설정하고 가져오는
//	model.getValue(), model.setValue() 함수를 사용하여 코딩하면 됨
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			popup 시킬 xrw id
//	p_name			저장할 element 이름
//	p_value			저장할 값
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//	팝업호출시 표준위치를 사용할 경우만 사용할 수 있는 함수
//	기본위치 + p_popid 에 해당하는 인스턴스에
//	p_name에 지정된 이름으로 p_value의 값을 설정한다.
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function set_popup_rcvs_data(p_popid,p_name,p_value) {
	var ref = get_popup_rcvs_ref(p_popid);
	model.makeValue(ref + "/" + p_name, p_value);
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	팝업에서 전달된 값을 가져오는 함수
//	기본위치를 사용하지않는 경우 개발자가 직접 값을 설정하고 가져오는
//	model.getValue(), model.setValue() 함수를 사용하여 코딩하면 됨
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			popup 시킬 xrw id
//	p_name			저장할 element 이름
//--------------------------------------------------------------------------------------------------
//출력
//	String			p_name에 해당하는 값
//--------------------------------------------------------------------------------------------------
//설명
//	팝업호출시 표준위치를 사용할 경우만 사용할 수 있는 함수
//	기본위치 + p_popid 에 해당하는 인스턴스에서
//	p_name에 지정된 이름으로 저장된 값을 가져온다.
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function get_popup_rcvs_data(p_popid,p_name) {
	return model.getValue(get_popup_rcvs_ref(p_popid) + "/" + p_name).Trim();
}


//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	전달할 값을 value_list 형태로 프로퍼티에 설정하고 popup을 종료한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			현재 팝업된 xrw id
//	p_resultref		전달할 값이 있는 인스턴스의 위치
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//	팝업창 입장에서 호출한 창에 결과를 보내는 함수
//	기본설정 위치를 사용한다.
//	/root/reqData/fwdData/p_popid 위치에 보낼 값이 있다면 이 함수를 사용하고
//	데이터그리드의 특정 row를 직접 반환하거나 다른 위치를 사용하려면
//	close_popupEx() 함수를 사용하면 된다.
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function close_popup(p_popid) {
	close_popupEx(p_popid, get_popup_send_ref(p_popid));
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	iv_Title 이름으로 사용하는 import된 xrw 내부의 타이틀을 설정하는 함수
//--------------------------------------------------------------------------------------------------
//입력
//	p_title			설정할 타이틀
//--------------------------------------------------------------------------------------------------
//출력
//--------------------------------------------------------------------------------------------------
//설명
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function set_popup_title(p_title) {
	iv_Title.group_tit.maintitle.value = p_title;
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	iv_Title 이름으로 사용하는 import된 xrw 내부의 타이틀을 반환하는 함수
//--------------------------------------------------------------------------------------------------
//입력
//--------------------------------------------------------------------------------------------------
//출력
//	String			타이틀
//--------------------------------------------------------------------------------------------------
//설명
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function get_popup_title() {
	return iv_Title.group_tit.maintitle.value;
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	iv_Title 이름으로 사용하는 import된 xrw 내부의 min 버튼의 visible 설정
//--------------------------------------------------------------------------------------------------
//입력
//	p_bool			true이면 버튼이 보이고
//					false이면 버튼이 보이지 않는다.
//--------------------------------------------------------------------------------------------------
//출력
//--------------------------------------------------------------------------------------------------
//설명
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function set_popup_min(p_bool) {
	iv_Title.group_tit.btnMin.visible = p_bool;
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	iv_Title 이름으로 사용하는 import된 xrw 내부의 max 버튼의 visible 설정
//--------------------------------------------------------------------------------------------------
//입력
//	p_bool			true이면 버튼이 보이고
//					false이면 버튼이 보이지 않는다.
//--------------------------------------------------------------------------------------------------
//출력
//--------------------------------------------------------------------------------------------------
//설명
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function set_popup_max(p_bool) {
	iv_Title.group_tit.btnMax.visible = p_bool;
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	iv_Title 이름으로 사용하는 import된 xrw 내부의 close 버튼의 visible 설정
//--------------------------------------------------------------------------------------------------
//입력
//	p_bool			true이면 버튼이 보이고
//					false이면 버튼이 보이지 않는다.
//--------------------------------------------------------------------------------------------------
//출력
//--------------------------------------------------------------------------------------------------
//설명
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function set_popup_close(p_bool) {
	iv_Title.group_tit.btnClose.visible = p_bool;
}

//==================================================================================================
//작성
//  윤정주
//--------------------------------------------------------------------------------------------------
//기능
//  부서에 대한 권한을 체크함.
//--------------------------------------------------------------------------------------------------
//입력
//  dept_cd         부서값
//--------------------------------------------------------------------------------------------------
//출력
//  없음
//--------------------------------------------------------------------------------------------------
//설명
//
//--------------------------------------------------------------------------------------------------
//예제
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	submit_completed()함수의 결과값으로 submission의 성공/실패 여부를 확인하고
//	성공시 지정된 메시지, 실패시 지정된 메시지를 각각 보여준다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_success_msg			성공시 사용자에게 보여질 메시지
//	p_faild_msg				실패시 사용자에게 보여질 메시지
//--------------------------------------------------------------------------------------------------
//출력
//	Boolean					submit_completed()의 결과값
//--------------------------------------------------------------------------------------------------
//설명
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function check_submit_completed(p_success_msg, p_faild_msg) {
	if (p_success_msg == null) {
		p_success_msg = "";
	}
	if (p_faild_msg == null) {
		p_faild_msg = "";
	}	

	//확인
	if(submit_completed()) {
		//성공
		if (p_success_msg != "") show_message(p_success_msg,"데이터 처리 확인");
		return true;
	}
	else {
		//에러
		if (p_faild_msg != "") show_message(p_faild_msg,"데이터 처리 확인");
		return false;
	}
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	입력 항목의 값을 검증 한다.
//--------------------------------------------------------------------------------------------------
//입력
//	1:object			체크할 instance path 혹은 control
//	2:string			문자열 앞,뒤의 공백을 제거 할 지 여부, "TRIM","LTRIM","RTRIM","NONE"
//	3:string			필수항목 체크에 실패 했을 경우 focus를 줄지 여부, "FOCUS", "NONE"
//	4:string			필수항목 체크에 실패 했을 경우 보여 줄 메시지, 항목의 이름을 넘기면 됨.
//	5:string			체크할 항목에 대한 정의(구분자는 ',' 사용)
//						5-1:	길이
//						5-2:	n보다 크거나 같다.
//						5-3:	n보다 작거나 같다.
//--------------------------------------------------------------------------------------------------
//출력
//	true				정상 처리
//	false				입력항목 검증에 실패, 항목이 공백인 경우
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
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
		show_message("데이터 검증 항목이 지정되지 않았습니다.");
		return flag;
	}

	//trim 여부
	if (arguments[1] == null || arguments[1].Trim() == "") {
		trim_type = TRIM_TYPE_NONE;
	}
	trim_type = arguments[1].toUpperCase();	
	
	//focus 대상 확인
	if (typeof(arguments[2]) == DATA_TYPE_OBJECT) {
		//만약 focus type이 object로 넘어온 경우 해당 오브젝트를 focus한다.
		//arguments[0]과 arguments[2]가 동시에 object라면 2번이 우선
		focus_target = eval(arguments[2]).attribute("id");
		focus_type = FOCUS_TYPE_FOCUS;
	}
	else if (typeof(arguments[0]) == DATA_TYPE_OBJECT) {
		//만약 focus type이 object가 아닌 focus 여부 문자열로 지정된다면
		//첫번째 인수를 focus 한다.
		focus_target = eval(arguments[0]).attribute("id");
	}
	else {
		//만약 focus type도 문자열 형태의 focus 여부로 넘어오고
		//체크할 값도 object가 아닌 instance 형태로 넘어왔다면
		//포커스를 할 필요가 없다.
		focus_target = "";
	}
	
	//focus가 object가 아닐 때만 처리
	//focus가 object라면 focus를 지정된 object로 이동시킨다.
	if (typeof(arguments[2]) != DATA_TYPE_OBJECT) {
		//focus 여부
		if (arguments[2] == null || arguments[2].Trim() == "") {
			focus_type = FOCUS_TYPE_NONE;
		}
		focus_type = arguments[2].toUpperCase();		
	}

	//message 여부
	//입력기준으로 확인하고 컨트롤에 caption attribute가 있는 경우 하단에서 다시 지정
	if (arguments[3] == null || arguments[3].Trim() == "") {
		item_name = "";
	}
	else {
		item_name = arguments[3];
	}

	//값 가져오기
	//문자열인 경우 체크할 인스턴스 위치라고 가정
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
		show_message("체크할 수 없는 값입니다.");
		return flag;
	}
	//지정된 trim형태로 값 변환
	val = remove_space(val,trim_type);

	//validation item
	if (arguments[4] == null || arguments[4].Trim() == "") {
		arguments[4] = "";
	}
	
	validation_itemList = arguments[4].Trim().split(PARSE_ITEMSEP);

	//반복문을 시작하기전 true로 설정해놓고
	//반복중에 validation 오류시 false로 설정
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	길이, 값비교를 통해서 주어진 값이 기준값에 합당한지 검증
//--------------------------------------------------------------------------------------------------
//입력
//	p_mode				number, 체크모드
//							VALIDATION_LENGTH		길이체크
//							VALIDATION_GTEQ			greater than or equal
//							VALIDATION_LTEQ			less than or equal
//	p_itemname			string, 현재 체크하고 있는 아이템의 이름, 메시지에 사용
//	p_item				string, 현재 체크하고자 하는 값의 문자열
//	p_check				string, 체크하고자 하는 기준값
//							VALIDATION_LENGTH		p_item의 길이와 비교할 숫자
//							VALIDATION_GTEQ			p_item < p_check를 비교 할 값, p_item >= p_check 
//							VALIDATION_LTEQ			p_item > p_check를 비교 할 값, p_item <= p_check 
//--------------------------------------------------------------------------------------------------
//출력
//	boolean, true		검증에 성공한 경우
//	boolean, false		검증에 실패한 경우
//--------------------------------------------------------------------------------------------------
//설명
//--------------------------------------------------------------------------------------------------
//예제
//==================================================================================================
function check_validation_item(p_mode,p_itemname,p_item,p_check) {
	var flag = true;
	var msg_title = "입력항목검증";
	
	switch(p_mode) {
		case VALIDATION_LENGTH:
			if (p_item.length != Number(p_check)) {
				//길이가 다른 경우
				flag = false;
				if ("" != p_itemname.Trim()) {
					show_message(p_itemname + "의 길이는 " + Number(p_check) + "자리로 입력하세요.",msg_title);
				}
			}
			break;
		case VALIDATION_GTEQ:
			if (p_item < p_check) {
				//값이 더 작은 경우
				flag = false;
				if ("" != p_itemname.Trim()) {
					show_message(p_itemname + "의 값은" + p_check + "보다 크게 입력하세요.",msg_title);
				}
			}
			break;
		case VALIDATION_LTEQ:
			if (p_item > p_check) {
				//값이 더 큰 경우
				flag = false;
				if ("" != p_itemname.Trim()) {
					show_message(p_itemname + "의 값은" + p_check + "보다 작게 입력하세요.",msg_title);
				}
			}
			break;
		default:
			//그외의 경우 처리하지 않는다, true로 반환
			break;
	}
	
	return flag;
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	입력된 p_ref path에서 값을 가져온다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_ref				string, 값이 저장된 instance path
//--------------------------------------------------------------------------------------------------
//출력
//	string				인스턴스의 값
//--------------------------------------------------------------------------------------------------
//설명
//	model.getValue()를 사용하여 값을 반환한다.
//	p_ref가 "" 인 경우 값으로 "" 반환
//--------------------------------------------------------------------------------------------------
//예제
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	p_obj control의 값을 반환한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_obj				object, 값이 저장된 control
//--------------------------------------------------------------------------------------------------
//출력
//	string				control의 값
//--------------------------------------------------------------------------------------------------
//설명
//	control별 값이 저장된 property를 사용하여 값을 가져와서 반환
//--------------------------------------------------------------------------------------------------
//예제
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
			show_message("체크 할 수 없는 값입니다.");
			break;
	}
	return return_value;
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	p_obj로 지정된 control의 ref를 참조하여 mapping된 instance의 값을 설정한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_obj				object, instance에 매핑된 control
//	p_value				string, 설정할 값
//	p_refresh			boolean, true인 경우 control을 refresh, false인 경우 미처리
//--------------------------------------------------------------------------------------------------
//출력
//--------------------------------------------------------------------------------------------------
//설명
//--------------------------------------------------------------------------------------------------
//예제
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	p_obj로 지정된 control의 ref를 참조하여 mapping된 instance의 값을 반환한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_obj				object, instance에 매핑된 control
//--------------------------------------------------------------------------------------------------
//출력
//	string				ref의 값
//--------------------------------------------------------------------------------------------------
//설명
//--------------------------------------------------------------------------------------------------
//예제
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	p_ref 참조하여 mapping된 instance의 값을 설정한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_ref				instance path
//	p_value				설정할 값
//--------------------------------------------------------------------------------------------------
//출력
//--------------------------------------------------------------------------------------------------
//설명
//--------------------------------------------------------------------------------------------------
//예제
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	p_ref 참조하여 mapping된 instance의 값을 반환한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_ref				instance path
//--------------------------------------------------------------------------------------------------
//출력
//	string				ref의 값
//--------------------------------------------------------------------------------------------------
//설명
//--------------------------------------------------------------------------------------------------
//예제
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	control에서 참조된 instance path를 찾거나 사용자 지정된 instance path에
//	p_value의 값을 설정한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_item				object(control) 혹은 instance path
//	p_value				설정할 값
//	string,boolean		control의 refresh여부
//--------------------------------------------------------------------------------------------------
//출력
//--------------------------------------------------------------------------------------------------
//설명
//	인스턴스인 경우 refresh는 제외되고, control인 경우 입력된 값을 사용하여 refresh여부를
//	확인하여 인수로 전달함, 기본은 false
//--------------------------------------------------------------------------------------------------
//예제
//==================================================================================================
function set_refvalue(p_item,p_value) {
	var refresh = true;
	var raise = false;

	//refresh 여부
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

	//value-changed 여부
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
		show_message("잘못된 item 설정");
	}
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	control에서 참조된 instance path를 찾거나 사용자 지정된 instance path에서
//	값을 찾아서 반환한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_item				object(control) 혹은 instance path
//--------------------------------------------------------------------------------------------------
//출력
//	string				instance의 값
//--------------------------------------------------------------------------------------------------
//설명
//--------------------------------------------------------------------------------------------------
//예제
//==================================================================================================
function get_refvalue(p_item) {
	if (typeof(p_item) == DATA_TYPE_STRING) {
		return get_instance_value(p_item);
	}
	else if (typeof(p_item) == DATA_TYPE_OBJECT) {
		return get_object_value(p_item);
	}
	else {
		show_message("잘못된 item 설정");
	}
}
//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	문자열로 지정된 두 날짜의 차이를 계산해서 반환한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_from				string, 시작일
//	p_to				string, 종료일
//--------------------------------------------------------------------------------------------------
//출력
//	number				날짜간의 차이 값
//						계산이 불가능한 값이 들어온다면 0으로 반환한다.
//--------------------------------------------------------------------------------------------------
//설명
//	p_to 에서 p_from 을 뺀 날을 계산한다.
//--------------------------------------------------------------------------------------------------
//예제
//==================================================================================================
function get_datediff(p_from,p_to) {
	var diff = 0;
	var error_disp = false;

	//에러표시여부
	if (arguments[2] != null) {
		if (typeof(arguments[2]) == DATA_TYPE_STRING) {
			error_disp = convert_to_bool(arguments[2],false);
		}
		else if  (typeof(arguments[2]) == DATA_TYPE_BOOLEAN) {
			error_disp = eval(arguments[2]);
		}
	}
	
	//시작일 체크
	if (typeof(p_from) != DATA_TYPE_STRING) {
		if (error_disp) {
			show_message("get_datediff()\n시작일 입력 값 오류");
		}
		return diff;
	}
	
	//종료일 체크
	if (typeof(p_to) != DATA_TYPE_STRING) {
		if (error_disp) {
			show_message("get_datediff()\n종료일 입력 값 오류");
		}
		return diff;
	}
	
	var from_dt = p_from.ToDate();
	var to_dt =	p_to.ToDate();
	
	//시작일 체크
	if (from_dt == null) {
		if (error_disp) {
			show_message("get_datediff()\n시작일 입력 값 오류");
		}
		return diff;
	}
	
	//종료일 체크
	if (to_dt == null) {
		if (error_disp) {
			show_message("get_datediff()\n종료일 입력 값 오류");
		}
		return diff;
	}
	
	return to_dt.Diff(from_dt);
}

//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	문자열을 boolean 변수로 변환하고 반환하며, 변환에 실패할 경우 default 설정을 반환한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_str				변환할 문자열
//	p_default			변환실패시 설정할 기본값
//--------------------------------------------------------------------------------------------------
//출력
//	true
//	false
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	대상 obj(datagrid)의 p_row와 p_col 위치의 cell text color를 변경한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_obj				datagrid, 대상 datagrid
//	p_row				대상 rowid
//	p_col				대상 colid
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//	지정된 위치의 셀 텍스트 색상을 에러 색으로 변경한다.
//--------------------------------------------------------------------------------------------------
//예제
//==================================================================================================
function add_datagrid_error(p_obj,p_row,p_col) {
	var obj = eval(p_obj);
	obj.cellStyle("color",p_row,p_col) = DEFAULT_DATAGRID_TEXT_COLOR_ERROR;
}

//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	대상 obj(datagrid)의 p_row와 p_col 위치의 cell text color를 변경한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_obj				datagrid, 대상 datagrid
//	p_row				대상 rowid
//	p_col				대상 colid
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//	지정된 위치의 셀 텍스트 색상을 기본 색으로 변경한다.
//--------------------------------------------------------------------------------------------------
//예제
//==================================================================================================
function del_datagrid_error(p_obj,p_row,p_col) {
	var obj = eval(p_obj);
	obj.cellStyle("color",p_row,p_col) = DEFAULT_DATAGRID_TEXT_COLOR_NORMAL;
}

//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	p_obj로 넘어온 datagrid의 p_colid가 순차적인 값인지 확인하고
//	특정 row의 p_colid에 해당하는 값이 위에 위치한 값보다 작거나, 아래 위치한 값보다 큰 경우
//	해당 row의 p_colid cell의 text 색상을 변경한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_obj				datagrid, 대상 datagrid
//	p_colid				Number, 대상 column
//	arguments[2]		Number, 대상 row
//--------------------------------------------------------------------------------------------------
//출력
//	Array[2]			Number[2],	Array(0)은 위의 값보다 작은 경우의 갯수,
//									Array(1)은 아래 값보다 큰 경우의 갯수
//--------------------------------------------------------------------------------------------------
//설명
//	반환값 배열을 사용해서 적절한 메시지를 출력하는 형태로 사용하면 됨
//	이 메서드를 사용 할 경우는
//	그리드에 내용이 다시 조회되거나 변경되는 경우 datagrid.rebuildStyle() 함수로
//	특정 셀에 설정된 스타일을 초기화 시켜야 한다.
//--------------------------------------------------------------------------------------------------
//예제
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
	
	//rowid 지정 여부
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

		//현재 데이터가 이전데이터보다 작은지 검증
		for (var i = obj.fixedRows; i < j;i++) {
			curr_value = obj.valueMatrix(i,colid).Trim();
			
			if (curr_value == "") {
				continue;
			}
			
			if (base_value < curr_value) {
				add_datagrid_error(obj,j,colid);
				//현재데이터가 이전데이터보다 작다면 -1을 반환
				lcount++;
				break;
			}
		}
		
		//현재 데이터가 이전데이터보다 큰지 검증
		for (var i = j + 1; i < obj.rows;i++) {
			curr_value = obj.valueMatrix(i,colid).Trim();
			
			if (curr_value == "") {
				continue;
			}
			
			if (base_value > curr_value) {
				add_datagrid_error(obj,j,colid);
				//현재데이터가 이전데이터보다 작다면 -1을 반환
				gcount++;
				break;
			}
		}
	}
	
	return new Array (lcount,gcount);
}

//==================================================================================================
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	p_obj로 지정된 datagrid에서 필수값(class==req) 혹은 지정된 column이 모두 공백일 경우에
//	해당 rowstatus를 clear 시킨다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_obj				datagrid,체크할 datagrid
//	arguments[1]		string, 체크할 col list. 미지정시 req 필드를 대상으로 검사한다. 
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//	대상 datagrid중 입력,수정,삭제의 대상에서 제외할 row를 확인하기 위한 함수
//--------------------------------------------------------------------------------------------------
//예제
//	
//==================================================================================================
function del_datagrid_reqdata_empty(p_obj) {
	var obj = eval(p_obj);
	var rowstatus = 0;
	var need_del = false;
	var cell_value = "";
	var col_list = null;
	var req_mode = true;	//req_mode 가 true이면 req를 체크하고, 아니면 지정된 col_list에 해당하는 column을 대상으로
	var key_flag = false;
	var key_mode = false;

	//컬럼목록 지정 여부
	if (arguments[1] != null && arguments[1] != "") {
		col_list = datagrid_colname_to_colid(obj,arguments[1]).split(PARSE_ITEMSEP);
		req_mode = false;
	}
	else {
		col_list = "-1".split(PARSE_ITEMSEP);
		req_mode = true;
	}

	//키목록 지정 여부
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
	var req_mode = true;	//req_mode 가 true이면 req를 체크하고, 아니면 지정된 col_list에 해당하는 column을 대상으로
	var key_flag = false;

	//컬럼목록 지정 여부
	if (arguments[1] != null && arguments[1] != "") {
		col_list = datagrid_colname_to_colid(obj,arguments[1]).split(PARSE_ITEMSEP);
		req_mode = false;
	}
	else {
		col_list = "-1".split(PARSE_ITEMSEP);
		req_mode = true;
	}
	
	//키목록 지정 여부
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	p_array로 전달된 배열에 p_value 값이 있는지 체크한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_array				Array, 값이 들어있는 배열
//	p_value				String,Number, 배열에 있는지 체크할 값
//--------------------------------------------------------------------------------------------------
//출력
//	true				배열에 지정된 p_value가 있음
//	false				배열에 지정된 p_value가 없음
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
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
//작성
//	강태호
//--------------------------------------------------------------------------------------------------
//기능
//	datagrid 변경,입력사항 체크
//--------------------------------------------------------------------------------------------------
//입력
//	p_obj				체크할 datagrid
//--------------------------------------------------------------------------------------------------
//출력
//	true				변경,입력사항이 있음
//	false				변경,입력사항이 없음
//--------------------------------------------------------------------------------------------------
//설명
//	
//--------------------------------------------------------------------------------------------------
//예제
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

//년도의 spin control 구현시 사용 할 함수
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
//input event에서 onbuttonclick 이벤트와 내부의 다른 이벤트가 중복된 경우
//버튼을 눌렀는지 확인한다. 이 경우는 onbuttonclick 이벤트가 발생하지 않고 다른 이벤트가 먼저 시작하면서
//onbuttonclick event가 정상 동작하지 않는 경우를 확인하기 위한 함수
function check_dup_input_event() {
	if (event == null || event.button <= 0 || event.down == "" || event.name != "xforms-value-changed") {
		return false;
	}

	//눌려진 버튼이 현재 value-changed 이벤트의 currentTarget과 같은지 확인해야함.
	//값이 변경된 컨트롤과 눌려진 컨트롤이 틀리다면
	//눌려진 컨트롤의 buttonclick event를 수행하고나서
	//false를 반환시켜 value change 이벤트도 수행해야하고
	//같다면 버튼 클릭 이벤트만 수행하고
	//value-changed는 수행이 되지 않도록 true를 반환해야함.

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
		//이후 이벤트가 진행되지 않도록 막는다.
		event.preventDefault();
		return true;
	}
	
	return false;
}
*/

function check_dup_input_event() {
	if (event.button > 0 && event.down == event.currentTarget + ".button" && event.name != "onbuttonclick") {
		//onbuttonclick event를 구동시키고
		eval(event.currentTarget).dispatch("onbuttonclick");
		//이후 이벤트가 진행되지 않도록 막는다.
		event.preventDefault();
		return true;
	}
	
	return false;
}

//팝업을 호출하는 메인 함수
//내부에서 trustform의 event를 확인해서
//필요한 경우 팝업 호출 대신 직접 데이터를 찾아서 반환하는 형태로 구동되고
//value-changed와 buttonclick 이벤트가 동시에 발생했을 경우
//buttonclick 이벤트만 타도록 조정한다.
//p_more는 value-changed로 2건 이상의 데이터가 있을 경우 popup을 설정할지 여부
function call_popup(p_popid,p_subid,p_cursor,p_properties,p_more) {
	//팝업창을 열어야 할 지 여부 저장 변수
	var need_popup = true;
	//팝업에서 데이터가 전달되었는지 여부 저장 변수
	var rcvs_flag = false;
	var actionid = "";
	var totalcnt = 0;
	var more = true;
	
	//more 여부
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
	
	//버튼클릭으로 이벤트가 발생하기 전에
	//value-changed 이벤트가 먼저 발생한 경우
	//input button의 내부 버튼이 클릭됐는지 여부를 확인한다.
	if (event != null && event.name == "xforms-value-changed") {
		if (check_dup_input_event()) {
			//이미 buttonclick에서 필요한 작업을 마쳤으므로 false로 반환해서 중복작업을 없앤다.
			return rcvs_flag;
		}
	}
	
	//이전에 조회되었던 자료를 삭제한다.
	//reset_popup_rcvs_data(p_popid);

	//p_subid가 지정되었을 때만 동작한다.
	if (p_subid.Trim() != "") {
		//현재 함수를 실행한 이벤트가 value-changed인지 확인한다.
		if (event != null && event.name == "xforms-value-changed") {
			var act_info = p_subid.split("_");
			var system_cd = act_info[0];
			var part_cd = act_info[1];
			var servlet_id = act_info[2];
			var servlet_cd = servlet_id.substr(0,1) + "000";
			
			//필수항목이 입력되었는지 확인하고 입력되지 않은 필수 항목이 있는 경우 
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
					// 데이터가 여러건인 경우 팝업을 띄우면 취소는 사용자 선택이지만
					// 팝업을 띄우지 않으면 취소형태로 반환되어야 한다.
					// 따라서 기본 반환값을 false로 설정한다.
					// 팝업을 띄우면 사용자 선택에 따라 true로 변경되기도 한다.
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
	
	//그외 버튼인 경우는 계속 진행
	if (need_popup) {
		rcvs_flag = open_popup(p_popid,p_properties);
	}
	
//	if (!rcvs_flag) {
//		reset_popup_rcvs_data(p_popid);
//	}
	
	//조회를 위해 설정했던 데이터들을 삭제한다.
	reset_popup_send_data(p_popid);
	//팝업에서 데이터가 정상적으로 전달되었는지 여부를 반환한다.
	return rcvs_flag;	
}


function call_mc_co_1010(p_more) {
	var more = true;
	
	//more 여부
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
	
	//more 여부
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
	
	//more 여부
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
	
	//more 여부
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
    
    //more 여부
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
	
	//more 여부
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
	
	//more 여부
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
	
	//more 여부
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
	
	//more 여부
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
    
    //more 여부
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
    
    //more 여부
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
    
    //more 여부
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

// 원가배부코드조회 팝업
function call_mc_co_1030(p_more) {
    var more = true;
    
    //more 여부
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

//예산상세내역조회 팝업
function call_mc_co_1040(p_more) {
    var more = true;
    
    //more 여부
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

//지정된 datagrid control의 모든 row를 삭제한다.
function datagrid_data_clear(p_obj){
	var obj = eval(p_obj);

	remove_refnodeset(obj.nodeset);
	
	obj.refresh();
}

function datagrid_addrow(p_obj,p_num,p_refresh) {
	var obj = eval(p_obj);
	var refresh = true;

	//row를 추가하고 refresh 할지 여부
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

//해당 노드를 생성한다 기존에 있으면 false
//생성되었으면 true;
function make_refnode(p_ref) {
	p_ref = p_ref.Trim();
	
	if (p_ref == "") {
		return false;
	}
	
	//받을 인스턴스 구조가 없는 경우 생성한다.
	if (instance1.selectSingleNode(p_ref) == null) {
		model.makeNode(p_ref);
		return true;
	}
	return false;
}

//경로가 있고 리셋이 정상처리되면 true
//경로가 없는 경우 false;
function reset_refnode(p_ref) {
	p_ref = p_ref.Trim();

	if (p_ref != "") {
		model.removenode(p_ref);
		model.makeNode(p_ref);
		return true;
	}	
	return false;
}

//경로가 있고 복사처리되면 true
//경로가 없는 경우 false;
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
        alert("형식 지정 오류");
        return r_str;
    }
    
	//길이가 0보다 작거나 같으면 원본 반환
	if (p_len <= 0) {
		return r_str;
	}
	//문자열이 지정된 길이보다 크거나 같으면 원본 반환
	if (r_str.length >= p_len) {
		return r_str;
	}
	//p_char이 null이거나 공백이면 기본값인 space로 설정한다.
	if (p_char == null || p_char == "") {
		p_char = " ";
	}
	
	//반복하면서 p_len보다 커지거나 같을 때까지 p_char을 붙인다.
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
        alert("형식 지정 오류");
        return r_str;
    }
	
	//길이가 0보다 작거나 같으면 원본 반환
	if (p_len <= 0) {
		return r_str;
	}
	//문자열이 지정된 길이보다 크거나 같으면 원본 반환
	if (r_str.length >= p_len) {
		return r_str;
	}
	//p_char이 null이거나 공백이면 기본값인 space로 설정한다.
	if (p_char == null || p_char == "") {
		p_char = " ";
	}
	
	//반복하면서 p_len보다 커지거나 같을 때까지 p_char을 붙인다.
	while(p_len > r_str.length) {
		r_str = r_str + p_char;
	}
	
	return r_str.substr(0,p_len);
}

//전역함수임 CIISComm.js에 들어가야 맞지만
//귀찮아서 우리만 사용함
/* 배상용 과장 datagrid의 sort를 사용 할 경우 인스턴스의 순서와 데이터의 rowid와의
 * 매핑이 깨지므로 sort시에 grid내용을 instance에 반영하도록 적용
 */
function onaftersort() {
	if (event == null) {
		return;
	}

	if (eval(event.target) == null || eval(event.currentTarget) == null) {
		return;
	}

	if (event.target != event.currentTarget || eval(event.target).elementName != "xforms:datagrid") {
		//버블링 제거, datagrid 확인
		return;
	}
	
	var obj = eval(event.target);

	try {
		//정렬 후 rowid와 실제 instance의 순서가 틀려지므로
		//정렬 후 무조껀 인스턴스와 동기화 시킨다.
		obj.gridToInstance();
	}
	catch(ex) {
		
	}
	finally {
		
	}
}

//콤보의 모든 데이터 삭제
function combo_data_clear(p_obj){
	var obj = eval(p_obj);

	remove_refnodeset(obj.choices.itemset.attribute("nodeset"));
	
	obj.refresh();
}

//선택된 item을 선택해제하고 선택 해제된 item의 index 값을 반환한다.
function combo_data_init(p_obj) {
	var obj = eval(p_obj);
	var prev_index = obj.focusIndex;
	
	if (prev_index < 0) {
		return prev_index;
	}
	
	obj.deselect(prev_index);
	
	return prev_index;
}

//콤보에 데이터를 추가한다.
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
	
	//refresh 여부
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
	
	//중복추가 가능 여부
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
		//중복으로 추가 할 수 없는 경우
		return false;
	}
	
	if (refresh) {
		obj.refresh();
	}
	
	return true;
}

//콤보에 지정된 값이 있는지 확인한다.
// return -1 찾을 수 없거나 찾지 못한 경우
// return i 찾은 node의 순번
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

//combo나 datagrid등에 쓰이는 nodeset 형태의 데이터를 한꺼번에 reset삭제한다.
function remove_refnodeset(p_ref) {
	p_ref = p_ref.Trim();
	
	if (p_ref != "") {
		model.removeNodeset(p_ref);
		return true;
	}	
	return false;	
}	

//combo나 datagrid등에 쓰이는 nodeset 형태의 데이터를 한꺼번에 reset
function reset_refnodeset(p_ref) {
	p_ref = p_ref.Trim();

	if (p_ref != "") {
		remove_refnodeset(p_ref);
		make_refnode(p_ref);
		return true;
	}	
	return false;
}

//지정된 문자열을 숫자로 변환한다.
//값이 확인 될 수 없는 경우 0으로 처리해서 반환
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
	
	//null이거 공백이면 숫자 0으로 변환할지 여부 기본값:true
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

//지정된 row1,col1,row2,col2 영역의 합계를 구해서 반환한다.
//p_refcondition의 양식은 check_valitem의 validate_item을 참조 "길이,최소,최대"
function datagrid_data_sum(p_obj,p_row1,p_col1,p_row2,p_col2,p_refcolid,p_refcondition) {
	var obj = eval(p_obj);
	var return_value = 0;
	var row1 = 0;
	var col1 = 0;
	var row2 = 0;
	var col2 = 0;
	
	//row와 col로 지정된 1,2번 값중 큰 값이 뒤에 오도록 설정
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
	
	//시작 row 검증
	//고정row보다 작은 값이 시작 row로 지정된 경우 fixedRows로 변경
	if (row1 < obj.fixedRows) {
		row1 = obj.fixedRows;
	}
	
	//끝 row 검증
	if (row2 > obj.rows) {
		row2 = obj.rows;
	}
	
	//시작 col 검증
	if (col1 < obj.fixedCols) {
		col1 = obj.fixedCols;
	}
	
	//끝 col 검증
	if (col2 > obj.cols) {
		col2 = obj.cols;
	}
	
	//column의 경우 무조껀 첫 번째가 1이라고 가정한 경우
	//fixedCols가 0일때는 0번째가 1번이되므로 column을 재계산해줘야함.
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

	//colid가 범위 바깥에 있으면 조건비교를 하지 않는다.
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

			//row단위로 빼도 가능하지만 그냥 cell단위로 동작하도록 작성
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
        	len += 2; //Db가 한글을 3byte로 인식하여 2->3
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
	//p_cols가 공백이면 종료
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
			//해당 이름의 컬럼이 없음
			col_id = string_to_number(col_name);
		}
		
		return_value += col_id.toString() + ",";
	}
	return return_value.substr(0,return_value.length - 1);
}


function control_is_maxlength(p_obj,p_errclear,p_errfocus,p_errmsg) {
	//귀찮아서 모든 값은 정상적으로 넘어온다고 가정해버렸다.
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
					msg += "은(는) ";
				}
				msg += obj.attribute("maxlength") + "자리 형식입니다.";
				
				show_message(msg);
			}
		}
		if (true == p_errfocus) {
			model.setFocus(obj.attribute("id"));
		}
	}
	return false;
}

//이 함수가 정상동작 하기 위해서(focus가 true인 경우에 한해서)
//grid의 onnext() 함수에 선택적인 이벤트 무효화가 필요하다.
function datagrid_is_maxlength(p_obj,p_errclear,p_errfocus,p_errmsg) {
	//귀찮아서 모든 값은 정상적으로 넘어온다고 가정해버렸다.
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
					msg += "은(는) ";
				}
				msg += obj.colAttribute(obj.col,"maxlength") + "자리 형식입니다.";
				
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
		//문자열 ref
		source = instance1.selectSingleNode(p_source.Trim());
	}
	else if (true == var_is_object(p_source)) {
		//object node 라고 가정
		source = p_source;
	}
	
	if (true == var_is_string(p_parent)) {
		//문자열 ref
		parent = instance1.selectSingleNode(p_parent.Trim());
	}
	else if (true == var_is_object(p_parent)) {
		//object node 라고 가정
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
		//문자열 ref
		source = instance1.selectSingleNode(p_source.Trim());
	}
	else if (true == var_is_object(p_source)) {
		//object node 라고 가정
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
		//문자열 ref
		source = instance1.selectSingleNode(p_source.Trim());
	}
	else if (true == var_is_object(p_source)) {
		//object node 라고 가정
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
		//문자열 ref
		source = instance1.selectNodes(p_source.Trim());
		if (0 < source.length) {
			return_value = new Array(source.length);
			for(var i = 0;i < source.length;i++) {
				return_value[i] = source.item(i);
			}
		}
	}
	else if (true == var_is_object(p_source)) {
		//object node 라고 가정
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

//p_nodes는 node의 array 형태임
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
		//이미 데이터가 존재하고 dupinsert가 false이면
		//해당 item과 같은 값을 가진 첫 번째 값을 반환
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	p_ref 인스턴스 위치에 있는 1차 자식 노드들의 값 목록을 만든다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_ref			데이터 목록을 작성 할 인스턴스 위치
//--------------------------------------------------------------------------------------------------
//출력
//	String			값 목록
//--------------------------------------------------------------------------------------------------
//설명
//	기본으로 설정된 VALUE_LIST_ITEMSEP = "|", VALUE_LIST_VALUESEP = "=" 를 사용하여
//	clsf_cd=92|cd=|cd_abrv_nm=홍길동
//	형태의 값 목록을 만든다.
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	p_value_list를 통해서 받은 데이터를 p_ref 인스턴스 위치에 저장한다.
//--------------------------------------------------------------------------------------------------
//입력
//	p_ref			저장할 인스턴스 위치
//	p_value_list	저장할 데이터의 목록
//--------------------------------------------------------------------------------------------------
//출력
//	false			팝업을 통해 전달된 데이터가 없을 때
//	true			팝업을 통해 전달된 데이터가 있을 때
//--------------------------------------------------------------------------------------------------
//==================================================================================================
//지정된 p_value_list를 이용해서 p_ref 아래에 저장한다.
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
	//depth에서 최소 레벨을 빼서 /nodename 의 경우 0 /nodename/nodechild1 의 경우 1이 되도록 레벨 설정
	node_level = arr_value.length - 2;
//alert("ref="+ref+",node_string="+node_string+",node_value="+node_value);
	//레벨이 0인경우는 무조껀 노드를 만들고
	//아닌 경우는 부모 노드부터 현재의 마지막 형제 노드를 가르키도록 지정한다.
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
				//항상 이전에 부모 노드가 만들어지게 되므로
				//1이상의 값이 넘어오게 된다.
//alert("node_count is zero, node_path="+node_path);
				//node_path = node_path + "[" + 1 + "]";
			}
			else {
				node_path += "[" + node_count + "]";
			}
		}
		//마지막 노드이름을 추가하여 full path 생성
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
//작성
//	배상용
//--------------------------------------------------------------------------------------------------
//기능
//	전달할 값을 value_list 형태로 프로퍼티에 설정하고 popup을 종료한다. (확장)
//--------------------------------------------------------------------------------------------------
//입력
//	p_popid			현재 팝업된 xrw id
//	p_resultref		전달할 값이 있는 인스턴스의 위치
//--------------------------------------------------------------------------------------------------
//출력
//	없음
//--------------------------------------------------------------------------------------------------
//설명
//	팝업창 입장에서 호출한 창에 결과를 보내는 함수
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
            commMsgBox(ctr.attribute("caption") + "은(는) 필수입력항목입니다.");
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
