/*************** CRM에서 사용하는 기존 공통 script ***************/

/************************************************************************
*  Title        : 공통 자바스크립트 모음 ( 취합 )
*  Description  :  구성
*       1)팝업 관련 Method
*       2)폼 관련 Method
*       3)Util Method( Date, String, Etc...)
*  Copyright    : Copyright (c) 2003.03.02
*  Company      : Soft on mobile
*  사용환경       : Explorer 5.5 이상 최적
*  @author	    : feelhouse@orgio.net
*  @version     : 0.9
*************************************************************************/

/////////////////////////////////////////////////////////////////
//	1)팝업 관련 Method
/////////////////////////////////////////////////////////////////

    /**
     * 우편번호 검색 팝업창을 띄운다.( 조선일보에 맞게 커스터마이징 되어야 한다.)
     *
     * @param	column 컬럼명
     * @param	keyWord 검색어
     * @param	fn 펑션명
     */
    function jsPost(column, keyWord, fn) {
        var url = "/BasisServlet?cmd=SearchPost&column=" + column + "&keyWord=" + keyWord + "&fn=" + fn;
        var name = null;
        var features = "width=600,height=550,scrollbars=yes,top=100,left=100";
        var popupWin = window.open(url, name, features);
        popupWin.focus();
    }


    /**
     * 시스템 사용자(USR ID, 사용자명) 검색 팝업창을 띄운다.
     *
     * @param	column 컬럼명
     * @param	keyWord 검색어
     * @param	fn 펑션명
     * @use     function setSmusr(usrId, usrName) { }
     */
    function jsSmusr(column, keyWord, fn) {
        var url = "/SystemServlet?cmd=SearchUser&column=" + column + "&keyWord=" + keyWord + "&fn=" + fn;
        var name = null;
        var features = "width=600,height=550,scrollbars=yes,top=100,left=100";
        var popupWin = window.open(url, name, features);
        popupWin.focus();
    }

    /**
     * 새창을 여는 함수(왼쪽 상단)
     *
     * @param url
     * @param winName
     * @param sizeW
     * @param sizeH
     */
    function jsOpenWin( url, winName, sizeW, sizeH)
    {
        var nLeft  = 0;
        var nTop  = 0;
        opt = ",toolbar=no,menubar=no,location=no,scrollbars=yes,status=no";
        window.open(url, winName, "left=" + nLeft + ",top=" +  nTop + ",width=" + sizeW + ",height=" + sizeH  + opt );
    }


    /**
     * 새창을 화면 중앙에 여는 함수(스코럴바 no)
     *
     * @param url
     * @param winName
     * @param sizeW
     * @param sizeH
     */
    function jsNewWin( url, winName, sizeW, sizeH)
    {
        var nLeft  = screen.width/2 - sizeW/2 ;
        var nTop  = screen.height/2 - sizeH/2 ;
        opt = ",toolbar=no,menubar=no,location=no,scrollbars=no,status=no";
        window.open(url, winName, "left=" + nLeft + ",top=" +  nTop + ",width=" + sizeW + ",height=" + sizeH  + opt );
    }

    /**
     * 새창을 화면 중앙에 여는 함수(scrollbars yes)
     *
     * @param url
     * @param winName
     * @param sizeW
     * @param sizeH
     */
    function jsNewWinScY( url, winName, sizeW, sizeH)
    {
        var nLeft  = screen.width/2 - sizeW/2 ;
        var nTop  = screen.height/2 - sizeH/2 ;
        opt = ",toolbar=no,menubar=no,location=no,scrollbars=yes,status=no";
        window.open(url, winName, "left=" + nLeft + ",top=" +  nTop + ",width=" + sizeW + ",height=" + sizeH  + opt );
    }

    /**
     * 새창을 화면 중앙에 여는 함수(scrollbars auto)
     *
     * @param url
     * @param winName
     * @param sizeW
     * @param sizeH
     */
    function jsNewWinScA( url, winName, sizeW, sizeH)
    {
        var nLeft  = screen.width/2 - sizeW/2 ;
        var nTop  = screen.height/2 - sizeH/2 ;
        opt = ",toolbar=no,menubar=no,location=no,scrollbars=auto,status=no";
        window.open(url, winName, "left=" + nLeft + ",top=" +  nTop + ",width=" + sizeW + ",height=" + sizeH  + opt );
    }


    /**
     * Modal 새창을 화면 중앙에 여는 함수
     *
     * @param url
     * @param args
     * @param sizeW
     * @param sizeH
     */
    function jsNewModalWin( url, args, sizeW, sizeH)
    {
        opt = "center:yes; help:no; resizable:no; scroll:yes; status:yes";
        strReturn = window.showModalDialog(url, args, "dialogWidth:" + sizeW + "px; dialogHeight:" + sizeH  +"px; "+ opt );
        return strReturn;
    }

    /**
     * Status 없는 Modal 새창을 화면 중앙에 여는 함수
     *
     * @param url
     * @param args
     * @param sizeW
     * @param sizeH
     */
    function jsNewModalWinNoS( url, args, sizeW, sizeH)
    {
        opt = "center:yes; help:no; resizable:no; scroll:yes; status:no";
        strReturn = window.showModalDialog(url, args, "dialogWidth:" + sizeW + "px; dialogHeight:" + sizeH  +"px; "+ opt );
        return strReturn;
    }
/////////////////////////////////////////////////////////////////
//	2)폼 관련 Method
/////////////////////////////////////////////////////////////////

    /**
     * 폼 데이터 유효성을 체크한다.
     *
     * @param	form
     * @return boolean
     */
    function validate(form) {
        var obj;
        for (var i = 0; i < form.elements.length; i++) {
            obj = form.elements(i);
            if(!validateObj(form, obj)) return false;
        }

        return	true;
    }

    /**
     * 폼 내 특정 오브젝트의 데이터 유효성을 체크한다.
     *
     * @param form
     * @param	obj
     * @return boolean
     */
    function validateObj(form, obj) {

        //해당 element가 disabled 되었을 경우 항상 true를 리턴함
        if(obj.disabled) return true;

        var caption;
        var dataType;
        var minValue;
        var maxValue;
        var isValid;
        var value;

        var example = "";

        obj.value = trim(obj.value);
        caption = obj.getAttribute("caption");
        dataType = obj.getAttribute("dataType");
        minValue = obj.getAttribute("minValue");
        maxValue = obj.getAttribute("maxValue");
        len = obj.getAttribute("len");
        value = obj.value;

        //   alert(obj.name + ";");
        if (caption == null) {
            caption = obj.name;
        }

        // 필수 입력 항목 체크
        if (obj.getAttribute("notEmpty") != null) {
            isValid = false;

            if (obj.type == "radio" || obj.type == "checkbox") {
                if (form.elements(obj.name).length) {
                    for (var j = 0; j < form.elements(obj.name).length; j++) {
                        if (form.elements(obj.name)[j].checked) {
                            isValid = true;
                            break;
                        }
                    }
                } else {
                    if (obj.checked) {
                        isValid = true;
                    }
                }
            } else {
                if (value != "") {
                    isValid = true;
                }
            }

            if (!isValid) {
                alert(caption + "은(는) 필수 입력 항목 입니다.");
                obj.focus();
                selectTextField(obj);
                if (window.event) {
                    window.event.returnValue = false;
                }
                return	false;
            }
        }

        // 데이터 길이 체크
        if (len != null && value != "") {
            if (value.length != eval(len)) {
                alert(caption + "은(는) " + len + "자리를 입력해야 합니다.");
                obj.focus();
                selectTextField(obj);
                if (window.event) {
                    window.event.returnValue = false;
                }
                return	false;
            }
        }

        if (obj.type == "text" || obj.type == "password") {
            // 데이터 타입 체크
            if ((value != "") && (dataType != null)) {
                isValid = true;
                checkValue = false;

                if (dataType == "date") {
                    value = deleteDateFormatStr(value);
                    isValid = isDate(value);
                    checkValue = true;
                } else if (dataType == "month") {
                    value = deleteMonthFormatStr(value);
                    isValid = isDate(value + "01");
                    checkValue = true;
                } else if (dataType == "email") {
                    isValid = isEmail(value);
                } else if (dataType == "float") {
                    value = deleteCommaStr(value);
                    isValid = isFloat(value);
                    checkValue = true;
                } else if (dataType == "integer") {
                    value = deleteCommaStr(value);
                    isValid = isInteger(value);
                    checkValue = true;
                } else if (dataType == "number") {
                    value = deleteCommaStr(value);
                    isValid = isNumber(value);
                    checkValue = true;
                } else if (dataType == "phone") {
                    isValid = isValidPhone(value);
                    example = "\n예) 02-929-8272";
                } else if (dataType == "phone1") {
                    isValid = isValidPhone1(value); //지역번호만 체크
                    example = "\n예) 02";
                } else if (dataType == "pcs1") {
                    isValid = isValidPcs1(value); //휴대폰 이통사 번호만 체크
                    example = "\n예) 011";
                } else if (dataType == "jumin") {
                    value = deleteHyphen(value);
                    isValid = isValidJumin(value);
                    example = "";
                } else if (dataType == "office") {
                    value = deleteHyphen(value);
                    isValid = isValidOfficeNum(value);
                    example = "";
                } else if (dataType == "juffice") {
                    value = deleteHyphen(value);
                    isValid = isValidJuffice(value);
                    example = "";
                } else if ( dataType == "zip") {
                    value = deleteHyphen(value);
                    isValid = isValidZip(value);
                    example = "\n예) 100100";
                } else if ( dataType == "24hr") {
                    value = deleteSemicolon(value);
                    isValid = isValid24hr(value);
                    example = "\n예) 1300";
                }

                if (!isValid) {
                    alert(caption + "이(가) 올바르지 않습니다." + example);
                    /*
                    if (dataType == "float" || dataType == "integer" || dataType == "number") {
                        obj.value = "0";
                    }
                    */
                    obj.focus();
                    obj.select();
                    selectTextField(obj);
                    if (window.event) {
                        window.event.returnValue = false;
                    }
                    return	false;
                }
                if (checkValue) {
                    if (minValue != null) {
                        if (eval(minValue) > eval(value)) {
                            alert(caption + " 값이 최소값(" + minValue + ") 미만입니다.");
                            obj.focus();
                            selectTextField(obj);
                            if (window.event) {
                                window.event.returnValue = false;
                            }
                            return	false;
                        }
                    }
                    if (isValid && (maxValue != null)) {
                        if (eval(maxValue) < eval(value)) {
                            alert(caption + " 값이 최대값(" + maxValue + ")을 초과합니다.");
                            obj.focus();
                            selectTextField(obj);
                            if (window.event) {
                                window.event.returnValue = false;
                            }
                            return	false;
                        }
                    }
                }
            }
        }
        return	true;
    }

    /**
     * 이벤트 핸들러를 등록한다.
     *  INPUT 객체에 dataType 속성(User defined attribute)를 근거로 적절한 이벤트 핸들러를 등록한다.
     *  1. 모든 Input 객체 onkeypress = nextFocus
     *  2. Input 객체중 dataType 속성이 "date"인 경우 onblur = addDateFormat2 , onfocus = deleteDateFormat2;
     *  3. Input 객체중 dataType 속성이 "number" , "integer" 나 "float" 이고 commar 속성이 존재하는 경우 onblur = addComma2, onfocus = deleteComma2
     * @param
     * @return
     */
    function setEventHandler() {
        for (var i = 0; i < document.forms.length; i++) {
            var elements = document.forms(i).elements;
            setEventHandler2(elements);
        }
    }

    /**
     * 폼객체를 파라미터로 받아 이벤트 핸들러를 등록한다.
     * @param form
     * @return
     */
    function setEventHandler2(elements) {
        for (var j = 0; j < elements.length; j++) {
            // INPUT 객체의 onblur 이벤트에 핸들러를 등록한다.
            if (elements(j).tagName == "INPUT") {

                dataType = elements(j).getAttribute("dataType");

                if (dataType == "date") {	 // 날짜형 : 예) "2002/11/11"
                    if(!elements(j).readOnly){
                        elements(j).onblur = addDateFormat2;
                        elements(j).onfocus = deleteDateFormat2;
                    }
                    addDateFormat(elements(j));
                } else if (dataType == "month") { // 월분형 : 예) "2003/11"
                    if(!elements(j).readOnly){
                        elements(j).onblur = addMonthFormat2;
                        elements(j).onfocus = deleteMonthFormat2;
                    }
                    addMonthFormat(elements(j));
                } else if (dataType == "number" || dataType == "integer" || dataType == "float") {
                    if (elements(j).getAttribute("comma") != null) {
                        if(!elements(j).readOnly){
                            elements(j).onblur = addComma2;
                            elements(j).onfocus = deleteComma2;
                        }
                        addComma(elements(j));
                    }
                } else if (dataType == "jumin"){
                    if(!elements(j).readOnly){
                        elements(j).onblur = addJuminFormat2;
                        elements(j).onfocus = deleteJuminFormat2;
                    }
                    setJuminHyphen(elements(j));
                } else if (dataType == "office"){
                    if(!elements(j).readOnly){
                        elements(j).onblur = addOfficeFormat2;
                        elements(j).onfocus = deleteOfficeFormat2;
                    }
                    setJuminHyphen(elements(j));
                } else if (dataType == "juffice"){
                    if(!elements(j).readOnly){
                        elements(j).onblur = addJufficeFormat2;
                        elements(j).onfocus = deleteJufficeFormat2;
                    }
                    setJuminHyphen(elements(j));
                } else if (dataType == "zip"){
                    if(!elements(j).readOnly){
                        elements(j).onblur = addZipFormat2;
                        elements(j).onfocus = deleteZipFormat2;
                    }
                    setZipHyphen(elements(j));
                } else if (dataType == "24hr"){
                    if(!elements(j).readOnly){
                        elements(j).onblur = add24hrFormat2;
                        elements(j).onfocus = delete24hrFormat2;
                    }
                    set24hrSemicolon(elements(j));
                }
            }
        }
    }


    /**
     * 엔터 키 이벤트 핸들러를 등록한다.
     *
     *
     */
    function setEnterKeyEventHandler(){
        var forms = document.forms;
        _sortedForms = new Array(); // tabIndex 속성값에 따라 정렬된 element의 배열을 저장하기 위한 전역 배열
        for(var i = 0; i<forms.length; i++){
            _sortedForms[i] = sortFormByTabIndex(forms(i));
            //var elements = forms(i).elements;
            var elements = _sortedForms[i];
            for(var j = 0; j<elements.length; j++){
                if(elements[j].tagName != "TEXTAREA")elements[j].onkeypress = focusToTarget; //textarea 의 경우 enter key의 의미가 존재하므로 제외
            }
        }
    }

    /**
     * form elements 중 input 요소들의 background color 설정
     */
    function setInputBackgroundColor(){
        var forms = document.forms;
        var elements;
        for(var i=0; i<forms.length; i++){
            setInputBackgroundColorForm(forms(i));
        }
    }

    /**
     * 특정 form elements 중 input 요소들의 background color 설정
     */
    function setInputBackgroundColorForm(o_form){
        var elements = o_form.elements;
        for(var j=0; j<elements.length; j++){
            if(elements(j).tagName != "INPUT" || elements(j).type.toUpperCase() != "TEXT") continue;
            if(elements(j).readOnly || elements(j).disabled ){
                //elements(j).style.backgroundColor = "#E6E6E6";
                    elements(j).className = "readonly_box";
            }else{
                //elements(j).style.backgroundColor = "#FFFFFF";
                    elements(j).className = "text_box";
            }
        }
    }



    /**
    * 특정 input text box의 특정 index에  '-'를 삽입
    *
    * @param obj input text box 객체의 reference
    * @param idx '-'가 삽입될 index
    * @return
    */
    function insertDash(obj, idx){
        if(obj == null) return;
        obj.value = deleteHyphen(obj.value);

        var str = obj.value;
        if(str.length <= idx) return;
        obj.value = str.substring(0, idx) + "-" + str.substring(idx, str.length);
    }

    /**
     * Form element object중 <input type="text" || "password" > 일 경우 select를 수행한다.
     *
     * @param obj
     * @retrun
     */
    function selectTextField(obj){
        if(obj.tagName == "INPUT" && (obj.type == "text" || obj.type == "password")){
            obj.select();
        }
    }

    /**
     * 숫자형식에서 comma를 없애고, 날짜형식에서 "/" 를 없앤다.
     *
     * @param	form
     */
    function makeValue(form) {
        for (var i = 0; i < form.elements.length; i++) {
            obj = form.elements(i);
            makeValueObj(form, obj);
        }
    }


    /**
     * 숫자형식에서 comma를 없애고, 날짜형식에서 "/" 를 없앤다.
     * 하나의 오브젝트에 대한 것임.
     *
     * @param	form
     * @param	obj
     */
    function makeValueObj(form, obj) {
        if (obj.tagName == "INPUT") {
            dataType = obj.getAttribute("dataType");

            if (dataType == "date") {
                deleteDateFormat(obj);
            } else if (dataType == "month") {
                deleteMonthFormat(obj);
            } else if (dataType == "number" || dataType == "integer" || dataType == "float") {
                if (obj.getAttribute("comma") != null) {
                    deleteComma(obj);
                }
            } else if (dataType == "jumin" || dataType == "office" || dataType == "juffice" || dataType == "zip"){
                obj.value = deleteHyphen(obj.value);
            } else if (dataType == "24hr"){
                obj.value = deleteSemicolon(obj.value);
            }
        }
    }

    /**
     * Form Element Object에 값을 세팅한다.
     * Select box( Combo box )의 경우 해당 값과 일치하는 값을 가지는 index 가 선택
     * @param	obj
     * @param	value
     */
    function setValue(obj, value) {
        if (obj) {
            if (obj.type == "text") {
                obj.value = value;
            } else if (obj.tagName == "SELECT") {
                for (var i = 0; i < obj.length; i++) {
                    if (obj.options[i].value == value) {
                        obj.options[i].selected = true;
                        break;
                    }
                }
            }
        }
    }


    /**
     *  사업자번호 체크.
     *
     * @param  tempStr '-'를 뺀 사업자 번호
     * @return boolean
     */
    function isValidOfficeNum(tmpStr)
    {
        tmpSum			= new Number(0);
        tmpMod			= new Number(0);
        resValue		= new Number(0);
        var intOffNo 	= new Array(0,0,0,0,0,0,0,0,0,0);
        var strChkNum 	= new Array(1,3,7,1,3,7,1,3,5);

        for(var i = 0 ; i < 10 ; i ++){
            intOffNo[i] = new Number(tmpStr.substring(i, i+1));
        }

        for(var i = 0 ; i < 9 ; i ++){
            tmpSum = tmpSum + (intOffNo[i]*strChkNum[i]);
        }

        tmpSum = tmpSum + ((intOffNo[8]*5)/10);

        tmpMod = parseInt(tmpSum%10, 10);

        if(tmpMod == 0){
            resValue = 0;
        }
        else{
            resValue = 10 - tmpMod;
        }

        if(resValue == intOffNo[9]){
            return true;

        }
        else{
            return false;
        }
    }

    /**
     * 주민등록번호 체크
     *
     * @param obj
     * @return boolean
     */
    function isValidJuminObj(obj) {
        var str = deleteHyphen(obj.value);	// 필드에 있는 주민번호에서 '-'제거

        if( !isValidJumin(str) ) {
            alert("유효하지 않은 주민등록번호입니다.");
            obj.focus();
            if (window.event) {
                window.event.returnValue = false;
            }
            return	false;
        }
        obj.value = str;
        return	true;
    }

    /**
     * 사업자번호 혹은 주민등록번호 체크
     *
     * @param obj
     * @return boolean
     */
    function isValidJufficeObj(obj) {
        var str = deleteHyphen(obj.value);	// 필드에 있는 주민번호에서 '-'제거

        if( !isValidJuffice(str)){
            alert("유효하지 않은 번호입니다.");
            obj.focus();
            if (window.event) {
                window.event.returnValue = false;
            }
            return	false;
        }
        obj.value = str;
        return	true;
    }

    /**
     * 사업자번호 혹은 주민등록번호 체크
     *
     * @param str '-'를 뺀 번호
     * @return boolean
     */
    function isValidJuffice(str) {
        //if(isValidJumin(str) || isValidOfficeNum(str)){
	if(isValidJumin(str) || isValidOfficeNum(str) || isValidBubinNum(str) || isValidFgnNum(str)){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 주민등록번호 체크
     *
     * @param	str '-'를 뺀 주민등록번호
     * @return boolean
     */
    function isValidJumin(str) {
        var tmp = 0;
        var sex = str.substring(6, 7);
        var birthday;

        if (str.length != 13) {
            return	false;
        }

        if (sex == 1 || sex == 2) {
            birthday = "19" + str.substring(0, 6);
        } else if (sex == 3  || sex == 4) {
            birthday = "20" + str.substring(0, 6);
        } else {
            return	false;
        }

        if (!isDate(birthday)) {
            return	false;
        }

        for (var i = 0; i < 12 ; i++) {
            tmp = tmp + ((i%8+2) * parseInt(str.substring(i,i+1)));
        }

        tmp = 11 - (tmp %11);
        tmp = tmp % 10;

        if (tmp != str.substring(12, 13)) {
            return	false;
        }

        return	true;
    }

    /**
     * 유효한 우편번호인지 체크
     * @param str '-'을 뺀 우편번호
     * @return boolean
     */
    function isValidZip(str){
        re = /^(\d{6})$/;
        if (re.test(str)) {
            return	true;
        }
        return	false;
    }

    /**
     * 유효한 24hr 시간임을 체크
     * @param str ':'을 뺀 24hr - 예)0100
     * @return boolean
     */
    function isValid24hr(str){
        re = /^(\d{4})$/;
        return (isValidFormat(str,re) && isValidHour(str.substring(0,2)) && isValidMin(2,4));
    }

    /**
     * 오직 숫자로만 이루어져 있는지 체크
     *
     * @param	num 임의의 문자열
     * @return boolean
     */
    function isNumber(num) {
        re = /^[0-9]*[0-9]$/;

        if (re.test(num)) {
            return	true;
        }

        return	false;
    }

    /**
     * 정수 체크
     *
     * 1. +, - 부호를 생략하거나 넣을 수 있다 : ^[\+-]?
     * 2. 0에서 9까지 숫자가 0번 이상 올 수 있다 : [0-9]*
     * 3. 마지막은 숫자로 끝나야 한다 : [0-9]$
     *
     * @param	num 임의의 문자열
     * @return	boolean
     */
    function isInteger(num) {
        re = /^[\+-]?[0-9]*[0-9]$/;

        if (re.test(num)) {
            return	true;
        }

        return	false;
    }

    /**
     * 부동소수 체크
     *
     * 1. +, - 부호를 생략하거나 넣을 수 있다 : ^[\+-]?
     * 2. 0에서 9까지 숫자가 0번 이상 올 수 있다 : [0-9]*
     * 3. 소수점을 넣을 수 있다 : [.]?
     * 4. 소수점 이하 자리에 0에서 9까지 숫자가 올 수 있다 : [0-9]*
     * 5. 마지막은 숫자로 끝나야 한다 : [0-9]$
     *
     * @param	num 임의의 문자열
     * @return	boolean
     */
    function isFloat(num) {
        re = /^[\+-]?[0-9]*[.]?[0-9]*[0-9]$/;

        if (re.test(num)) {
            return	true;
        }

        return	false;
    }

    /**
     * 이메일 체크
     *
     * @param	email
     * @return	boolean
     *
     * Deprecated at 2003/10/27
     */
     /*
    function isEmail(email) {

        re = /[^@]+@[A-Za-z0-9_-]+[.]+[A-Za-z]+/;

        if (re.test(email)) {
            return	true;
        }

        return	false;
    }
    */

    /**
     * 이메일 체크
     *
     * @param	strEmail 임의의 문자열
     * @return	boolean
     */
    function isEmail (strEmail) {

        var checkTLD=1;
        var knownDomsPat=/^(com|net|org|edu|int|mil|gov|arpa|biz|aero|name|coop|info|pro|museum)$/;
        var emailPat=/^(.+)@(.+)$/;
        var specialChars="\\(\\)><@,;:\\\\\\\"\\.\\[\\]";
        var validChars="\[^\\s" + specialChars + "\]";
        var quotedUser="(\"[^\"]*\")";
        var ipDomainPat=/^\[(\d{1,3})\.(\d{1,3})\.(\d{1,3})\.(\d{1,3})\]$/;
        var atom=validChars + '+';
        var word="(" + atom + "|" + quotedUser + ")";
        var userPat=new RegExp("^" + word + "(\\." + word + ")*$");
        var domainPat=new RegExp("^" + atom + "(\\." + atom +")*$");
        var matchArray=strEmail.match(emailPat);

        if (matchArray==null) {
        //alert("이메일 주소가 정확하지 않습니다 (체크 @ and .'s)");
        return false;
        }
        var user=matchArray[1];
        var domain=matchArray[2];
        for (i=0; i<user.length; i++) {
        if (user.charCodeAt(i)>127) {
        //alert("잘못된 이메일 주소를 입력 하셨습니다.");
        return false;
           }
        }
        for (i=0; i<domain.length; i++) {
        if (domain.charCodeAt(i)>127) {
        //alert("도메인 이름이 잘못 기제 되었습니다.");
        return false;
           }
        }

        if (user.match(userPat)==null) {
        //alert("이메일 조소가 아닙니다.");
        return false;
        }
        var IPArray=domain.match(ipDomainPat);
        if (IPArray!=null) {

        for (var i=1;i<=4;i++) {
        if (IPArray[i]>255) {
        //alert("IP주소가 틀립니다!");
        return false;
           }
        }
        return true;
        }

        var atomPat=new RegExp("^" + atom + "$");
        var domArr=domain.split(".");
        var len=domArr.length;
        for (i=0;i<len;i++) {
        if (domArr[i].search(atomPat)==-1) {
        //alert("도메인 이 존재 하지 않습니다.");
        return false;
           }
        }

        if (checkTLD && domArr[domArr.length-1].length!=2 &&
        domArr[domArr.length-1].search(knownDomsPat)==-1) {
        //alert("알려진 형식으로 끝이 나야합니다." + "country.");
        return false;
        }

        if (len<2) {
        //alert("Hostname이 틀립니다. !");
        return false;
        }

        return true;
    }

  /**
     * 한글로만 이루어져 있는지 체크 한다.
     *
     * @param	han
     * @return	boolean
     */
  function isHangul(han) {
        var inText = han.value;
        var ret;

        ret = inText.charCodeAt();
        if (ret > 31 && ret < 127) {
            //alert("한글만 입력 가능합니다.");
            han.value = "";
            han.focus();
            return false;
        }
        return true;
    }

    /**
     * 영문자 검증
     * @param str
     * @return boolean
     */
    function isAlpha(obj){
        var str = obj.value;
        if(isEmpty(str)) return false;

        for(var idx=0;idx < str.length;idx++){
            if(!((str.charAt(idx) >='a' && str <= 'z') || (str.charAt(idx) >= 'A' && str <= 'Z'))){
                return false;
            }
        }
        return true;
    }

    /**
     * 숫자에 comma를 붙인다.
     *
     * @param	obj
     */
    function addComma(obj) {
        var value = trim(obj.value);

        if (value == "") {
            return;
        }
        value = deleteCommaStr(value);

        if (!isFloat(value)) {
            caption = obj.getAttribute("caption");

            if (caption == null) {
                caption = "";
            }

            alert(caption + " 형식이 올바르지 않습니다.");
            //obj.value = "0";
            //obj.focus();
            obj.select();
            if (window.event) {
                window.event.returnValue = false;
            }
            return;
        }

        obj.value = addCommaStr(value);
    }

    /**
     * 숫자에 comma를 붙인다.
     */
    function addComma2() {
        var obj = window.event.srcElement;
        addComma(obj);
    }

    /**
     * 숫자에 comma를 붙인다.
     *
     * @param	str
     */
    function addCommaStr(str) {
        var num = "";
        var sign = "";

        if (str.charAt(0) == "+" || str.charAt(0) == "-") {
            sign = str.charAt(0);
            str = str.substr(1);
        }

        var index = str.indexOf('.');

        if (index != -1) {
            num = str.substr(index);
        } else {
            index = str.length;
        }

        for (var i = index - 3; i > 0; ) {
            num = ',' + str.substr(i, 3) + num;

            index = i;
            i -= 3;
        }

        num = sign + str.substr(0, index) + num;

        return	num;
    }

    /**
     * 숫자에서 comma를 없앤다.
     *
     * @param	obj
     */
    function deleteComma(obj) {
        obj.value = deleteCommaStr(obj.value);
    }

    /**
     * 숫자에서 comma를 없앤다.
     */
    function deleteComma2() {
        var obj = window.event.srcElement;
        deleteComma(obj);
        obj.select();
    }

    /**
     * 숫자에서 comma를 없앤다.
     *
     * @param	str
     */
    function deleteCommaStr(str) {
        var temp = '';

        for (var i = 0; i < str.length; i++) {
            if (str.charAt(i) == ',') {
                continue;
            } else {
                temp += str.charAt(i);
            }
        }

        return	temp;
    }

    /**
     * 날짜에 "/"를 붙인다.
     *
     * @param	obj
     */
    function addDateFormat(obj) {
        var value = trim(obj.value);

        if (value == "") {
            return;
        }

        value = deleteDateFormatStr(value);

        if (!isDate(value)) {
            caption = obj.getAttribute("caption");

            if (caption == null) {
                caption = "";
            }

            alert(caption + " 형식이 올바르지 않거나, 올바른 날짜가 아닙니다.\n( 예, 20020101 )");
            obj.focus();

            return;
        }

        obj.value = addDateFormatStr(value);
    }


    /**
     * 날짜에 "/"를 붙인다.
     */
    function addDateFormat2() {
        var obj = window.event.srcElement;
        addDateFormat(obj);
    }

    /**
     * 날짜에 "/"를 붙인다.
     * by bobjaru. CIIS 표준에 맞춰 "-" 로 변경. 2008.4.23
     * @param	str
     */
    function addDateFormatStr(str) {
        //return	str.substring(0, 4) + "/" + str.substring(4, 6) + "/" + str.substring(6, 8);
        return	str.substring(0, 4) + "-" + str.substring(4, 6) + "-" + str.substring(6, 8);
    }

    /**
     * 날짜에서 "/"를 없앤다.
     *
     * @param	obj
     */
    function deleteDateFormat(obj) {
        obj.value = deleteDateFormatStr(obj.value);
    }

    /**
     * 날짜에서 "/"를 없앤다.
     */
    function deleteDateFormat2() {
        var obj = window.event.srcElement;
        deleteDateFormat(obj);
        obj.select();
    }

    /**
     * 날짜에서 "/"를 없앤다.
     * by bobjaru. CIIS 표준에 맞춰 "-" 로 변경. 2008.4.23
     * @param	str
     */
    function deleteDateFormatStr(str) {
        var temp = '';

        for (var i = 0; i < str.length; i++) {
            //if (str.charAt(i) == '/') {
            if (str.charAt(i) == '-') {
                continue;
            } else {
                temp += str.charAt(i);
            }
        }

        return	temp;
    }

    /**
     * 월분에 "/"를 붙인다.
     *
     * @param	obj
     */
    function addMonthFormat(obj) {
        var value = trim(obj.value);

        if (value == "") {
            return;
        }

        value = deleteMonthFormatStr(value);

        if ( !isNumber(value) || value.length != 6 || !isValidMonth(value.substring(4, 6))) {
            caption = obj.getAttribute("caption");

            if (caption == null) {
                caption = "";
            }

            alert(caption + " 형식이 올바르지 않거나, 올바른 월이 아닙니다.\n( 예, 200201 )");
            obj.focus();

            return;
        }

        obj.value = addMonthFormatStr(value);
    }

    /**
     * 월분에 "/"를 붙인다.
     */
    function addMonthFormat2() {
        var obj = window.event.srcElement;
        addMonthFormat(obj);
    }

    /**
     * 날짜에 "/"를 붙인다.
     * by bobjaru. CIIS 표준에 맞춰 "-" 로 변경. 2008.4.23
     * @param	str
     */
    function addMonthFormatStr(str) {
        //return	str.substring(0, 4) + "/" + str.substring(4, 6);
        return	str.substring(0, 4) + "-" + str.substring(4, 6);
    }

    /**
     * 날짜에서 "/"를 없앤다.
     *
     * @param	obj
     */
    function deleteMonthFormat(obj) {
        obj.value = deleteMonthFormatStr(obj.value);
    }

    /**
     * 날짜에서 "/"를 없앤다.
     */
    function deleteMonthFormat2() {
        var obj = window.event.srcElement;
        deleteMonthFormat(obj);
        obj.select();
    }

    /**
     * 날짜에서 "/"를 없앤다.
     * by bobjaru. CIIS 표준에 맞춰 "-" 로 변경. 2008.4.23
     * @param	str
     */
    function deleteMonthFormatStr(str) {
        var temp = '';

        for (var i = 0; i < str.length; i++) {
            //if (str.charAt(i) == '/') {
            if (str.charAt(i) == '-') {
                continue;
            } else {
                temp += str.charAt(i);
            }
        }

        return	temp;
    }


    /**
     * 주민등록번호에 "-"를 붙인다.
     *
     * @param	obj
     */
    function addJuminFormat(obj) {
        var value = trim(obj.value);

        if (value == "") return;

        value = deleteHyphen(value);

        if ( !isValidJumin(value)) {
            caption = obj.getAttribute("caption");

            if (caption == null) caption = "";

            alert(caption + " 형식이 올바르지 않거나, 올바른 주민등록번호가 아닙니다.");
            obj.focus();

        }else{
            setJuminHyphen(obj);
        }
    }

    /**
     * 주민등록번호에 "-"를 붙인다.
     */
    function addJuminFormat2() {
        var obj = window.event.srcElement;
        addJuminFormat(obj);
    }

    /**
     * 주민등록번호에서 "-"를 없앤다.
     */
    function deleteJuminFormat2() {
        var obj = window.event.srcElement;
        obj.value = deleteHyphen(obj.value);
        obj.select();
    }


    /**
     * 사업자등록번호에 "-"를 붙인다.
     *
     * @param	obj
     */
    function addOfficeFormat(obj) {
        var value = trim(obj.value);

        if (value == "") return;

        value = deleteHyphen(value);

        if ( !isValidOfficeNum(value)) {
            caption = obj.getAttribute("caption");

            if (caption == null) caption = "";

            alert(caption + " 형식이 올바르지 않거나, 올바른 사업자등록번호가 아닙니다.");
            obj.focus();

        }else{
            setJuminHyphen(obj);
        }
    }

    /**
     * 사업자등록번호에 "-"를 붙인다.
     */
    function addOfficeFormat2() {
        var obj = window.event.srcElement;
        addOfficeFormat(obj);
    }

    /**
     * 사업자등록번호에서 "-"를 없앤다.
     */
    function deleteOfficeFormat2() {
        var obj = window.event.srcElement;
        obj.value = deleteHyphen(obj.value);
        obj.select();
    }

    /**
     * 24hr시간에 ":"를 붙인다.
     *
     * @param	obj
     */
    function add24hrFormat(obj) {
        var value = trim(obj.value);

        if (value == "") return;

        value = deleteSemicolon(value);

        if ( !isValid24hr(value)) {
            caption = obj.getAttribute("caption");

            if (caption == null) caption = "";

            alert(caption + " 형식이 올바르지 않거나, 올바른 시간(24시간)이 아닙니다.");
            obj.focus();

        }else{
            set24hrSemicolon(obj);
        }
    }

    /**
     * 24hr시간에 ":"를 붙인다.
     */
    function add24hrFormat2() {
        var obj = window.event.srcElement;
        add24hrFormat(obj);
    }

    /**
     * 24hr시간에서 ":"를 없앤다.
     */
    function delete24hrFormat2() {
        var obj = window.event.srcElement;
        obj.value = deleteSemicolon(obj.value);
        obj.select();
    }

    /**
     * 사업자번호 혹은 주민등록번호/외국인번호에 "-"를 붙인다.
     *
     * @param	obj
     */
    function addJufficeFormat(obj) {
        var value = trim(obj.value);

        if (value == "") return;

        value = deleteHyphen(value);

        if ( !isValidJuffice(value)) {
            caption = obj.getAttribute("caption");

            if (caption == null) caption = "";

//            alert(caption + " 형식이 올바르지 않거나, 올바른 주민등록번호/사업자번호 (이)가 아닙니다.");
	    alert(caption + " 형식이 올바르지 않거나, 올바른 (주민/사업자/법인/외국인)등록번호 (이)가 아닙니다.");
            obj.focus();

        }else{

            setJuminHyphen(obj);
        }
    }

    /**
     * 사업자번호 혹은 주민등록번호에 "-"를 붙인다.
     */
    function addJufficeFormat2() {
        var obj = window.event.srcElement;
        addJufficeFormat(obj);
    }

    /**
     * 사업자번호 혹은 주민등록번호에서 "-"를 없앤다.
     */
    function deleteJufficeFormat2() {
        var obj = window.event.srcElement;


        obj.value = deleteHyphen(obj.value);
        obj.select();
    }

    /**
     * 우편번호에 "-"를 붙인다.
     *
     * @param	obj
     */
    function addZipFormat(obj) {
        var value = trim(obj.value);

        if (value == "") return;

        value = deleteHyphen(value);

        if ( !isValidZip(value)) {
            caption = obj.getAttribute("caption");

            if (caption == null) caption = "";

            alert(caption + " 형식이 올바르지 않거나, 올바른 우편번호가 아닙니다.");
            obj.focus();

        }else{
            setZipHyphen(obj);
        }
    }

    /**
     * 우편번호에 "-"를 붙인다.
     */
    function addZipFormat2() {
        var obj = window.event.srcElement;
       addZipFormat(obj);
    }

    /**
     * 우편번호에서 "-"를 없앤다.
     */
    function deleteZipFormat2() {
        var obj = window.event.srcElement;
        obj.value = deleteHyphen(obj.value);
        obj.select();
    }


    /**
     * 자리수 체크 후 자리수 일치하면 다음 객체로 focusing
     *
     * @param chkObj
     * @param dstObj
     * @param intLen
     */
    function passFocus(chkObj, dstObj, intLen){
        var str = chkObj.value;

        if(str.length == intLen) dstObj.focus();
        else return;
    }

    /**
     * 발생된 이벤트의 keycode가 "13" 일 경우 target 객체로 focus를 이동한다.
     * 엔터키 후 포커스 이동
     * @param o_target
     */
    function focus_to_obj(o_target){
        var e = window.event;
        if(!e) return;
        if(e.keyCode != "13" ) return;

        e.returnValue = false;
        o_target.focus();
    }




    /**
     *
     * 특정 form의 element들을 tabIndex 속성값에 따라 정렬하여 전역 Array에 담아 리턴한다..
     *
     * @param objForm
     */
    function sortFormByTabIndex(objForm){
        if(!objForm.elements ) return null;

        var arrTarget = new Array();
        var idx =0;
        for(var i=0; i<objForm.elements.length; i++){
            objForm.elements(i).setAttribute("_idx", i);
            if( objForm.elements(i).type != "hidden" && !objForm.elements(i).readOnly
                && objForm.elements(i).tabIndex != 0 && objForm.elements(i).tagName != "TEXTAREA"
                && objForm.style.display != "none" && !objForm.elements(i).disabled){
                arrTarget[idx] = objForm.elements(i);
                idx++;
            }
        }

        var temp;
        for(var i=0; i<arrTarget.length - 1; i++){
            for(var j=0; j<arrTarget.length -1; j++){
                if(arrTarget[j].tabIndex > arrTarget[j+1].tabIndex){
                    temp = arrTarget[j];
                    arrTarget[j] = arrTarget[j+1]
                    arrTarget[j+1] = temp;
                }
            }
        }
        return arrTarget;
    }

    /**
     * Form Element 들에서 엔터키를 누를 경우 다음 tabIndex 를 찾아서 focus를 이동시킨다.
     */
    function focusToTarget(){
        var e = window.event;

        if(!e) return;
        if(e.keyCode != "13") return;
        e.returnValue = false;
        var objSrc = e.srcElement;

        if(objSrc._idx != 0 && !objSrc._idx) return;

        var objTarget = findFocusTarget(objSrc.form.name, objSrc._idx);

        if(objTarget==null || !objTarget) return;
        objTarget.focus();
        if(objTarget.type == "text" ) objTarget.select();
    }

    /**
     * Focus를 줄 다음 객체를 찾아낸다
     *
     * @param strFormName   이벤트를 발생시킨 elements를 포함하는 form 객체의 name
     * @param strIdx		이벤트를 발생시킨 elements의 _idx 사용자 정의 Attribute 값
     */
    function findFocusTarget(strFormName, strIdx){

        var srcIndex = 0;   // 이벤트가 발생한 input object가 존재하는 _sortedForms 의 index

        for(var i=0; i< document.forms.length; i++){
            if( strFormName == document.forms(i).name ){
                srcIndex = i;
                break;
            }
        }

        var srcSortedForm = _sortedForms[srcIndex];

        var idx;			// 정렬된 폼 객체에서 이벤트가 발생한 발생한 elements의 name과 값이 일치하는 객체의 index 값
        var tarIndex = 0;	// 포커스를 받게될 객체의 해당 index 값

        //소스 를 구한다.
        for(var i= 0; i< srcSortedForm.length; i++){
            if( strIdx == srcSortedForm[i]._idx ){
                idx = i;
                srcSortedForm[idx].blur();
                break;
            }
        }

        if(idx == null) return;
        if(idx == srcSortedForm.length - 1){
            tarIndex = 0; // idx 가 제일 큰 객체에서 이벤트가 발생한 경우
        }else{
            tarIndex = idx + 1; //다음 객체라 가정
            //타겟을 구한다.
            for(var j= tarIndex; j<srcSortedForm.length; j++){
                if(srcSortedForm[j].type == "hidden" || srcSortedForm[j].readOnly
                        || srcSortedForm[j].style.display == "none" || srcSortedForm[j].disabled
                        || srcSortedForm[j].style.visibility == "hidden" ){
                        continue;
                }else{
                    break;
                }
            }
            tarIndex = j;
        }
        return srcSortedForm[tarIndex];
    }


    /**
     * 입력값에 스페이스 이외의 의미있는 값이 있는지 체크
     * ex) if (isEmpty(form.keyword)) {
     *         alert("검색조건을 입력하세요.");
     *     }
     */
    function isEmpty(input) {
        if (input.value == null || input.value.replace(/ /gi,"") == "") {
            return true;
        }
        return false;
    }

    /**
     * 입력값이 사용자가 정의한 포맷 형식인지 체크
     * 자세한 format 형식은 자바스크립트의 'regular expression'을 참조
     */
    function isValidFormat(inputStr,re) {
         if (re.test(inputStr)) {
              return true; //올바른 포맷 형식
         }
         return false;
    }

    /**
     * 입력값이 일반전화번호 형식(DDD-국-번호)인지 체크
     * 서울특별시	02		경 기 031	강 원 033	인 천 032
     * 대 전		042		충 북 043	충 남 041	대 구 053
     * 경 북		054		경 남 055	울 산 052	부 산 051
     * 전 북		063		전 남 061	광 주 062	제 주 064
     *
     */
    function isValidPhone(inputStr) {
        if (inputStr == null || inputStr.replace(/ /gi,"") == "" ) {
            return false;
        }else{
            //var re = /^(02|031|032|033|041|042|043|051|052|053|054|055|061|062|063|064|080)-[0-9]{3,4}-[0-9]{4}$/;
            var re = /^[0]{1}[0-9]{1,3}-[0-9]{3,4}-[0-9]{4}$/;
            return isValidFormat(inputStr,re);
        }
    }

    /**
     * 입력값이 일반전화번호 형식(DDD)인지 체크
     * 서울특별시	02		경 기 031	강 원 033	인 천 032
     * 대 전		042		충 북 043	충 남 041	대 구 053
     * 경 북		054		경 남 055	울 산 052	부 산 051
     * 전 북		063		전 남 061	광 주 062	제 주 064
     *
     */
    function isValidPhone1(inputStr) {
        if (inputStr == null || inputStr.replace(/ /gi,"") == "" ) {
            return false;
        }else{
            //var re = /^(02|031|032|033|041|042|043|051|052|053|054|055|061|062|063|064|080)$/;
            var re = /^[0]{1}[0-9]{1,3}$/;
            return isValidFormat(inputStr,re);
        }
    }

    /**
     * 입력값이 전화번호 형식(숫자-숫자-숫자)인지 (느슨한) 체크 pcs 번호 체크와 같이 사용해도 됨
     */
    function isValidPhone2(input) {
        var format = /^(\d+)-(\d+)-(\d+)$/;
        return isValidFormat(input,format);
    }

    /**
     * 입력값이 핸드폰번호 형식(사업자번호-국-번호)인지 체크
     *
     * 사업자번호 011 016 018 017 019
     */
    function isValidPcs(inputStr) {
        if (inputStr == null || inputStr.replace(/ /gi,"") == "" ) {
            return false;
        }else{
            //var re = /^(0505|010|011|016|018|017|019)-[0-9]{3,4}-[0-9]{4}$/;
            var re = /^[0]{1}[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}$/;
            return isValidFormat(inputStr,re);
        }
    }

    /**
     * 입력값이 핸드폰번호 형식(사업자번호)인지 체크
     *
     * 사업자번호 011 016 018 017 019
     */
    function isValidPcs1(inputStr) {
        if (inputStr == null || inputStr.replace(/ /gi,"") == "" ) {
            return false;
        }else{
            //var re = /^(0505|010|011|016|018|017|019)$/;
            var re = /^[0]{1}[0-9]{2,3}$/;
            return isValidFormat(inputStr,re);
        }
    }



    /**
     * 아이디 유효성검사
     * @param 아이디 폼객체
     * @return true, false
     */
    function isValidId(thisObj)
    {
        var tmp;
        var frmMemId = thisObj;
        tmp = frmMemId.value;

        if (tmp.length < 4 || tmp.length > 10) {
            alert("ID는4글자 이상, 10 글자 이하입니다.");
            frmMemId.focus();
            return false;
        }

        for (var i = 0; i < tmp.length; i++) {
            if (tmp.charAt(i) >= '0' && tmp.charAt(i) <= '9') continue;
            else if (tmp.charAt(i) >= 'a' && tmp.charAt(i) <= 'z') continue;
            else if (tmp.charAt(i) >= 'A' && tmp.charAt(i) <= 'Z') continue;
            else if (tmp.charAt(i) == '_' || tmp.charAt(i) == '-') continue;
            else {
                alert("ID에는 영문자, 숫자, 기호 ('-' , '_' ) 만 사용하실 수 있습니다.");
                frmMemId.value = "" ;
                frmMemId.focus();
                return false;
            }
        }

        if (tmp.charAt(0) == '_' || tmp.charAt(0) == '-') {
            alert("'_'와 '-'는 ID의 첫글자로 사용하실 수 없습니다.");
            return false;
        }
        return true ;
    }

    function isValidName(frmObj){
        var frmMemName = frmObj;

        if (trim(frmMemName.value) == "" || getLength(frmMemName.value) < 1 || getLength(frmMemName.value) > 10) {
            alert("이름를 정확히 입력하세요.");
            frmMemName.focus();
            return false;
        }
        return true;
    }

    /**
     *  폼태그안 radio button에서 체크된 value 값을 리턴
     *
     *  @param  frmObj	(form reference)
     *  @param	radioNm	(String)
     *  @return	strValue
     */
    function jsGetCheckedValue(frmObj, radioNm){
        if(frmObj.elements(radioNm).length){
            for(var i = 0; i < frmObj.elements(radioNm).length; i++){
                if(frmObj.elements(radioNm)[i].checked){
                    return frmObj.elements(radioNm)[i].value;
                }
            }
        }else{
            if(frmObj.elements(radioNm).checked) return frmObj.elements(radioNm).value;
        }
        return "";
    }

    /**
    *  폼태그인 raido button 혹은 check box 필드중 해당 value 값을 가진 항목을 체크
    *  @param objTarget  해당 레디오 혹은 체크 박스 개체
    *  @param strValue   체크되어야 하는 값
    */
    function jsSetCheckedValue(objTarget, strValue) {
        if( objTarget.length){
            for(var i=0; i<objTarget.length; i++) {
                if(objTarget[i].value == strValue) {
                    objTarget[i].checked = true;
                    break;
                }else{
                    objTarget[i].checked = false;
                }
            }
        }else{
            if(objTarget.value == strValue) objTarget.checked = true;
            else objTarget.checked = false;
        }
    }

    /**
    *  폼안에 레디오버튼과 체크박스의 체크된 값을 한 스트링값으로 리턴한다.
	*                                                	구분자(*)
    *
    *  @param form (Object) --폼 이름
    *  @return String
    */
    function jsGetCheckedValues(form){
        var obj;
        var i;
        var j;
        var radiochk;
        var strSumValue = "";
        var tempName    = "";

        //alert(form.elements("radio8").length);
        for(i = 0; i < form.elements.length; i++ ){
            obj       = form.elements(i);
            radiochk  = 0;

            if (obj.type == "radio" || obj.type == "checkbox") {
                //alert("tempName : " + tempName);
                if (tempName == obj.name) continue;
                //alert("continued\ntempName : " + tempName);

                if (form.elements(obj.name).length > 0) {
                    for(j = 0; j < form.elements(obj.name).length; j++) {
//						alert("form.elements("+obj.name+")["+j+"]"+".checked : " + form.elements(obj.name)[j].checked);
                        if (form.elements(obj.name)[j].checked) {
                            strSumValue += form.elements(obj.name)[j].value + "*" ;
                            if (obj.type=="radio") radiochk = 1;
//							alert("strSumValue : " + strSumValue);
                        }
                    }
                    if (radiochk==0) {
                        return "error";
                    }
                    tempName = obj.name;
                }
                else {
                    if (form.elements(obj.name).checked) {
                        strSumValue += form.elements(obj.name).value + "*";
//						alert("strSumValue : " + strSumValue);
                    }
                    else if (obj.type=="radio" && !(form.elements(obj.name).checked)) {
                        return "error"
                    }
                    tempName = obj.name;
                }
            }
        }
        //alert("strSumValue : " + strSumValue);
        // 마지막 length * 제거
        if(strSumValue != "" ){
            strSumValue = strSumValue.substring(0,strSumValue.length-1);
        }
        return strSumValue;
    }

    /**
    *  폼안에 특정 레디오버튼이나 특정 체크박스의 체크된 값을 delimiter가 사이에 끼워져있는 스트링값으로 리턴한다.
    *
    *
    *  @param form (Object)
    *  @param objTargetName (String)
    *  @param delimiter (String)  default : ","
    *  @return String
    */
    function jsGetCheckedGroupValues(form, objTargetName, delimiter){

        var strSumValue = "";

        if(delimiter == "" ) delimiter = ",";

        if (form.elements(objTargetName).length > 0) {
            for(var j = 0; j < form.elements(objTargetName).length; j++) {
                if (form.elements(objTargetName)[j].checked) {
                    strSumValue += form.elements(objTargetName)[j].value + delimiter ;
                }
            }
        }
        else {
            if (form.elements(objTargetName).checked) {
                strSumValue += form.elements(objTargetName).value + delimiter;
            }
        }

        // 마지막 length delimiter 제거
        if(strSumValue != "" ){
            strSumValue = strSumValue.substring(0,strSumValue.length - delimiter.length);
        }
        return strSumValue;
    }



    /**
     * 문자에서 Hyphen을 없앤다.
     *
     * @param	str
     */
    function deleteHyphen(str) {

        var temp = '';
        if(str == "") return temp;
        for (var i = 0; i < str.length; i++) {
            if (str.charAt(i) == '-') {
                continue;
            } else {
                temp += str.charAt(i);
            }
        }
        return	temp;
    }

    /**
     * 문자에서 Semicolon을 없앤다.
     *
     * @param	str
     */
    function deleteSemicolon(str) {
        var temp = '';
        if(str == "") return temp;
        for (var i = 0; i < str.length; i++) {
            if (str.charAt(i) == ':') {
                continue;
            } else {
                temp += str.charAt(i);
            }
        }
        return	temp;
    }


    /**
     *  주민등록번호&사업자번호에 '-'넣기
     */
     function setJuminHyphen(obj) {
        var str = deleteHyphen(obj.value);

        if(str.length == 13) {	// 주민등록번호  6-7
            str = str.substring(0, 6) + "-" + str.substring(6);
        }else if(str.length == 10) { // 사업자번호 3-2-5
            str = str.substring(0, 3) + "-"+ str.substring(3, 5) + "-"+ str.substring(5);
        }
         obj.value = str;
     }

    /**
     *  우편번호에 '-'넣기
     */
     function setZipHyphen(obj) {
        var str = deleteHyphen(obj.value);
        obj.value = (isValidZip(str))? str.substring(0, 3) + "-" + str.substring(3,6) : str;
     }

    /**
     * time에 ':' 넣기
     */
    function set24hrSemicolon(obj) {
        var str = deleteSemicolon(obj.value);
        obj.value = (isValid24hr(str))? str.substring(0, 2) + ":" + str.substring(2,4) : str;
    }

    /**
     * 폼 안의 숫자 오브젝트에 콤마를 붙여준다.
     */
    function setComma() {
        for (var i = 0; i < document.forms.length; i++) {
            var elements = document.forms(i).elements;
            for (var j = 0; j < elements.length; j++) {
                if (elements(j).tagName == "INPUT") {
                    dataType = elements(j).getAttribute("dataType");
                    if (dataType == "number" || dataType == "integer" || dataType == "float") {
                        if (elements(j).getAttribute("comma") != null) {
                            addComma(elements(j));
                        }
                    }
                }
            }
        }
    }

/////////////////////////////////////////////////////////////////
//	3)Util Method( 날짜, 스트링, 기타...)
/////////////////////////////////////////////////////////////////


    /**
     * 일수를 계산한다.(초일산입 말일불산입)
     *
     * @param	from 시작일
     * @param	to 종료일
     * @return	일수
     */
    function jsGetDays(from, to) {

        var fromDt = deleteDateFormatStr(from);
        var toDt = deleteDateFormatStr(to);
        var days = 0 ;

        var fromYy = eval(fromDt.substring(0,4));
        var fromMm = eval(fromDt.substring(4,6) - 1);
        var fromDd = eval(fromDt.substring(6,8));

        var toYy = eval(toDt.substring(0,4));
        var toMm = eval(toDt.substring(4,6) - 1);
        var toDd = eval(toDt.substring(6,8));

        var fromDate = new Date(fromYy, fromMm, fromDd) ;
        var toDate = new Date(toYy, toMm, toDd) ;

        days = ((toDate - fromDate) / 60 / 60 / 24 / 1000);

        return	days;
    }

    /**
     * 유효한(존재하는) 월(月)인지 체크
     */
    function isValidMonth(mm) {
        var m = parseInt(mm,10);
        return (m >= 1 && m <= 12);
    }

    /**
     * 유효한(존재하는) 일(日)인지 체크
     */
    function isValidDay(yyyy, mm, dd) {
        var m = parseInt(mm,10) - 1;
        var d = parseInt(dd,10);

        var end = new Array(31,28,31,30,31,30,31,31,30,31,30,31);
        if ((yyyy % 4 == 0 && yyyy % 100 != 0) || yyyy % 400 == 0) {
            end[1] = 29;
        }

        return (d >= 1 && d <= end[m]);
    }

    /**
     * 유효한(존재하는) 시(時)인지 체크
     */
    function isValidHour(hh) {
        var h = parseInt(hh,10);
        return (h >= 1 && h <= 24);
    }

    /**
     * 유효한(존재하는) 분(分)인지 체크
     */
    function isValidMin(mi) {
        var m = parseInt(mi,10);
        return (m >= 1 && m <= 60);
    }

    /**
     * Time 형식인지 체크(느슨한 체크)
     */
    function isValidTimeFormat(time) {
        return (!isNaN(time) && time.length == 12);
    }

    /**
     * 유효하는(존재하는) Time 인지 체크
     * ex) var time = form.time.value; //'200102310000'
     *     if (!isValidTime(time)) {
     *         alert("올바른 날짜가 아닙니다.");
     *     }
     */
    function isValidTime(time) {
        var year  = time.substring(0,4);
        var month = time.substring(4,6);
        var day   = time.substring(6,8);
        var hour  = time.substring(8,10);
        var min   = time.substring(10,12);

        if (parseInt(year,10) >= 1900  && isValidMonth(month) &&
            isValidDay(year,month,day) && isValidHour(hour)   &&
            isValidMin(min)) {
            return true;
        }
        return false;
    }

    /**
     * Time 스트링을 자바스크립트 Date 객체로 변환
     * parameter time: Time 형식의 String
     */
    function toTimeObject(time) { //parseTime(time)
        var year  = time.substr(0,4);
        var month = time.substr(4,2) - 1; // 1월=0,12월=11
        var day   = time.substr(6,2);
        var hour  = time.substr(8,2);
        var min   = time.substr(10,2);

        return new Date(year,month,day,hour,min);
    }

    /**
     * 자바스크립트 Date 객체를 Time 스트링으로 변환
     * parameter date: JavaScript Date Object
     */
    function toTimeString(date) { //formatTime(date)
        var year  = date.getFullYear();
        var month = date.getMonth() + 1; // 1월=0,12월=11이므로 1 더함
        var day   = date.getDate();
        var hour  = date.getHours();
        var min   = date.getMinutes();

        if (("" + month).length == 1) { month = "0" + month; }
        if (("" + day).length   == 1) { day   = "0" + day;   }
        if (("" + hour).length  == 1) { hour  = "0" + hour;  }
        if (("" + min).length   == 1) { min   = "0" + min;   }

        return ("" + year + month + day + hour + min)
    }

    /**
     * Time이 현재시각 이후(미래)인지 체크
     */
    function isFutureTime(time) {
        return (toTimeObject(time) > new Date());
    }

    /**
     * Time이 현재시각 이전(과거)인지 체크
     */
    function isPastTime(time) {
        return (toTimeObject(time) < new Date());
    }

    /**
     * 주어진 Time 과 y년 m월 d일 h시 차이나는 Time을 리턴
     * ex) var time = form.time.value; //'20000101000'
     *     alert(shiftTime(time,0,0,-100,0));
     *     => 2000/01/01 00:00 으로부터 100일 전 Time
     */
    function shiftTime(time,y,m,d,h) { //moveTime(time,y,m,d,h)
        var date = toTimeObject(time);

        date.setFullYear(date.getFullYear() + y); //y년을 더함
        date.setMonth(date.getMonth() + m);       //m월을 더함
        date.setDate(date.getDate() + d);         //d일을 더함
        date.setHours(date.getHours() + h);       //h시를 더함

        return toTimeString(date);
    }
    /**
     * 두 일자가 몇일 차이나는지 구함
     * date1:시작일자, date2:종료일자
     */
    function getDayBetween(date1,date2) {
            var day_gab = Math.floor( (date1-date2) / (60*60*24*1000) )
            return (day_gab*-1) ;
    }
    /**
     * 두 Time이 몇 개월 차이나는지 구함
     * time1이 time2보다 크면(미래면) minus(-)
     */
    function getMonthInterval(time1,time2) { //measureMonthInterval(time1,time2)
        var date1 = toTimeObject(time1);
        var date2 = toTimeObject(time2);

        var years  = date2.getFullYear() - date1.getFullYear();
        var months = date2.getMonth() - date1.getMonth();
        var days   = date2.getDate() - date1.getDate();

        return (years * 12 + months + (days >= 0 ? 0 : -1) );
    }

    /**
     * 두 Time이 며칠 차이나는지 구함
     * time1이 time2보다 크면(미래면) minus(-)
     */
    function getDayInterval(time1,time2) {
        var date1 = toTimeObject(time1);
        var date2 = toTimeObject(time2);
        var day   = 1000 * 3600 * 24; //24시간

        return parseInt((date2 - date1) / day, 10);
    }

    /**
     * 두 Time이 몇 시간 차이나는지 구함
     * time1이 time2보다 크면(미래면) minus(-)
     */
    function getHourInterval(time1,time2) {
        var date1 = toTimeObject(time1);
        var date2 = toTimeObject(time2);
        var hour  = 1000 * 3600; //1시간

        return parseInt((date2 - date1) / hour, 10);
    }

    /**
     * 현재 시각을 Time 형식으로 리턴
     */
    function getCurrentTime() {
        return toTimeString(new Date());
    }

    /**
     * 현재 시각과 y년 m월 d일 h시 차이나는 Time을 리턴
     */
    function getRelativeTime(y,m,d,h) {

        return shiftTime(getCurrentTime(),y,m,d,h);
    }

    /**
     * 현재 年을 YYYY형식으로 리턴
     */
    function getYear() {

        return getCurrentTime().substr(0,4);
    }

    /**
     * 현재 月을 MM형식으로 리턴
     */
    function getMonth() {

        return getCurrentTime().substr(4,2);
    }

    /**
     * 현재 日을 DD형식으로 리턴
     */
    function getDay() {

        return getCurrentTime().substr(6,2);
    }

    /**
     * 현재 時를 HH형식으로 리턴
     */
    function getHour() {

        return getCurrentTime().substr(8,2);
    }

    /**
     * 오늘이 무슨 요일이야?
     * ex) alert('오늘은 ' + getDayOfWeek() + '요일입니다.');
     */
    function getDayOfWeek() {
        var now = new Date();

        var day = now.getDay(); //일요일=0,월요일=1,...,토요일=6
        var week = new Array('일','월','화','수','목','금','토');

        return week[day];
    }


    /**
     * 특정날짜의 요일을 구한다.
     */
    function getDayOfWeek(time) {
        var now = toTimeObject(time);

        var day = now.getDay(); //일요일=0,월요일=1,...,토요일=6
        var week = new Array('일','월','화','수','목','금','토');

        return week[day];
    }


    /**
     * 날짜 체크
     *
     * @param	date
     * @return	boolean
     */
    function isDate(date) {
        if (date == null || date.length != 8) {
            return	false;
        }

        if (!isNumber(date)) {
            return	false;
        }

        var year = eval(date.substring(0, 4));
        var month = eval(date.substring(4, 6));
        var day = eval(date.substring(6, 8));

        if (month > 12 || month < 1) {
            return	false;
        }
        if (day > 31 || day < 1){
            return	false;
        }

        var totalDays;

        switch (eval(month)){

            case 1 :
                totalDays = 31;
                break;
            case 2 :
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                    totalDays = 29;
                else
                    totalDays = 28;
                break;
            case 3 :
                totalDays = 31;
                break;
            case 4 :
                totalDays = 30;
                break;
            case 5 :
                totalDays = 31;
                break;
            case 6 :
                totalDays = 30;
                break;
            case 7 :
                totalDays = 31;
                break;
            case 8 :
                totalDays = 31;
                break;
            case 9 :
                totalDays = 30;
                break;
            case 10 :
                totalDays = 31;
                break;
            case 11 :
                totalDays = 30;
                break;
            case 12 :
                totalDays = 31;
                break;
        }

        if (day > totalDays) {
            return	false;
        }

        return	true;
    }
    /**
     * trim
     *
     * @param	text
     * @return	string
     */
    function trim(text) {
        if (text == "" || text==null) {
            return	text;
        }

        var len = text.length;
        var st = 0;

        while ((st < len) && (text.charAt(st) <= ' ')) {
            st++;
        }

        while ((st < len) && (text.charAt(len - 1) <= ' ')) {
            len--;
        }

        return	((st > 0) || (len < text.length)) ? text.substring(st, len) : text;
    }

    /**
     * ltrim
     *
     * @param	text
     * @return	string
     */
    function ltrim(text) {
        if (text == "") {
            return	text;
        }

        var len = text.length;
        var st = 0;

        while ((st < len) && (text.charAt(st) <= ' ')) {
            st++;
        }

        return	(st > 0) ? text.substring(st, len) : text;
    }

    /**
     * rtrim
     *
     * @param	text
     * @return	string
     */
    function rtrim(text) {
        if (text == "") {
            return	text;
        }

        var len = text.length;
        var st = 0;

        while ((st < len) && (text.charAt(len - 1) <= ' ')) {
            len--;
        }

        return	(len < text.length) ? text.substring(st, len) : text;
    }


    /**
     * 스트링의 길이를 구한다.
     */
    function getLength(str) {
        //alert(str);
        var val = str;
        var len = val.length;

        if(len != 0) {
            if (navigator.appName!="Netscape"){
                var s = 0;
                var total = 0;

                while (s < len) {
                    chr = val.charAt(s);

                    if((chr >= 'ㄱ') && (chr <= '\uFFFD'))
                    { total+=2;  }
                    else { total++; }

                    s++;
                }
            } else {
                total = len ;
            }

            return total;
        }
        else { return 0; }

    }

    /**
    * 배열과 delimiter 를 받아서
    * 배열의 값들을 delimiter 로 연결된 문자열을 리턴
    * @param strArr (문자열 배열)
    * @param strDelimiter
    * @return String
    */
    function jsGetChainStr(strArr, strDelimiter){
        if(!strArr || strArr.length < 1 || !strDelimiter || strDelimiter.length < 1) return "";
        var strTemp = "";
        for(var i=0; i<strArr.length; i++){
            strTemp += (strArr[i] != "" )? strDelimiter + strArr[i] : "" ;
        }
        return (strTemp.length > strDelimiter.length)? strTemp.substring(strDelimiter.length, strTemp.length) : "";
    }

   /**
     *  화면에 메시지를 나타낸다
     *
     *  @param flg (0: no error, 1:alert error, 2:confirm error)
     *  @param strMsg
     *  @return 0 : nothing,   1 : confirm  2 : cancel
     */
    function jsShowMsg(flg, strMsg){
        if(flg == 1){
            alert(strMsg);
            return 0;
        }else if(flg == 2){
            return (confirm(strMsg))? 1 : 2;
        }
        return 0;
    }

    /**
     * 브라우저의 버전을 체크한다.
     *
     * @param	none
     * @return		none
     * @added by feelhouse@orgio.net 2003-10-27
     */
    function objDetectBrowser() {
        var strUA, s, i;
        this.isIE = false;  // 인터넷 익스플로러인지를 나타내는 속성
        this.isNS = false;  // 넷스케이프인지를 나타내는 속성
        this.version = null; // 브라우저 버전을 나타내는 속성

        // Agent 정보를 담고 있는 문자열.
        strUA = navigator.userAgent;

        s = "MSIE";
        // Agent 문자열(strUA) "MSIE"란 문자열이 들어 있는지 체크

        if ((i = strUA.indexOf(s)) >= 0) {
            this.isIE = true;
            // 변수 i에는 strUA 문자열 중 MSIE가 시작된 위치 값이 들어있고,
            // s.length는 MSIE의 길이 즉, 4가 들어 있다.
            // strUA.substr(i + s.length)를 하면 strUA 문자열 중 MSIE 다음에
            // 나오는 문자열을 잘라온다.
            // 그 문자열을 parseFloat()로 변환하면 버전을 알아낼 수 있다.
            this.version = parseFloat(strUA.substr(i + s.length));
            return;
        }

        s = "Netscape6/";
        // Agent 문자열(strUA) "Netscape6/"이란 문자열이 들어 있는지 체크

        if ((i = strUA.indexOf(s)) >= 0) {
            this.isNS = true;
            this.version = parseFloat(strUA.substr(i + s.length));
            return;
        }

        // 다른 "Gecko" 브라우저는 NS 6.1로 취급.

        s = "Gecko";
        if ((i = strUA.indexOf(s)) >= 0) {
            this.isNS = true;
            this.version = 6.1;
            return;
        }
    }

  /**
   * 화면 크기를 1024*768로 고정 시킨다.
   * author 이혁
   */
  function fix_screen(){
    if ((screen.availWidth >= 1024) & (screen.availHeight >= 768)){
      availX = 1024;
      availY = 768;
      screenX = screen.availWidth;
      screenY = screen.availHeight;
      windowX = (screenX - availX)/2;
      windowY = (screenY - availY)/2;
    }
    else {
      //availX = 1024;
      //availY = 768;
      availX = screen.availWidth;
      availY = screen.availHeight;
      windowX = 0;
      windowY = 0;
    }
    moveTo(windowX,windowY);
    resizeTo(availX, availY);
  }

    // 키보드 입력시 숫자만 입력 가능
    function onlyNumber(){

        if ((event.keyCode >= 32 && event.keyCode < 48)
             || (event.keyCode > 57 && event.keyCode < 65)
             || (event.keyCode > 90 && event.keyCode < 97)
             || (event.keyCode >= 97 && event.keyCode <= 122)
             || (event.keyCode >= 65 && event.keyCode <= 90))

             event.returnValue = false;

    }
    // 키보드 입력시 수자 및 ','가 입력 가능
    function AmtNumber(){

        if ((event.keyCode >= 32 && event.keyCode < 44)
             || (event.keyCode >= 45 && event.keyCode < 48)
             || (event.keyCode > 57 && event.keyCode < 65)
             || (event.keyCode > 90 && event.keyCode < 97)
             || (event.keyCode >= 97 && event.keyCode <= 122)
             || (event.keyCode >= 65 && event.keyCode <= 90))
             event.returnValue = false;

    }
    // 키보드 입력시 수자 및 '.'가 입력 가능
    function RateNumber(){

        if ((event.keyCode >= 32 && event.keyCode < 46)
             || (event.keyCode >= 47 && event.keyCode < 48)
             || (event.keyCode > 57 && event.keyCode < 65)
             || (event.keyCode > 90 && event.keyCode < 97)
             || (event.keyCode >= 97 && event.keyCode <= 122)
             || (event.keyCode >= 65 && event.keyCode <= 90))
            event.returnValue = false;

    }


    //검색날짜 유효기간
    function getBoundDate1(yy,mm,dd,stdDate)
    {
        var today = new Date();
        today.setYear(stdDate.substring(0,4));
        today.setMonth(stdDate.substring(4,6)-1);
        today.setDate(stdDate.substring(6,8));
        today.setHours(today.getHours());
        today.setMinutes(today.getMinutes());
        today.setSeconds(today.getSeconds());

        yy = Number(yy);
        mm = Number(mm);
        dd = Number(dd);

        var date = new Date();

        var DAY = 24 * 60 * 60 * 1000;

        if ( yy != 0 ){
            date.setTime(today.getTime() + DAY * 365 * yy);
        }

        if ( mm != 0 ){
            date.setTime(today.getTime() + DAY * 30 * mm);
        }

        if ( dd != 0 ){
            date.setTime(today.getTime() + DAY * dd);
        }

        return lpad(new String(date.getYear()),4,'0') + lpad(new String(date.getMonth() + 1),2,'0') + lpad(new String(date.getDate()),2,'0');
    }



    function getBoundDate(yy, mm, dd) {
        yy = Number(yy);
        mm = Number(mm);
        dd = Number(dd);

        var date = new Date();

        var DAY = 24 * 60 * 60 * 1000;


        if ( yy != 0 ){
            date.setTime(datToday.getTime() + DAY * 365 * yy);
        }

        if ( mm != 0 ){
            date.setTime(datToday.getTime() + DAY * 30 * mm);
        }

        if ( dd != 0 ){
            date.setTime(datToday.getTime() + DAY * dd);
        }

        return lpad(new String(date.getYear()),4,'0') + lpad(new String(date.getMonth() + 1),2,'0') + lpad(new String(date.getDate()),2,'0');
    }


    //검색날짜 체크
    function isVaildTerm(obj,yy,mm,dd)
    {
        var datestr = obj.value;


        //널인지?
        if(isEmpty(datestr)){
            return null;
        }

        // 날짜 포맷제거
        obj_removeformat(obj);

        //8자리인지?
        if (getByteLength(datestr) != 8) {
            alert("날짜는 '-'를 제외한 8자리 숫자로 입력하십시오.");
            return false;

        }



        // yy,mm,dd,fromto가 없을 경우
        if (yy == null) yy = 0;
        if (mm == null) mm = 0;
        if (dd == null) dd = 0;

        // 검색날짜 유효기간 가져오기
        var boundDate = getBoundDate(yy,mm,dd);

        if (yy < 0  || mm < 0  || dd < 0) {
            if ( boundDate > datestr) {
                alert("유효하지 않은 검색날짜입니다.\n유효한 날짜는" + boundDate.substring(0,4) + "년 " + boundDate.substring(4,6) + "월 " + boundDate.substring(6) + "일부터 입니다.");
                obj.select();
                return false;
            }
        } else {
            if ( boundDate < datestr) {
                alert("유효하지 않은 검색날짜입니다.\n유효한 날짜는" + boundDate.substring(0,4) + "년 " + boundDate.substring(4,6) + "월 " + boundDate.substring(6) + "일까지 입니다.");
                obj.select();
                return false;
            }
        }


        return true;

    }



    //오늘날짜
    function getToDay()
    {

        var date = datToday;

        var year  = date.getFullYear();
        var month = date.getMonth() + 1; // 1월=0,12월=11이므로 1 더함
        var day   = date.getDate();

        if (("" + month).length == 1) { month = "0" + month; }
        if (("" + day).length   == 1) { day   = "0" + day;   }

        return ("" + year + month + day)

    }


    /**
     * Cookie설정하기
     */
    function setCookie(name, value, expire) {
              document.cookie = name + "=" + escape(value)
              + ( (expire) ? "; expires=" + expire.toGMTString() : "")
    }

    /**
     * Cookie 구하기
     */
    function getCookie(uName) {

        var flag = document.cookie.indexOf(uName+'=');
        if (flag != -1) {
            flag += uName.length + 1
            end = document.cookie.indexOf(';', flag)

            if (end == -1) end = document.cookie.length
            return unescape(document.cookie.substring(flag, end))
        }
    }

    /**
     * 특정 폼의 모든 elements 들을 disable 처리하기
     */
    function disableFormElements(form){
        var c = form.elements;
        if(!c.length) return;
        for( var i = 0; i < c.length ; i++){
            c[i].disabled = true;
        }
    }

    /**
     * 특정 폼의 모든 elements 들을 enable 처리하기
     */
    function enableFormElements(form){
        var c = form.elements;
        if(!c.length) return;
        for( var i = 0; i < c.length ; i++){
            c[i].disabled = false;
        }
    }

    /**
     * yyyymm 스트링에 addmm 개월을 더한 년월을 리턴
     * parameter yyyymm: yyyymm 형식의 스트링 날짜
     * parameter addmm : 숫자 Type
     * return          : 년월(yyyymm) 스트링
     */
     function toAddMonth(yyyymm,addmm) {
         var year  = eval(yyyymm.substr(0,4));
         var month = eval(yyyymm.substr(4,2))+year*12;

         if (addmm==0) {
             return yyyymm;
         }

         if ((month + addmm)%12==0) {
             year  = Math.floor((month + addmm)/12) - 1;
             month = 12;
         }
         else {
             year  = Math.floor((month + addmm)/12);
             month = Math.abs((month + addmm)%12);
         }

         return lpad(new String(year),4,'0') + lpad(new String(month),2,'0');
     }

    // Left 빈자리 만큼 padStr 을 붙인다.
    function lpad(src, len, padStr){
        var retStr = "";
        var padCnt = Number(len) - String(src).length;
        for(var i=0;i<padCnt;i++) retStr += String(padStr);
        return retStr+src;
    }

    // Right 빈자리 만큼 padStr 을 붙인다.
    function rpad(src, len, padStr){
        var retStr = "";
        var padCnt = Number(len) - String(src).length;
        for(var i=0;i<padCnt;i++) retStr += String(padStr);
        return src+retStr;
    }

    // AppException이 발생하였을 경우 에러핸들러를 호출한다.
    function callAppErrorHandler(o) {
        try {
            errorHandle(o);
        } catch(e) {
        }
    }


     /**
     *  외국인등록번호 유효성 체크.
     *
     * @param  tempStr '-'를 뺀 외국인등록번호
     * @return boolean
     */
    function isValidFgnNum(tmpStr)
    {
        var format = /^(\d{6})(-{0,1})(\d{7})$/;
        if(isValidFormat(tmpStr, format)){

            var fgn_reg_no = tmpStr;

	        if ((fgn_reg_no.charAt(6) == "5") || (fgn_reg_no.charAt(6) == "6"))
	        {
	           birthYear = "19";
	        }
	        else if ((fgn_reg_no.charAt(6) == "7") || (fgn_reg_no.charAt(6) == "8"))
	        {
	           birthYear = "20";
	        }
	        else if ((fgn_reg_no.charAt(6) == "9") || (fgn_reg_no.charAt(6) == "0"))
	        {
	           birthYear = "18";
	        }
	        else
	        {
	          return false;
	        }
	        birthYear += fgn_reg_no.substr(0, 2);
	        birthMonth = fgn_reg_no.substr(2, 2) - 1;
	        birthDate = fgn_reg_no.substr(4, 2);
	        birth = new Date(birthYear, birthMonth, birthDate);

	        if ( birth.getYear() % 100 != fgn_reg_no.substr(0, 2) ||
	             birth.getMonth() != birthMonth ||
	             birth.getDate() != birthDate) {
	             return false;
	        }

	        if (fgn_no_chksum(fgn_reg_no) == false){
	            return false;
	        }
	        else {
	            return true;
	        }

        }else{
            return false;
        }
    }

    /**
     *  외국인등록번호 체크
     *
     */
	function fgn_no_chksum(reg_no) {
	    var sum = 0;
	    var odd = 0;

	    buf = new Array(13);
	    for (i = 0; i < 13; i++) buf[i] = parseInt(reg_no.charAt(i));

	    odd = buf[7]*10 + buf[8];

	    if (odd%2 != 0) {
	      return false;
	    }

	    if ((buf[11] != 6)&&(buf[11] != 7)&&(buf[11] != 8)&&(buf[11] != 9)) {
	      return false;
	    }

	    multipliers = [2,3,4,5,6,7,8,9,2,3,4,5];
	    for (i = 0, sum = 0; i < 12; i++) sum += (buf[i] *= multipliers[i]);


	    sum=11-(sum%11);

	    if (sum>=10) sum-=10;

	    sum += 2;

	    if (sum>=10) sum-=10;

	    if ( sum != buf[12]) {
	        return false;
	    }
	    else {
	        return true;
	    }
	}


    /**
     *  법인등록번호 유효성 체크.
     *
     * @param  tempStr '-'를 뺀 법인등록 번호
     * @return boolean
     */
    function isValidBubinNum(tmpStr)
    {
        var format = /^(\d{6})(-{0,1})(\d{7})$/;
        if(isValidFormat(tmpStr, format)){

            var n_chk = 0;

            var n1  = tmpStr.substring(0,1);
            var n2  = tmpStr.substring(1,2);
            var n3  = tmpStr.substring(2,3);
            var n4  = tmpStr.substring(3,4);
            var n5  = tmpStr.substring(4,5);
            var n6  = tmpStr.substring(5,6);
            var n7  = tmpStr.substring(6,7);
            var n8  = tmpStr.substring(7,8);
            var n9  = tmpStr.substring(8,9);
            var n10 = tmpStr.substring(9,10);
            var n11 = tmpStr.substring(10,11);
            var n12 = tmpStr.substring(11,12);
            var n13 = tmpStr.substring(12,13);

            n_chk += n1 * 1;
            n_chk += n2 * 2;
            n_chk += n3 * 1;
            n_chk += n4 * 2;
            n_chk += n5 * 1;
            n_chk += n6 * 2;
            n_chk += n7 * 1;
            n_chk += n8 * 2;
            n_chk += n9 * 1;
            n_chk += n10 * 2;
            n_chk += n11 * 1;
            n_chk += n12 * 2;
            n_chk = n_chk % 10;
            n_chk = 10 - n_chk;

            if(n_chk > 9 ){n_chk = 10 - n_chk;}
            n_chk = Math.abs(n_chk);
            if(n_chk == n13){
                return true;
            }else{
                return false;
            }


        }else{
            return false;
        }
    }

