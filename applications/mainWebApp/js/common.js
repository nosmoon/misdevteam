/*************** CRM���� ����ϴ� ���� ���� script ***************/

/************************************************************************
*  Title        : ���� �ڹٽ�ũ��Ʈ ���� ( ���� )
*  Description  :  ����
*       1)�˾� ���� Method
*       2)�� ���� Method
*       3)Util Method( Date, String, Etc...)
*  Copyright    : Copyright (c) 2003.03.02
*  Company      : Soft on mobile
*  ���ȯ��       : Explorer 5.5 �̻� ����
*  @author	    : feelhouse@orgio.net
*  @version     : 0.9
*************************************************************************/

/////////////////////////////////////////////////////////////////
//	1)�˾� ���� Method
/////////////////////////////////////////////////////////////////

    /**
     * �����ȣ �˻� �˾�â�� ����.( �����Ϻ��� �°� Ŀ���͸���¡ �Ǿ�� �Ѵ�.)
     *
     * @param	column �÷���
     * @param	keyWord �˻���
     * @param	fn ��Ǹ�
     */
    function jsPost(column, keyWord, fn) {
        var url = "/BasisServlet?cmd=SearchPost&column=" + column + "&keyWord=" + keyWord + "&fn=" + fn;
        var name = null;
        var features = "width=600,height=550,scrollbars=yes,top=100,left=100";
        var popupWin = window.open(url, name, features);
        popupWin.focus();
    }


    /**
     * �ý��� �����(USR ID, ����ڸ�) �˻� �˾�â�� ����.
     *
     * @param	column �÷���
     * @param	keyWord �˻���
     * @param	fn ��Ǹ�
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
     * ��â�� ���� �Լ�(���� ���)
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
     * ��â�� ȭ�� �߾ӿ� ���� �Լ�(���ڷ��� no)
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
     * ��â�� ȭ�� �߾ӿ� ���� �Լ�(scrollbars yes)
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
     * ��â�� ȭ�� �߾ӿ� ���� �Լ�(scrollbars auto)
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
     * Modal ��â�� ȭ�� �߾ӿ� ���� �Լ�
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
     * Status ���� Modal ��â�� ȭ�� �߾ӿ� ���� �Լ�
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
//	2)�� ���� Method
/////////////////////////////////////////////////////////////////

    /**
     * �� ������ ��ȿ���� üũ�Ѵ�.
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
     * �� �� Ư�� ������Ʈ�� ������ ��ȿ���� üũ�Ѵ�.
     *
     * @param form
     * @param	obj
     * @return boolean
     */
    function validateObj(form, obj) {

        //�ش� element�� disabled �Ǿ��� ��� �׻� true�� ������
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

        // �ʼ� �Է� �׸� üũ
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
                alert(caption + "��(��) �ʼ� �Է� �׸� �Դϴ�.");
                obj.focus();
                selectTextField(obj);
                if (window.event) {
                    window.event.returnValue = false;
                }
                return	false;
            }
        }

        // ������ ���� üũ
        if (len != null && value != "") {
            if (value.length != eval(len)) {
                alert(caption + "��(��) " + len + "�ڸ��� �Է��ؾ� �մϴ�.");
                obj.focus();
                selectTextField(obj);
                if (window.event) {
                    window.event.returnValue = false;
                }
                return	false;
            }
        }

        if (obj.type == "text" || obj.type == "password") {
            // ������ Ÿ�� üũ
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
                    example = "\n��) 02-929-8272";
                } else if (dataType == "phone1") {
                    isValid = isValidPhone1(value); //������ȣ�� üũ
                    example = "\n��) 02";
                } else if (dataType == "pcs1") {
                    isValid = isValidPcs1(value); //�޴��� ����� ��ȣ�� üũ
                    example = "\n��) 011";
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
                    example = "\n��) 100100";
                } else if ( dataType == "24hr") {
                    value = deleteSemicolon(value);
                    isValid = isValid24hr(value);
                    example = "\n��) 1300";
                }

                if (!isValid) {
                    alert(caption + "��(��) �ùٸ��� �ʽ��ϴ�." + example);
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
                            alert(caption + " ���� �ּҰ�(" + minValue + ") �̸��Դϴ�.");
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
                            alert(caption + " ���� �ִ밪(" + maxValue + ")�� �ʰ��մϴ�.");
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
     * �̺�Ʈ �ڵ鷯�� ����Ѵ�.
     *  INPUT ��ü�� dataType �Ӽ�(User defined attribute)�� �ٰŷ� ������ �̺�Ʈ �ڵ鷯�� ����Ѵ�.
     *  1. ��� Input ��ü onkeypress = nextFocus
     *  2. Input ��ü�� dataType �Ӽ��� "date"�� ��� onblur = addDateFormat2 , onfocus = deleteDateFormat2;
     *  3. Input ��ü�� dataType �Ӽ��� "number" , "integer" �� "float" �̰� commar �Ӽ��� �����ϴ� ��� onblur = addComma2, onfocus = deleteComma2
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
     * ����ü�� �Ķ���ͷ� �޾� �̺�Ʈ �ڵ鷯�� ����Ѵ�.
     * @param form
     * @return
     */
    function setEventHandler2(elements) {
        for (var j = 0; j < elements.length; j++) {
            // INPUT ��ü�� onblur �̺�Ʈ�� �ڵ鷯�� ����Ѵ�.
            if (elements(j).tagName == "INPUT") {

                dataType = elements(j).getAttribute("dataType");

                if (dataType == "date") {	 // ��¥�� : ��) "2002/11/11"
                    if(!elements(j).readOnly){
                        elements(j).onblur = addDateFormat2;
                        elements(j).onfocus = deleteDateFormat2;
                    }
                    addDateFormat(elements(j));
                } else if (dataType == "month") { // ������ : ��) "2003/11"
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
     * ���� Ű �̺�Ʈ �ڵ鷯�� ����Ѵ�.
     *
     *
     */
    function setEnterKeyEventHandler(){
        var forms = document.forms;
        _sortedForms = new Array(); // tabIndex �Ӽ����� ���� ���ĵ� element�� �迭�� �����ϱ� ���� ���� �迭
        for(var i = 0; i<forms.length; i++){
            _sortedForms[i] = sortFormByTabIndex(forms(i));
            //var elements = forms(i).elements;
            var elements = _sortedForms[i];
            for(var j = 0; j<elements.length; j++){
                if(elements[j].tagName != "TEXTAREA")elements[j].onkeypress = focusToTarget; //textarea �� ��� enter key�� �ǹ̰� �����ϹǷ� ����
            }
        }
    }

    /**
     * form elements �� input ��ҵ��� background color ����
     */
    function setInputBackgroundColor(){
        var forms = document.forms;
        var elements;
        for(var i=0; i<forms.length; i++){
            setInputBackgroundColorForm(forms(i));
        }
    }

    /**
     * Ư�� form elements �� input ��ҵ��� background color ����
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
    * Ư�� input text box�� Ư�� index��  '-'�� ����
    *
    * @param obj input text box ��ü�� reference
    * @param idx '-'�� ���Ե� index
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
     * Form element object�� <input type="text" || "password" > �� ��� select�� �����Ѵ�.
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
     * �������Ŀ��� comma�� ���ְ�, ��¥���Ŀ��� "/" �� ���ش�.
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
     * �������Ŀ��� comma�� ���ְ�, ��¥���Ŀ��� "/" �� ���ش�.
     * �ϳ��� ������Ʈ�� ���� ����.
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
     * Form Element Object�� ���� �����Ѵ�.
     * Select box( Combo box )�� ��� �ش� ���� ��ġ�ϴ� ���� ������ index �� ����
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
     *  ����ڹ�ȣ üũ.
     *
     * @param  tempStr '-'�� �� ����� ��ȣ
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
     * �ֹε�Ϲ�ȣ üũ
     *
     * @param obj
     * @return boolean
     */
    function isValidJuminObj(obj) {
        var str = deleteHyphen(obj.value);	// �ʵ忡 �ִ� �ֹι�ȣ���� '-'����

        if( !isValidJumin(str) ) {
            alert("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
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
     * ����ڹ�ȣ Ȥ�� �ֹε�Ϲ�ȣ üũ
     *
     * @param obj
     * @return boolean
     */
    function isValidJufficeObj(obj) {
        var str = deleteHyphen(obj.value);	// �ʵ忡 �ִ� �ֹι�ȣ���� '-'����

        if( !isValidJuffice(str)){
            alert("��ȿ���� ���� ��ȣ�Դϴ�.");
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
     * ����ڹ�ȣ Ȥ�� �ֹε�Ϲ�ȣ üũ
     *
     * @param str '-'�� �� ��ȣ
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
     * �ֹε�Ϲ�ȣ üũ
     *
     * @param	str '-'�� �� �ֹε�Ϲ�ȣ
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
     * ��ȿ�� �����ȣ���� üũ
     * @param str '-'�� �� �����ȣ
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
     * ��ȿ�� 24hr �ð����� üũ
     * @param str ':'�� �� 24hr - ��)0100
     * @return boolean
     */
    function isValid24hr(str){
        re = /^(\d{4})$/;
        return (isValidFormat(str,re) && isValidHour(str.substring(0,2)) && isValidMin(2,4));
    }

    /**
     * ���� ���ڷθ� �̷���� �ִ��� üũ
     *
     * @param	num ������ ���ڿ�
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
     * ���� üũ
     *
     * 1. +, - ��ȣ�� �����ϰų� ���� �� �ִ� : ^[\+-]?
     * 2. 0���� 9���� ���ڰ� 0�� �̻� �� �� �ִ� : [0-9]*
     * 3. �������� ���ڷ� ������ �Ѵ� : [0-9]$
     *
     * @param	num ������ ���ڿ�
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
     * �ε��Ҽ� üũ
     *
     * 1. +, - ��ȣ�� �����ϰų� ���� �� �ִ� : ^[\+-]?
     * 2. 0���� 9���� ���ڰ� 0�� �̻� �� �� �ִ� : [0-9]*
     * 3. �Ҽ����� ���� �� �ִ� : [.]?
     * 4. �Ҽ��� ���� �ڸ��� 0���� 9���� ���ڰ� �� �� �ִ� : [0-9]*
     * 5. �������� ���ڷ� ������ �Ѵ� : [0-9]$
     *
     * @param	num ������ ���ڿ�
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
     * �̸��� üũ
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
     * �̸��� üũ
     *
     * @param	strEmail ������ ���ڿ�
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
        //alert("�̸��� �ּҰ� ��Ȯ���� �ʽ��ϴ� (üũ @ and .'s)");
        return false;
        }
        var user=matchArray[1];
        var domain=matchArray[2];
        for (i=0; i<user.length; i++) {
        if (user.charCodeAt(i)>127) {
        //alert("�߸��� �̸��� �ּҸ� �Է� �ϼ̽��ϴ�.");
        return false;
           }
        }
        for (i=0; i<domain.length; i++) {
        if (domain.charCodeAt(i)>127) {
        //alert("������ �̸��� �߸� ���� �Ǿ����ϴ�.");
        return false;
           }
        }

        if (user.match(userPat)==null) {
        //alert("�̸��� ���Ұ� �ƴմϴ�.");
        return false;
        }
        var IPArray=domain.match(ipDomainPat);
        if (IPArray!=null) {

        for (var i=1;i<=4;i++) {
        if (IPArray[i]>255) {
        //alert("IP�ּҰ� Ʋ���ϴ�!");
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
        //alert("������ �� ���� ���� �ʽ��ϴ�.");
        return false;
           }
        }

        if (checkTLD && domArr[domArr.length-1].length!=2 &&
        domArr[domArr.length-1].search(knownDomsPat)==-1) {
        //alert("�˷��� �������� ���� �����մϴ�." + "country.");
        return false;
        }

        if (len<2) {
        //alert("Hostname�� Ʋ���ϴ�. !");
        return false;
        }

        return true;
    }

  /**
     * �ѱ۷θ� �̷���� �ִ��� üũ �Ѵ�.
     *
     * @param	han
     * @return	boolean
     */
  function isHangul(han) {
        var inText = han.value;
        var ret;

        ret = inText.charCodeAt();
        if (ret > 31 && ret < 127) {
            //alert("�ѱ۸� �Է� �����մϴ�.");
            han.value = "";
            han.focus();
            return false;
        }
        return true;
    }

    /**
     * ������ ����
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
     * ���ڿ� comma�� ���δ�.
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

            alert(caption + " ������ �ùٸ��� �ʽ��ϴ�.");
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
     * ���ڿ� comma�� ���δ�.
     */
    function addComma2() {
        var obj = window.event.srcElement;
        addComma(obj);
    }

    /**
     * ���ڿ� comma�� ���δ�.
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
     * ���ڿ��� comma�� ���ش�.
     *
     * @param	obj
     */
    function deleteComma(obj) {
        obj.value = deleteCommaStr(obj.value);
    }

    /**
     * ���ڿ��� comma�� ���ش�.
     */
    function deleteComma2() {
        var obj = window.event.srcElement;
        deleteComma(obj);
        obj.select();
    }

    /**
     * ���ڿ��� comma�� ���ش�.
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
     * ��¥�� "/"�� ���δ�.
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

            alert(caption + " ������ �ùٸ��� �ʰų�, �ùٸ� ��¥�� �ƴմϴ�.\n( ��, 20020101 )");
            obj.focus();

            return;
        }

        obj.value = addDateFormatStr(value);
    }


    /**
     * ��¥�� "/"�� ���δ�.
     */
    function addDateFormat2() {
        var obj = window.event.srcElement;
        addDateFormat(obj);
    }

    /**
     * ��¥�� "/"�� ���δ�.
     * by bobjaru. CIIS ǥ�ؿ� ���� "-" �� ����. 2008.4.23
     * @param	str
     */
    function addDateFormatStr(str) {
        //return	str.substring(0, 4) + "/" + str.substring(4, 6) + "/" + str.substring(6, 8);
        return	str.substring(0, 4) + "-" + str.substring(4, 6) + "-" + str.substring(6, 8);
    }

    /**
     * ��¥���� "/"�� ���ش�.
     *
     * @param	obj
     */
    function deleteDateFormat(obj) {
        obj.value = deleteDateFormatStr(obj.value);
    }

    /**
     * ��¥���� "/"�� ���ش�.
     */
    function deleteDateFormat2() {
        var obj = window.event.srcElement;
        deleteDateFormat(obj);
        obj.select();
    }

    /**
     * ��¥���� "/"�� ���ش�.
     * by bobjaru. CIIS ǥ�ؿ� ���� "-" �� ����. 2008.4.23
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
     * ���п� "/"�� ���δ�.
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

            alert(caption + " ������ �ùٸ��� �ʰų�, �ùٸ� ���� �ƴմϴ�.\n( ��, 200201 )");
            obj.focus();

            return;
        }

        obj.value = addMonthFormatStr(value);
    }

    /**
     * ���п� "/"�� ���δ�.
     */
    function addMonthFormat2() {
        var obj = window.event.srcElement;
        addMonthFormat(obj);
    }

    /**
     * ��¥�� "/"�� ���δ�.
     * by bobjaru. CIIS ǥ�ؿ� ���� "-" �� ����. 2008.4.23
     * @param	str
     */
    function addMonthFormatStr(str) {
        //return	str.substring(0, 4) + "/" + str.substring(4, 6);
        return	str.substring(0, 4) + "-" + str.substring(4, 6);
    }

    /**
     * ��¥���� "/"�� ���ش�.
     *
     * @param	obj
     */
    function deleteMonthFormat(obj) {
        obj.value = deleteMonthFormatStr(obj.value);
    }

    /**
     * ��¥���� "/"�� ���ش�.
     */
    function deleteMonthFormat2() {
        var obj = window.event.srcElement;
        deleteMonthFormat(obj);
        obj.select();
    }

    /**
     * ��¥���� "/"�� ���ش�.
     * by bobjaru. CIIS ǥ�ؿ� ���� "-" �� ����. 2008.4.23
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
     * �ֹε�Ϲ�ȣ�� "-"�� ���δ�.
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

            alert(caption + " ������ �ùٸ��� �ʰų�, �ùٸ� �ֹε�Ϲ�ȣ�� �ƴմϴ�.");
            obj.focus();

        }else{
            setJuminHyphen(obj);
        }
    }

    /**
     * �ֹε�Ϲ�ȣ�� "-"�� ���δ�.
     */
    function addJuminFormat2() {
        var obj = window.event.srcElement;
        addJuminFormat(obj);
    }

    /**
     * �ֹε�Ϲ�ȣ���� "-"�� ���ش�.
     */
    function deleteJuminFormat2() {
        var obj = window.event.srcElement;
        obj.value = deleteHyphen(obj.value);
        obj.select();
    }


    /**
     * ����ڵ�Ϲ�ȣ�� "-"�� ���δ�.
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

            alert(caption + " ������ �ùٸ��� �ʰų�, �ùٸ� ����ڵ�Ϲ�ȣ�� �ƴմϴ�.");
            obj.focus();

        }else{
            setJuminHyphen(obj);
        }
    }

    /**
     * ����ڵ�Ϲ�ȣ�� "-"�� ���δ�.
     */
    function addOfficeFormat2() {
        var obj = window.event.srcElement;
        addOfficeFormat(obj);
    }

    /**
     * ����ڵ�Ϲ�ȣ���� "-"�� ���ش�.
     */
    function deleteOfficeFormat2() {
        var obj = window.event.srcElement;
        obj.value = deleteHyphen(obj.value);
        obj.select();
    }

    /**
     * 24hr�ð��� ":"�� ���δ�.
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

            alert(caption + " ������ �ùٸ��� �ʰų�, �ùٸ� �ð�(24�ð�)�� �ƴմϴ�.");
            obj.focus();

        }else{
            set24hrSemicolon(obj);
        }
    }

    /**
     * 24hr�ð��� ":"�� ���δ�.
     */
    function add24hrFormat2() {
        var obj = window.event.srcElement;
        add24hrFormat(obj);
    }

    /**
     * 24hr�ð����� ":"�� ���ش�.
     */
    function delete24hrFormat2() {
        var obj = window.event.srcElement;
        obj.value = deleteSemicolon(obj.value);
        obj.select();
    }

    /**
     * ����ڹ�ȣ Ȥ�� �ֹε�Ϲ�ȣ/�ܱ��ι�ȣ�� "-"�� ���δ�.
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

//            alert(caption + " ������ �ùٸ��� �ʰų�, �ùٸ� �ֹε�Ϲ�ȣ/����ڹ�ȣ (��)�� �ƴմϴ�.");
	    alert(caption + " ������ �ùٸ��� �ʰų�, �ùٸ� (�ֹ�/�����/����/�ܱ���)��Ϲ�ȣ (��)�� �ƴմϴ�.");
            obj.focus();

        }else{

            setJuminHyphen(obj);
        }
    }

    /**
     * ����ڹ�ȣ Ȥ�� �ֹε�Ϲ�ȣ�� "-"�� ���δ�.
     */
    function addJufficeFormat2() {
        var obj = window.event.srcElement;
        addJufficeFormat(obj);
    }

    /**
     * ����ڹ�ȣ Ȥ�� �ֹε�Ϲ�ȣ���� "-"�� ���ش�.
     */
    function deleteJufficeFormat2() {
        var obj = window.event.srcElement;


        obj.value = deleteHyphen(obj.value);
        obj.select();
    }

    /**
     * �����ȣ�� "-"�� ���δ�.
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

            alert(caption + " ������ �ùٸ��� �ʰų�, �ùٸ� �����ȣ�� �ƴմϴ�.");
            obj.focus();

        }else{
            setZipHyphen(obj);
        }
    }

    /**
     * �����ȣ�� "-"�� ���δ�.
     */
    function addZipFormat2() {
        var obj = window.event.srcElement;
       addZipFormat(obj);
    }

    /**
     * �����ȣ���� "-"�� ���ش�.
     */
    function deleteZipFormat2() {
        var obj = window.event.srcElement;
        obj.value = deleteHyphen(obj.value);
        obj.select();
    }


    /**
     * �ڸ��� üũ �� �ڸ��� ��ġ�ϸ� ���� ��ü�� focusing
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
     * �߻��� �̺�Ʈ�� keycode�� "13" �� ��� target ��ü�� focus�� �̵��Ѵ�.
     * ����Ű �� ��Ŀ�� �̵�
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
     * Ư�� form�� element���� tabIndex �Ӽ����� ���� �����Ͽ� ���� Array�� ��� �����Ѵ�..
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
     * Form Element �鿡�� ����Ű�� ���� ��� ���� tabIndex �� ã�Ƽ� focus�� �̵���Ų��.
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
     * Focus�� �� ���� ��ü�� ã�Ƴ���
     *
     * @param strFormName   �̺�Ʈ�� �߻���Ų elements�� �����ϴ� form ��ü�� name
     * @param strIdx		�̺�Ʈ�� �߻���Ų elements�� _idx ����� ���� Attribute ��
     */
    function findFocusTarget(strFormName, strIdx){

        var srcIndex = 0;   // �̺�Ʈ�� �߻��� input object�� �����ϴ� _sortedForms �� index

        for(var i=0; i< document.forms.length; i++){
            if( strFormName == document.forms(i).name ){
                srcIndex = i;
                break;
            }
        }

        var srcSortedForm = _sortedForms[srcIndex];

        var idx;			// ���ĵ� �� ��ü���� �̺�Ʈ�� �߻��� �߻��� elements�� name�� ���� ��ġ�ϴ� ��ü�� index ��
        var tarIndex = 0;	// ��Ŀ���� �ްԵ� ��ü�� �ش� index ��

        //�ҽ� �� ���Ѵ�.
        for(var i= 0; i< srcSortedForm.length; i++){
            if( strIdx == srcSortedForm[i]._idx ){
                idx = i;
                srcSortedForm[idx].blur();
                break;
            }
        }

        if(idx == null) return;
        if(idx == srcSortedForm.length - 1){
            tarIndex = 0; // idx �� ���� ū ��ü���� �̺�Ʈ�� �߻��� ���
        }else{
            tarIndex = idx + 1; //���� ��ü�� ����
            //Ÿ���� ���Ѵ�.
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
     * �Է°��� �����̽� �̿��� �ǹ��ִ� ���� �ִ��� üũ
     * ex) if (isEmpty(form.keyword)) {
     *         alert("�˻������� �Է��ϼ���.");
     *     }
     */
    function isEmpty(input) {
        if (input.value == null || input.value.replace(/ /gi,"") == "") {
            return true;
        }
        return false;
    }

    /**
     * �Է°��� ����ڰ� ������ ���� �������� üũ
     * �ڼ��� format ������ �ڹٽ�ũ��Ʈ�� 'regular expression'�� ����
     */
    function isValidFormat(inputStr,re) {
         if (re.test(inputStr)) {
              return true; //�ùٸ� ���� ����
         }
         return false;
    }

    /**
     * �Է°��� �Ϲ���ȭ��ȣ ����(DDD-��-��ȣ)���� üũ
     * ����Ư����	02		�� �� 031	�� �� 033	�� õ 032
     * �� ��		042		�� �� 043	�� �� 041	�� �� 053
     * �� ��		054		�� �� 055	�� �� 052	�� �� 051
     * �� ��		063		�� �� 061	�� �� 062	�� �� 064
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
     * �Է°��� �Ϲ���ȭ��ȣ ����(DDD)���� üũ
     * ����Ư����	02		�� �� 031	�� �� 033	�� õ 032
     * �� ��		042		�� �� 043	�� �� 041	�� �� 053
     * �� ��		054		�� �� 055	�� �� 052	�� �� 051
     * �� ��		063		�� �� 061	�� �� 062	�� �� 064
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
     * �Է°��� ��ȭ��ȣ ����(����-����-����)���� (������) üũ pcs ��ȣ üũ�� ���� ����ص� ��
     */
    function isValidPhone2(input) {
        var format = /^(\d+)-(\d+)-(\d+)$/;
        return isValidFormat(input,format);
    }

    /**
     * �Է°��� �ڵ�����ȣ ����(����ڹ�ȣ-��-��ȣ)���� üũ
     *
     * ����ڹ�ȣ 011 016 018 017 019
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
     * �Է°��� �ڵ�����ȣ ����(����ڹ�ȣ)���� üũ
     *
     * ����ڹ�ȣ 011 016 018 017 019
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
     * ���̵� ��ȿ���˻�
     * @param ���̵� ����ü
     * @return true, false
     */
    function isValidId(thisObj)
    {
        var tmp;
        var frmMemId = thisObj;
        tmp = frmMemId.value;

        if (tmp.length < 4 || tmp.length > 10) {
            alert("ID��4���� �̻�, 10 ���� �����Դϴ�.");
            frmMemId.focus();
            return false;
        }

        for (var i = 0; i < tmp.length; i++) {
            if (tmp.charAt(i) >= '0' && tmp.charAt(i) <= '9') continue;
            else if (tmp.charAt(i) >= 'a' && tmp.charAt(i) <= 'z') continue;
            else if (tmp.charAt(i) >= 'A' && tmp.charAt(i) <= 'Z') continue;
            else if (tmp.charAt(i) == '_' || tmp.charAt(i) == '-') continue;
            else {
                alert("ID���� ������, ����, ��ȣ ('-' , '_' ) �� ����Ͻ� �� �ֽ��ϴ�.");
                frmMemId.value = "" ;
                frmMemId.focus();
                return false;
            }
        }

        if (tmp.charAt(0) == '_' || tmp.charAt(0) == '-') {
            alert("'_'�� '-'�� ID�� ù���ڷ� ����Ͻ� �� �����ϴ�.");
            return false;
        }
        return true ;
    }

    function isValidName(frmObj){
        var frmMemName = frmObj;

        if (trim(frmMemName.value) == "" || getLength(frmMemName.value) < 1 || getLength(frmMemName.value) > 10) {
            alert("�̸��� ��Ȯ�� �Է��ϼ���.");
            frmMemName.focus();
            return false;
        }
        return true;
    }

    /**
     *  ���±׾� radio button���� üũ�� value ���� ����
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
    *  ���±��� raido button Ȥ�� check box �ʵ��� �ش� value ���� ���� �׸��� üũ
    *  @param objTarget  �ش� ����� Ȥ�� üũ �ڽ� ��ü
    *  @param strValue   üũ�Ǿ�� �ϴ� ��
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
    *  ���ȿ� �������ư�� üũ�ڽ��� üũ�� ���� �� ��Ʈ�������� �����Ѵ�.
	*                                                	������(*)
    *
    *  @param form (Object) --�� �̸�
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
        // ������ length * ����
        if(strSumValue != "" ){
            strSumValue = strSumValue.substring(0,strSumValue.length-1);
        }
        return strSumValue;
    }

    /**
    *  ���ȿ� Ư�� �������ư�̳� Ư�� üũ�ڽ��� üũ�� ���� delimiter�� ���̿� �������ִ� ��Ʈ�������� �����Ѵ�.
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

        // ������ length delimiter ����
        if(strSumValue != "" ){
            strSumValue = strSumValue.substring(0,strSumValue.length - delimiter.length);
        }
        return strSumValue;
    }



    /**
     * ���ڿ��� Hyphen�� ���ش�.
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
     * ���ڿ��� Semicolon�� ���ش�.
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
     *  �ֹε�Ϲ�ȣ&����ڹ�ȣ�� '-'�ֱ�
     */
     function setJuminHyphen(obj) {
        var str = deleteHyphen(obj.value);

        if(str.length == 13) {	// �ֹε�Ϲ�ȣ  6-7
            str = str.substring(0, 6) + "-" + str.substring(6);
        }else if(str.length == 10) { // ����ڹ�ȣ 3-2-5
            str = str.substring(0, 3) + "-"+ str.substring(3, 5) + "-"+ str.substring(5);
        }
         obj.value = str;
     }

    /**
     *  �����ȣ�� '-'�ֱ�
     */
     function setZipHyphen(obj) {
        var str = deleteHyphen(obj.value);
        obj.value = (isValidZip(str))? str.substring(0, 3) + "-" + str.substring(3,6) : str;
     }

    /**
     * time�� ':' �ֱ�
     */
    function set24hrSemicolon(obj) {
        var str = deleteSemicolon(obj.value);
        obj.value = (isValid24hr(str))? str.substring(0, 2) + ":" + str.substring(2,4) : str;
    }

    /**
     * �� ���� ���� ������Ʈ�� �޸��� �ٿ��ش�.
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
//	3)Util Method( ��¥, ��Ʈ��, ��Ÿ...)
/////////////////////////////////////////////////////////////////


    /**
     * �ϼ��� ����Ѵ�.(���ϻ��� ���Ϻһ���)
     *
     * @param	from ������
     * @param	to ������
     * @return	�ϼ�
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
     * ��ȿ��(�����ϴ�) ��(��)���� üũ
     */
    function isValidMonth(mm) {
        var m = parseInt(mm,10);
        return (m >= 1 && m <= 12);
    }

    /**
     * ��ȿ��(�����ϴ�) ��(��)���� üũ
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
     * ��ȿ��(�����ϴ�) ��(��)���� üũ
     */
    function isValidHour(hh) {
        var h = parseInt(hh,10);
        return (h >= 1 && h <= 24);
    }

    /**
     * ��ȿ��(�����ϴ�) ��(��)���� üũ
     */
    function isValidMin(mi) {
        var m = parseInt(mi,10);
        return (m >= 1 && m <= 60);
    }

    /**
     * Time �������� üũ(������ üũ)
     */
    function isValidTimeFormat(time) {
        return (!isNaN(time) && time.length == 12);
    }

    /**
     * ��ȿ�ϴ�(�����ϴ�) Time ���� üũ
     * ex) var time = form.time.value; //'200102310000'
     *     if (!isValidTime(time)) {
     *         alert("�ùٸ� ��¥�� �ƴմϴ�.");
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
     * Time ��Ʈ���� �ڹٽ�ũ��Ʈ Date ��ü�� ��ȯ
     * parameter time: Time ������ String
     */
    function toTimeObject(time) { //parseTime(time)
        var year  = time.substr(0,4);
        var month = time.substr(4,2) - 1; // 1��=0,12��=11
        var day   = time.substr(6,2);
        var hour  = time.substr(8,2);
        var min   = time.substr(10,2);

        return new Date(year,month,day,hour,min);
    }

    /**
     * �ڹٽ�ũ��Ʈ Date ��ü�� Time ��Ʈ������ ��ȯ
     * parameter date: JavaScript Date Object
     */
    function toTimeString(date) { //formatTime(date)
        var year  = date.getFullYear();
        var month = date.getMonth() + 1; // 1��=0,12��=11�̹Ƿ� 1 ����
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
     * Time�� ����ð� ����(�̷�)���� üũ
     */
    function isFutureTime(time) {
        return (toTimeObject(time) > new Date());
    }

    /**
     * Time�� ����ð� ����(����)���� üũ
     */
    function isPastTime(time) {
        return (toTimeObject(time) < new Date());
    }

    /**
     * �־��� Time �� y�� m�� d�� h�� ���̳��� Time�� ����
     * ex) var time = form.time.value; //'20000101000'
     *     alert(shiftTime(time,0,0,-100,0));
     *     => 2000/01/01 00:00 ���κ��� 100�� �� Time
     */
    function shiftTime(time,y,m,d,h) { //moveTime(time,y,m,d,h)
        var date = toTimeObject(time);

        date.setFullYear(date.getFullYear() + y); //y���� ����
        date.setMonth(date.getMonth() + m);       //m���� ����
        date.setDate(date.getDate() + d);         //d���� ����
        date.setHours(date.getHours() + h);       //h�ø� ����

        return toTimeString(date);
    }
    /**
     * �� ���ڰ� ���� ���̳����� ����
     * date1:��������, date2:��������
     */
    function getDayBetween(date1,date2) {
            var day_gab = Math.floor( (date1-date2) / (60*60*24*1000) )
            return (day_gab*-1) ;
    }
    /**
     * �� Time�� �� ���� ���̳����� ����
     * time1�� time2���� ũ��(�̷���) minus(-)
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
     * �� Time�� ��ĥ ���̳����� ����
     * time1�� time2���� ũ��(�̷���) minus(-)
     */
    function getDayInterval(time1,time2) {
        var date1 = toTimeObject(time1);
        var date2 = toTimeObject(time2);
        var day   = 1000 * 3600 * 24; //24�ð�

        return parseInt((date2 - date1) / day, 10);
    }

    /**
     * �� Time�� �� �ð� ���̳����� ����
     * time1�� time2���� ũ��(�̷���) minus(-)
     */
    function getHourInterval(time1,time2) {
        var date1 = toTimeObject(time1);
        var date2 = toTimeObject(time2);
        var hour  = 1000 * 3600; //1�ð�

        return parseInt((date2 - date1) / hour, 10);
    }

    /**
     * ���� �ð��� Time �������� ����
     */
    function getCurrentTime() {
        return toTimeString(new Date());
    }

    /**
     * ���� �ð��� y�� m�� d�� h�� ���̳��� Time�� ����
     */
    function getRelativeTime(y,m,d,h) {

        return shiftTime(getCurrentTime(),y,m,d,h);
    }

    /**
     * ���� Ҵ�� YYYY�������� ����
     */
    function getYear() {

        return getCurrentTime().substr(0,4);
    }

    /**
     * ���� ���� MM�������� ����
     */
    function getMonth() {

        return getCurrentTime().substr(4,2);
    }

    /**
     * ���� ���� DD�������� ����
     */
    function getDay() {

        return getCurrentTime().substr(6,2);
    }

    /**
     * ���� ���� HH�������� ����
     */
    function getHour() {

        return getCurrentTime().substr(8,2);
    }

    /**
     * ������ ���� �����̾�?
     * ex) alert('������ ' + getDayOfWeek() + '�����Դϴ�.');
     */
    function getDayOfWeek() {
        var now = new Date();

        var day = now.getDay(); //�Ͽ���=0,������=1,...,�����=6
        var week = new Array('��','��','ȭ','��','��','��','��');

        return week[day];
    }


    /**
     * Ư����¥�� ������ ���Ѵ�.
     */
    function getDayOfWeek(time) {
        var now = toTimeObject(time);

        var day = now.getDay(); //�Ͽ���=0,������=1,...,�����=6
        var week = new Array('��','��','ȭ','��','��','��','��');

        return week[day];
    }


    /**
     * ��¥ üũ
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
     * ��Ʈ���� ���̸� ���Ѵ�.
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

                    if((chr >= '��') && (chr <= '\uFFFD'))
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
    * �迭�� delimiter �� �޾Ƽ�
    * �迭�� ������ delimiter �� ����� ���ڿ��� ����
    * @param strArr (���ڿ� �迭)
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
     *  ȭ�鿡 �޽����� ��Ÿ����
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
     * �������� ������ üũ�Ѵ�.
     *
     * @param	none
     * @return		none
     * @added by feelhouse@orgio.net 2003-10-27
     */
    function objDetectBrowser() {
        var strUA, s, i;
        this.isIE = false;  // ���ͳ� �ͽ��÷η������� ��Ÿ���� �Ӽ�
        this.isNS = false;  // �ݽ������������� ��Ÿ���� �Ӽ�
        this.version = null; // ������ ������ ��Ÿ���� �Ӽ�

        // Agent ������ ��� �ִ� ���ڿ�.
        strUA = navigator.userAgent;

        s = "MSIE";
        // Agent ���ڿ�(strUA) "MSIE"�� ���ڿ��� ��� �ִ��� üũ

        if ((i = strUA.indexOf(s)) >= 0) {
            this.isIE = true;
            // ���� i���� strUA ���ڿ� �� MSIE�� ���۵� ��ġ ���� ����ְ�,
            // s.length�� MSIE�� ���� ��, 4�� ��� �ִ�.
            // strUA.substr(i + s.length)�� �ϸ� strUA ���ڿ� �� MSIE ������
            // ������ ���ڿ��� �߶�´�.
            // �� ���ڿ��� parseFloat()�� ��ȯ�ϸ� ������ �˾Ƴ� �� �ִ�.
            this.version = parseFloat(strUA.substr(i + s.length));
            return;
        }

        s = "Netscape6/";
        // Agent ���ڿ�(strUA) "Netscape6/"�̶� ���ڿ��� ��� �ִ��� üũ

        if ((i = strUA.indexOf(s)) >= 0) {
            this.isNS = true;
            this.version = parseFloat(strUA.substr(i + s.length));
            return;
        }

        // �ٸ� "Gecko" �������� NS 6.1�� ���.

        s = "Gecko";
        if ((i = strUA.indexOf(s)) >= 0) {
            this.isNS = true;
            this.version = 6.1;
            return;
        }
    }

  /**
   * ȭ�� ũ�⸦ 1024*768�� ���� ��Ų��.
   * author ����
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

    // Ű���� �Է½� ���ڸ� �Է� ����
    function onlyNumber(){

        if ((event.keyCode >= 32 && event.keyCode < 48)
             || (event.keyCode > 57 && event.keyCode < 65)
             || (event.keyCode > 90 && event.keyCode < 97)
             || (event.keyCode >= 97 && event.keyCode <= 122)
             || (event.keyCode >= 65 && event.keyCode <= 90))

             event.returnValue = false;

    }
    // Ű���� �Է½� ���� �� ','�� �Է� ����
    function AmtNumber(){

        if ((event.keyCode >= 32 && event.keyCode < 44)
             || (event.keyCode >= 45 && event.keyCode < 48)
             || (event.keyCode > 57 && event.keyCode < 65)
             || (event.keyCode > 90 && event.keyCode < 97)
             || (event.keyCode >= 97 && event.keyCode <= 122)
             || (event.keyCode >= 65 && event.keyCode <= 90))
             event.returnValue = false;

    }
    // Ű���� �Է½� ���� �� '.'�� �Է� ����
    function RateNumber(){

        if ((event.keyCode >= 32 && event.keyCode < 46)
             || (event.keyCode >= 47 && event.keyCode < 48)
             || (event.keyCode > 57 && event.keyCode < 65)
             || (event.keyCode > 90 && event.keyCode < 97)
             || (event.keyCode >= 97 && event.keyCode <= 122)
             || (event.keyCode >= 65 && event.keyCode <= 90))
            event.returnValue = false;

    }


    //�˻���¥ ��ȿ�Ⱓ
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


    //�˻���¥ üũ
    function isVaildTerm(obj,yy,mm,dd)
    {
        var datestr = obj.value;


        //������?
        if(isEmpty(datestr)){
            return null;
        }

        // ��¥ ��������
        obj_removeformat(obj);

        //8�ڸ�����?
        if (getByteLength(datestr) != 8) {
            alert("��¥�� '-'�� ������ 8�ڸ� ���ڷ� �Է��Ͻʽÿ�.");
            return false;

        }



        // yy,mm,dd,fromto�� ���� ���
        if (yy == null) yy = 0;
        if (mm == null) mm = 0;
        if (dd == null) dd = 0;

        // �˻���¥ ��ȿ�Ⱓ ��������
        var boundDate = getBoundDate(yy,mm,dd);

        if (yy < 0  || mm < 0  || dd < 0) {
            if ( boundDate > datestr) {
                alert("��ȿ���� ���� �˻���¥�Դϴ�.\n��ȿ�� ��¥��" + boundDate.substring(0,4) + "�� " + boundDate.substring(4,6) + "�� " + boundDate.substring(6) + "�Ϻ��� �Դϴ�.");
                obj.select();
                return false;
            }
        } else {
            if ( boundDate < datestr) {
                alert("��ȿ���� ���� �˻���¥�Դϴ�.\n��ȿ�� ��¥��" + boundDate.substring(0,4) + "�� " + boundDate.substring(4,6) + "�� " + boundDate.substring(6) + "�ϱ��� �Դϴ�.");
                obj.select();
                return false;
            }
        }


        return true;

    }



    //���ó�¥
    function getToDay()
    {

        var date = datToday;

        var year  = date.getFullYear();
        var month = date.getMonth() + 1; // 1��=0,12��=11�̹Ƿ� 1 ����
        var day   = date.getDate();

        if (("" + month).length == 1) { month = "0" + month; }
        if (("" + day).length   == 1) { day   = "0" + day;   }

        return ("" + year + month + day)

    }


    /**
     * Cookie�����ϱ�
     */
    function setCookie(name, value, expire) {
              document.cookie = name + "=" + escape(value)
              + ( (expire) ? "; expires=" + expire.toGMTString() : "")
    }

    /**
     * Cookie ���ϱ�
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
     * Ư�� ���� ��� elements ���� disable ó���ϱ�
     */
    function disableFormElements(form){
        var c = form.elements;
        if(!c.length) return;
        for( var i = 0; i < c.length ; i++){
            c[i].disabled = true;
        }
    }

    /**
     * Ư�� ���� ��� elements ���� enable ó���ϱ�
     */
    function enableFormElements(form){
        var c = form.elements;
        if(!c.length) return;
        for( var i = 0; i < c.length ; i++){
            c[i].disabled = false;
        }
    }

    /**
     * yyyymm ��Ʈ���� addmm ������ ���� ����� ����
     * parameter yyyymm: yyyymm ������ ��Ʈ�� ��¥
     * parameter addmm : ���� Type
     * return          : ���(yyyymm) ��Ʈ��
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

    // Left ���ڸ� ��ŭ padStr �� ���δ�.
    function lpad(src, len, padStr){
        var retStr = "";
        var padCnt = Number(len) - String(src).length;
        for(var i=0;i<padCnt;i++) retStr += String(padStr);
        return retStr+src;
    }

    // Right ���ڸ� ��ŭ padStr �� ���δ�.
    function rpad(src, len, padStr){
        var retStr = "";
        var padCnt = Number(len) - String(src).length;
        for(var i=0;i<padCnt;i++) retStr += String(padStr);
        return src+retStr;
    }

    // AppException�� �߻��Ͽ��� ��� �����ڵ鷯�� ȣ���Ѵ�.
    function callAppErrorHandler(o) {
        try {
            errorHandle(o);
        } catch(e) {
        }
    }


     /**
     *  �ܱ��ε�Ϲ�ȣ ��ȿ�� üũ.
     *
     * @param  tempStr '-'�� �� �ܱ��ε�Ϲ�ȣ
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
     *  �ܱ��ε�Ϲ�ȣ üũ
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
     *  ���ε�Ϲ�ȣ ��ȿ�� üũ.
     *
     * @param  tempStr '-'�� �� ���ε�� ��ȣ
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

