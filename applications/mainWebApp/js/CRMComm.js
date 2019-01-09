/*************************************************************************************************/
/* 0. 일반 Util 함수
/* 1)  replaceAll  : param1 문자열내 모든 param2 문자열을 param3문자열로 치환.
/* 2)  
/* 3)  
/* 4)  
/* 5) 
/*************************************************************************************************/

/**
 * _src : 원본 문자열
 * _old : 바뀔 대상 문자열
 * _new : 새로운 문자열
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
 * 1)  commReqCheckEx   : group 내의 필수입력 확인. class = req 인경우 체크.
 * 2)  commValidate     : group 내 validation. 필요한 속성을 설정한 컨트롤에 대해서 체크.
 * 3)  commValidateCtr  : 내부적으로 사용.
 * 4)  commChkNodesetDate : nodeset path를 받아 해당 nodeset의 값이 날짜로 유효한지를 체크.
 * 5)  commEventHandler : group내 모든 특정 control에 공통 event handler를 설정.
 * 6)  commEventHandlerCtr : 특정 control에 공통 event handler를 설정.
 * 7)  commHandlerDate  : 날짜 control event handler
 * 8)  commHandlerDateChk  : 날짜 validation 및 처리
 * 9)  commHandlerFromDate : 시작일 event handler
 * 10)  commHandlerFromDateChk : 시작일 validation 및 처리
 * 11)  commHandlerToDate   : 종료일 event handler
 * 12)  commHandlerToDateChk   : 종료일 validation 및 처리
 * 13)  commValidateDateFromTo : 시작일과 종료일간 일자 선후 체크.
 * 14)  commHandlerMonth       : 월 event handler
 * 15)  commHandlerMonthChk    : 월 validation 및 처리
 * 16)  commHandlerFromMonth : 시작월 event handler
 * 17)  commHandlerFromMonthChk : 시작월 validation 및 처리
 * 18)  commHandlerToMonth   : 종료월 event handler
 * 19)  commHandlerToMonthChk   : 종료월 validation 및 처리
 * 20)  commValidateMonthFromTo : 시작월과 종료월간 일자 선후 체크.
 * 21)  commHandlerJumin       : 주민번호 event handler
 * 22)  commHandlerOffice      : 사업자번호 event handler
 * 23)  commHandlerJuffice     : 주민번호 및 사업자번호 event handler //현재 사용할 수 없음.
 * 24)  commChkNodesetDate     : nodeset (ArrayList) 의 값을 date check.
 * 25)  validate_zip : 우편번호 체크 (-없음)
 * 26) validate_stafno : 확장자 고유번호 유효성 체크
 * 27) validate_bns_itemcd : 판촉물코드 유효성 검증
 * 28) valid_rdr_no : 독자번호 유효성 검증
 * 29) valid_prev_rdr_no : 전독자번호 유효성 검증
 * 30) valid_dstc_no : 구역코드 유효성 체크
 * 31) valid_dstc_dlvno : 구역+배달 유효성 체크
 * 32) valid_tel_no : 전화번호 유효성 체크
 * 33) valid_addr : 주소 유효성 체크
 * 34) isValidFormatX : 공통 유효성 체크. 문자열과 reqular expression을 입력 받아 유효성 체크. */
/*************************************************************************************************/

/**
 * @function    : commReqCheckEx
 * @access      : public
 * @description : 필수입력 확인. CIISComm.js의 commReqCheck의 확장판.(select 컨트롤 포함.)
 *                 class = req 이고 input, secret, select1, select 인 컨트롤에 대해서 체크.
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
               caption = "필수 입력사항(" + id + ")";

				model.setFocus(id);	
				commMsgBox(caption + "이(가) 누락되었습니다.");
				chk =false;
				break;
			}
		}
	}
	return chk;
}

/**
  * group내의 control 값의 유효성을 체크. 필수입력값 체크 포함.
  * input, secret 컨트롤에 대해서 dataType 이 설정되어 있는 컨트롤만 체크.
  * 설정 속성 : caption - 컨트롤의 이름. alert 발생시 이 이름을 사용한다 설정하지 않으면 id값
                dataType - date, month, email, float, integer, number, phone, phone1, pcs1, jumin, office, juffice, zip, 24hr, 
                len - 고정 길이 데이터인 경우 설정
                minValue - 숫자로 최소값 하한이 필요할 경우 설정
                maxValue - 숫자로 최대값 상한이 필요한 경우 설정.
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
  * control 값의 유효성을 체크. 
  * 내부적으로 CIISComm.js의 값 체크 함수들을 사용.
  * CIISComm.js로 처리되지 않는 값은 common.js 체크 함수 사용.
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

   // 데이터 길이 체크
   if (len != null && value != "") {

       if (eval(len)>0 && value.length != eval(len)) {
           alert(caption + "은(는) " + len + "자리를 입력해야 합니다.");
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
       // 데이터 타입 체크
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
               example = "\n예) 02-929-8272";
           } else if (dataType == "phone1") {
               isValid = isValidPhone1(value); //지역번호만 체크
               example = "\n예) 02";
           } else if (dataType == "pcs1") {
               isValid = isValidPcs1(value); //휴대폰 이통사 번호만 체크
               example = "\n예) 011";
           } else if (dataType == "jumin") {
               //isValid = commCheckRrnoVal(ref);  //함수내 alert가 존재하여 사용할 수 없음.
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
                  model.alert(caption + "의 종료일이 지정되지 않았습니다.");
                  model.setFocus(ctr.attribute("id"));
                  return false;
               }
               toCtr = document.controls(toCtr);
               if(toCtr == null)
               {
                  model.alert(caption + "의 종료일을 찾을 수 없습니다.");
                  model.setFocus(ctr.attribute("id"));
                  return false;
               }

               //무한루프 방지를 위해 값만 체크.
               if(!isDate(toCtr.value))
               {
                  var toCap = toCtr.attribute("caption")==null || trim(toCtr.attribute("caption")) == "" ? toCtr.attribute("id") : toCtr.attribute("caption");
                  model.alert(toCap + "(이)가 유효한 날짜가 아닙니다.");
                  model.setFocus(toCtr.attribute("id"));
                  return false;
               }

               var fval = value;
               var tval = toCtr.value;
               if(!commValidateDateFromTo(fval, tval))
               {
                  model.alert("시작일은 종료일보다 빨라야 합니다.");
                  model.setFocus(ctr.attribute("id"));
                  return false;
               }
           }
           if (checkValue) {
               if (minValue != null) {
                   if (eval(minValue) > eval(value)) {
                       alert(caption + " 값이 최소값(" + minValue + ") 미만입니다.");
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
                       alert(caption + " 값이 최대값(" + maxValue + ")을 초과합니다.");
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
 * 그룹내 control에 대해 event handler를 설정한다.
 * control의 attribute가 setHandler="true" 로 설정되어 있는 경우에 한해 설정한다.
 * 주의 : common.js를 반드시 함께 포함해야 한다.
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
 * 컨트롤에 대해 event handler를 설정한다.
 * input : dataType - date, datefrom, dateto, month, jumin, office, juffice 인 경우 설정.
 *         속성 editable="false" 인 경우는 skip한다.
 * 주의 : trustform MDI 처리시 model.setFocus에 버그가 있으므로 일단 xforms-value-changed 로 처리. (DOMFocusOut의 경우 무한 루프 발생)
 *        xforms-value-changed로 처리할 경우, 한번 이벤트를 발생한 후 focus out이 가능해 지므로 여전히 문제.
**/
function commEventHandlerCtr(ctr)
{
   if (ctr.elementName == "xforms:input") {
      if(ctr.attribute("editable")=="false")
         return;

      /** 원래 DOMFocusOut 이벤트에 handler를 걸어야 하나, MDI 구조에서 focusing bug가 있어 일단 xforms-value-changed를 이용.
          이렇게 되면 한번 event 처리 후 다시 사용자가 값을 변경하지 않으면 event 가 발생하지 않아 pass되는 문제가 발생. **/
      var eventName = "xforms-value-changed";   // "DOMFocusOut"
      var eventHandler = "";
      var dataType = ctr.attribute("dataType");

      if (dataType == "date") {	 // 날짜형 : 예) "2002/11/11"
         eventHandler = "commHandlerDate();";
      } else if (dataType == "datefrom") { // 월분형 : 예) "2003/11"
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
      //format을 일반화할 수도 없고, onfocus도 문제가 있기 때문에(format을 일반화하지 않을 경우 focus in/out시 handler를 모두 설정해야함) 일단 pass 
      /*(else if (dataType == "juffice"){
         eventHandler = "commHandlerJuffice();";
      }*/

      if(eventHandler != "")
         eval(ctr.attribute("id") + ".attribute('" + eventName + "') = '" + eventHandler + "'");
   }
}

/**
 * 날짜 처리 handler.
 * commHandlerDateChk로 부터 처리 결과를 받아 alert 및 focusing 처리.
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
      model.alert(caption + "(이)가 유효한 날짜값이 아닙니다.");
      model.setFocus(id);
   }
}

/**
 * 날짜 check 및 처리.
 * isNumber, isDate(common.js) 사용
**/
function commHandlerDateChk(ctr)
{
   var mask = ctr.attribute("mask")=="include";
   var val = mask ? deleteDateFormatStr(ctr.value) : ctr.value;   //format은 "-"이라고 간주.
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
 * 시작날짜 처리 handler.
 * commHandlerFromDateChk로 부터 처리 결과를 받아 alert 및 focusing 처리.
 * 기본 date 체크. attribute relid 가 유효할 경우 from-to date 체크.
**/
function commHandlerFromDate()
{
   var id = event.currentTarget;
   var ctr = document.controls(id);
   var caption = ctr.attribute("caption");

   if(ctr.value == "")
      return;
   var ret = commHandlerFromDateChk(ctr);    // 0:정상. -1:유효하지 않은 날짜. -2:종료일보다 늦은 날짜. -3:유효한 종료일이 설정되지 않았음.
   var msg = "";
   if(ret != 0)
   {
      if(caption==null || trim(caption)=="")
         caption = id;

      if(ret == -1)
         msg = caption + "(이)가 유효한 날짜가 아닙니다.";
      else if(ret == -2)
         msg = caption + "(은)는 종료일보다 늦을 수 없습니다.";
      else if(ret == -3)
         msg = caption + "(와)과 관계된 유효한 종료일이 존재하지 않습니다.";
      else
         msg = "(이)가 유효하지 않습니다.";

      model.alert(msg);
      model.setFocus(id);
   }
}

/**
 * 시작날짜 check 및 처리.
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

   var fval = ctr.attribute("mask")=="include" ? deleteDateFormatStr(ctr.value) : ctr.value;   //format은 "-"이라고 간주.
   var tval = toCtr.attribute("mask")=="include" ? deleteDateFormatStr(toCtr.value) : toCtr.value;   //format은 "-"이라고 간주.
   if(!commValidateDateFromTo(fval, tval))
      return -2;
   
   return 0;
}

/**
 * 종료날짜 처리 handler.
 * commHandlerToDateChk로 부터 처리 결과를 받아 alert 및 focusing 처리.
 * 기본 date 체크. attribute relid 가 유효할 경우 from-to date 체크.
**/
function commHandlerToDate()
{
   var id = event.currentTarget;
   var ctr = document.controls(id);
   var caption = ctr.attribute("caption");

   if(ctr.value == "")
      return;
   var ret = commHandlerToDateChk(ctr);    // 0:정상. -1:유효하지 않은 날짜. -2:시작일보다 빠른 날짜. -3:유효한 시작일이 설정되지 않았음.
   var msg = "";
   if(ret != 0)
   {
      if(caption==null || trim(caption)=="")
         caption = id;

      if(ret == -1)
         msg = caption + "(이)가 유효한 날짜가 아닙니다.";
      else if(ret == -2)
         msg = caption + "(은)는 시작일보다 빠를 수 없습니다.";
      else if(ret == -3)
         msg = caption + "(와)과 관계된 유효한 시작일이 존재하지 않습니다.";
      else
         msg = "(이)가 유효하지 않습니다.";

      model.alert(msg);
      model.setFocus(id);
   }
}

/**
 * 종료날짜 check 및 처리.
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

   var fval = fromCtr.attribute("mask")=="include" ? deleteDateFormatStr(fromCtr.value) : fromCtr.value;   //format은 "-"이라고 간주.
   var tval = ctr.attribute("mask")=="include" ? deleteDateFormatStr(ctr.value) : ctr.value;   //format은 "-"이라고 간주.
   if(!commValidateDateFromTo(fval, tval))
      return -2;
   
   return 0;
}

/**
 * fdate(시작일), tdate(종료일) 간 관계 검증.
**/
function commValidateDateFromTo(fdate, tdate)
{
   //어느 한쪽이든 값이 없으면 검증하지 않음.
   if(fdate==null || trim(fdate)=="" || tdate==null || trim(tdate)=="")
      return true;
   //어느 한쪽이든 날짜가 유효하지 않으면 검증하지 않음.
   if(!isDate(fdate) || !isDate(tdate))
      return true;

   //숫자로 보고 단순 비교.
   return eval(fdate) <= eval(tdate);
}

/**
 * 월 처리 handler.
 * commHandlerMonthChk로 부터 처리 결과를 받아 alert 및 focusing 처리.
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
      model.alert(caption + "(이)가 유효한 월이 아닙니다.");
      model.setFocus(id);
   }
}

/**
 * 월 check 및 처리.
 * isDate(common.js) 사용
**/
function commHandlerMonthChk(ctr)
{
   var mask = ctr.attribute("mask")=="include"; 
   var val = mask ? deleteMonthFormatStr(ctr.value) : ctr.value;   //format은 "-"이라고 간주.
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
 * 시작날짜 처리 handler.
 * commHandlerFromDateChk로 부터 처리 결과를 받아 alert 및 focusing 처리.
 * 기본 date 체크. attribute relid 가 유효할 경우 from-to date 체크.
**/
function commHandlerFromMonth()
{
   var id = event.currentTarget;
   var ctr = document.controls(id);
   var caption = ctr.attribute("caption");

   if(ctr.value == "")
      return;
   var ret = commHandlerFromMonthChk(ctr);    // 0:정상. -1:유효하지 않은 월. -2:종료월보다 늦은 날짜. -3:유효한 종료월이 설정되지 않았음.
   var msg = "";
   if(ret != 0)
   {
      if(caption==null || trim(caption)=="")
         caption = id;

      if(ret == -1)
         msg = caption + "(이)가 유효한 월이 아닙니다.";
      else if(ret == -2)
         msg = caption + "(은)는 종료월보다 늦을 수 없습니다.";
      else if(ret == -3)
         msg = caption + "(와)과 관계된 유효한 종료월이 존재하지 않습니다.";
      else
         msg = "(이)가 유효하지 않습니다.";

      model.alert(msg);
      model.setFocus(id);
   }
}

/**
 * 시작월 check 및 처리.
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

   var fval = ctr.attribute("mask")=="include" ? deleteMonthFormatStr(ctr.value) : ctr.value;   //format은 "-"이라고 간주.
   var tval = toCtr.attribute("mask")=="include" ? deleteMonthFormatStr(toCtr.value) : toCtr.value;   //format은 "-"이라고 간주.
   if(!commValidateMonthFromTo(fval, tval))
      return -2;
   
   return 0;
}

/**
 * 종료월 처리 handler.
 * commHandlerToMonthChk 부터 처리 결과를 받아 alert 및 focusing 처리.
 * 기본 date 체크. attribute relid 가 유효할 경우 from-to date 체크.
**/
function commHandlerToMonth()
{
   var id = event.currentTarget;
   var ctr = document.controls(id);
   var caption = ctr.attribute("caption");

   if(ctr.value == "")
      return;
   var ret = commHandlerToMonthChk(ctr);    // 0:정상. -1:유효하지 않은 월. -2:시작일보다 빠른 월. -3:유효한 시작월이 설정되지 않았음.
   var msg = "";
   if(ret != 0)
   {
      if(caption==null || trim(caption)=="")
         caption = id;

      if(ret == -1)
         msg = caption + "(이)가 유효한 월이 아닙니다.";
      else if(ret == -2)
         msg = caption + "(은)는 시작월보다 빠를 수 없습니다.";
      else if(ret == -3)
         msg = caption + "(와)과 관계된 유효한 시작월이 존재하지 않습니다.";
      else
         msg = "(이)가 유효하지 않습니다.";

      model.alert(msg);
      model.setFocus(id);
   }
}

/**
 * 종료월 check 및 처리.
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

   var fval = fromCtr.attribute("mask")=="include" ? deleteMonthFormatStr(fromCtr.value) : fromCtr.value;   //format은 "-"이라고 간주.
   var tval = ctr.attribute("mask")=="include" ? deleteMonthFormatStr(ctr.value) : ctr.value;   //format은 "-"이라고 간주.
   if(!commValidateMonthFromTo(fval, tval))
      return -2;
   
   return 0;
}

/**
 * fmonth(시작월), tmonth(종료월) 간 관계 검증.
**/
function commValidateMonthFromTo(fmonth, tmonth)
{
   //어느 한쪽이든 값이 없으면 검증하지 않음.
   if(fmonth==null || trim(fmonth)=="" || tmonth==null || trim(tmonth)=="")
      return true;
   //어느 한쪽이든 날짜가 유효하지 않으면 검증하지 않음.
   if(!isDate(fmonth+"01") || !isDate(tmonth+"01"))
      return true;

   //숫자로 보고 단순 비교.
   return eval(fmonth) <= eval(tmonth);
}

/**
 * 주민번호 처리 handler.
 * isValidJumin(common.js) 로 부터 처리 결과를 받아 alert 및 focusing 처리.
 * mask=include 이면 format이 "-"이라고 간주하고 값에서 "-"을 제외하여 체크.
**/
function commHandlerJumin()
{
   var id = event.currentTarget;
   var ctr = document.controls(id);
   var caption = ctr.attribute("caption");
   var val = ctr.attribute("mask")=="include" ? deleteHyphen(ctr.value) : ctr.value;   //format은 "-"이라고 간주.

   if(ctr.value == "")
      return;
   if(!isValidJumin(val))
   {
      if(caption==null || trim(caption)=="")
         caption = id;
      model.alert(caption + "(이)가 유효한 주민번호가 아닙니다.");
      model.setFocus(id);
   }
}

/**
 * 사업자번호 처리 handler.
 * isValidOfficeNum(common.js) 로 부터 처리 결과를 받아 alert 및 focusing 처리.
 * mask=include 이면 format이 "-"이라고 간주하고 값에서 "-"을 제외하여 체크.
**/
function commHandlerOffice()
{
   var id = event.currentTarget;
   var ctr = document.controls(id);
   var caption = ctr.attribute("caption");
   var val = ctr.attribute("mask")=="include" ? deleteHyphen(ctr.value) : ctr.value;   //format은 "-"이라고 간주.

   if(ctr.value == "")
      return;
   if(!isValidOfficeNum(val))
   {
      if(caption==null || trim(caption)=="")
         caption = id;
      model.alert(caption + "(이)가 유효한 사업자번호가 아닙니다.");
      model.setFocus(id);
   }
}

/**
 * 주민번호 및 사업자번호 처리 handler.
 * isValidJuffice(common.js)로 부터 처리 결과를 받아 alert 및 focusing 처리.
 * mask=include 이면 format이 "-"이라고 간주하고 값에서 "-"을 제외하여 체크.
**/
function commHandlerJuffice()
{
   var id = event.currentTarget;
   var ctr = document.controls(id);
   var caption = ctr.attribute("caption");
   var val = ctr.attribute("mask")=="include" ? deleteHyphen(ctr.value) : ctr.value;   //format은 "-"이라고 간주.

   if(ctr.value == "")
      return;
   if(!isValidJuffice(val))
   {
      if(caption==null || trim(caption)=="")
         caption = id;
      model.alert(caption + "(이)가 유효한 주민번호 혹은 사업자번호가 아닙니다.");
      model.setFocus(id);
   }
}

/*
내부적으로 CIISComm.js의 commGhkCal 함수 사용
nodesetPath : nodeset의 xpath
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

/* 기존 common.js의 함수를 내부적으로 사용. 기존 개별 jsp에 존재하던 함수 */
function validate_zip(s_zip){
   if(trim(s_zip) == "") return false;
   var format = /^(\d{3})(-{0,1})(\d{3})$/;
   return isValidFormatX(s_zip, format);
}

/* 기존 common.js의 함수를 내부적으로 사용. 기존 개별 jsp에 존재하던 함수 */
// 확장자 고유번호 유효성 검증(숫자로만 1 ~ 8)
function validate_stafno(s_stafno){
    if(trim(s_stafno) == "") return false;
    var format = /^(\d{1,8})$/;
    return isValidFormatX(s_stafno, format);
}

/* 기존 common.js의 함수를 내부적으로 사용. 기존 개별 jsp에 존재하던 함수 */
// 판촉물코드 유효성 검증(숫자로만 이루어졌으면)
function validate_bns_itemcd(s_cd){
    if(trim(s_cd) == "") return false;
    var format = /^(\d+)$/;
    return isValidFormatX(s_cd, format);
}

/* 기존 common.js의 함수를 내부적으로 사용. 기존 개별 jsp에 존재하던 함수 */
// 독자번호 유효성 체크
function valid_rdr_no(s_word){
  return isValidFormatX(s_word, /^(\d{9})$/);
}

/* 기존 common.js의 함수를 내부적으로 사용. 기존 개별 jsp에 존재하던 함수 */
// 전독자번호 유효성 체크
function valid_prev_rdr_no(s_word){
  return isValidFormatX(s_word, /^(\d{5})$/);
}

/* 기존 common.js의 함수를 내부적으로 사용. 기존 개별 jsp에 존재하던 함수 */
// 구역코드 유효성 체크
function valid_dstc_no(s_word){
  return isValidFormatX(s_word, /^(\d{3})$/);
}

/* 기존 common.js의 함수를 내부적으로 사용. 기존 개별 jsp에 존재하던 함수 */
// 구역+배달 유효성 체크
function valid_dstc_dlvno(s_word){
  return isValidFormatX(s_word, /^(\d{6})$/);
}

/* 기존 common.js의 함수를 내부적으로 사용. 기존 개별 jsp에 존재하던 함수 */
// 전화번호 유효성 체크
function valid_tel_no(s_word){
  return isValidFormatX(s_word, /^(\d{4}|\d{7,8}|\d{10,}|(\d{2,4})-{0,1}(\d{3,4})-{0,1}(\d{4}))$/);
}

/* 기존 common.js의 함수를 내부적으로 사용. 기존 개별 jsp에 존재하던 함수 */
// 주소 유효성 체크(맨 끝자리의 문자가 ".") 인가?
function valid_addr(s_word){
  return (s_word.lastIndexOf(".") != -1 && s_word.length == s_word.lastIndexOf(".") + 1)? true : false;
}

/**
* 입력값이 사용자가 정의한 포맷 형식인지 체크
* 자세한 format 형식은 자바스크립트의 'regular expression'을 참조
* common.js 에 있던 함수로 이름을 바꿔서 적용.
*/
function isValidFormatX(inputStr,re) {
   if (re.test(inputStr)) {
        return true; //올바른 포맷 형식
   }
   return false;
}

/*************************************************************************************************/
/* 2. 공통 기능 제어
 * 1)  close  : 공통 MDI close 호출. 에러시(CIIS 공통 MDI 외에서 호출되었을 경우) window.close() 호출
 * 2)  confirm : trustform 기반에서 confirm함수.
 * 3)  checkNotFixedCell : grid click(dblclick)시 클릭된 cell이 fixed cell이 아닌 데이터 영역인지 체크.
 * 4)  addGroupButton : group button 생성
 * 5)  getGroupButton : group button의 갯수.
 * 6)  removeAllGroupButton : group 내 group button 일괄 삭제
 * 7)  disableChildControl : group 내 컨트롤의 disable 속성을 일괄 변경
 * 8)  checkAllGridChkCol : grid에서 check column을 일괄 변경
 * 9)  gridSubtotal : grid subtotal 처리. 
 * 10) arrangeSubTotal   : grid subtotal을 grid 기능이 아닌 직접 구현해야 할 경우 subtotal의 각 output의 left위치와 width를 grid에 맞게 동적으로 지정.
                           grid subtotal을 grid 기능이 아닌 직접 구현해야 할 경우 UI 디자인의 편의를 돕고 grid column 변경이 일어날 경우 동적으로 변경하는데 사용
 * 11)  gridReadOnly      : colRef를 이용한 grid readonly 설정.
 * 12)  gridCellAttribute :  grid의 특정 셀 영역의 attribute를 설정.
 * 13)  gridCellStyle : grid의 특정 셀 영역의 style을 설정.
 * 14) clearSelectCombo  : select 의 nodeset path를 이용하여 combo를 clear한다.
 * 15) addSelectCombo    : combo에 item 추가.
 * 16) setSelectDefault  : select계열 컨트롤 default값 설정.
 * 17) clearGridCols     : 해당 그리드의 column을 모두 삭제한다.
 * 18) buildGridCols : grid의 column을 생성한다. 동적으로 grid를 구성할 때 사용.
 * 19) addGridColumn : grid에 column을 추가한다.
 * 20) insertGridColumn : grid에 column을 추가한다. 특정 위치에 column을 삽입함.
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
 * _group : button이 생성될 group
 * _id : button id
 * _btnGroup : button group 속성
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
   btnObj.attribute("text") = _title;										// 생성된 Task Button의 text
   btnObj.attribute("DOMActivate") = _handler;							// 생성된 Task Button의 DOMActivate 이벤트
}

/**
 * _group : group control
 * _btnGroup : button group 속성
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
 * _btnGroup : button group 속성
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
 * _disable : disable 시킬지 여부 true/false
 * _onlydisable : true - 개체의 disable 속성 제어. false - editable 속성을 제어(select 계열은 disable 제어)
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
 * _grid : grid 개체 혹은 id
 * _chkcol : check column
 * _chk : check할지 uncheck 할지 여부. boolean. optional. 값을 주지 않을 경우 전체가 체크되어 있는 상황에서는 전체 uncheck을 그렇지 않은 경우에는 전체 check.
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
 * _type에 null 입력시 1) 각 column에 설정된 "subtotaltype" 값으로 각 컬럼의 subtotal type을 결정 2) 해당 속성이 없을 경우 default로 sum 설정
 * _formats 에 null 입력시 각 column에 설정된 "format" 설정값을 사용.
 * _grid : grid 개체 혹은 id
 * _type : subtotal type (sum, average...)
 * _titlefld : "계" 와 같이 subtotal 행의 제목이 위치할 column. null 가능.
 * _title : 제목. null 가능.
 * _fields : subtotal을 설정할 column의 ref 배열. null 가능. 제목 column을 제외한 전체 column
 * _formats : subtotal column의 포맷 배열. null 가능.
 * _style : subtotal행의 스타일. null 가능.
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
그리드의 subtotal이 subtotal 함수를 사용하여 만들지 못하고 인위적으로 output을 만들어 사용해야 할 경우 사용.
아래의 존건대로 UI를 만든 후 해당 함수를 호출하면 output을 자동으로 정렬해 준다.
grid의 column 사이즈를 변경할 경우 이벤트에서 해당 함수를 호출하면 변경된 사이즈에 맞게 변경시킬 수 있다.
** grid column을 이동할 경우에는 다른 함수를 사용해야 함.
** 순서가 맞지 않을 경우 grid내부의 output 순서를 grid와 동일하게 조정한다.
** grid의 onafteruserresize 에서 호출시 동작은 하지만 subtotal에 scroll이 생성되지 않아 일부가 가려지는 문제 있음.
1. subtotal은 grid column 갯수(보이는 갯수) 만큼의 output과 이를 포함하고 있는 group으로 구성되어야 한다.
2. 소스상의 output 순서는 grid column 순서와 동일해야한다.
3. left와 width는 임의로 지정해 놓아도 된다.
4. top, height는 조정하지 않으므로 설정한다.
5. output의 ref는 소스 상에서 output의 순서에 따라 grid column과 매치되어야 한다.
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
 * _grid : 그리드 개체
 * _srow : 시작 row
 * _scol : 시작 column
 * _erow : 끝 row. optional.
 * _ecol : 끝 column. optional.
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
 * column은 ref 값을 사용.
 * _grid : 그리드 개체
 * _att : 속성명
 * _val : 스타일 값.
 * _srow : 시작 row
 * _scol : 시작 column
 * _erow : 끝 row. optional.
 * _ecol : 끝 column. optional.
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
 * column은 ref 값을 사용.
 * _grid : 그리드 개체
 * _style : 스타일 속성명
 * _val : 스타일 값.
 * _srow : 시작 row
 * _scol : 시작 column
 * _erow : 끝 row. optional.
 * _ecol : 끝 column. optional.
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
area combo clear. combo의 nodeset이 item level이어야 함.
combo : combo 개체
defaultLabel : default label이 필요할 경우 값을 넣어준다. null인 경우 nodeset을 새로 만들지 않는다.
defaultValue : default label에 해당하는 value
refresh : refresh여부
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
combo item 추가 
combo : combo 개체
label : label
value : value
refresh : refresh여부
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
 * select, select1 계열 컨트롤의 default 값 설정.
 * _selctr : select 계열 컨트롤 id 혹은 개체
 * _defaultVal : defaut 값. null일 경우 _defaultIdx로 설정.
 * _defaultIdx : default 값이 존재하지 않을 경우 선택할 item index. null 혹은 음수값일 경우 셋팅하지 않는다.
 * _refresh : 해당 컨트롤 refresh 여부.
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
 * 그리드의 모든 column을 삭제
 * _grid : grid id 혹은 개체
 * _refresh : refresh 여부
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

   //node부터 삭제하면 에러 발생.
   model.removeNodeset(nodeset);

   if(_refresh)
      _grid.refresh();
}

/*
_grid : grid id
_captionSet : "^"로 분할된 문자열. "^"로 분할된 문자열인 경우 넣어준 갯수 만큼 grid의 앞에서부터 caption을 채운다. null 가능.
_caption : column 의 caption prefix/suffix. _captionSet 외에 일괄적으로 붙일 caption pre/suf
_prefix : _caption이 caption명의 prefix인지 suffix 인지 지정 (caption1, caption2... 혹은 1caption, 2caption... 이 될지를 지정)
_refresh : 생성 후 refresh 여부
_dataset : grid의 dataset 속성 값. (record수준까지)
_type : column의 type 속성 값. (output 외에는 필요에 따라 추가적인 속성 혹은 child 생성 필요.
_width : column width 속성 값.
_txtAlign : column align 속성 값.
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

   //caption 에 빈문자열을 넣는순간 column 생성.
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
_refresh : 생성 후 refresh 여부
_ref : column의 ref 속성 값.
_type : column의 type 속성 값. (output 외에는 필요에 따라 추가적인 속성 혹은 child 생성 필요.
_width : column width 속성 값.
_txtAlign : column align 속성 값.
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
_idx : column을 생성할 위치 index.
_before : _idx의 앞 혹은 뒤에 생성할지 여부.
_refresh : 생성 후 refresh 여부
_ref : column의 ref 속성 값.
_type : column의 type 속성 값. (output 외에는 필요에 따라 추가적인 속성 혹은 child 생성 필요.
_width : column width 속성 값.
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
/* 3. TrustForm 관련 Util 함수
 * 1)  curCellValue  	 : param1 해당 그리드의 선택된 cell 의 값
 * 2)  setCurCellValue   : 위 함수의 set 버전
 * 3)  curRowRefColValue : param1 그리드상에서 현재 선택된 row의 param2를 ref로 가지는 column의 값.
 * 4)  setCurRowRefColValue : 위 함수의 set 버전
 * 5)  gridRefColValue   : param1 그리드상에서 param2 row의 param3를 ref로 가지는 column의 값. 
 * 6)  setGridRefColValue : 위 함수의 set 버전
 * 7)  modelCopyValue    : param2 path의 값을 param1 path에 복사
 * 8)  modelCopyXpathValue : param2 의 xpath 함수를 계산하여 param1에 복사
 * 9)  remakeNode        : 노드를 삭제하고 다시 만든다.
 * 10)  makeCopyNode      : 노드를 생성하고 값을 copy해 온다.
 * 11)  makeValueNode     : 노드를 생성하고 값을 셋팅한다.
 * 12) childValueCopy    : param2 path의 모든 하위 노드 값을 param1 path의 하위노드에 복사 한다. param1에 없는 노드는 skip
 * 13) gridRowValueCopy  : grid의 특정 행을 노드에 복사
 * 14) gridRowCopyToOpener : grid의 특정 행을 opener의 노드에 복사
 * 15) setNodesetValue : 노드셋에 일괄적으로 동일한 값을 복사
 * 16)  makeNodesetToForm : nodeset을 저장에 사용할 form 형태로 변형. parameter이름에 index를 붙여서 구분.
 * 17)  makeNodesetToFormNamed : nodeset을 저장에 사용할 form 형태로 변형. 필드를 한정할 수 있다.
 * 18) makeNodesetToArrayForm : nodeset을 저장에 사용할 form 형태로 변형. 동일명의 배열 형태로 구성.
 * 19) makeNodesetToArrayFormNamed : 필드를 한정할 수 있다.
 * 20) makeNodesetToAppendForm : nodeset을 저장에 사용할 form 형태로 변형. 필드하나당 하나의 parameter로 구성하고 값을 delim으로 붙여서 구성.
 * 21) makeNodesetToAppendFormNamed : 필드를 한정할 수 있다.
 * 22) makeNodesetWithoutDisabled : 노드셋을 복사하고, disabled된 컨트롤에 해당하는 노드를 삭제한다. disabled된 컨트롤의 값이 서버에 전달되지 않도록 함.
 * 23) makeNodesetSelectToArray : 복수선택이 가능한 select계열 컨트롤의 값을 분할하여 노드셋으로 변환. html checkbox 처럼 값이 서버에 전달되도록 하기 위함.
 * 24) makeNodesetBasedOnCtrl : 위의 makeNodesetWithoutDisabled, makeNodesetSelectToArray의 기능 합침.
 * 25) splitNodeToNodes : 노드의 값이 구분자로 연결되어 있을 경우 해당 값을 분할하여 노드셋으로 변환.
 * 26) clearChildNodes   : 하위 노드의 값을 빈문자열로 setting.
 * 27) clearChildControl : 하위 컨트롤들의 값을 빈문자열로 setting.
 * 28) resetChildControl : 하위 컨드롤의 셋팅을 초기화함. input="", select(0), disabled = false, 
 * 29) concatSelectValues : select 계열 컨트롤의 dataset값들을 구분자를 이용하여 하나의 문자열로 합친다.
 * 30) concatNodesetValues : 해당 xpath에 해당한는 nodeset 값을 구분자를 이용하여 하나의 문자열로 합친다.
 * 31) concatNodeChildValues : 해당 xpath에 해당하는 mnode의 child node의 값을 합한다.
 * 32) concatGridColValues : 그리드의 특정 행의 값을 구분자를 이용하여 하나의 문자열로 합친다. 체크박스 컬럼을 이용하여 포함여부를 결정할 수 있다.
 */
/*************************************************************************************************/

/**
 * 그리드의 현재 행, 현재 열의 값 return
**/
function curCellValue(_grid)
{
   return _grid.valueMatrix(_grid.row, _grid.col);
}

/**
 * 그리드의 현재 행, 현재 열의 값 지정.
**/
function setCurCellValue(_grid, _val)
{
   _grid.valueMatrix(_grid.row, _grid.col) = _val;
}

/**
 * 그리드의 현재 행 (grid.row) 의 특정 ref를 가지는 열의 값 가져옴
**/
function curRowRefColValue(_grid, _ref)
{
   return _grid.valueMatrix(_grid.row, _grid.colRef(_ref));
}

/**
 * 그리드의 현재 행 (grid.row) 의 특정 ref를 가지는 열의 값 지정.
**/
function setCurRowRefColValue(_grid, _ref, _val)
{
   _grid.valueMatrix(_grid.row, _grid.colRef(_ref)) = _val;
}

/**
 * 그리드의 특정 행의 특정 ref를 가지는 열의 값을 가져옴
**/
function gridRefColValue(_grid, _row, _ref)
{
	return _grid.valueMatrix(_row, _grid.colRef(_ref));
}

/**
 * 그리드의 특정 행의 특정 ref를 가지는 열의 값을 지정
**/
function setGridRefColValue(_grid, _row, _ref, _val)
{
	_grid.valueMatrix(_row, _grid.colRef(_ref)) = _val;
}

/**
 * 값 복사. 노드 -> 노드
**/
function modelCopyValue(_tar, _src)
{
	model.setValue(_tar, model.getValue(_src));
}

/**
 * xpath 함수 실행 결과를 타겟에 복사.
 * _tar : target node path
 * _xpath : xpath 함수를 포함한 source path
**/
function modelCopyXpathValue(_tar, _xpath)
{
   model.setValue(_tar, model.getXPathValue(_xpath));
}

/**
 * 노드를 삭제 후 생성.
**/
function remakeNode(_xpath)
{
	model.removeNodeset(_xpath);
	model.makeNode(_xpath);
}

/**
 * 노드를 생성한 후 값을 복사.
 * _tarPath : target node path
 * _srcPath : source node path
**/
function makeCopyNode(_tarPath, _srcPath)
{
	model.makeNode(_tarPath);
	model.setValue(_tarPath, model.getValue(_srcPath));
}

/**
 * 노드를 생성한 후 값을 셋팅.
 * _tarPath : 타겟 노드 path
 * _val : 값
**/
function makeValueNode(_tarPath, _val)
{
	model.makeNode(_tarPath);
	model.setValue(_tarPath, _val);
}

/**
 * 노드의 모든 하위 노드 값을 타겟의 하위 노드에 복사. 존재할 경우에만 복사.
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
 * 그리드의 특정 행을 특정 노드로 복사
 * _tar : 복사 결과 노드 path
 * _grid : 복사 대상 grid
 * _row : 복사 대상 grid row
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
 * 그리드의 특정 행을 현재 창을 생성한 opener의 특정 노드로 복사
 * _tar : 복사 결과 노드 path
 * _grid : 복사 대상 grid
 * _row : 복사 대상 grid row
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
 * _xpath : 노드셋 path
 * _val : value
**/
function setNodesetValue(_xpath, _val)
{
   var nodeset = instance1.selectNodes(_xpath);
   for(var i=0; nodeset!=null && i<nodeset.length; i++)
      nodeset.item(i).value = _val;
}

/**
 * 노드셋의 반복된 필드 값들을 하나의 노드아래에 순차적인 이름으로 재구성한다.  (그리드 데이터를 폼으로 구성하는 경우에 사용 가능하다.)
 * 예)
   <record>     ------->     <newnode>
    <a>a</a>                  <a0>a</a0>
    <b>b</b>                  <b0>b</b0>
   </record>                  <a1>c</a1>
   <record>                   <b1>d</b1>
    <a>c</a>                 </newnode> 
    <b>d</b>
   </record>
 * _srcNodesetPath : record 단위까지의 path
 * _tarPath : 새로 만들어질 결과.
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
 * 노드셋의 반복된 필드 값들을 하나의 노드아래에 순차적인 이름으로 재구성한다.
 * 노드셋의 특정 노드의 집합을 지정한다.
 * _srcNodesetPath : record 단위까지의 path
 * _tarPath : 새로 만들어질 결과.
 * _fieldArr : 필드를 배열로 지정한다. 원래 이름과 신규 이름의 배열로 넘길 경우 (최종 2차 배열) 이름을 변경해서 저장 가능.
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
 * 노드셋의 반복된 필드 값들을 하나의 노드아래의 동일명의 노드로 중복해서 생성한다.  (그리드 데이터를 폼으로 구성하는 경우에 사용 가능하다.)
 * http의 post로 전송할 경우 배열로 받게된다. 노드셋의 모든 하위 노드에 대해 수행한다.
 * 예)
   <record>     ------->     <newnode>
    <a>a</a>                  <a>a</a>
    <b>b</b>                  <b>b</b>
   </record>                  <a>c</a>
   <record>                   <b>d</b>
    <a>c</a>                 </newnode> 
    <b>d</b>
   </record>
 * _srcNodesetPath : record 단위까지의 path
 * _tarPath : 새로 만들어질 결과.
 * _chkField : checkbox 필드의 ref node
 * _chkVal : check 여부를 결정하는 값.
 * _notremake : target node를 새로 만들지 여부.
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
 * 노드셋의 반복된 필드 값들을 하나의 노드아래의 동일명의 노드로 중복해서 생성한다. http의 post로 전송할 경우 배열로 받게된다. 
 * 노드셋의 특정 노드의 집합을 지정한다.
 * _srcNodesetPath : record 단위까지의 path
 * _tarPath : 새로 만들어질 결과.
 * _chkField : checkbox 필드의 ref node
 * _chkVal : check 여부를 결정하는 값.
 * _notremake : target node를 새로 만들지 여부.
 * _fieldArr : 필드를 배열로 지정한다. 원래 이름과 신규 이름의 배열로 넘길 경우 (최종 2차 배열) 이름을 변경해서 저장 가능.
 * _notremake : 타겟 노드를 새로 생성할 지 여부.
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

            //변형해야할 필드명을 기존필드와 새로운필드명의 array로 넘길 수 있다.
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

               //check필드는 index 순차값을 가진다.
               if(nodeName == _chkField)
               {
                  model.makeNode(_tarPath + "/" + newName + "[" + idx + "]");
                  model.setValue(_tarPath + "/" + newName + "[" + idx + "]", idx-1);
               }
               //그외 필드는 해당하는 값.
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
 * 노드셋의 반복된 필드 값들을 하나의 필드에 구분자로 합친다. (그리드 데이터를 폼으로 구성하는 경우에 사용 가능하다.)
 * 노드셋의 모든 하위 노드에 대해 수행한다.
 * 예) 구분자 : ##, 마지막 구분자 제외.
   <record>     ------->     <newnode>
    <a>a</a>                  <a>a##c</a>
    <b>b</b>                  <b>b##d</b>
   </record>                 </newnode>
   <record>
    <a>c</a>
    <b>d</b>
   </record>
 * _srcNodesetPath : 소스 node xpath
 * _tarPath : 타겟 node xpath
 * _chkField : checkbox 필드의 ref node. optional
 * _chkVal : check 여부를 결정하는 값.
 * _delim : 구분자
 * _exclud : 마지막 구분자를 포함할지 제외할 지여부
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
 * 노드셋의 반복된 필드 값들을 하나의 필드에 구분자로 합친다. 노드셋의 특정 노드의 집합을 지정한다.
 * _srcNodesetPath : 소스 node xpath
 * _tarPath : 타겟 node xpath
 * _chkField : checkbox 필드의 ref node. optional
 * _chkVal : check 여부를 결정하는 값.
 * _delim : 구분자
 * _exclud : 마지막 구분자를 포함할지 제외할 지여부
 * _fieldArr : 대상 필드들을 지정한 배열. 원래 이름과 신규 이름의 배열로 넘길 경우 (최종 2차 배열) 이름을 변경해서 저장 가능.
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
				
            //변형해야할 필드명을 기존필드와 새로운필드명의 array로 넘길 수 있다.
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
         
         //변형해야할 필드명을 기존필드와 새로운필드명의 array로 넘길 수 있다.
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
 * 노드셋의 반복된 필드 값들을 하나의 필드에 구분자로 합친다. (그리드 데이터를 폼으로 구성하는 경우에 사용 가능하다.)
 * 노드셋의 모든 하위 노드에 대해 수행한다.
 * 예) 구분자 : ##, 마지막 구분자 제외.
   <record>     ------->     <newnode>
    <a>a</a>                  <a>a##c</a>
    <b>b</b>                  <b>b##d</b>
   </record>                 </newnode>
   <record>
    <a>c</a>
    <b>d</b>
   </record>
 * _srcNodesetPath : 소스 node xpath
 * _tarPath : 타겟 node xpath
 * _delim : 구분자
 * _exclud : 마지막 구분자를 포함할지 제외할 지여부
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
 * 노드셋의 반복된 필드 값들을 하나의 필드에 구분자로 합친다. 노드셋의 특정 노드의 집합을 지정한다.
 * _srcNodesetPath : 소스 node xpath
 * _tarPath : 타겟 node xpath
 * _delim : 구분자
 * _exclud : 마지막 구분자를 포함할지 제외할 지여부
 * _fieldArr : 대상 필드들을 지정한 배열. 원래 이름과 신규 이름의 배열로 넘길 경우 (최종 2차 배열) 이름을 변경해서 저장 가능.
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
				
            //변형해야할 필드명을 기존필드와 새로운필드명의 array로 넘길 수 있다.
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
         
         //변형해야할 필드명을 기존필드와 새로운필드명의 array로 넘길 수 있다.
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
 * disabled control을 제외하여 instance를 생성. 
 * html의 disabled개체를 포함한 form과 동일한 동작을 보장하기 위함.
 * upload control은 처리하지 못함.
 * _formPath : 원본 노드 xpath
 * _ctrGroup : _formPath를 사용하는 컨트롤을 담고 있는 group
 * _newForm : 복사할 타겟 노드 xpath
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
 * TrustForm의 select계열컨트롤(check, list)을 Html 개체(check, multi select)와 동일한 방식으로 전송하기 위해 배열로 구성해줌.
 * 기본적으로 select계열의 ref 속성에 지정된 노드명을 사용하여 배열을 만듦.
 * select에 rel 속성(사용자정의) 에 노트 path가 지정되어 있을 경우, rel 노드로 배열 생성.
 * _formPath : 원본 노드 xpath
 * _ctrGroup : _formPath를 사용하는 컨트롤을 담고 있는 group
 * _newForm : 복사할 타겟 노드 xpath
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
 * makeNodesetWithoutDisabled와 makeNodesetSelectToArray의 기능을 합쳐 놓음.
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
 * 노드의 값이 구분자로 연결된 문자열인 경우, 해당 노드를 노드셋으로보 분할(배열)
 * _node : node xpath
 * _delim : 구분자
 * _tarNode : 값을 저장할 대상 node xpath
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
 * _refresh : 화면을 refresh할지 여부.
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
 * _group : 대상 컨트롤을 담고 있는 group.
 * _refresh : 화면을 refresh할지 여부.
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
			//ctr.value = "";   //컨트롤마다 reset 하는 관계로 node를 직접 변경.
         if(ctr.attribute("ref") != null && ctr.attribute("ref") != "")
            model.setValue(ctr.attribute("ref"), "");
		}
	}

   if(_refresh)
      _group.refresh();
}

/**
 * _group : 대상 컨트롤을 담고 있는 group.
 * _refresh : 화면을 refresh할지 여부.
 * _resetdisabled : disabled된 컨트롤의 dsiabled 상태를 풀어줄지 여부
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
 _control : 대상 control (select, select1 계열)
 _delim : 구분자
 _excludeEndDelim : 마지막 구분자(문자열 끝)를 제외할지 여부
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
 _delim : 구분자
 _excludeEndDelim : 마지막 구분자(문자열 끝)를 제외할지 여부
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
 _delim : 구분자
 _excludeEndDelim : 마지막 구분자(문자열 끝)를 제외할지 여부
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
 _grid : 대상 그리드
 _colref : 대상 column ref
 _delim : 구분자
 _excludeEndDelim : 마지막 구분자를 제외할 지 여부
 _chkcolref : 포함여부를 체크할 체크박스 column ref. optional
 _chkval : _chkcolref의 체크시 값.
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
/* 8. 공통 팝업 함수
 * 1) openBranch        : 지국선택공통화면 modal open. openBranchPub (출판)
 * 2) searchBranchByName: 지국명으로 지국 조회. searchBranchByNamePub (출판)
 * 3) openBranchPub     : 출판용 지국선택
 * 4) searchBranchByNamePub : 출판용 지국검색
 * 5) openZip           : 우편번호 검색 팝업. openZipPub (출판) -> 공통 script (CIISComm.js로 이동)
 * 6) searchZip         : 우편번호 검색. searchZipPub (출판) -> 공통 script (CIISComm.js로 이동)
 * 7) openZipPub        : 출판용 우편번호선택
 * 8) searchZipPub      : 출판용 우편번호검색
 * 9) openUserDetailPub : 출판용 독자상세 팝업 (조회전용)
 * 10) openUserPub       : 출판용 독자상세 팝업 (수정, 삭제)
 * 11) openReaderPub     : 출판용 정기독자 조회 팝업
 * 12) searchReaderService : 독자 서비스 조회 (서비스내역 및 이미지 컨트롤)
 * 13) openReaderDetailView : 독자상세조회 팝업
 * 14) openRdrExtn       : 확장자 조회 팝업
 * 15) searchRdrExtn     : 확장자 검색
 * 16) openBnsItem       : 판촉물 조회
 * 17) searchBnsItem     : 판촉물 검색
 * 18) openReaderSearchModal : 독자조회 팝업 (modal)
 * 19) openReaderSearch  : 독자조회 팝업 (modeless)
 */
/*************************************************************************************************/

/**
 * _ref : 넘겨줄 parameter를 담고 있는 node path
 * _resRef : return 값을 받은 node path.
**/
function openBranch(_ref, _resRef)
{
   var style = "width:660px; height:415; align:center; caption:hidden";
   model.property("BRANCH_RES_XPATH") = _resRef;
   
   remakeNode(_resRef);
   window.load("/xrw/ss/common/ss_common_1110_p.xrw", "modal", "BRANCHPOP", style, _ref, "/root/tempData/searchBranch");
}

/**
 * _ref : 넘겨줄 parameter를 담고 있는 node path
 * _resRef : return 값을 받은 node path.
 * callback : 모듈 실행 후 실행할 callback 함수
 * flagnode : flag 제어. 일부 화면에서 지국 검색과 리스트 검색이 연동되도록 되어 있는 경우에 사용.
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
         alert("callback 함수를 실행하는데 문제가 발생했습니다:" + callback);
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
 * _ref : 넘겨줄 parameter를 담고 있는 node path
 * _resRef : return 값을 받은 node path.
**/
function openBranchPub(_ref, _resRef)
{
   var style = "width:660px; height:435; align:center; caption:hidden;";
   model.property("BRANCH_RES_XPATH") = _resRef;
   
   remakeNode(_resRef);
   window.load("/xrw/ps/common/ps_common_1901_p.xrw", "modal", "BRANCHPOP", style, _ref, "/root/tempData/searchBranch");
}

/**
 * _ref : 넘겨줄 parameter를 담고 있는 node path
 * _resRef : return 값을 받은 node path.
**/
function searchBranchByNamePub(_ref, _resRef)
{
   remakeNode(_resRef);
   modelSendNoMake("commSearchBranchByName", "/ps/common/1906", _ref, _resRef);
}

/** --> CIISComm.js로 이전.
_ref : request data node path
       zip - 검색단어, job_flag - 특정지국/전체우편번호 검색범위 지정
_resRef : 검색결과 데이터를 저장할 data node path
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
       zip - 검색단어, disp_flag - 지국명을 표시할지 여부. "L"이면 지국을 표시하지 않는다.
_resRef : 검색결과 데이터를 저장할 data node path
*/
function openZipPub(_ref, _resRef)
{
   var style = "width:410px; height:415; align:center; caption:hidden";
   model.property("ZIP_RES_XPATH") = _resRef;
   
   remakeNode(_resRef);
   window.load("/xrw/ps/common/ps_common_1801_p.xrw", "modal", "ZIPPOP", style, _ref, "/root/tempData/zipForm");
}

/**
 * _ref : 넘겨줄 parameter를 담고 있는 node path
 * _resRef : return 값을 받은 node path.
**/
function searchZipPub(_ref, _resRef)
{
   remakeNode(_resRef);
   modelSendNoMake("commSearchZip", "/ps/common/1111", _ref, _resRef);
}

/**
 * _ref : 넘겨줄 parameter를 담고 있는 node path
 * _resRef : return 값을 받은 node path.
**/
// 독자상세 팝업(조회전용)
function openUserDetailPub(_ref, _resRef)
{
   var style = "width:860px; height:785; align:center; caption:hidden";
   model.property("USER_RES_XPATH") = _resRef;
   
   remakeNode(_resRef);
   window.load("/xrw/ps/common/ps_common_1416_p.xrw", "modal", "DETAILPOP", style, _ref, "/root/tempData/userForm");
}

/**
 * _ref : 넘겨줄 parameter를 담고 있는 node path
 * _resRef : return 값을 받은 node path.
**/
//독자상세 팝업(수정,삭제)
function openUserPub(_ref, _resRef)
{
   var style = "width:950px; height:500; align:center; caption:hidden";
   model.property("USER_RES_XPATH") = _resRef;
   
   remakeNode(_resRef);
   window.load("/xrw/ps/common/ps_common_1000_p.xrw", "modal", "DETAILPOP", style, _ref, "/root/tempData/userForm");
}

/**
 * _ref : 넘겨줄 parameter를 담고 있는 node path
 * _resRef : return 값을 받은 node path.
**/
// 정기독자 조회 팝업
function openReaderPub(_ref, _resRef)
{
   var style = "width:710px; height:320; align:center; caption:hidden";
   model.property("USER_RES_XPATH") = _resRef;
   
   remakeNode(_resRef);
   window.load("/xrw/ps/common/ps_common_1106_p.xrw", "modal", "DETAILPOP", style, _ref, "/root/tempData/userForm");
}

/**
 * _ref : 넘겨줄 parameter를 담고 있는 node path
 * _resRef : return 값을 받은 node path.
 * _imgcontrol : 결과값에 따라 관련 image control을 제어할지 여부.
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
 * 독자상세조회 popup
 * _ref : request parameter를 담고 있는 node path
 *        parameter는 bocd, rdr_no, find_type 이 가능하다. rdr_no는 필수.
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
   var popid = "RDRDETAILPOP" + date.getTime();	//id 중복을 피하기 위한 timestamp
   
   var prop = "left:140px; top:50px; width:935px; height:570px;";
   var url = "/xrw/ss/reader/sl_reader_1100_a.xrw";
   window.load(url, "modeless", popid, prop);
   
   window.children(popid).window.javaScript.setPostParameter(arr);
}

/**
 * 확장자 조회 popup
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
 * 확장자 검색
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
 * 판촉물 조회 popup
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
 * 판촉물 검색 
 * <bnsItemcdSearchForm>
      <bns_itemnm/>
      <bns_itemcd/>
      <pageno/>
      <pagesize/>
   </bnsItemcdSearchForm>  (상동)
**/
function searchBnsItem(_ref, _resRef)
{
   remakeNode(_resRef);
   modelSendNoMake("commBnsItemSearch", "/ss/slcommon/1505", _ref, _resRef);
}

/**
 * 독자조회 popup
**/
function openReaderSearchModal(_ref, _resRef)
{
   var style = "width:940px; height:435; align:center; caption:hidden;";
   model.property("RDRDETAILSEARCHSALES_RES_XPATH") = _resRef;

   remakeNode(_resRef);
   window.load("/xrw/ss/common/ss_common_1170_p.xrw", "modal", "READERSEARCHPOP", style, _ref, "/root/initData/postData/readerSearchForm");
}

/**
 * 독자조회 popup (modeless)
**/
function openReaderSearch(_id, _resRef)
{
   var style = "width:940px; height:435; align:center; caption:hidden;";
   model.property("RDRDETAILSEARCH_RES_XPATH") = _resRef;
   window.load("/xrw/ss/slcommon/sl_common_1100_p.xrw", "modeless", _id, style);
}


/*************************************************************************************************/
/* 9. 공통 모듈 호출
 * 1) callServletPage : 일반 jsp 페이지를 호출해 주는 함수. iviewer 내에서 호출하므로 화면 전환이 없다. print 출력 jsp등에 사용.
 * 2) callServletPagePub : 판매용 함수.
/* 3) 
/* 4) 
/* 5)  
/* 6)
/*************************************************************************************************/

/**
 * action : 실행시키고자 하는 target url.
 * ref : target url에 넘겨줄 parameter를 담고 있는 node.
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
 * action : 실행시키고자 하는 target url.
 * ref : target url에 넘겨줄 parameter를 담고 있는 node.
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
 * callServletPage로 oz print module을 실행시 oz preview 화면이 display 되지 않음.
 * iviewer를 inline으로 배치하고 크기도 일정 크기 이상 (20px이상) 되어야 모듈이 실행됨.
 * 아마도 hidden이거나 화면에 display 될정도의 크기가 아니면 TrustForm에서 object를 제대로 그리지 않는 것으로 보임.
 * 따라서 아래와 같이 일정 크기로 표시한 후 timer를 이용하여 해당 컨트롤을 다시 숨김.
 * action : 실행시키고자 하는 target url.
 * ref : target url에 넘겨줄 parameter를 담고 있는 node.
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
 * callServletPage로 oz print module을 실행시 oz preview 화면이 display 되지 않음.
 * iviewer를 inline으로 배치하고 크기도 일정 크기 이상 (20px이상) 되어야 모듈이 실행됨.
 * 아마도 hidden이거나 화면에 display 될정도의 크기가 아니면 TrustForm에서 object를 제대로 그리지 않는 것으로 보임.
 * 따라서 아래와 같이 일정 크기로 표시한 후 timer를 이용하여 해당 컨트롤을 다시 숨김.
 * action : 실행시키고자 하는 target url.
 * ref : target url에 넘겨줄 parameter를 담고 있는 node.
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