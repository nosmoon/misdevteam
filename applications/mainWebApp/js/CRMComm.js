/*************************************************************************************************/
/* 0. �Ϲ� Util �Լ�
/* 1)  replaceAll  : param1 ���ڿ��� ��� param2 ���ڿ��� param3���ڿ��� ġȯ.
/* 2)  
/* 3)  
/* 4)  
/* 5) 
/*************************************************************************************************/

/**
 * _src : ���� ���ڿ�
 * _old : �ٲ� ��� ���ڿ�
 * _new : ���ο� ���ڿ�
**/
function replaceAll(_src, _old, _new)
{
   var result = _src;
   
   while(result.indexOf(_old) != -1)
   {
      result = result.replace(_old, _new);
   }			
   return result;
}

/*************************************************************************************************/
/* 1. Validation
 * 1)  commReqCheckEx   : group ���� �ʼ��Է� Ȯ��. class = req �ΰ�� üũ.
 * 2)  commValidate     : group �� validation. �ʿ��� �Ӽ��� ������ ��Ʈ�ѿ� ���ؼ� üũ.
 * 3)  commValidateCtr  : ���������� ���.
 * 4)  commChkNodesetDate : nodeset path�� �޾� �ش� nodeset�� ���� ��¥�� ��ȿ������ üũ.
 * 5)  commEventHandler : group�� ��� Ư�� control�� ���� event handler�� ����.
 * 6)  commEventHandlerCtr : Ư�� control�� ���� event handler�� ����.
 * 7)  commHandlerDate  : ��¥ control event handler
 * 8)  commHandlerDateChk  : ��¥ validation �� ó��
 * 9)  commHandlerFromDate : ������ event handler
 * 10)  commHandlerFromDateChk : ������ validation �� ó��
 * 11)  commHandlerToDate   : ������ event handler
 * 12)  commHandlerToDateChk   : ������ validation �� ó��
 * 13)  commValidateDateFromTo : �����ϰ� �����ϰ� ���� ���� üũ.
 * 14)  commHandlerMonth       : �� event handler
 * 15)  commHandlerMonthChk    : �� validation �� ó��
 * 16)  commHandlerFromMonth : ���ۿ� event handler
 * 17)  commHandlerFromMonthChk : ���ۿ� validation �� ó��
 * 18)  commHandlerToMonth   : ����� event handler
 * 19)  commHandlerToMonthChk   : ����� validation �� ó��
 * 20)  commValidateMonthFromTo : ���ۿ��� ������� ���� ���� üũ.
 * 21)  commHandlerJumin       : �ֹι�ȣ event handler
 * 22)  commHandlerOffice      : ����ڹ�ȣ event handler
 * 23)  commHandlerJuffice     : �ֹι�ȣ �� ����ڹ�ȣ event handler //���� ����� �� ����.
 * 24)  commChkNodesetDate     : nodeset (ArrayList) �� ���� date check.
 * 25)  validate_zip : �����ȣ üũ (-����)
 * 26) validate_stafno : Ȯ���� ������ȣ ��ȿ�� üũ
 * 27) validate_bns_itemcd : ���˹��ڵ� ��ȿ�� ����
 * 28) valid_rdr_no : ���ڹ�ȣ ��ȿ�� ����
 * 29) valid_prev_rdr_no : �����ڹ�ȣ ��ȿ�� ����
 * 30) valid_dstc_no : �����ڵ� ��ȿ�� üũ
 * 31) valid_dstc_dlvno : ����+��� ��ȿ�� üũ
 * 32) valid_tel_no : ��ȭ��ȣ ��ȿ�� üũ
 * 33) valid_addr : �ּ� ��ȿ�� üũ
 * 34) isValidFormatX : ���� ��ȿ�� üũ. ���ڿ��� reqular expression�� �Է� �޾� ��ȿ�� üũ. */
/*************************************************************************************************/

/**
 * @function    : commReqCheckEx
 * @access      : public
 * @description : �ʼ��Է� Ȯ��. CIISComm.js�� commReqCheck�� Ȯ����.(select ��Ʈ�� ����.)
 *                 class = req �̰� input, secret, select1, select �� ��Ʈ�ѿ� ���ؼ� üũ.
 * @sig         : 
 * @param       : group ID
 * @param       : 
 * @return      : 
 */ 
function commReqCheckEx(group1) {
	var chk =true;
	if( typeof group1 == 'string' ) group1 = document.controls(group1);
	var cnt = group1.children.length;
	
	for(i=0 ; i<cnt ; i++) {
		var ctr = group1.children.item(i);
		if(ctr.elementName=="xforms:input" || 
         ctr.elementName=="xforms:secret" || 
         ctr.elementName=="xforms:select1" || 
         ctr.elementName=="xforms:select") {

         if(ctr.disabled)
            continue;
			
			if(ctr.attribute("class")=="req" && model.getValue(ctr.attribute("ref"))=="") {
            var caption = ctr.attribute("caption");
            var id = ctr.attribute("id");

            if(caption == null || caption == "")
               caption = "�ʼ� �Է»���(" + id + ")";

				model.setFocus(id);	
				commMsgBox(caption + "��(��) �����Ǿ����ϴ�.");
				chk =false;
				break;
			}
		}
	}
	return chk;
}

/**
  * group���� control ���� ��ȿ���� üũ. �ʼ��Է°� üũ ����.
  * input, secret ��Ʈ�ѿ� ���ؼ� dataType �� �����Ǿ� �ִ� ��Ʈ�Ѹ� üũ.
  * ���� �Ӽ� : caption - ��Ʈ���� �̸�. alert �߻��� �� �̸��� ����Ѵ� �������� ������ id��
                dataType - date, month, email, float, integer, number, phone, phone1, pcs1, jumin, office, juffice, zip, 24hr, 
                len - ���� ���� �������� ��� ����
                minValue - ���ڷ� �ּҰ� ������ �ʿ��� ��� ����
                maxValue - ���ڷ� �ִ밪 ������ �ʿ��� ��� ����.
  *
  * @param	group
  * @return boolean
  */
function commValidate(group1) {
   if(!commReqCheckEx(group1))
      return false;

   if( typeof group1 == 'string' ) group1 = document.controls(group1);
   var cnt = group1.children.length;

   for(var i=0; i<cnt; i++) {
      var ctr = group1.children.item(i);

      if(ctr.elementName == "xforms:script")
         continue;

      if(!commValidateCtr(ctr)) return false;
   }
   return	true;
}

/**
  * control ���� ��ȿ���� üũ. 
  * ���������� CIISComm.js�� �� üũ �Լ����� ���.
  * CIISComm.js�� ó������ �ʴ� ���� common.js üũ �Լ� ���.
  *
  * @param	control
  * @return boolean
  */
function commValidateCtr(ctr) {
   if( typeof ctr == 'string' ) ctr = document.controls(ctr);

   if(ctr.disabled)
      return true;

   var ref;
   var value;
   var caption;
   var dataType;
   var minValue;
   var maxValue;
   var isValid;

   var example = "";

   ref = ctr.attribute("ref");
   value = model.getValue(ref).Trim();
   caption = ctr.attribute("caption");
   dataType = ctr.attribute("dataType");
   minValue = ctr.attribute("minValue");
   maxValue = ctr.attribute("maxValue");
   len = ctr.attribute("len");
   
   if(caption == null) {
      caption = ctr.attribute("id");
   }

   // ������ ���� üũ
   if (len != null && value != "") {

       if (eval(len)>0 && value.length != eval(len)) {
           alert(caption + "��(��) " + len + "�ڸ��� �Է��ؾ� �մϴ�.");
           model.setFocus(ctr.attribute("id"));
           /*if(window.event) {
              window.event.returnValue = false;
           }*/
           if (event) {
               event.preventDefault(); 
               event.stopPropagation();
           }
           return	false;
       }
   }
 
   if (ctr.elementName=="xforms:input" || ctr.elementName=="xforms:secret") {
       // ������ Ÿ�� üũ
       if ((value != "") && (dataType != null)) {
           isValid = true;
           checkValue = false;
           checkFromTo = false;
 
           if (dataType == "date") {
               isValid = commGhkCal(ref);
               checkValue = true;
           } else if (dataType == "datefrom") {
               isValid = commGhkCal(ref);
               checkValue = true;
               checkFromTo = true;
           } else if (dataType == "dateto") {
               isValid = commGhkCal(ref);
               checkValue = true;
           } else if (dataType == "month") {
               isValid = commGhkMonth(ref);
               checkValue = true;
           } else if (dataType == "email") {
               //isValid = commValidateEmail(ref);
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
               isValid = commValidateTelNo(ref);
               example = "\n��) 02-929-8272";
           } else if (dataType == "phone1") {
               isValid = isValidPhone1(value); //������ȣ�� üũ
               example = "\n��) 02";
           } else if (dataType == "pcs1") {
               isValid = isValidPcs1(value); //�޴��� ����� ��ȣ�� üũ
               example = "\n��) 011";
           } else if (dataType == "jumin") {
               //isValid = commCheckRrnoVal(ref);  //�Լ��� alert�� �����Ͽ� ����� �� ����.
               isValid = isValidJumin(value);
               example = "";
           } else if (dataType == "office") {
               isValid = commCheckBrnoVal(ref);
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
               model.setFocus(ctr.attribute("id"));
               if (event) {
                   event.preventDefault(); 
                   event.stopPropagation();
               }
               return	false;
           }
           if(checkFromTo)
           {
               var toCtr = ctr.attribute("relid");
               if(toCtr == null)
               {
                  model.alert(caption + "�� �������� �������� �ʾҽ��ϴ�.");
                  model.setFocus(ctr.attribute("id"));
                  return false;
               }
               toCtr = document.controls(toCtr);
               if(toCtr == null)
               {
                  model.alert(caption + "�� �������� ã�� �� �����ϴ�.");
                  model.setFocus(ctr.attribute("id"));
                  return false;
               }

               //���ѷ��� ������ ���� ���� üũ.
               if(!isDate(toCtr.value))
               {
                  var toCap = toCtr.attribute("caption")==null || trim(toCtr.attribute("caption")) == "" ? toCtr.attribute("id") : toCtr.attribute("caption");
                  model.alert(toCap + "(��)�� ��ȿ�� ��¥�� �ƴմϴ�.");
                  model.setFocus(toCtr.attribute("id"));
                  return false;
               }

               var fval = value;
               var tval = toCtr.value;
               if(!commValidateDateFromTo(fval, tval))
               {
                  model.alert("�������� �����Ϻ��� ����� �մϴ�.");
                  model.setFocus(ctr.attribute("id"));
                  return false;
               }
           }
           if (checkValue) {
               if (minValue != null) {
                   if (eval(minValue) > eval(value)) {
                       alert(caption + " ���� �ּҰ�(" + minValue + ") �̸��Դϴ�.");
                       model.setFocus(ctr.attribute("id"));
                       if (event) {
                           event.preventDefault(); 
                           event.stopPropagation();
                       }
                       return	false;
                   }
               }
               if (isValid && (maxValue != null)) {
                   if (eval(maxValue) < eval(value)) {
                       alert(caption + " ���� �ִ밪(" + maxValue + ")�� �ʰ��մϴ�.");
                       model.setFocus(ctr.attribute("id"));
                       /*if (window.event) {
                           window.event.returnValue = false;
                       }*/
                       if (event) {
                           event.preventDefault(); 
                           event.stopPropagation();
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
 * �׷쳻 control�� ���� event handler�� �����Ѵ�.
 * control�� attribute�� setHandler="true" �� �����Ǿ� �ִ� ��쿡 ���� �����Ѵ�.
 * ���� : common.js�� �ݵ�� �Բ� �����ؾ� �Ѵ�.
**/
function commEventHandler(group1) {
   if( typeof group1 == 'string' ) group1 = document.controls(group1);
   var cnt = group1.children.length;

   for(var i=0; i<cnt; i++) {
      var ctr = group1.children.item(i);

      if(ctr.elementName == "xforms:script")
         continue;
      if(ctr.attribute("setHandler") != "true")
         continue;

      commEventHandlerCtr(ctr);
   }
}

/**
 * ��Ʈ�ѿ� ���� event handler�� �����Ѵ�.
 * input : dataType - date, datefrom, dateto, month, jumin, office, juffice �� ��� ����.
 *         �Ӽ� editable="false" �� ���� skip�Ѵ�.
 * ���� : trustform MDI ó���� model.setFocus�� ���װ� �����Ƿ� �ϴ� xforms-value-changed �� ó��. (DOMFocusOut�� ��� ���� ���� �߻�)
 *        xforms-value-changed�� ó���� ���, �ѹ� �̺�Ʈ�� �߻��� �� focus out�� ������ ���Ƿ� ������ ����.
**/
function commEventHandlerCtr(ctr)
{
   if (ctr.elementName == "xforms:input") {
      if(ctr.attribute("editable")=="false")
         return;

      /** ���� DOMFocusOut �̺�Ʈ�� handler�� �ɾ�� �ϳ�, MDI �������� focusing bug�� �־� �ϴ� xforms-value-changed�� �̿�.
          �̷��� �Ǹ� �ѹ� event ó�� �� �ٽ� ����ڰ� ���� �������� ������ event �� �߻����� �ʾ� pass�Ǵ� ������ �߻�. **/
      var eventName = "xforms-value-changed";   // "DOMFocusOut"
      var eventHandler = "";
      var dataType = ctr.attribute("dataType");

      if (dataType == "date") {	 // ��¥�� : ��) "2002/11/11"
         eventHandler = "commHandlerDate();";
      } else if (dataType == "datefrom") { // ������ : ��) "2003/11"
         eventHandler = "commHandlerFromDate();";
      } else if (dataType == "dateto") {
         eventHandler = "commHandlerToDate();";
      } else if (dataType == "month") {
         eventHandler = "commHandlerMonth();";
      } else if (dataType == "monthfrom") {
         eventHandler = "commHandlerFromMonth();";
      } else if (dataType == "monthto") {
         eventHandler = "commHandlerToMonth();";
      } else if (dataType == "jumin"){
         eventHandler = "commHandlerJumin();";
      } else if (dataType == "office"){
         eventHandler = "commHandlerOffice();";
      } 
      //format�� �Ϲ�ȭ�� ���� ����, onfocus�� ������ �ֱ� ������(format�� �Ϲ�ȭ���� ���� ��� focus in/out�� handler�� ��� �����ؾ���) �ϴ� pass 
      /*(else if (dataType == "juffice"){
         eventHandler = "commHandlerJuffice();";
      }*/

      if(eventHandler != "")
         eval(ctr.attribute("id") + ".attribute('" + eventName + "') = '" + eventHandler + "'");
   }
}

/**
 * ��¥ ó�� handler.
 * commHandlerDateChk�� ���� ó�� ����� �޾� alert �� focusing ó��.
**/
function commHandlerDate()
{
   var id = event.currentTarget;
   var ctr = document.controls(id);
   var caption = ctr.attribute("caption");

   if(ctr.value == "")
      return;
   if(!commHandlerDateChk(ctr))
   {
      if(caption==null || trim(caption)=="")
         caption = id;
      model.alert(caption + "(��)�� ��ȿ�� ��¥���� �ƴմϴ�.");
      model.setFocus(id);
   }
}

/**
 * ��¥ check �� ó��.
 * isNumber, isDate(common.js) ���
**/
function commHandlerDateChk(ctr)
{
   var mask = ctr.attribute("mask")=="include";
   var val = mask ? deleteDateFormatStr(ctr.value) : ctr.value;   //format�� "-"�̶�� ����.
   var str = "";
   var st2 = "";

   if(!isNumber(val))
      return false;

   if(val.length == 4)
   {
      val += "0101";
   }
   else if(val.length == 5)
   {
      str = val.substring(4);
      if(str == "0")
         str += "101";
      else
         val = val.substring(0,4) + "0" + str + "01";
   }
   else if(val.length == 6)
   {
      str = val.substring(4, 5);
      st2 = val.substring(5);
      if(str == "1" && st2 == "0")
         val += "01";
      else if(st2 == "0")
         return false;
      else if(str == "0")
         val += "01";
      else
         val = val.substring(0,4) + "0" + str + "0" + st2;
   }
   else if(val.length == 7)
   {
      str = val.substring(4,6);
      st2 = val.substring(6);
      if(str == "00")
         return false;
      else if(eval(str) < 13)
      {
         val = val.substring(0,6) + "0" + st2;
      }
      else
      {
         val = val.substring(0,5) + "0" + val.substring(5);
      }
   }

   if(!isDate(val))
      return false;

   ctr.value = mask ? addDateFormatStr(val) : val;
   return true;
}

/**
 * ���۳�¥ ó�� handler.
 * commHandlerFromDateChk�� ���� ó�� ����� �޾� alert �� focusing ó��.
 * �⺻ date üũ. attribute relid �� ��ȿ�� ��� from-to date üũ.
**/
function commHandlerFromDate()
{
   var id = event.currentTarget;
   var ctr = document.controls(id);
   var caption = ctr.attribute("caption");

   if(ctr.value == "")
      return;
   var ret = commHandlerFromDateChk(ctr);    // 0:����. -1:��ȿ���� ���� ��¥. -2:�����Ϻ��� ���� ��¥. -3:��ȿ�� �������� �������� �ʾ���.
   var msg = "";
   if(ret != 0)
   {
      if(caption==null || trim(caption)=="")
         caption = id;

      if(ret == -1)
         msg = caption + "(��)�� ��ȿ�� ��¥�� �ƴմϴ�.";
      else if(ret == -2)
         msg = caption + "(��)�� �����Ϻ��� ���� �� �����ϴ�.";
      else if(ret == -3)
         msg = caption + "(��)�� ����� ��ȿ�� �������� �������� �ʽ��ϴ�.";
      else
         msg = "(��)�� ��ȿ���� �ʽ��ϴ�.";

      model.alert(msg);
      model.setFocus(id);
   }
}

/**
 * ���۳�¥ check �� ó��.
**/
function commHandlerFromDateChk(ctr)
{
   if(!commHandlerDateChk(ctr))
      return -1;

   var toCtr = ctr.attribute("relid");
   if(toCtr == null)
      return -3;
   toCtr = document.controls(toCtr);
   if(toCtr == null)
      return -3;

   var fval = ctr.attribute("mask")=="include" ? deleteDateFormatStr(ctr.value) : ctr.value;   //format�� "-"�̶�� ����.
   var tval = toCtr.attribute("mask")=="include" ? deleteDateFormatStr(toCtr.value) : toCtr.value;   //format�� "-"�̶�� ����.
   if(!commValidateDateFromTo(fval, tval))
      return -2;
   
   return 0;
}

/**
 * ���ᳯ¥ ó�� handler.
 * commHandlerToDateChk�� ���� ó�� ����� �޾� alert �� focusing ó��.
 * �⺻ date üũ. attribute relid �� ��ȿ�� ��� from-to date üũ.
**/
function commHandlerToDate()
{
   var id = event.currentTarget;
   var ctr = document.controls(id);
   var caption = ctr.attribute("caption");

   if(ctr.value == "")
      return;
   var ret = commHandlerToDateChk(ctr);    // 0:����. -1:��ȿ���� ���� ��¥. -2:�����Ϻ��� ���� ��¥. -3:��ȿ�� �������� �������� �ʾ���.
   var msg = "";
   if(ret != 0)
   {
      if(caption==null || trim(caption)=="")
         caption = id;

      if(ret == -1)
         msg = caption + "(��)�� ��ȿ�� ��¥�� �ƴմϴ�.";
      else if(ret == -2)
         msg = caption + "(��)�� �����Ϻ��� ���� �� �����ϴ�.";
      else if(ret == -3)
         msg = caption + "(��)�� ����� ��ȿ�� �������� �������� �ʽ��ϴ�.";
      else
         msg = "(��)�� ��ȿ���� �ʽ��ϴ�.";

      model.alert(msg);
      model.setFocus(id);
   }
}

/**
 * ���ᳯ¥ check �� ó��.
**/
function commHandlerToDateChk(ctr)
{
   if(!commHandlerDateChk(ctr))
      return -1;

   var fromCtr = ctr.attribute("relid");
   if(fromCtr == null)
      return -3;
   fromCtr = document.controls(fromCtr);
   if(fromCtr == null)
      return -3;

   var fval = fromCtr.attribute("mask")=="include" ? deleteDateFormatStr(fromCtr.value) : fromCtr.value;   //format�� "-"�̶�� ����.
   var tval = ctr.attribute("mask")=="include" ? deleteDateFormatStr(ctr.value) : ctr.value;   //format�� "-"�̶�� ����.
   if(!commValidateDateFromTo(fval, tval))
      return -2;
   
   return 0;
}

/**
 * fdate(������), tdate(������) �� ���� ����.
**/
function commValidateDateFromTo(fdate, tdate)
{
   //��� �����̵� ���� ������ �������� ����.
   if(fdate==null || trim(fdate)=="" || tdate==null || trim(tdate)=="")
      return true;
   //��� �����̵� ��¥�� ��ȿ���� ������ �������� ����.
   if(!isDate(fdate) || !isDate(tdate))
      return true;

   //���ڷ� ���� �ܼ� ��.
   return eval(fdate) <= eval(tdate);
}

/**
 * �� ó�� handler.
 * commHandlerMonthChk�� ���� ó�� ����� �޾� alert �� focusing ó��.
**/
function commHandlerMonth()
{
   var id = event.currentTarget;
   var ctr = document.controls(id);
   var caption = ctr.attribute("caption");

   if(ctr.value == "")
      return;
   if(!commHandlerMonthChk(ctr))
   {
      if(caption==null || trim(caption)=="")
         caption = id;
      model.alert(caption + "(��)�� ��ȿ�� ���� �ƴմϴ�.");
      model.setFocus(id);
   }
}

/**
 * �� check �� ó��.
 * isDate(common.js) ���
**/
function commHandlerMonthChk(ctr)
{
   var mask = ctr.attribute("mask")=="include"; 
   var val = mask ? deleteMonthFormatStr(ctr.value) : ctr.value;   //format�� "-"�̶�� ����.
   var str = "";

   if(!isNumber(val))
      return false;

   if(val.length == 4)
   {
      val += "01";
   }
   else if(val.length == 5)
   {
      str = val.substring(4);
      if(str == "0")
         str += "1";
      else if(eval(str) < 10)
         val = val.substring(0,4) + "0" + str;
   }

   if(!isDate(val+"01"))
      return false;

   ctr.value = mask ? addMonthFormatStr(val) : val;
   return true;
}

/**
 * ���۳�¥ ó�� handler.
 * commHandlerFromDateChk�� ���� ó�� ����� �޾� alert �� focusing ó��.
 * �⺻ date üũ. attribute relid �� ��ȿ�� ��� from-to date üũ.
**/
function commHandlerFromMonth()
{
   var id = event.currentTarget;
   var ctr = document.controls(id);
   var caption = ctr.attribute("caption");

   if(ctr.value == "")
      return;
   var ret = commHandlerFromMonthChk(ctr);    // 0:����. -1:��ȿ���� ���� ��. -2:��������� ���� ��¥. -3:��ȿ�� ������� �������� �ʾ���.
   var msg = "";
   if(ret != 0)
   {
      if(caption==null || trim(caption)=="")
         caption = id;

      if(ret == -1)
         msg = caption + "(��)�� ��ȿ�� ���� �ƴմϴ�.";
      else if(ret == -2)
         msg = caption + "(��)�� ��������� ���� �� �����ϴ�.";
      else if(ret == -3)
         msg = caption + "(��)�� ����� ��ȿ�� ������� �������� �ʽ��ϴ�.";
      else
         msg = "(��)�� ��ȿ���� �ʽ��ϴ�.";

      model.alert(msg);
      model.setFocus(id);
   }
}

/**
 * ���ۿ� check �� ó��.
**/
function commHandlerFromMonthChk(ctr)
{
   if(!commHandlerMonthChk(ctr))
      return -1;

   var toCtr = ctr.attribute("relid");
   if(toCtr == null)
      return -3;
   toCtr = document.controls(toCtr);
   if(toCtr == null)
      return -3;

   var fval = ctr.attribute("mask")=="include" ? deleteMonthFormatStr(ctr.value) : ctr.value;   //format�� "-"�̶�� ����.
   var tval = toCtr.attribute("mask")=="include" ? deleteMonthFormatStr(toCtr.value) : toCtr.value;   //format�� "-"�̶�� ����.
   if(!commValidateMonthFromTo(fval, tval))
      return -2;
   
   return 0;
}

/**
 * ����� ó�� handler.
 * commHandlerToMonthChk ���� ó�� ����� �޾� alert �� focusing ó��.
 * �⺻ date üũ. attribute relid �� ��ȿ�� ��� from-to date üũ.
**/
function commHandlerToMonth()
{
   var id = event.currentTarget;
   var ctr = document.controls(id);
   var caption = ctr.attribute("caption");

   if(ctr.value == "")
      return;
   var ret = commHandlerToMonthChk(ctr);    // 0:����. -1:��ȿ���� ���� ��. -2:�����Ϻ��� ���� ��. -3:��ȿ�� ���ۿ��� �������� �ʾ���.
   var msg = "";
   if(ret != 0)
   {
      if(caption==null || trim(caption)=="")
         caption = id;

      if(ret == -1)
         msg = caption + "(��)�� ��ȿ�� ���� �ƴմϴ�.";
      else if(ret == -2)
         msg = caption + "(��)�� ���ۿ����� ���� �� �����ϴ�.";
      else if(ret == -3)
         msg = caption + "(��)�� ����� ��ȿ�� ���ۿ��� �������� �ʽ��ϴ�.";
      else
         msg = "(��)�� ��ȿ���� �ʽ��ϴ�.";

      model.alert(msg);
      model.setFocus(id);
   }
}

/**
 * ����� check �� ó��.
**/
function commHandlerToMonthChk(ctr)
{
   if(!commHandlerMonthChk(ctr))
      return -1;

   var fromCtr = ctr.attribute("relid");
   if(fromCtr == null)
      return -3;
   fromCtr = document.controls(fromCtr);
   if(fromCtr == null)
      return -3;

   var fval = fromCtr.attribute("mask")=="include" ? deleteMonthFormatStr(fromCtr.value) : fromCtr.value;   //format�� "-"�̶�� ����.
   var tval = ctr.attribute("mask")=="include" ? deleteMonthFormatStr(ctr.value) : ctr.value;   //format�� "-"�̶�� ����.
   if(!commValidateMonthFromTo(fval, tval))
      return -2;
   
   return 0;
}

/**
 * fmonth(���ۿ�), tmonth(�����) �� ���� ����.
**/
function commValidateMonthFromTo(fmonth, tmonth)
{
   //��� �����̵� ���� ������ �������� ����.
   if(fmonth==null || trim(fmonth)=="" || tmonth==null || trim(tmonth)=="")
      return true;
   //��� �����̵� ��¥�� ��ȿ���� ������ �������� ����.
   if(!isDate(fmonth+"01") || !isDate(tmonth+"01"))
      return true;

   //���ڷ� ���� �ܼ� ��.
   return eval(fmonth) <= eval(tmonth);
}

/**
 * �ֹι�ȣ ó�� handler.
 * isValidJumin(common.js) �� ���� ó�� ����� �޾� alert �� focusing ó��.
 * mask=include �̸� format�� "-"�̶�� �����ϰ� ������ "-"�� �����Ͽ� üũ.
**/
function commHandlerJumin()
{
   var id = event.currentTarget;
   var ctr = document.controls(id);
   var caption = ctr.attribute("caption");
   var val = ctr.attribute("mask")=="include" ? deleteHyphen(ctr.value) : ctr.value;   //format�� "-"�̶�� ����.

   if(ctr.value == "")
      return;
   if(!isValidJumin(val))
   {
      if(caption==null || trim(caption)=="")
         caption = id;
      model.alert(caption + "(��)�� ��ȿ�� �ֹι�ȣ�� �ƴմϴ�.");
      model.setFocus(id);
   }
}

/**
 * ����ڹ�ȣ ó�� handler.
 * isValidOfficeNum(common.js) �� ���� ó�� ����� �޾� alert �� focusing ó��.
 * mask=include �̸� format�� "-"�̶�� �����ϰ� ������ "-"�� �����Ͽ� üũ.
**/
function commHandlerOffice()
{
   var id = event.currentTarget;
   var ctr = document.controls(id);
   var caption = ctr.attribute("caption");
   var val = ctr.attribute("mask")=="include" ? deleteHyphen(ctr.value) : ctr.value;   //format�� "-"�̶�� ����.

   if(ctr.value == "")
      return;
   if(!isValidOfficeNum(val))
   {
      if(caption==null || trim(caption)=="")
         caption = id;
      model.alert(caption + "(��)�� ��ȿ�� ����ڹ�ȣ�� �ƴմϴ�.");
      model.setFocus(id);
   }
}

/**
 * �ֹι�ȣ �� ����ڹ�ȣ ó�� handler.
 * isValidJuffice(common.js)�� ���� ó�� ����� �޾� alert �� focusing ó��.
 * mask=include �̸� format�� "-"�̶�� �����ϰ� ������ "-"�� �����Ͽ� üũ.
**/
function commHandlerJuffice()
{
   var id = event.currentTarget;
   var ctr = document.controls(id);
   var caption = ctr.attribute("caption");
   var val = ctr.attribute("mask")=="include" ? deleteHyphen(ctr.value) : ctr.value;   //format�� "-"�̶�� ����.

   if(ctr.value == "")
      return;
   if(!isValidJuffice(val))
   {
      if(caption==null || trim(caption)=="")
         caption = id;
      model.alert(caption + "(��)�� ��ȿ�� �ֹι�ȣ Ȥ�� ����ڹ�ȣ�� �ƴմϴ�.");
      model.setFocus(id);
   }
}

/*
���������� CIISComm.js�� commGhkCal �Լ� ���
nodesetPath : nodeset�� xpath
*/
function commChkNodesetDate(nodesetPath)
{
   var nodeset = instance1.selectNodes(nodesetPath);
   
   if(nodeset == null || nodesetPath.length==0)
      return false;

   for(var i=0; i<nodeset.length; i++)
      if(!commGhkCal(nodesetPath + "[" + (i+1) + "]"))
         return false;

   return true;
}

/* ���� common.js�� �Լ��� ���������� ���. ���� ���� jsp�� �����ϴ� �Լ� */
function validate_zip(s_zip){
   if(trim(s_zip) == "") return false;
   var format = /^(\d{3})(-{0,1})(\d{3})$/;
   return isValidFormatX(s_zip, format);
}

/* ���� common.js�� �Լ��� ���������� ���. ���� ���� jsp�� �����ϴ� �Լ� */
// Ȯ���� ������ȣ ��ȿ�� ����(���ڷθ� 1 ~ 8)
function validate_stafno(s_stafno){
    if(trim(s_stafno) == "") return false;
    var format = /^(\d{1,8})$/;
    return isValidFormatX(s_stafno, format);
}

/* ���� common.js�� �Լ��� ���������� ���. ���� ���� jsp�� �����ϴ� �Լ� */
// ���˹��ڵ� ��ȿ�� ����(���ڷθ� �̷��������)
function validate_bns_itemcd(s_cd){
    if(trim(s_cd) == "") return false;
    var format = /^(\d+)$/;
    return isValidFormatX(s_cd, format);
}

/* ���� common.js�� �Լ��� ���������� ���. ���� ���� jsp�� �����ϴ� �Լ� */
// ���ڹ�ȣ ��ȿ�� üũ
function valid_rdr_no(s_word){
  return isValidFormatX(s_word, /^(\d{9})$/);
}

/* ���� common.js�� �Լ��� ���������� ���. ���� ���� jsp�� �����ϴ� �Լ� */
// �����ڹ�ȣ ��ȿ�� üũ
function valid_prev_rdr_no(s_word){
  return isValidFormatX(s_word, /^(\d{5})$/);
}

/* ���� common.js�� �Լ��� ���������� ���. ���� ���� jsp�� �����ϴ� �Լ� */
// �����ڵ� ��ȿ�� üũ
function valid_dstc_no(s_word){
  return isValidFormatX(s_word, /^(\d{3})$/);
}

/* ���� common.js�� �Լ��� ���������� ���. ���� ���� jsp�� �����ϴ� �Լ� */
// ����+��� ��ȿ�� üũ
function valid_dstc_dlvno(s_word){
  return isValidFormatX(s_word, /^(\d{6})$/);
}

/* ���� common.js�� �Լ��� ���������� ���. ���� ���� jsp�� �����ϴ� �Լ� */
// ��ȭ��ȣ ��ȿ�� üũ
function valid_tel_no(s_word){
  return isValidFormatX(s_word, /^(\d{4}|\d{7,8}|\d{10,}|(\d{2,4})-{0,1}(\d{3,4})-{0,1}(\d{4}))$/);
}

/* ���� common.js�� �Լ��� ���������� ���. ���� ���� jsp�� �����ϴ� �Լ� */
// �ּ� ��ȿ�� üũ(�� ���ڸ��� ���ڰ� ".") �ΰ�?
function valid_addr(s_word){
  return (s_word.lastIndexOf(".") != -1 && s_word.length == s_word.lastIndexOf(".") + 1)? true : false;
}

/**
* �Է°��� ����ڰ� ������ ���� �������� üũ
* �ڼ��� format ������ �ڹٽ�ũ��Ʈ�� 'regular expression'�� ����
* common.js �� �ִ� �Լ��� �̸��� �ٲ㼭 ����.
*/
function isValidFormatX(inputStr,re) {
   if (re.test(inputStr)) {
        return true; //�ùٸ� ���� ����
   }
   return false;
}

/*************************************************************************************************/
/* 2. ���� ��� ����
 * 1)  close  : ���� MDI close ȣ��. ������(CIIS ���� MDI �ܿ��� ȣ��Ǿ��� ���) window.close() ȣ��
 * 2)  confirm : trustform ��ݿ��� confirm�Լ�.
 * 3)  checkNotFixedCell : grid click(dblclick)�� Ŭ���� cell�� fixed cell�� �ƴ� ������ �������� üũ.
 * 4)  addGroupButton : group button ����
 * 5)  getGroupButton : group button�� ����.
 * 6)  removeAllGroupButton : group �� group button �ϰ� ����
 * 7)  disableChildControl : group �� ��Ʈ���� disable �Ӽ��� �ϰ� ����
 * 8)  checkAllGridChkCol : grid���� check column�� �ϰ� ����
 * 9)  gridSubtotal : grid subtotal ó��. 
 * 10) arrangeSubTotal   : grid subtotal�� grid ����� �ƴ� ���� �����ؾ� �� ��� subtotal�� �� output�� left��ġ�� width�� grid�� �°� �������� ����.
                           grid subtotal�� grid ����� �ƴ� ���� �����ؾ� �� ��� UI �������� ���Ǹ� ���� grid column ������ �Ͼ ��� �������� �����ϴµ� ���
 * 11)  gridReadOnly      : colRef�� �̿��� grid readonly ����.
 * 12)  gridCellAttribute :  grid�� Ư�� �� ������ attribute�� ����.
 * 13)  gridCellStyle : grid�� Ư�� �� ������ style�� ����.
 * 14) clearSelectCombo  : select �� nodeset path�� �̿��Ͽ� combo�� clear�Ѵ�.
 * 15) addSelectCombo    : combo�� item �߰�.
 * 16) setSelectDefault  : select�迭 ��Ʈ�� default�� ����.
 * 17) clearGridCols     : �ش� �׸����� column�� ��� �����Ѵ�.
 * 18) buildGridCols : grid�� column�� �����Ѵ�. �������� grid�� ������ �� ���.
 * 19) addGridColumn : grid�� column�� �߰��Ѵ�.
 * 20) insertGridColumn : grid�� column�� �߰��Ѵ�. Ư�� ��ġ�� column�� ������.
 * /
/*************************************************************************************************/

/**
 * 
**/
function close()
{
   try{
      viewer("mainFrame").window.javaScript.closeMDIWindow(model.getValue("/root/initData/pageInfo/pageID"));
   }catch(e){
      window.close();
   }
}

/**
 * 
**/
function confirm(msg)
{
   return model.alert(msg, "", 4) == 6;
}

/**
 * 
**/
function checkNotFixedCell(_grid)
{
   if(typeof(_grid) == "string") _grid=document.cocheckNotFixedCellntrols("_grid");

   return _grid.mouseCol>_grid.fixedCols-1 && _grid.mouseRow>_grid.fixedRows-1
}

/**
 * _group : button�� ������ group
 * _id : button id
 * _btnGroup : button group �Ӽ�
 * _title : button caption
 * _handle : button handler
 * _props : button properties.
**/
function addGroupButton(_group, _id, _btnGroup, _title, _handler, _props)
{
   if(typeof(_group) == "string") _group = document.controls(_group);
   if(_group == null)
      return;
   
   if(document.controls(_id) != null)
      return;
      
   var btnObj=_group.createChild("xforms:button", "id:"+ _id + "; group:" + _btnGroup + "; " + _props);
   btnObj.attribute("text") = _title;										// ������ Task Button�� text
   btnObj.attribute("DOMActivate") = _handler;							// ������ Task Button�� DOMActivate �̺�Ʈ
}

/**
 * _group : group control
 * _btnGroup : button group �Ӽ�
**/
function getGroupButton(_group, _btnGroup)
{
   if(typeof(_group) == "string") _group = document.controls(_group);
   if(_group == null)
      return;
      
   var cnt = 0;
   for(var i=0; i<_group.children.length; i++)
   {
      var ctr = _group.children.item(i);
      if(ctr.elementName == "xforms:button")
         if(_btnGroup == null || _btnGroup == "" || ctr.attribute("group") == _btnGroup)
            cnt++;
   }
   
   return cnt;
}

/**
 * _group : group control
 * _btnGroup : button group �Ӽ�
**/
function removeAllGroupButton(_group, _btnGroup)
{
   if(typeof(_group) == "string") _group = document.controls(_group);
   if(_group == null)
      return;
      
   var childs = _group.children;
   if(childs == null)
      return;
      
   for(var i=childs.length-1; i>=0; i--)
   {
      var ctr = childs.item(i);
      if(ctr.elementName == "xforms:button" && ctr.attribute("group") == _btnGroup)
         _group.removeChild(ctr.attribute("id"));
   }
}

/**
 * _group : group
 * _disable : disable ��ų�� ���� true/false
 * _onlydisable : true - ��ü�� disable �Ӽ� ����. false - editable �Ӽ��� ����(select �迭�� disable ����)
**/
function disableChildControl(_group, _disable, _onlydisable)
{
   if( typeof _group == 'string' ) _group = document.controls(_group);
	var cnt = _group.children.length;

   for(i=0 ; i<cnt ; i++) {
		var ctr = _group.children.item(i);
		if(ctr.elementName=="xforms:input" || 
         ctr.elementName=="xforms:textarea" || 
         ctr.elementName=="xforms:secret")
      {
         if(_onlydisable)
            ctr.disabled = _disable;
         else
            ctr.attribute("editable") = _disable ? "false" : "true";
      }
      else if(ctr.elementName=="xforms:select" || 
              ctr.elementName=="xforms:select1" ||
              ctr.elementName=="xforms:button" )
      {
         ctr.disabled = _disable;
      }

	}
}

/**
 * _grid : grid ��ü Ȥ�� id
 * _chkcol : check column
 * _chk : check���� uncheck ���� ����. boolean. optional. ���� ���� ���� ��� ��ü�� üũ�Ǿ� �ִ� ��Ȳ������ ��ü uncheck�� �׷��� ���� ��쿡�� ��ü check.
**/
function checkAllGridChkCol(_grid, _chkcol, _chk)
{
   if(typeof(_grid) == "string")
      _grid = document.controls(_grid);
   if(_grid == null)
      return;
      
   var nodeset = _grid.attribute("nodeset");
   if(instance1.selectSingleNode(nodeset) == null)
      return;
   if(_grid.colRef(_chkcol) < 0)
      return;

   var checkvalue = _grid.colAttribute(_grid.colRef(_chkcol), "checkvalue");
   if(checkvalue == null || checkvalue.value == "" || checkvalue.indexOf(",")<0)
      return;
   
   var appVal = "";
   var chkVal = checkvalue.substring(0, checkvalue.indexOf(","));
   var unchkVal = checkvalue.substring(checkvalue.indexOf(",")+1);
   if(_chk == null)
   {
      var chklen = instance1.selectNodes(nodeset + "[" + _chkcol + "='" + chkVal + "']").length;
      var totlen = instance1.selectNodes(nodeset).length;
      if(chklen == totlen)
         appVal = unchkVal;
      else
         appVal = chkVal;
   }
   else
      appVal = _chk ? chkVal : unchkVal;

   var nodes = instance1.selectNodes(nodeset);
   for(var i=0; i<nodes.length; i++)
      if(nodes.item(i).selectSingleNode(_chkcol) != null && !_grid.isReadOnly(i+_grid.fixedRows, _grid.colRef(_chkcol)))
         nodes.item(i).selectSingleNode(_chkcol).nodeValue = appVal;
   
   _grid.refresh();
}

/**
 * _type�� null �Է½� 1) �� column�� ������ "subtotaltype" ������ �� �÷��� subtotal type�� ���� 2) �ش� �Ӽ��� ���� ��� default�� sum ����
 * _formats �� null �Է½� �� column�� ������ "format" �������� ���.
 * _grid : grid ��ü Ȥ�� id
 * _type : subtotal type (sum, average...)
 * _titlefld : "��" �� ���� subtotal ���� ������ ��ġ�� column. null ����.
 * _title : ����. null ����.
 * _fields : subtotal�� ������ column�� ref �迭. null ����. ���� column�� ������ ��ü column
 * _formats : subtotal column�� ���� �迭. null ����.
 * _style : subtotal���� ��Ÿ��. null ����.
 * 
**/
function gridSubtotal(_grid, _type, _titlefld, _title, _fields, _formats, _style)
{
   if(typeof(_grid) == "string")
      _grid = document.controls(_grid);
   if(_grid == null)
      return;

   if(_fields == null)
   {
      _fields = new Array();
      for(var i=_grid.fixedCols; i<_grid.cols; i++)
         if(_grid.colAttribute(i, "ref") != _titlefld)
            _fields[_fields.length] = _grid.colAttribute(i, "ref");
   }

   for(var i=0; i<_fields.length; i++)
      _grid.subtotal("clear", -1, _grid.colRef(_fields[i]));
   
   if(_title == null)
      _title = "";
   if(_style == null)
      _style = "";
   
   for(var i=0; i<_fields.length; i++)
   {
      var format = "";
      var type = "";
      var tmpformat = _grid.colAttribute(_grid.colRef(_fields[i]), "format");
      var tmptype = _grid.colAttribute(_grid.colRef(_fields[i]), "subtotaltype");

      if(_formats != null && _formats.length > i && _formats[i] != null)
         format = _formats[i];
      else if(tmpformat!=null && tmpformat!="")
         format = tmpformat;

      if(_type!=null && _type!="")
         type = _type;
      else if(tmptype!=null && tmptype!="")
         type = tmptype;
      else
         type = "sum";

      if(i == 0)
         _grid.subtotal(type, -1, _grid.colRef(_fields[i]), format, _style, _grid.colRef(_titlefld), _title);
      else
         _grid.subtotal(type, -1, _grid.colRef(_fields[i]), format, _style);
   }
}

/*
�׸����� subtotal�� subtotal �Լ��� ����Ͽ� ������ ���ϰ� ���������� output�� ����� ����ؾ� �� ��� ���.
�Ʒ��� ���Ǵ�� UI�� ���� �� �ش� �Լ��� ȣ���ϸ� output�� �ڵ����� ������ �ش�.
grid�� column ����� ������ ��� �̺�Ʈ���� �ش� �Լ��� ȣ���ϸ� ����� ����� �°� �����ų �� �ִ�.
** grid column�� �̵��� ��쿡�� �ٸ� �Լ��� ����ؾ� ��.
** ������ ���� ���� ��� grid������ output ������ grid�� �����ϰ� �����Ѵ�.
** grid�� onafteruserresize ���� ȣ��� ������ ������ subtotal�� scroll�� �������� �ʾ� �Ϻΰ� �������� ���� ����.
1. subtotal�� grid column ����(���̴� ����) ��ŭ�� output�� �̸� �����ϰ� �ִ� group���� �����Ǿ�� �Ѵ�.
2. �ҽ����� output ������ grid column ������ �����ؾ��Ѵ�.
3. left�� width�� ���Ƿ� ������ ���Ƶ� �ȴ�.
4. top, height�� �������� �����Ƿ� �����Ѵ�.
5. output�� ref�� �ҽ� �󿡼� output�� ������ ���� grid column�� ��ġ�Ǿ�� �Ѵ�.
 */
function arrangeSubTotal(_grid, _group)
{
   var ipts = new Array();
   for(var _i=0; _i<_group.children.length; _i++)
      if(_group.children.item(_i).elementName=="xforms:output")
         ipts[ipts.length] = _group.children.item(_i);

   _group.attribute("width") = _grid.attribute("width");
   
   var _iptidx = 0;
   var _left = 0;
   var _width = 0;
   var _iptcrt = null;
   for(var _i=0; _i<_grid.cols; _i++)
   {
      if(_grid.colHidden(_i) || _grid.colWidth(_i)<=0  || _iptidx>ipts.length-1)
         continue;
         
      _width = _grid.colWidth(_i);
      if(_iptidx==ipts.length-1 || _i==_grid.cols-1)
      {
         var gridwidth = _grid.attribute("width");
         if(gridwidth.indexOf("px")>0)
            gridwidth = gridwidth.substring(0, gridwidth.indexOf("px"));
         _width = eval(gridwidth)  - _left;
      }
         
      _iptcrt = ipts[_iptidx++];
      _iptcrt.attribute("width") = _width;
      _iptcrt.attribute("left") = _left;
      
      _left += _grid.colWidth(_i);
   }
}

/**
 * _grid : �׸��� ��ü
 * _srow : ���� row
 * _scol : ���� column
 * _erow : �� row. optional.
 * _ecol : �� column. optional.
 * _readonly : true/false
**/
function gridReadOnly(_grid, _srow, _scol, _erow, _ecol, _readonly)
{
   if(_erow==null || _erow=="")
      _erow = _srow;
   if(_ecol==null || _ecol=="")
      _ecol = _scol;
   if(_readonly == null)
      _readonly = true;

   _grid.isReadOnly(_srow, _grid.colRef(_scol), _erow, _grid.colRef(_ecol)) = _readonly;
}

/**
 * column�� ref ���� ���.
 * _grid : �׸��� ��ü
 * _att : �Ӽ���
 * _val : ��Ÿ�� ��.
 * _srow : ���� row
 * _scol : ���� column
 * _erow : �� row. optional.
 * _ecol : �� column. optional.
**/
function gridCellAttribute(_grid, _att, _val, _srow, _scol, _erow, _ecol)
{
   if(_erow==null || _erow=="")
      _erow = _srow;
   if(_ecol==null || _ecol=="")
      _ecol = _scol;

   _grid.cellattribute(_att, _srow, _grid.colRef(_scol), _erow, _grid.colRef(_ecol)) = _val;
}

/**
 * column�� ref ���� ���.
 * _grid : �׸��� ��ü
 * _style : ��Ÿ�� �Ӽ���
 * _val : ��Ÿ�� ��.
 * _srow : ���� row
 * _scol : ���� column
 * _erow : �� row. optional.
 * _ecol : �� column. optional.
**/
function gridCellStyle(_grid, _style, _val, _srow, _scol, _erow, _ecol)
{
   if(_erow==null || _erow=="")
      _erow = _srow;
   if(_ecol==null || _ecol=="")
      _ecol = _scol;

   _grid.cellStyle(_style, _srow, _grid.colRef(_scol), _erow, _grid.colRef(_ecol)) = _val;
}

/* 
area combo clear. combo�� nodeset�� item level�̾�� ��.
combo : combo ��ü
defaultLabel : default label�� �ʿ��� ��� ���� �־��ش�. null�� ��� nodeset�� ���� ������ �ʴ´�.
defaultValue : default label�� �ش��ϴ� value
refresh : refresh����
*/
function clearSelectCombo(combo, defautLabel, defaultValue, refresh)
{
   var nodeset = combo.choices.itemset.attribute("nodeset");
   var path = nodeset.lastIndexOf("/") > 0 ? nodeset.substring(0, nodeset.lastIndexOf("/")) : nodeset;
   var item = nodeset.lastIndexOf("/") > 0 ? nodeset.substring(nodeset.lastIndexOf("/")+1) : "";;
   var label = combo.choices.itemset.label.attribute("ref");
   var value = combo.choices.itemset.value.attribute("ref");

   remakeNode(path);

   if(defautLabel != null)
   {
      model.makeNode(nodeset);
      model.makeNode(nodeset + "/" + label);
      model.makeNode(nodeset + "/" + value);

      model.setValue(nodeset + "/" + label, defautLabel);
      model.setValue(nodeset + "/" + value, defaultValue == null ? "" : defaultValue);
   }

   if(refresh == null)
      refresh = true;

   if(refresh)
   {
      combo.refresh();
      combo.select(0);
   }
}

/* 
combo item �߰� 
combo : combo ��ü
label : label
value : value
refresh : refresh����
*/
function addSelectCombo(combo, labelVal, valueVal, refresh)
{
   var nodeset = combo.choices.itemset.attribute("nodeset");
   var path = nodeset.lastIndexOf("/") > 0 ? nodeset.substring(0, nodeset.lastIndexOf("/")) : nodeset;
   var item = nodeset.lastIndexOf("/") > 0 ? nodeset.substring(nodeset.lastIndexOf("/")+1) : "";;
   var label = combo.choices.itemset.label.attribute("ref");
   var value = combo.choices.itemset.value.attribute("ref");

   if(instance1.selectNodes(nodeset).length == 0)
      model.makeNode(nodeset);
   else
      model.duplicate(path, nodeset);
   var idx = instance1.selectNodes(nodeset).length;
   
   if(instance1.selectNodes(nodeset + "[" + idx + "]/" + label).length == 0)
      model.makeNode(nodeset + "[" + idx + "]/" + label);
   if(instance1.selectNodes(nodeset + "[" + idx + "]/" + value).length == 0)
      model.makeNode(nodeset + "[" + idx + "]/" + value);
   model.setValue(nodeset + "[" + idx + "]/" + label, labelVal);
   model.setValue(nodeset + "[" + idx + "]/" + value, valueVal);

   if(refresh)
   {
      combo.refresh();
      combo.select(combo.length-1);
   }
}

/**
 * select, select1 �迭 ��Ʈ���� default �� ����.
 * _selctr : select �迭 ��Ʈ�� id Ȥ�� ��ü
 * _defaultVal : defaut ��. null�� ��� _defaultIdx�� ����.
 * _defaultIdx : default ���� �������� ���� ��� ������ item index. null Ȥ�� �������� ��� �������� �ʴ´�.
 * _refresh : �ش� ��Ʈ�� refresh ����.
**/
function setSelectDefault(_selctr, _defaultVal, _defaultIdx, _refresh)
{
   if(typeof(_selctr) == "string")
      _selctr = document.controls(_selctr);
   if(_selctr == null)
      return;

   var val = null;
   var ref = _selctr.attribute("ref");
   if(instance1.selectNodes(ref).length == 0)
      return;

   if(_defaultVal != null)
   {
      for(var i=0; i<_selctr.length; i++)
         if(_selctr.item(i).value == _defaultVal)
         {
            val = _defaultVal;
            break;
         }

      if(_selctr.length == 0 && _selctr.children("choices").children("itemset") != null)
      {
         var nodeset = _selctr.children("choices").children("itemset").attribute("nodeset");
         if(_selctr.children("choices").children("itemset").children("value") != null)
         {
            var valref = _selctr.children("choices").children("itemset").children("value").attribute("ref");
            var node = instance1.selectSingleNode(nodeset + "[" + valref + "='" + _defaultVal + "']/" + valref);
            if(node != null)
               val = node.nodeValue;
         }
      }
   }
   
   if(_defaultIdx != null && _defaultIdx >= 0)
   {
      if(_selctr.length > 0 && _defaultIdx < _selctr.length)
         val = _selctr.item(_defaultIdx).value;
      else
      {
         var nodeset = _selctr.children("choices").children("itemset").attribute("nodeset");
         if(_selctr.children("choices").children("itemset").children("value") != null)
         {
            var valref = _selctr.children("choices").children("itemset").children("value").attribute("ref");
            var node = instance1.selectSingleNode(nodeset + "[" + (_defaultIdx+1) + "]" + "/" + valref);
            if(node != null)
               val = node.nodeValue;
         }
      }
   }

   if(val != null)
      model.setValue(ref, val);
   if(_refresh)
      _selctr.refresh();
}

/**
 * �׸����� ��� column�� ����
 * _grid : grid id Ȥ�� ��ü
 * _refresh : refresh ����
**/
function clearGridCols(_grid, _refresh)
{
   if( typeof _grid == 'string' ) _grid = document.controls(_grid);
   if(_grid.cols == null)
      return;

   var len = _grid.cols;
   var nodeset = _grid.attribute("nodeset");

   if( typeof _grid == 'string' ) _grid = document.controls(_grid);

   for(var i=len; i>0; i--)
   {
      _grid.deleteColumn(i-1, false);
   }

   //node���� �����ϸ� ���� �߻�.
   model.removeNodeset(nodeset);

   if(_refresh)
      _grid.refresh();
}

/*
_grid : grid id
_captionSet : "^"�� ���ҵ� ���ڿ�. "^"�� ���ҵ� ���ڿ��� ��� �־��� ���� ��ŭ grid�� �տ������� caption�� ä���. null ����.
_caption : column �� caption prefix/suffix. _captionSet �ܿ� �ϰ������� ���� caption pre/suf
_prefix : _caption�� caption���� prefix���� suffix ���� ���� (caption1, caption2... Ȥ�� 1caption, 2caption... �� ������ ����)
_refresh : ���� �� refresh ����
_dataset : grid�� dataset �Ӽ� ��. (record���ر���)
_type : column�� type �Ӽ� ��. (output �ܿ��� �ʿ信 ���� �߰����� �Ӽ� Ȥ�� child ���� �ʿ�.
_width : column width �Ӽ� ��.
_txtAlign : column align �Ӽ� ��.
 */
function buildGridCols(_grid, _captionSet, _caption, _idxStart, _prefix, _refresh, _dataset, _type, _width, _txtAlign)
{
   if( typeof _grid == 'string' ) _grid = document.controls(_grid);

   if(instance1.selectSingleNode(_dataset) == null)
      return;

   var refNodes = instance1.selectSingleNode(_dataset).childNodes;
   var caption="";
   var capSetNo = 0;

   if(_caption == null || _caption == "")
      _caption = "caption";

   if(_captionSet.indexOf("^") > 0)
      capSetNo = _captionSet.split("^").length;
   else if(_captionSet.length > 0)
      capSetNo = 1;
   else if(_captionSet == null)
      _captionSet = "";

   if(_idxStart == null)
      _idxStart = 0;

   //caption �� ���ڿ��� �ִ¼��� column ����.
   //_grid.caption="";

   var idx = _idxStart;
   caption += _captionSet + "^";
   for(var i=0; i<refNodes.length; i++)
   {
      var node = refNodes.item(i);
      
      if(capSetNo <= i)
      {
         if(_prefix)
            caption += _caption + (idx) + "^";
         else
            caption += "" + (idx) + _caption + "^";

         idx++;
      }

      addGridColumn(_grid, false, node.nodeName, _type, _width, _txtAlign)
   }
   if(caption.lastIndexOf("^") == (caption.length - "^".length))
      caption = caption.substring(0, caption.lastIndexOf("^"));

   _grid.caption=caption;

   if(_refresh)
      _grid.refresh();
}

/*
_grid : grid id
_refresh : ���� �� refresh ����
_ref : column�� ref �Ӽ� ��.
_type : column�� type �Ӽ� ��. (output �ܿ��� �ʿ信 ���� �߰����� �Ӽ� Ȥ�� child ���� �ʿ�.
_width : column width �Ӽ� ��.
_txtAlign : column align �Ӽ� ��.
 */
function addGridColumn(_grid, _refresh, _ref, _type, _width, _txtAlign)
{
   if( typeof _grid == 'string' ) _grid = document.controls(_grid);

   var prop = "ref:"+_ref;
   if(_type != null && _type != "")
      prop += "; type:"+_type;
   if(_txtAlign != null && _txtAlign != "")
      prop += "; text-align:"+_txtAlign;

   if(_refresh == null || _refresh=="")
      _refresh = false;

   _grid.addColumn(prop, _refresh);

   if(_width!=null && _width!="")
      _grid.colWidth(_grid.colRef(_ref)) = _width;
}

/*
_grid : grid id
_idx : column�� ������ ��ġ index.
_before : _idx�� �� Ȥ�� �ڿ� �������� ����.
_refresh : ���� �� refresh ����
_ref : column�� ref �Ӽ� ��.
_type : column�� type �Ӽ� ��. (output �ܿ��� �ʿ信 ���� �߰����� �Ӽ� Ȥ�� child ���� �ʿ�.
_width : column width �Ӽ� ��.
 */
function insertGridColumn(_grid, _idx, _before, _refresh, _ref, _type, _width)
{
   if( typeof _grid == 'string' ) _grid = document.controls(_grid);

   var prop = "ref:"+_ref;
   if(_type != null && _type != "")
      prop += ":type:"+_type;

   //"before" or "after"
   if(_before == null || _before == "")
      _before = "before";

   if(_refresh == null || _refresh=="")
      _refresh = false;

   _grid.insertColumn(_idx, prop, _before, _refresh);

   if(_width!=null && _width!="")
      _grid.colWidth(_grid.colRef(_ref)) = _width;
}

/*************************************************************************************************/
/* 3. TrustForm ���� Util �Լ�
 * 1)  curCellValue  	 : param1 �ش� �׸����� ���õ� cell �� ��
 * 2)  setCurCellValue   : �� �Լ��� set ����
 * 3)  curRowRefColValue : param1 �׸���󿡼� ���� ���õ� row�� param2�� ref�� ������ column�� ��.
 * 4)  setCurRowRefColValue : �� �Լ��� set ����
 * 5)  gridRefColValue   : param1 �׸���󿡼� param2 row�� param3�� ref�� ������ column�� ��. 
 * 6)  setGridRefColValue : �� �Լ��� set ����
 * 7)  modelCopyValue    : param2 path�� ���� param1 path�� ����
 * 8)  modelCopyXpathValue : param2 �� xpath �Լ��� ����Ͽ� param1�� ����
 * 9)  remakeNode        : ��带 �����ϰ� �ٽ� �����.
 * 10)  makeCopyNode      : ��带 �����ϰ� ���� copy�� �´�.
 * 11)  makeValueNode     : ��带 �����ϰ� ���� �����Ѵ�.
 * 12) childValueCopy    : param2 path�� ��� ���� ��� ���� param1 path�� ������忡 ���� �Ѵ�. param1�� ���� ���� skip
 * 13) gridRowValueCopy  : grid�� Ư�� ���� ��忡 ����
 * 14) gridRowCopyToOpener : grid�� Ư�� ���� opener�� ��忡 ����
 * 15) setNodesetValue : ���¿� �ϰ������� ������ ���� ����
 * 16)  makeNodesetToForm : nodeset�� ���忡 ����� form ���·� ����. parameter�̸��� index�� �ٿ��� ����.
 * 17)  makeNodesetToFormNamed : nodeset�� ���忡 ����� form ���·� ����. �ʵ带 ������ �� �ִ�.
 * 18) makeNodesetToArrayForm : nodeset�� ���忡 ����� form ���·� ����. ���ϸ��� �迭 ���·� ����.
 * 19) makeNodesetToArrayFormNamed : �ʵ带 ������ �� �ִ�.
 * 20) makeNodesetToAppendForm : nodeset�� ���忡 ����� form ���·� ����. �ʵ��ϳ��� �ϳ��� parameter�� �����ϰ� ���� delim���� �ٿ��� ����.
 * 21) makeNodesetToAppendFormNamed : �ʵ带 ������ �� �ִ�.
 * 22) makeNodesetWithoutDisabled : ������ �����ϰ�, disabled�� ��Ʈ�ѿ� �ش��ϴ� ��带 �����Ѵ�. disabled�� ��Ʈ���� ���� ������ ���޵��� �ʵ��� ��.
 * 23) makeNodesetSelectToArray : ���������� ������ select�迭 ��Ʈ���� ���� �����Ͽ� �������� ��ȯ. html checkbox ó�� ���� ������ ���޵ǵ��� �ϱ� ����.
 * 24) makeNodesetBasedOnCtrl : ���� makeNodesetWithoutDisabled, makeNodesetSelectToArray�� ��� ��ħ.
 * 25) splitNodeToNodes : ����� ���� �����ڷ� ����Ǿ� ���� ��� �ش� ���� �����Ͽ� �������� ��ȯ.
 * 26) clearChildNodes   : ���� ����� ���� ���ڿ��� setting.
 * 27) clearChildControl : ���� ��Ʈ�ѵ��� ���� ���ڿ��� setting.
 * 28) resetChildControl : ���� ������� ������ �ʱ�ȭ��. input="", select(0), disabled = false, 
 * 29) concatSelectValues : select �迭 ��Ʈ���� dataset������ �����ڸ� �̿��Ͽ� �ϳ��� ���ڿ��� ��ģ��.
 * 30) concatNodesetValues : �ش� xpath�� �ش��Ѵ� nodeset ���� �����ڸ� �̿��Ͽ� �ϳ��� ���ڿ��� ��ģ��.
 * 31) concatNodeChildValues : �ش� xpath�� �ش��ϴ� mnode�� child node�� ���� ���Ѵ�.
 * 32) concatGridColValues : �׸����� Ư�� ���� ���� �����ڸ� �̿��Ͽ� �ϳ��� ���ڿ��� ��ģ��. üũ�ڽ� �÷��� �̿��Ͽ� ���Կ��θ� ������ �� �ִ�.
 */
/*************************************************************************************************/

/**
 * �׸����� ���� ��, ���� ���� �� return
**/
function curCellValue(_grid)
{
   return _grid.valueMatrix(_grid.row, _grid.col);
}

/**
 * �׸����� ���� ��, ���� ���� �� ����.
**/
function setCurCellValue(_grid, _val)
{
   _grid.valueMatrix(_grid.row, _grid.col) = _val;
}

/**
 * �׸����� ���� �� (grid.row) �� Ư�� ref�� ������ ���� �� ������
**/
function curRowRefColValue(_grid, _ref)
{
   return _grid.valueMatrix(_grid.row, _grid.colRef(_ref));
}

/**
 * �׸����� ���� �� (grid.row) �� Ư�� ref�� ������ ���� �� ����.
**/
function setCurRowRefColValue(_grid, _ref, _val)
{
   _grid.valueMatrix(_grid.row, _grid.colRef(_ref)) = _val;
}

/**
 * �׸����� Ư�� ���� Ư�� ref�� ������ ���� ���� ������
**/
function gridRefColValue(_grid, _row, _ref)
{
	return _grid.valueMatrix(_row, _grid.colRef(_ref));
}

/**
 * �׸����� Ư�� ���� Ư�� ref�� ������ ���� ���� ����
**/
function setGridRefColValue(_grid, _row, _ref, _val)
{
	_grid.valueMatrix(_row, _grid.colRef(_ref)) = _val;
}

/**
 * �� ����. ��� -> ���
**/
function modelCopyValue(_tar, _src)
{
	model.setValue(_tar, model.getValue(_src));
}

/**
 * xpath �Լ� ���� ����� Ÿ�ٿ� ����.
 * _tar : target node path
 * _xpath : xpath �Լ��� ������ source path
**/
function modelCopyXpathValue(_tar, _xpath)
{
   model.setValue(_tar, model.getXPathValue(_xpath));
}

/**
 * ��带 ���� �� ����.
**/
function remakeNode(_xpath)
{
	model.removeNodeset(_xpath);
	model.makeNode(_xpath);
}

/**
 * ��带 ������ �� ���� ����.
 * _tarPath : target node path
 * _srcPath : source node path
**/
function makeCopyNode(_tarPath, _srcPath)
{
	model.makeNode(_tarPath);
	model.setValue(_tarPath, model.getValue(_srcPath));
}

/**
 * ��带 ������ �� ���� ����.
 * _tarPath : Ÿ�� ��� path
 * _val : ��
**/
function makeValueNode(_tarPath, _val)
{
	model.makeNode(_tarPath);
	model.setValue(_tarPath, _val);
}

/**
 * ����� ��� ���� ��� ���� Ÿ���� ���� ��忡 ����. ������ ��쿡�� ����.
 * _tar : target node path
 * _src : source node path
**/
function childValueCopy(_tar, _src)
{
   var _tarNode = instance1.selectSingleNode(_tar);
   var _srcNode = instance1.selectSingleNode(_src);
   
   if(_tarNode == null || _srcNode == null)
      return;
   
   var _srcChilds = _srcNode.childNodes;
   for(var _i=0; _srcChilds!=null && _i<_srcChilds.length; _i++)
   {
      var _srcChild = _srcChilds.item(_i);
      var _tarChild = _tarNode.selectSingleNode(_srcChild.nodeName);
      if(_tarChild != null)
         _tarChild.nodeValue = _srcChild.nodeValue;
   }
}

/**
 * �׸����� Ư�� ���� Ư�� ���� ����
 * _tar : ���� ��� ��� path
 * _grid : ���� ��� grid
 * _row : ���� ��� grid row
**/
function gridRowValueCopy(_tar, _grid, _row)
{
   if(typeof(_grid) == "string")
      _grid = document.controls(_grid);

   if(_grid == null)
      return;
   
   var tarnode = instance1.selectSingleNode(_tar);
   if(tarnode == null)
      return;
      
   for(var cidx=0; cidx<_grid.cols; cidx++)
   {
      var ref = _grid.colAttribute(cidx, "ref");
      var child = tarnode.selectSingleNode(ref);
      if(child != null)
         child.nodeValue = _grid.valueMatrix(_row, cidx);
   }
}

/**
 * �׸����� Ư�� ���� ���� â�� ������ opener�� Ư�� ���� ����
 * _tar : ���� ��� ��� path
 * _grid : ���� ��� grid
 * _row : ���� ��� grid row
**/
function gridRowCopyToOpener(_tar, _grid, _row)
{
   if(typeof(_grid) == "string")
      _grid = document.controls(_grid);

   if(_grid == null)
      return;

   opener.model.removenode(_tar);
   opener.model.makeNode(_tar);

   for(var cidx=0; cidx<_grid.cols; cidx++)
   {
      var ref = _grid.colAttribute(cidx, "ref");
      
      opener.model.makeNode(_tar + "/" + ref);
      opener.model.setValue(_tar + "/" + ref, _grid.valueMatrix(_row, cidx));
   }
}

/**
 * _xpath : ���� path
 * _val : value
**/
function setNodesetValue(_xpath, _val)
{
   var nodeset = instance1.selectNodes(_xpath);
   for(var i=0; nodeset!=null && i<nodeset.length; i++)
      nodeset.item(i).value = _val;
}

/**
 * ������ �ݺ��� �ʵ� ������ �ϳ��� ���Ʒ��� �������� �̸����� �籸���Ѵ�.  (�׸��� �����͸� ������ �����ϴ� ��쿡 ��� �����ϴ�.)
 * ��)
   <record>     ------->     <newnode>
    <a>a</a>                  <a0>a</a0>
    <b>b</b>                  <b0>b</b0>
   </record>                  <a1>c</a1>
   <record>                   <b1>d</b1>
    <a>c</a>                 </newnode> 
    <b>d</b>
   </record>
 * _srcNodesetPath : record ���������� path
 * _tarPath : ���� ������� ���.
 */
function makeNodesetToForm(_srcNodesetPath, _tarPath)
{
	var fileds = instance1.selectSingleNode(_srcNodesetPath).childNodes;
	var fieldArr = new Array();
	for(var i=0; i<fileds.length; i++)
		fieldArr[fieldArr.length] = fileds.item(i).nodeName;
	
	makeNodesetToFormNamed(_srcNodesetPath, _tarPath, fieldArr);
}

/**
 * ������ �ݺ��� �ʵ� ������ �ϳ��� ���Ʒ��� �������� �̸����� �籸���Ѵ�.
 * ������ Ư�� ����� ������ �����Ѵ�.
 * _srcNodesetPath : record ���������� path
 * _tarPath : ���� ������� ���.
 * _fieldArr : �ʵ带 �迭�� �����Ѵ�. ���� �̸��� �ű� �̸��� �迭�� �ѱ� ��� (���� 2�� �迭) �̸��� �����ؼ� ���� ����.
**/
function makeNodesetToFormNamed(_srcNodesetPath, _tarPath, _fieldArr)
{
	var nlen = instance1.selectNodes(_srcNodesetPath).length;

   remakeNode(_tarPath);

	for(var i=0; i<nlen; i++)
	{
		for(var j=0; _fieldArr!=null && j<_fieldArr.length; j++)
		{
			var nameset = _fieldArr[j];
			if(nameset!=null)
			{
				var nodeName = null;
				var newName = null;

				if(typeof(nameset) == 'object')
				{
					nodeName = nameset[0];
					newName = nameset[1];								
				}
				else
				{
					nodeName = nameset;
					newName = nameset;
				}

				if(nodeName!=null)
				{
					if(newName == null)
						newName = nodeName;
					model.makeNode(_tarPath + "/" + newName + i);
					model.setValue(_tarPath + "/" + newName + i, model.getValue(_srcNodesetPath + "[" + (i+1) + "]/" + nodeName));
				}
			}
		}
	}
}

/**
 * ������ �ݺ��� �ʵ� ������ �ϳ��� ���Ʒ��� ���ϸ��� ���� �ߺ��ؼ� �����Ѵ�.  (�׸��� �����͸� ������ �����ϴ� ��쿡 ��� �����ϴ�.)
 * http�� post�� ������ ��� �迭�� �ްԵȴ�. ������ ��� ���� ��忡 ���� �����Ѵ�.
 * ��)
   <record>     ------->     <newnode>
    <a>a</a>                  <a>a</a>
    <b>b</b>                  <b>b</b>
   </record>                  <a>c</a>
   <record>                   <b>d</b>
    <a>c</a>                 </newnode> 
    <b>d</b>
   </record>
 * _srcNodesetPath : record ���������� path
 * _tarPath : ���� ������� ���.
 * _chkField : checkbox �ʵ��� ref node
 * _chkVal : check ���θ� �����ϴ� ��.
 * _notremake : target node�� ���� ������ ����.
 */
function makeNodesetToArrayForm(_srcNodesetPath, _tarPath, _chkField, _chkVal, _notremake)
{
	var fileds = instance1.selectSingleNode(_srcNodesetPath).childNodes;
	var fieldArr = new Array();
	for(var i=0; i<fileds.length; i++)
		fieldArr[fieldArr.length] = fileds.item(i).nodeName;
	
	makeNodesetToArrayFormNamed(_srcNodesetPath, _tarPath, _chkField, _chkVal, fieldArr, _notremake);
}

/**
 * ������ �ݺ��� �ʵ� ������ �ϳ��� ���Ʒ��� ���ϸ��� ���� �ߺ��ؼ� �����Ѵ�. http�� post�� ������ ��� �迭�� �ްԵȴ�. 
 * ������ Ư�� ����� ������ �����Ѵ�.
 * _srcNodesetPath : record ���������� path
 * _tarPath : ���� ������� ���.
 * _chkField : checkbox �ʵ��� ref node
 * _chkVal : check ���θ� �����ϴ� ��.
 * _notremake : target node�� ���� ������ ����.
 * _fieldArr : �ʵ带 �迭�� �����Ѵ�. ���� �̸��� �ű� �̸��� �迭�� �ѱ� ��� (���� 2�� �迭) �̸��� �����ؼ� ���� ����.
 * _notremake : Ÿ�� ��带 ���� ������ �� ����.
 */
function makeNodesetToArrayFormNamed(_srcNodesetPath, _tarPath, _chkField, _chkVal, _fieldArr, _notremake)
{

	var nlen = instance1.selectNodes(_srcNodesetPath).length;

   if(_notremake)
   {
      if(instance1.selectNodes(_tarPath).length == 0)
         model.makeNode(_tarPath);
   }
   else
      remakeNode(_tarPath);

   var idx=1;
	for(var i=0; i<nlen; i++)
	{
      if(_chkField != null && _chkField != "")
      {
         var _chk = model.getValue(_srcNodesetPath + "[" + (i+1) + "]/" + _chkField);
         if(_chk != _chkVal)
            continue;
      }

		for(var j=0; _fieldArr!=null && j<_fieldArr.length; j++)
		{
			var nameset = _fieldArr[j];
			if(nameset!=null)
			{
				var nodeName = null;
				var newName = null;

            //�����ؾ��� �ʵ���� �����ʵ�� ���ο��ʵ���� array�� �ѱ� �� �ִ�.
				if(typeof(nameset) == 'object')
				{
					nodeName = nameset[0];
					newName = nameset[1];								
				}
				else
				{
					nodeName = nameset;
					newName = nameset;
				}

				if(nodeName!=null)
				{
               if(newName == null)
                  newName = nodeName;

               //check�ʵ�� index �������� ������.
               if(nodeName == _chkField)
               {
                  model.makeNode(_tarPath + "/" + newName + "[" + idx + "]");
                  model.setValue(_tarPath + "/" + newName + "[" + idx + "]", idx-1);
               }
               //�׿� �ʵ�� �ش��ϴ� ��.
               else
               {
                  model.makeNode(_tarPath + "/" + newName + "[" + idx + "]");
                  model.setValue(_tarPath + "/" + newName + "[" + idx + "]", model.getValue(_srcNodesetPath + "[" + (i+1) + "]/" + nodeName));
               }
				}
			}
		}

      idx++;
	}
}

/**
 * ������ �ݺ��� �ʵ� ������ �ϳ��� �ʵ忡 �����ڷ� ��ģ��. (�׸��� �����͸� ������ �����ϴ� ��쿡 ��� �����ϴ�.)
 * ������ ��� ���� ��忡 ���� �����Ѵ�.
 * ��) ������ : ##, ������ ������ ����.
   <record>     ------->     <newnode>
    <a>a</a>                  <a>a##c</a>
    <b>b</b>                  <b>b##d</b>
   </record>                 </newnode>
   <record>
    <a>c</a>
    <b>d</b>
   </record>
 * _srcNodesetPath : �ҽ� node xpath
 * _tarPath : Ÿ�� node xpath
 * _chkField : checkbox �ʵ��� ref node. optional
 * _chkVal : check ���θ� �����ϴ� ��.
 * _delim : ������
 * _exclud : ������ �����ڸ� �������� ������ ������
**/
function makeNodesetToAppendForm(_srcNodesetPath, _tarPath, _chkField, _chkVal, _delim, _exclud)
{
	var fileds = instance1.selectSingleNode(_srcNodesetPath).childNodes;
	var fieldArr = new Array();
	for(var i=0; i<fileds.length; i++)
		fieldArr[fieldArr.length] = fileds.item(i).nodeName;

	makeNodesetToAppendFormNamed(_srcNodesetPath, _tarPath, _chkField, _chkVal, _delim, _exclud, fieldArr);
}

/**
 * ������ �ݺ��� �ʵ� ������ �ϳ��� �ʵ忡 �����ڷ� ��ģ��. ������ Ư�� ����� ������ �����Ѵ�.
 * _srcNodesetPath : �ҽ� node xpath
 * _tarPath : Ÿ�� node xpath
 * _chkField : checkbox �ʵ��� ref node. optional
 * _chkVal : check ���θ� �����ϴ� ��.
 * _delim : ������
 * _exclud : ������ �����ڸ� �������� ������ ������
 * _fieldArr : ��� �ʵ���� ������ �迭. ���� �̸��� �ű� �̸��� �迭�� �ѱ� ��� (���� 2�� �迭) �̸��� �����ؼ� ���� ����.
**/
function makeNodesetToAppendFormNamed(_srcNodesetPath, _tarPath, _chkField, _chkVal, _delim, _exclud, _fieldArr)
{
   var nlen = instance1.selectNodes(_srcNodesetPath).length;
   var flen = 0;
   var vstr = null;

   remakeNode(_tarPath);

   if(_fieldArr==null || _fieldArr.length==0)
      return;

   flen = _fieldArr.length;
   vstr = new Array(flen);
   for(var i=0; i<vstr.length; i++)
      vstr[i] = "";
   
	for(var i=0; i<nlen; i++)
	{
      if(_chkField != null && _chkField != "")
      {
         var _chk = model.getValue(_srcNodesetPath + "[" + (i+1) + "]/" + _chkField);
         if(_chk != _chkVal)
            continue;
      }

		for(var j=0; _fieldArr!=null && j<_fieldArr.length; j++)
		{
			var nameset = _fieldArr[j];
			if(nameset!=null)
			{
            var nodeName = null;
				
            //�����ؾ��� �ʵ���� �����ʵ�� ���ο��ʵ���� array�� �ѱ� �� �ִ�.
				if(typeof(nameset) == 'object')
					nodeName = nameset[0];
				else
					nodeName = nameset;

            if(nodeName != null)
               vstr[j] += model.getValue(_srcNodesetPath + "[" + (i+1) + "]/" + nodeName) + _delim;
			}
		}
	}

   for(var j=0; _fieldArr!=null && j<_fieldArr.length; j++)
   {
      var nameset = _fieldArr[j];
      if(nameset!=null)
      {
         var newName = null;
         
         //�����ؾ��� �ʵ���� �����ʵ�� ���ο��ʵ���� array�� �ѱ� �� �ִ�.
         if(typeof(nameset) == 'object')
            newName = nameset[1];
         else
            newName = nameset;

         if(newName != null)
         {
            var str = vstr[j] == null ? "" : vstr[j];
            if(_exclud && vstr[j].lastIndexOf(_delim)>=0)
               str = str.substring(0, str.lastIndexOf(_delim))

            model.makeNode(_tarPath + "/" + newName);
            model.setValue(_tarPath + "/" + newName, str);
         
         }
      } 
   }
}

/**
 * ������ �ݺ��� �ʵ� ������ �ϳ��� �ʵ忡 �����ڷ� ��ģ��. (�׸��� �����͸� ������ �����ϴ� ��쿡 ��� �����ϴ�.)
 * ������ ��� ���� ��忡 ���� �����Ѵ�.
 * ��) ������ : ##, ������ ������ ����.
   <record>     ------->     <newnode>
    <a>a</a>                  <a>a##c</a>
    <b>b</b>                  <b>b##d</b>
   </record>                 </newnode>
   <record>
    <a>c</a>
    <b>d</b>
   </record>
 * _srcNodesetPath : �ҽ� node xpath
 * _tarPath : Ÿ�� node xpath
 * _delim : ������
 * _exclud : ������ �����ڸ� �������� ������ ������
**/
function makeNodesetToAppendForm_noChk(_srcNodesetPath, _tarPath, _delim, _exclud)
{
	var fileds = instance1.selectSingleNode(_srcNodesetPath).childNodes;
	var fieldArr = new Array();
	for(var i=0; i<fileds.length; i++)
		fieldArr[fieldArr.length] = fileds.item(i).nodeName;

	makeNodesetToAppendFormNamed_noChk(_srcNodesetPath, _tarPath, _delim, _exclud, fieldArr);
}

/**
 * ������ �ݺ��� �ʵ� ������ �ϳ��� �ʵ忡 �����ڷ� ��ģ��. ������ Ư�� ����� ������ �����Ѵ�.
 * _srcNodesetPath : �ҽ� node xpath
 * _tarPath : Ÿ�� node xpath
 * _delim : ������
 * _exclud : ������ �����ڸ� �������� ������ ������
 * _fieldArr : ��� �ʵ���� ������ �迭. ���� �̸��� �ű� �̸��� �迭�� �ѱ� ��� (���� 2�� �迭) �̸��� �����ؼ� ���� ����.
**/
function makeNodesetToAppendFormNamed_noChk(_srcNodesetPath, _tarPath, _delim, _exclud, _fieldArr)
{
   var nlen = instance1.selectNodes(_srcNodesetPath).length;
   var flen = 0;
   var vstr = null;

   remakeNode(_tarPath);

   if(_fieldArr==null || _fieldArr.length==0)
      return;

   flen = _fieldArr.length;
   vstr = new Array(flen);
   for(var i=0; i<vstr.length; i++)
      vstr[i] = "";
   
	for(var i=0; i<nlen; i++)
	{   

		for(var j=0; _fieldArr!=null && j<_fieldArr.length; j++)
		{
			var nameset = _fieldArr[j];
			if(nameset!=null)
			{
            var nodeName = null;
				
            //�����ؾ��� �ʵ���� �����ʵ�� ���ο��ʵ���� array�� �ѱ� �� �ִ�.
				if(typeof(nameset) == 'object')
					nodeName = nameset[0];
				else
					nodeName = nameset;

            if(nodeName != null)
               vstr[j] += model.getValue(_srcNodesetPath + "[" + (i+1) + "]/" + nodeName) + _delim;
			}
		}
	}

   for(var j=0; _fieldArr!=null && j<_fieldArr.length; j++)
   {
      var nameset = _fieldArr[j];
      if(nameset!=null)
      {
         var newName = null;
         
         //�����ؾ��� �ʵ���� �����ʵ�� ���ο��ʵ���� array�� �ѱ� �� �ִ�.
         if(typeof(nameset) == 'object')
            newName = nameset[1];
         else
            newName = nameset;

         if(newName != null)
         {
            var str = vstr[j] == null ? "" : vstr[j];
            if(_exclud && vstr[j].lastIndexOf(_delim)>=0)
               str = str.substring(0, str.lastIndexOf(_delim))

            model.makeNode(_tarPath + "/" + newName);
            model.setValue(_tarPath + "/" + newName, str);
            
         }
      } 
   }
}

/**
 * disabled control�� �����Ͽ� instance�� ����. 
 * html�� disabled��ü�� ������ form�� ������ ������ �����ϱ� ����.
 * upload control�� ó������ ����.
 * _formPath : ���� ��� xpath
 * _ctrGroup : _formPath�� ����ϴ� ��Ʈ���� ��� �ִ� group
 * _newForm : ������ Ÿ�� ��� xpath
**/
function makeNodesetWithoutDisabled(_formPath, _ctrGroup, _newForm)
{
   if(instance1.selectNodes(_formPath).length == 0)
      return;
   if(typeof(_ctrGroup) == "string")
      _ctrGroup = document.controls(_ctrGroup);
   if(_ctrGroup == null)
      return;
      
   remakeNode(_newForm);
   model.copyNode(_newForm, _formPath);
   
   for(var i=0; i<_ctrGroup.children.length; i++)
   {
      var ctr = _ctrGroup.children.item(i);
      if(ctr.disabled)
      {
         var ref = ctr.attribute("ref");
         if(ref.indexOf(_formPath) != 0)
            continue;
         model.removenode(_newForm + ref.substring(_formPath.length));
      }
   }
}

/**
 * TrustForm�� select�迭��Ʈ��(check, list)�� Html ��ü(check, multi select)�� ������ ������� �����ϱ� ���� �迭�� ��������.
 * �⺻������ select�迭�� ref �Ӽ��� ������ ������ ����Ͽ� �迭�� ����.
 * select�� rel �Ӽ�(���������) �� ��Ʈ path�� �����Ǿ� ���� ���, rel ���� �迭 ����.
 * _formPath : ���� ��� xpath
 * _ctrGroup : _formPath�� ����ϴ� ��Ʈ���� ��� �ִ� group
 * _newForm : ������ Ÿ�� ��� xpath
**/
function makeNodesetSelectToArray(_formPath, _ctrGroup, _newForm)
{
   if(instance1.selectNodes(_formPath).length == 0)
      return;
   if(typeof(_ctrGroup) == "string")
      _ctrGroup = document.controls(_ctrGroup);
   if(_ctrGroup == null)
      return;
      
   remakeNode(_newForm);
   model.copyNode(_newForm, _formPath);
   
   for(var i=0; i<_ctrGroup.children.length; i++)
   {
      var ctr = _ctrGroup.children.item(i);
      if(ctr.elementName == "xforms:select")
      {
         var ref = ctr.attribute("ref");
         var delim = ctr.attribute("sep");
         var rel = ctr.attribute("rel");
         
         if(ref.indexOf(_formPath) != 0)
            continue;
         if(rel == null || instance1.selectNodes(rel) == null || instance1.selectNodes(rel).length == 0 || rel.indexOf(_formPath) != 0)
            rel = ref;
            
         splitNodeToNodes(_newForm + ref.substring(_formPath.length), delim, _newForm + rel.substring(_formPath.length));
      }
   }
}

/**
 * makeNodesetWithoutDisabled�� makeNodesetSelectToArray�� ����� ���� ����.
**/
function makeNodesetBasedOnCtrl(_formPath, _ctrGroup, _newForm)
{
   if(instance1.selectNodes(_formPath).length == 0)
      return;
   if(typeof(_ctrGroup) == "string")
      _ctrGroup = document.controls(_ctrGroup);
   if(_ctrGroup == null)
      return;
      
   remakeNode(_newForm);
   model.copyNode(_newForm, _formPath);
   
   for(var i=0; i<_ctrGroup.children.length; i++)
   {
      var ctr = _ctrGroup.children.item(i);
      if(ctr.disabled)
      {
         var ref = ctr.attribute("ref");
         if(ref.indexOf(_formPath) != 0)
            continue;
         model.removenode(_newForm + ref.substring(_formPath.length));
      }
      else if(ctr.elementName == "xforms:select")
      {
         var ref = ctr.attribute("ref");
         var delim = ctr.attribute("sep");
         var rel = ctr.attribute("rel");
         
         if(ref.indexOf(_formPath) != 0)
            continue;
         if(rel == null || instance1.selectNodes(rel) == null || instance1.selectNodes(rel).length == 0 || rel.indexOf(_formPath) != 0)
            rel = ref;
            
         splitNodeToNodes(_newForm + ref.substring(_formPath.length), delim, _newForm + rel.substring(_formPath.length));
      }
   }
}

/**
 * ����� ���� �����ڷ� ����� ���ڿ��� ���, �ش� ��带 �������κ� ����(�迭)
 * _node : node xpath
 * _delim : ������
 * _tarNode : ���� ������ ��� node xpath
**/
function splitNodeToNodes(_node, _delim, _tarNode)
{
   if(instance1.selectSingleNode(_node).length == 0 || _delim == "")
      return;
   if(_tarNode == null)
      _tarNode = _node;
   
   var valstr = model.getValue(_node);
   if(valstr == "" || valstr.indexOf(_delim) < 0)
      return;
      
   var valarr = valstr.split(_delim);

   model.removenode(_tarNode);
   for(var i=0; valarr!=null && i<valarr.length; i++)
   {
      model.makeNode(_tarNode + "[" + (i+1) + "]");
      model.setValue(_tarNode + "[" + (i+1) + "]", valarr[i]);
   }
}

/**
 * _path : node xpath.
 * _refresh : ȭ���� refresh���� ����.
**/
function clearChildNodes(_path, _refresh)
{
   var _childs = instance1.selectSingleNode(_path).childNodes;
   for(var _i=0; _childs!=null && _i<_childs.length; _i++)
      _childs.item(_i).nodeValue = "";

   if(_refresh)
      model.refresh();
}

/**
 * _group : ��� ��Ʈ���� ��� �ִ� group.
 * _refresh : ȭ���� refresh���� ����.
**/
function clearChildControl(_group, _refresh)
{
   if( typeof _group == 'string' ) _group = document.controls(_group);
	var cnt = _group.children.length;
	
	for(i=0 ; i<cnt ; i++) {
		var ctr = _group.children.item(i);
		if(ctr.elementName=="xforms:input" || 
         ctr.elementName=="xforms:output" || 
         ctr.elementName=="xforms:select" || 
         ctr.elementName=="xforms:select1" || 
         ctr.elementName=="xforms:textarea" || 
         ctr.elementName=="xforms:secret") {
			//ctr.value = "";   //��Ʈ�Ѹ��� reset �ϴ� ����� node�� ���� ����.
         if(ctr.attribute("ref") != null && ctr.attribute("ref") != "")
            model.setValue(ctr.attribute("ref"), "");
		}
	}

   if(_refresh)
      _group.refresh();
}

/**
 * _group : ��� ��Ʈ���� ��� �ִ� group.
 * _refresh : ȭ���� refresh���� ����.
 * _resetdisabled : disabled�� ��Ʈ���� dsiabled ���¸� Ǯ������ ����
**/
function resetChildControl(_group, _refresh, _resetdisabled)
{
   if( typeof _group == 'string' ) _group = document.controls(_group);
	var cnt = _group.children.length;

   if(_resetdisabled == null)
      _resetdisabled = true;
	
	for(i=0 ; i<cnt ; i++) {
		var ctr = _group.children.item(i);
      if(_resetdisabled && ctr.disabled)
         ctr.disabled=false;
		if(ctr.elementName=="xforms:input" || 
         ctr.elementName=="xforms:output" || 
         ctr.elementName=="xforms:select" || 
         ctr.elementName=="xforms:textarea" || 
         ctr.elementName=="xforms:secret")
      {
         //ctr.value = "";
         if(ctr.attribute("ref") != null && ctr.attribute("ref") != "")
            model.setValue(ctr.attribute("ref"), "");
      }
      else if(ctr.elementName=="xforms:select1")
      {
			//ctr.select(0);
         if(ctr.length>0 && ctr.attribute("ref") != null && ctr.attribute("ref") != "")
            model.setValue(ctr.attribute("ref"), ctr.item(0).value);
      }
	}

   if(_refresh)
      _group.refresh();
}

/*
 _control : ��� control (select, select1 �迭)
 _delim : ������
 _excludeEndDelim : ������ ������(���ڿ� ��)�� �������� ����
 */
function concatSelectValues(_control, _delim, _excludeEndDelim)
{
   var _str = "";
   
   if( typeof _control == 'string' ) _control = document.controls(_control);
   
   if(_control == null || (_control.elementName!="xforms:select" && _control.elementName!="xforms:select1"))
      return _str;
      
   for(var _i=0; _i<_control.length; _i++)
   {
      if(_control.item(_i).value != "")
         _str += _control.item(_i).value + _delim;
   }
   
   if(_str != "" && _excludeEndDelim)
      _str = _str.substring(0, _str.lastIndexOf(_delim));
   
   return _str;
}

/*
 _nodesetPath : nodeset path
 _delim : ������
 _excludeEndDelim : ������ ������(���ڿ� ��)�� �������� ����
 */
function concatNodesetValues(_nodesetPath, _delim, _excludeEndDelim)
{
   var _str = "";
   
   var nodeset = instance1.selectNodes(_nodesetPath);
     
   for(var _i=0; nodeset!=null && _i<nodeset.length; _i++)
   {
      if(nodeset.item(_i).nodeValue != "")
         _str += nodeset.item(_i).nodeValue + _delim;
   }
   
   if(_str != "" && _excludeEndDelim)
      _str = _str.substring(0, _str.lastIndexOf(_delim));
   
   return _str;
}

/*
 _nodePath : node path
 _delim : ������
 _excludeEndDelim : ������ ������(���ڿ� ��)�� �������� ����
 */
function concatNodeChildValues(_nodePath, _delim, _excludeEndDelim)
{
   var _str = "";
   
   var node = instance1.selectSingleNode(_nodePath);
   if(node == null)
      return _str;
   
   var childs = node.childNodes;
   for(var _i=0; childs!=null && _i<childs.length; _i++)
   {
      if(childs.item(_i).nodeValue != "")
         _str += childs.item(_i).nodeValue + _delim;
   }
   
   if(_str != "" && _excludeEndDelim)
      _str = _str.substring(0, _str.lastIndexOf(_delim));
   
   return _str;
}

/*
 _grid : ��� �׸���
 _colref : ��� column ref
 _delim : ������
 _excludeEndDelim : ������ �����ڸ� ������ �� ����
 _chkcolref : ���Կ��θ� üũ�� üũ�ڽ� column ref. optional
 _chkval : _chkcolref�� üũ�� ��.
 */
function concatGridColValues(_grid, _colref, _delim, _excludeEndDelim, _chkcolref, _chkval)
{
   if(typeof(_grid) == "string")
      _grid = document.controls(_grid);
   if(_grid == null)
      return "";
   
   var ret = "";
   for(var i=_grid.fixedRows; i<_grid.rows; i++)
      if(!_grid.rowHidden(i))
         if(_chkcolref == null || _grid.colRef(_chkcolref) < 0 || _grid.valueMatrix(i, _grid.colRef(_chkcolref)) == _chkval)
            ret += _grid.valueMatrix(i, _grid.colRef(_colref)) + _delim;
   
   if(_excludeEndDelim)
      ret = ret.substring(0, ret.lastIndexOf(_delim));
   
   return ret;
} 

/*************************************************************************************************/
/* 8. ���� �˾� �Լ�
 * 1) openBranch        : �������ð���ȭ�� modal open. openBranchPub (����)
 * 2) searchBranchByName: ���������� ���� ��ȸ. searchBranchByNamePub (����)
 * 3) openBranchPub     : ���ǿ� ��������
 * 4) searchBranchByNamePub : ���ǿ� �����˻�
 * 5) openZip           : �����ȣ �˻� �˾�. openZipPub (����) -> ���� script (CIISComm.js�� �̵�)
 * 6) searchZip         : �����ȣ �˻�. searchZipPub (����) -> ���� script (CIISComm.js�� �̵�)
 * 7) openZipPub        : ���ǿ� �����ȣ����
 * 8) searchZipPub      : ���ǿ� �����ȣ�˻�
 * 9) openUserDetailPub : ���ǿ� ���ڻ� �˾� (��ȸ����)
 * 10) openUserPub       : ���ǿ� ���ڻ� �˾� (����, ����)
 * 11) openReaderPub     : ���ǿ� ���⵶�� ��ȸ �˾�
 * 12) searchReaderService : ���� ���� ��ȸ (���񽺳��� �� �̹��� ��Ʈ��)
 * 13) openReaderDetailView : ���ڻ���ȸ �˾�
 * 14) openRdrExtn       : Ȯ���� ��ȸ �˾�
 * 15) searchRdrExtn     : Ȯ���� �˻�
 * 16) openBnsItem       : ���˹� ��ȸ
 * 17) searchBnsItem     : ���˹� �˻�
 * 18) openReaderSearchModal : ������ȸ �˾� (modal)
 * 19) openReaderSearch  : ������ȸ �˾� (modeless)
 */
/*************************************************************************************************/

/**
 * _ref : �Ѱ��� parameter�� ��� �ִ� node path
 * _resRef : return ���� ���� node path.
**/
function openBranch(_ref, _resRef)
{
   var style = "width:660px; height:415; align:center; caption:hidden";
   model.property("BRANCH_RES_XPATH") = _resRef;
   
   remakeNode(_resRef);
   window.load("/xrw/ss/common/ss_common_1110_p.xrw", "modal", "BRANCHPOP", style, _ref, "/root/tempData/searchBranch");
}

/**
 * _ref : �Ѱ��� parameter�� ��� �ִ� node path
 * _resRef : return ���� ���� node path.
 * callback : ��� ���� �� ������ callback �Լ�
 * flagnode : flag ����. �Ϻ� ȭ�鿡�� ���� �˻��� ����Ʈ �˻��� �����ǵ��� �Ǿ� �ִ� ��쿡 ���.
**/
function searchBranchByName(_ref, _resRef, callback, flagnode)
{
   remakeNode(_resRef);
   modelSendNoMake("commSearchBranchByName", "/ss/common/1113", _ref, _resRef);

   if(callback != null)
   {
      try{
         eval(callback);
      }catch(e){
         alert("callback �Լ��� �����ϴµ� ������ �߻��߽��ϴ�:" + callback);
      }
   }

   var flag = model.getValue(flagnode);
   if(flag == "L")
   {
      model.setValue(flagnode, "N");
      search();
   }
   else if(flag == "LC")
   {
      model.setValue(flagnode, "N");
      search();
   }
   else if(flag == "LE")
   {
      model.setValue(flagnode, "N");
      search();
   }
   else if(flag == "LCE")
   {
      model.setValue(flagnode, "LE");
      searchWithBranch();
   }
}

/**
 * _ref : �Ѱ��� parameter�� ��� �ִ� node path
 * _resRef : return ���� ���� node path.
**/
function openBranchPub(_ref, _resRef)
{
   var style = "width:660px; height:435; align:center; caption:hidden;";
   model.property("BRANCH_RES_XPATH") = _resRef;
   
   remakeNode(_resRef);
   window.load("/xrw/ps/common/ps_common_1901_p.xrw", "modal", "BRANCHPOP", style, _ref, "/root/tempData/searchBranch");
}

/**
 * _ref : �Ѱ��� parameter�� ��� �ִ� node path
 * _resRef : return ���� ���� node path.
**/
function searchBranchByNamePub(_ref, _resRef)
{
   remakeNode(_resRef);
   modelSendNoMake("commSearchBranchByName", "/ps/common/1906", _ref, _resRef);
}

/** --> CIISComm.js�� ����.
_ref : request data node path
       zip - �˻��ܾ�, job_flag - Ư������/��ü�����ȣ �˻����� ����
_resRef : �˻���� �����͸� ������ data node path
*/
/*function openZip(_ref, _resRef)
{
   var style = "width:410px; height:440; align:center;";
   model.property("ZIP_RES_XPATH") = _resRef;
   
   remakeNode(_resRef);
   //window.load("/xrw/ss/common/ss_common_1150_p.xrw", "modal", "ZIPPOP", style, _ref, "/root/tempData/zipForm");
   window.load("/xrw/co/common/co_common_1150_p.xrw", "modal", "ZIPPOP", style, _ref, "/root/tempData/zipForm");
}

function searchZip(_ref, _resRef)
{
   remakeNode(_resRef);
   modelSendNoMake("commSearchZip", "/ss/common/1152", _ref, _resRef);
}*/

/**
_ref : request data node path
       zip - �˻��ܾ�, disp_flag - �������� ǥ������ ����. "L"�̸� ������ ǥ������ �ʴ´�.
_resRef : �˻���� �����͸� ������ data node path
*/
function openZipPub(_ref, _resRef)
{
   var style = "width:410px; height:415; align:center; caption:hidden";
   model.property("ZIP_RES_XPATH") = _resRef;
   
   remakeNode(_resRef);
   window.load("/xrw/ps/common/ps_common_1801_p.xrw", "modal", "ZIPPOP", style, _ref, "/root/tempData/zipForm");
}

/**
 * _ref : �Ѱ��� parameter�� ��� �ִ� node path
 * _resRef : return ���� ���� node path.
**/
function searchZipPub(_ref, _resRef)
{
   remakeNode(_resRef);
   modelSendNoMake("commSearchZip", "/ps/common/1111", _ref, _resRef);
}

/**
 * _ref : �Ѱ��� parameter�� ��� �ִ� node path
 * _resRef : return ���� ���� node path.
**/
// ���ڻ� �˾�(��ȸ����)
function openUserDetailPub(_ref, _resRef)
{
   var style = "width:860px; height:785; align:center; caption:hidden";
   model.property("USER_RES_XPATH") = _resRef;
   
   remakeNode(_resRef);
   window.load("/xrw/ps/common/ps_common_1416_p.xrw", "modal", "DETAILPOP", style, _ref, "/root/tempData/userForm");
}

/**
 * _ref : �Ѱ��� parameter�� ��� �ִ� node path
 * _resRef : return ���� ���� node path.
**/
//���ڻ� �˾�(����,����)
function openUserPub(_ref, _resRef)
{
   var style = "width:950px; height:500; align:center; caption:hidden";
   model.property("USER_RES_XPATH") = _resRef;
   
   remakeNode(_resRef);
   window.load("/xrw/ps/common/ps_common_1000_p.xrw", "modal", "DETAILPOP", style, _ref, "/root/tempData/userForm");
}

/**
 * _ref : �Ѱ��� parameter�� ��� �ִ� node path
 * _resRef : return ���� ���� node path.
**/
// ���⵶�� ��ȸ �˾�
function openReaderPub(_ref, _resRef)
{
   var style = "width:710px; height:320; align:center; caption:hidden";
   model.property("USER_RES_XPATH") = _resRef;
   
   remakeNode(_resRef);
   window.load("/xrw/ps/common/ps_common_1106_p.xrw", "modal", "DETAILPOP", style, _ref, "/root/tempData/userForm");
}

/**
 * _ref : �Ѱ��� parameter�� ��� �ִ� node path
 * _resRef : return ���� ���� node path.
 * _imgcontrol : ������� ���� ���� image control�� �������� ����.
**/
function searchReaderService(_ref, _resRef, _imgcontrol)
{
   remakeNode(_resRef);
   modelSendNoMake("commSearchReaderService", "/ss/slcommon/1310", _ref, _resRef);

   if(_imgcontrol)
   {
      var path = _resRef.substring(0, _resRef.lastIndexOf("/")>=0 ? _resRef.lastIndexOf("/") : _resRef.length);
      var srvs = instance1.selectNodes(path + "/resTemp/rdrService/record");
      for(var i=0; i<srvs.length; i++)
      {
         var imgCtr = document.controls(model.getValue(path + "/resTemp/rdrService/record[" + (i+1) + "]/ID"));
         if(imgCtr == null)
            continue;

         imgCtr.visible = eval(model.getValue(path + "/resTemp/rdrService/record[" + (i+1) + "]/VISIBLE"));
      }
   }
}

/**
 * ���ڻ���ȸ popup
 * _ref : request parameter�� ��� �ִ� node path
 *        parameter�� bocd, rdr_no, find_type �� �����ϴ�. rdr_no�� �ʼ�.
**/
function openReaderDetailView(_ref)
{
   var node = instance1.selectSingleNode(_ref);
   if(node == null)
      return;
   
   var arr = new Array();
   arr[0] = node.selectSingleNode("bocd") == null ? "" : node.selectSingleNode("bocd").nodeValue;
   arr[1] = node.selectSingleNode("rdr_no") == null ? "" : node.selectSingleNode("rdr_no").nodeValue;
   arr[2] = node.selectSingleNode("find_type") == null ? "" : node.selectSingleNode("find_type").nodeValue;
   
   var date = new Date();
   var popid = "RDRDETAILPOP" + date.getTime();	//id �ߺ��� ���ϱ� ���� timestamp
   
   var prop = "left:140px; top:50px; width:935px; height:570px;";
   var url = "/xrw/ss/reader/sl_reader_1100_a.xrw";
   window.load(url, "modeless", popid, prop);
   
   window.children(popid).window.javaScript.setPostParameter(arr);
}

/**
 * Ȯ���� ��ȸ popup
 * <rdrExtnPopupForm>
      <job_flg/>
      <bocd/>
      <extntypecd/>
      <extnblngcd/>
      <stafno/>
      <name/>
      <prn/>
      <pageno/>
      <pagesize/>
   </rdrExtnPopupForm>
**/
function openRdrExtn(_ref, _resRef)
{
   var style = "width:660px; height:450; align:center;";
   model.property("RDREXTN_RES_XPATH") = _resRef;
   
   remakeNode(_resRef);
   window.load("/xrw/ss/slcommon/sl_common_1200_p.xrw", "modal", "RDREXTNPOP", style, _ref, "/root/initData/postData/rdrExtnSearchForm");
}

/**
 * Ȯ���� �˻�
 * <rdrExtnSearchForm>
      <bocd/>
      <extnblngcd/>
      <extntypecd/>
      <stafno/>
      <name/>
      <prn/>
      <pageno/>
      <pagesize/>
   </rdrExtnSearchForm>
**/
function searchRdrExtn(_ref, _resRef)
{
   remakeNode(_resRef);
   modelSendNoMake("commSearchRdrExtn", "/ss/slcommon/1205", _ref, _resRef);
}

/**
 * ���˹� ��ȸ popup
 * <bnsItemcdSearchForm>
      <bns_itemnm/>
      <bns_itemcd/>
      <pageno/>
      <pagesize/>
   </bnsItemcdSearchForm>
**/
function openBnsItem(_ref, _resRef)
{
   var style = "width:435px; height:420; align:center;";
   model.property("BNSITEM_RES_XPATH") = _resRef;
   
   remakeNode(_resRef);
   window.load("/xrw/ss/slcommon/sl_common_1500_p.xrw", "modal", "BNSITEMPOP", style, _ref, "/root/initData/postData/bnsItemcdSearchForm");
}

/**
 * ���˹� �˻� 
 * <bnsItemcdSearchForm>
      <bns_itemnm/>
      <bns_itemcd/>
      <pageno/>
      <pagesize/>
   </bnsItemcdSearchForm>  (��)
**/
function searchBnsItem(_ref, _resRef)
{
   remakeNode(_resRef);
   modelSendNoMake("commBnsItemSearch", "/ss/slcommon/1505", _ref, _resRef);
}

/**
 * ������ȸ popup
**/
function openReaderSearchModal(_ref, _resRef)
{
   var style = "width:940px; height:435; align:center; caption:hidden;";
   model.property("RDRDETAILSEARCHSALES_RES_XPATH") = _resRef;

   remakeNode(_resRef);
   window.load("/xrw/ss/common/ss_common_1170_p.xrw", "modal", "READERSEARCHPOP", style, _ref, "/root/initData/postData/readerSearchForm");
}

/**
 * ������ȸ popup (modeless)
**/
function openReaderSearch(_id, _resRef)
{
   var style = "width:940px; height:435; align:center; caption:hidden;";
   model.property("RDRDETAILSEARCH_RES_XPATH") = _resRef;
   window.load("/xrw/ss/slcommon/sl_common_1100_p.xrw", "modeless", _id, style);
}


/*************************************************************************************************/
/* 9. ���� ��� ȣ��
 * 1) callServletPage : �Ϲ� jsp �������� ȣ���� �ִ� �Լ�. iviewer ������ ȣ���ϹǷ� ȭ�� ��ȯ�� ����. print ��� jsp� ���.
 * 2) callServletPagePub : �Ǹſ� �Լ�.
/* 3) 
/* 4) 
/* 5)  
/* 6)
/*************************************************************************************************/

/**
 * action : �����Ű���� �ϴ� target url.
 * ref : target url�� �Ѱ��� parameter�� ��� �ִ� node.
**/
function callServletPage(action, ref)
{
   body.createChild("xforms:iviewer", "id:iv_crmRedirect; left:1px; top:1px; width:1px; height:1px; visibility:hidden; ");
   var iv = document.controls("iv_crmRedirect")
   
   var root = ref.substring(ref.lastIndexOf("/"));
   iv.src = "/xrw/ss/common/iv_ActionRedirectHtml.xrw";

   var xml = instance1.selectNodesXml(ref);
   iv.instance1.loadXml(xml);
   iv.model.makeNode(root + "/action");
   iv.model.setValue(root + "/action", action);
   
   iv.window.javaScript.sendRedirect(root);
}

/**
 * action : �����Ű���� �ϴ� target url.
 * ref : target url�� �Ѱ��� parameter�� ��� �ִ� node.
**/
function callServletPagePub(action, ref)
{
   body.createChild("xforms:iviewer", "id:iv_crmRedirect; left:1px; top:1px; width:1px; height:1px; visibility:hidden; ");
   var iv = document.controls("iv_crmRedirect")
   
   var root = ref.substring(ref.lastIndexOf("/"));
   iv.src = "/xrw/ps/common/iv_ActionRedirectHtml.xrw";

   var xml = instance1.selectNodesXml(ref);
   iv.instance1.loadXml(xml);
   iv.model.makeNode(root + "/action");
   iv.model.setValue(root + "/action", action);
   
   iv.window.javaScript.sendRedirect(root);
}

var ozTimerID = null;

/**
 * callServletPage�� oz print module�� ����� oz preview ȭ���� display ���� ����.
 * iviewer�� inline���� ��ġ�ϰ� ũ�⵵ ���� ũ�� �̻� (20px�̻�) �Ǿ�� ����� �����.
 * �Ƹ��� hidden�̰ų� ȭ�鿡 display �������� ũ�Ⱑ �ƴϸ� TrustForm���� object�� ����� �׸��� �ʴ� ������ ����.
 * ���� �Ʒ��� ���� ���� ũ��� ǥ���� �� timer�� �̿��Ͽ� �ش� ��Ʈ���� �ٽ� ����.
 * action : �����Ű���� �ϴ� target url.
 * ref : target url�� �Ѱ��� parameter�� ��� �ִ� node.
**/
function callServletPrint(action, ref)
{
   var iv = document.controls("iv_crmRedirect")

   if(iv == null)
      iv = body.createChild("xforms:iviewer", "id:iv_crmRedirect; left:1px; top:1px; width:20px; height:20px; visibility:visible");
   else
      iv.visible = true;
   
   var root = ref.substring(ref.lastIndexOf("/"));
   iv.src = "/xrw/ss/common/iv_ActionRedirectHtml.xrw";

   var xml = instance1.selectNodesXml(ref);
   iv.instance1.loadXml(xml);
   iv.model.makeNode(root + "/action");
   iv.model.setValue(root + "/action", action);

   ozTimerID= window.setInterval( "checkOzReady()", 2000 );

   iv.window.javaScript.sendRedirect(root);
}

function checkOzReady()
{
   var iv = document.controls("iv_crmRedirect");

   iv.visible = false;
   window.clearInterval(ozTimerID);
}

/**
 * callServletPage�� oz print module�� ����� oz preview ȭ���� display ���� ����.
 * iviewer�� inline���� ��ġ�ϰ� ũ�⵵ ���� ũ�� �̻� (20px�̻�) �Ǿ�� ����� �����.
 * �Ƹ��� hidden�̰ų� ȭ�鿡 display �������� ũ�Ⱑ �ƴϸ� TrustForm���� object�� ����� �׸��� �ʴ� ������ ����.
 * ���� �Ʒ��� ���� ���� ũ��� ǥ���� �� timer�� �̿��Ͽ� �ش� ��Ʈ���� �ٽ� ����.
 * action : �����Ű���� �ϴ� target url.
 * ref : target url�� �Ѱ��� parameter�� ��� �ִ� node.
**/
function callServletPrintPub(action, ref)
{
   var iv = document.controls("iv_crmRedirect")

   if(iv == null)
      iv = body.createChild("xforms:iviewer", "id:iv_crmRedirect; left:1px; top:1px; width:20px; height:20px; visibility:visible");
   else
      iv.visible = true;
   
   var root = ref.substring(ref.lastIndexOf("/"));
   iv.src = "/xrw/ps/common/iv_ActionRedirectHtml.xrw";

   var xml = instance1.selectNodesXml(ref);
   iv.instance1.loadXml(xml);
   iv.model.makeNode(root + "/action");
   iv.model.setValue(root + "/action", action);

   ozTimerID= window.setInterval( "checkOzReady()", 2000 );

   iv.window.javaScript.sendRedirect(root);
}