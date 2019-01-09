/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.lnk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_5075_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sdsiidx;
	public String sdsipaymentidx;
	public String promisecode;
	public String result;
	public String resultcode;
	public String resultmsg;
	public String fmserr;
	public String fmserrmsg;
	public String incmg_pers_addr;
	public String incmg_pers;

	public TN_LNK_5075_ADM(){}
	public TN_LNK_5075_ADM(String cmpy_cd, String sdsiidx, String sdsipaymentidx, String promisecode, String result, String resultcode, String resultmsg, String fmserr, String fmserrmsg, String incmg_pers_addr, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.sdsiidx = sdsiidx;
		this.sdsipaymentidx = sdsipaymentidx;
		this.promisecode = promisecode;
		this.result = result;
		this.resultcode = resultcode;
		this.resultmsg = resultmsg;
		this.fmserr = fmserr;
		this.fmserrmsg = fmserrmsg;
		this.incmg_pers_addr = incmg_pers_addr;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSdsiidx(String sdsiidx){
		this.sdsiidx = sdsiidx;
	}

	public void setSdsipaymentidx(String sdsipaymentidx){
		this.sdsipaymentidx = sdsipaymentidx;
	}

	public void setPromisecode(String promisecode){
		this.promisecode = promisecode;
	}

	public void setResult(String result){
		this.result = result;
	}

	public void setResultcode(String resultcode){
		this.resultcode = resultcode;
	}

	public void setResultmsg(String resultmsg){
		this.resultmsg = resultmsg;
	}

	public void setFmserr(String fmserr){
		this.fmserr = fmserr;
	}

	public void setFmserrmsg(String fmserrmsg){
		this.fmserrmsg = fmserrmsg;
	}

	public void setIncmg_pers_addr(String incmg_pers_addr){
		this.incmg_pers_addr = incmg_pers_addr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSdsiidx(){
		return this.sdsiidx;
	}

	public String getSdsipaymentidx(){
		return this.sdsipaymentidx;
	}

	public String getPromisecode(){
		return this.promisecode;
	}

	public String getResult(){
		return this.result;
	}

	public String getResultcode(){
		return this.resultcode;
	}

	public String getResultmsg(){
		return this.resultmsg;
	}

	public String getFmserr(){
		return this.fmserr;
	}

	public String getFmserrmsg(){
		return this.fmserrmsg;
	}

	public String getIncmg_pers_addr(){
		return this.incmg_pers_addr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_5075_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_5075_ADM dm = (TN_LNK_5075_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sdsiidx);
		cstmt.setString(5, dm.sdsipaymentidx);
		cstmt.setString(6, dm.promisecode);
		cstmt.setString(7, dm.result);
		cstmt.setString(8, dm.resultcode);
		cstmt.setString(9, dm.resultmsg);
		cstmt.setString(10, dm.fmserr);
		cstmt.setString(11, dm.fmserrmsg);
		cstmt.setString(12, dm.incmg_pers_addr);
		cstmt.setString(13, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_5075_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("sdsiidx = [" + getSdsiidx() + "]");
		System.out.println("sdsipaymentidx = [" + getSdsipaymentidx() + "]");
		System.out.println("promisecode = [" + getPromisecode() + "]");
		System.out.println("result = [" + getResult() + "]");
		System.out.println("resultcode = [" + getResultcode() + "]");
		System.out.println("resultmsg = [" + getResultmsg() + "]");
		System.out.println("fmserr = [" + getFmserr() + "]");
		System.out.println("fmserrmsg = [" + getFmserrmsg() + "]");
		System.out.println("incmg_pers_addr = [" + getIncmg_pers_addr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String sdsiidx = req.getParameter("sdsiidx");
if( sdsiidx == null){
	System.out.println(this.toString+" : sdsiidx is null" );
}else{
	System.out.println(this.toString+" : sdsiidx is "+sdsiidx );
}
String sdsipaymentidx = req.getParameter("sdsipaymentidx");
if( sdsipaymentidx == null){
	System.out.println(this.toString+" : sdsipaymentidx is null" );
}else{
	System.out.println(this.toString+" : sdsipaymentidx is "+sdsipaymentidx );
}
String promisecode = req.getParameter("promisecode");
if( promisecode == null){
	System.out.println(this.toString+" : promisecode is null" );
}else{
	System.out.println(this.toString+" : promisecode is "+promisecode );
}
String result = req.getParameter("result");
if( result == null){
	System.out.println(this.toString+" : result is null" );
}else{
	System.out.println(this.toString+" : result is "+result );
}
String resultcode = req.getParameter("resultcode");
if( resultcode == null){
	System.out.println(this.toString+" : resultcode is null" );
}else{
	System.out.println(this.toString+" : resultcode is "+resultcode );
}
String resultmsg = req.getParameter("resultmsg");
if( resultmsg == null){
	System.out.println(this.toString+" : resultmsg is null" );
}else{
	System.out.println(this.toString+" : resultmsg is "+resultmsg );
}
String fmserr = req.getParameter("fmserr");
if( fmserr == null){
	System.out.println(this.toString+" : fmserr is null" );
}else{
	System.out.println(this.toString+" : fmserr is "+fmserr );
}
String fmserrmsg = req.getParameter("fmserrmsg");
if( fmserrmsg == null){
	System.out.println(this.toString+" : fmserrmsg is null" );
}else{
	System.out.println(this.toString+" : fmserrmsg is "+fmserrmsg );
}
String incmg_pers_addr = req.getParameter("incmg_pers_addr");
if( incmg_pers_addr == null){
	System.out.println(this.toString+" : incmg_pers_addr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_addr is "+incmg_pers_addr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String sdsiidx = Util.checkString(req.getParameter("sdsiidx"));
String sdsipaymentidx = Util.checkString(req.getParameter("sdsipaymentidx"));
String promisecode = Util.checkString(req.getParameter("promisecode"));
String result = Util.checkString(req.getParameter("result"));
String resultcode = Util.checkString(req.getParameter("resultcode"));
String resultmsg = Util.checkString(req.getParameter("resultmsg"));
String fmserr = Util.checkString(req.getParameter("fmserr"));
String fmserrmsg = Util.checkString(req.getParameter("fmserrmsg"));
String incmg_pers_addr = Util.checkString(req.getParameter("incmg_pers_addr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sdsiidx = Util.Uni2Ksc(Util.checkString(req.getParameter("sdsiidx")));
String sdsipaymentidx = Util.Uni2Ksc(Util.checkString(req.getParameter("sdsipaymentidx")));
String promisecode = Util.Uni2Ksc(Util.checkString(req.getParameter("promisecode")));
String result = Util.Uni2Ksc(Util.checkString(req.getParameter("result")));
String resultcode = Util.Uni2Ksc(Util.checkString(req.getParameter("resultcode")));
String resultmsg = Util.Uni2Ksc(Util.checkString(req.getParameter("resultmsg")));
String fmserr = Util.Uni2Ksc(Util.checkString(req.getParameter("fmserr")));
String fmserrmsg = Util.Uni2Ksc(Util.checkString(req.getParameter("fmserrmsg")));
String incmg_pers_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_addr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSdsiidx(sdsiidx);
dm.setSdsipaymentidx(sdsipaymentidx);
dm.setPromisecode(promisecode);
dm.setResult(result);
dm.setResultcode(resultcode);
dm.setResultmsg(resultmsg);
dm.setFmserr(fmserr);
dm.setFmserrmsg(fmserrmsg);
dm.setIncmg_pers_addr(incmg_pers_addr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 28 17:57:14 KST 2016 */