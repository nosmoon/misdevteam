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


public class TN_LNK_5065_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sdsiidx;
	public String requestdate;
	public String fmsseq;
	public String pymt_cd;
	public String acptdate;
	public String acptprice;
	public String fee;
	public String acptno;
	public String cnclokdate;
	public String result;
	public String resultcode;
	public String resultmsg;
	public String header;
	public String tail;
	public String fmserr;
	public String fmserrmsg;
	public String incmg_pers_addr;
	public String incmg_pers;

	public TN_LNK_5065_ADM(){}
	public TN_LNK_5065_ADM(String cmpy_cd, String sdsiidx, String requestdate, String fmsseq, String pymt_cd, String acptdate, String acptprice, String fee, String acptno, String cnclokdate, String result, String resultcode, String resultmsg, String header, String tail, String fmserr, String fmserrmsg, String incmg_pers_addr, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.sdsiidx = sdsiidx;
		this.requestdate = requestdate;
		this.fmsseq = fmsseq;
		this.pymt_cd = pymt_cd;
		this.acptdate = acptdate;
		this.acptprice = acptprice;
		this.fee = fee;
		this.acptno = acptno;
		this.cnclokdate = cnclokdate;
		this.result = result;
		this.resultcode = resultcode;
		this.resultmsg = resultmsg;
		this.header = header;
		this.tail = tail;
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

	public void setRequestdate(String requestdate){
		this.requestdate = requestdate;
	}

	public void setFmsseq(String fmsseq){
		this.fmsseq = fmsseq;
	}

	public void setPymt_cd(String pymt_cd){
		this.pymt_cd = pymt_cd;
	}

	public void setAcptdate(String acptdate){
		this.acptdate = acptdate;
	}

	public void setAcptprice(String acptprice){
		this.acptprice = acptprice;
	}

	public void setFee(String fee){
		this.fee = fee;
	}

	public void setAcptno(String acptno){
		this.acptno = acptno;
	}

	public void setCnclokdate(String cnclokdate){
		this.cnclokdate = cnclokdate;
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

	public void setHeader(String header){
		this.header = header;
	}

	public void setTail(String tail){
		this.tail = tail;
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

	public String getRequestdate(){
		return this.requestdate;
	}

	public String getFmsseq(){
		return this.fmsseq;
	}

	public String getPymt_cd(){
		return this.pymt_cd;
	}

	public String getAcptdate(){
		return this.acptdate;
	}

	public String getAcptprice(){
		return this.acptprice;
	}

	public String getFee(){
		return this.fee;
	}

	public String getAcptno(){
		return this.acptno;
	}

	public String getCnclokdate(){
		return this.cnclokdate;
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

	public String getHeader(){
		return this.header;
	}

	public String getTail(){
		return this.tail;
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
		 return "{ call MISTNN.SP_TN_LNK_5065_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_5065_ADM dm = (TN_LNK_5065_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sdsiidx);
		cstmt.setString(5, dm.requestdate);
		cstmt.setString(6, dm.fmsseq);
		cstmt.setString(7, dm.pymt_cd);
		cstmt.setString(8, dm.acptdate);
		cstmt.setString(9, dm.acptprice);
		cstmt.setString(10, dm.fee);
		cstmt.setString(11, dm.acptno);
		cstmt.setString(12, dm.cnclokdate);
		cstmt.setString(13, dm.result);
		cstmt.setString(14, dm.resultcode);
		cstmt.setString(15, dm.resultmsg);
		cstmt.setString(16, dm.header);
		cstmt.setString(17, dm.tail);
		cstmt.setString(18, dm.fmserr);
		cstmt.setString(19, dm.fmserrmsg);
		cstmt.setString(20, dm.incmg_pers_addr);
		cstmt.setString(21, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_5065_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("sdsiidx = [" + getSdsiidx() + "]");
		System.out.println("requestdate = [" + getRequestdate() + "]");
		System.out.println("fmsseq = [" + getFmsseq() + "]");
		System.out.println("pymt_cd = [" + getPymt_cd() + "]");
		System.out.println("acptdate = [" + getAcptdate() + "]");
		System.out.println("acptprice = [" + getAcptprice() + "]");
		System.out.println("fee = [" + getFee() + "]");
		System.out.println("acptno = [" + getAcptno() + "]");
		System.out.println("cnclokdate = [" + getCnclokdate() + "]");
		System.out.println("result = [" + getResult() + "]");
		System.out.println("resultcode = [" + getResultcode() + "]");
		System.out.println("resultmsg = [" + getResultmsg() + "]");
		System.out.println("header = [" + getHeader() + "]");
		System.out.println("tail = [" + getTail() + "]");
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
String requestdate = req.getParameter("requestdate");
if( requestdate == null){
	System.out.println(this.toString+" : requestdate is null" );
}else{
	System.out.println(this.toString+" : requestdate is "+requestdate );
}
String fmsseq = req.getParameter("fmsseq");
if( fmsseq == null){
	System.out.println(this.toString+" : fmsseq is null" );
}else{
	System.out.println(this.toString+" : fmsseq is "+fmsseq );
}
String pymt_cd = req.getParameter("pymt_cd");
if( pymt_cd == null){
	System.out.println(this.toString+" : pymt_cd is null" );
}else{
	System.out.println(this.toString+" : pymt_cd is "+pymt_cd );
}
String acptdate = req.getParameter("acptdate");
if( acptdate == null){
	System.out.println(this.toString+" : acptdate is null" );
}else{
	System.out.println(this.toString+" : acptdate is "+acptdate );
}
String acptprice = req.getParameter("acptprice");
if( acptprice == null){
	System.out.println(this.toString+" : acptprice is null" );
}else{
	System.out.println(this.toString+" : acptprice is "+acptprice );
}
String fee = req.getParameter("fee");
if( fee == null){
	System.out.println(this.toString+" : fee is null" );
}else{
	System.out.println(this.toString+" : fee is "+fee );
}
String acptno = req.getParameter("acptno");
if( acptno == null){
	System.out.println(this.toString+" : acptno is null" );
}else{
	System.out.println(this.toString+" : acptno is "+acptno );
}
String cnclokdate = req.getParameter("cnclokdate");
if( cnclokdate == null){
	System.out.println(this.toString+" : cnclokdate is null" );
}else{
	System.out.println(this.toString+" : cnclokdate is "+cnclokdate );
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
String header = req.getParameter("header");
if( header == null){
	System.out.println(this.toString+" : header is null" );
}else{
	System.out.println(this.toString+" : header is "+header );
}
String tail = req.getParameter("tail");
if( tail == null){
	System.out.println(this.toString+" : tail is null" );
}else{
	System.out.println(this.toString+" : tail is "+tail );
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
String requestdate = Util.checkString(req.getParameter("requestdate"));
String fmsseq = Util.checkString(req.getParameter("fmsseq"));
String pymt_cd = Util.checkString(req.getParameter("pymt_cd"));
String acptdate = Util.checkString(req.getParameter("acptdate"));
String acptprice = Util.checkString(req.getParameter("acptprice"));
String fee = Util.checkString(req.getParameter("fee"));
String acptno = Util.checkString(req.getParameter("acptno"));
String cnclokdate = Util.checkString(req.getParameter("cnclokdate"));
String result = Util.checkString(req.getParameter("result"));
String resultcode = Util.checkString(req.getParameter("resultcode"));
String resultmsg = Util.checkString(req.getParameter("resultmsg"));
String header = Util.checkString(req.getParameter("header"));
String tail = Util.checkString(req.getParameter("tail"));
String fmserr = Util.checkString(req.getParameter("fmserr"));
String fmserrmsg = Util.checkString(req.getParameter("fmserrmsg"));
String incmg_pers_addr = Util.checkString(req.getParameter("incmg_pers_addr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sdsiidx = Util.Uni2Ksc(Util.checkString(req.getParameter("sdsiidx")));
String requestdate = Util.Uni2Ksc(Util.checkString(req.getParameter("requestdate")));
String fmsseq = Util.Uni2Ksc(Util.checkString(req.getParameter("fmsseq")));
String pymt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("pymt_cd")));
String acptdate = Util.Uni2Ksc(Util.checkString(req.getParameter("acptdate")));
String acptprice = Util.Uni2Ksc(Util.checkString(req.getParameter("acptprice")));
String fee = Util.Uni2Ksc(Util.checkString(req.getParameter("fee")));
String acptno = Util.Uni2Ksc(Util.checkString(req.getParameter("acptno")));
String cnclokdate = Util.Uni2Ksc(Util.checkString(req.getParameter("cnclokdate")));
String result = Util.Uni2Ksc(Util.checkString(req.getParameter("result")));
String resultcode = Util.Uni2Ksc(Util.checkString(req.getParameter("resultcode")));
String resultmsg = Util.Uni2Ksc(Util.checkString(req.getParameter("resultmsg")));
String header = Util.Uni2Ksc(Util.checkString(req.getParameter("header")));
String tail = Util.Uni2Ksc(Util.checkString(req.getParameter("tail")));
String fmserr = Util.Uni2Ksc(Util.checkString(req.getParameter("fmserr")));
String fmserrmsg = Util.Uni2Ksc(Util.checkString(req.getParameter("fmserrmsg")));
String incmg_pers_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_addr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSdsiidx(sdsiidx);
dm.setRequestdate(requestdate);
dm.setFmsseq(fmsseq);
dm.setPymt_cd(pymt_cd);
dm.setAcptdate(acptdate);
dm.setAcptprice(acptprice);
dm.setFee(fee);
dm.setAcptno(acptno);
dm.setCnclokdate(cnclokdate);
dm.setResult(result);
dm.setResultcode(resultcode);
dm.setResultmsg(resultmsg);
dm.setHeader(header);
dm.setTail(tail);
dm.setFmserr(fmserr);
dm.setFmserrmsg(fmserrmsg);
dm.setIncmg_pers_addr(incmg_pers_addr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 23 18:46:03 KST 2016 */