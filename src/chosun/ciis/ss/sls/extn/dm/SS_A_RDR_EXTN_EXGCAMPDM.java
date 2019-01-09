/***************************************************************************************************
* 파일명 : SS_A_RDR_EXTN_EXGCAMPDM.java
* 기능 : 품앗이확장 대화 등록,수정,삭제를 위한 DM
* 작성일자 : 2003-11-18
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * class definition
 *
 */


public class SS_A_RDR_EXTN_EXGCAMPDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public String rdr_extncampno;
	public String campnm;
	public String frdt;
	public String todt;
	public long wght;
	public String closdt;
	public String alonpayplandt;
	public String remk;
	public String medicdary;
	public String alonamtary;
	public String wghtary;
	public String qtyaplydtary;
	public String basivalqtyary;

	public SS_A_RDR_EXTN_EXGCAMPDM(){}
	public SS_A_RDR_EXTN_EXGCAMPDM(String incmgpers, String accflag, String rdr_extncampno, String campnm, String frdt, String todt, long wght, String closdt, String alonpayplandt, String remk, String medicdary, String alonamtary, String wghtary, String qtyaplydtary, String basivalqtyary){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.rdr_extncampno = rdr_extncampno;
		this.campnm = campnm;
		this.frdt = frdt;
		this.todt = todt;
		this.wght = wght;
		this.closdt = closdt;
		this.alonpayplandt = alonpayplandt;
		this.remk = remk;
		this.medicdary = medicdary;
		this.alonamtary = alonamtary;
		this.wghtary = wghtary;
		this.qtyaplydtary = qtyaplydtary;
		this.basivalqtyary = basivalqtyary;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setRdr_extncampno(String rdr_extncampno){
		this.rdr_extncampno = rdr_extncampno;
	}

	public void setCampnm(String campnm){
		this.campnm = campnm;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setWght(long wght){
		this.wght = wght;
	}

	public void setClosdt(String closdt){
		this.closdt = closdt;
	}

	public void setAlonpayplandt(String alonpayplandt){
		this.alonpayplandt = alonpayplandt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setMedicdary(String medicdary){
		this.medicdary = medicdary;
	}

	public void setAlonamtary(String alonamtary){
		this.alonamtary = alonamtary;
	}

	public void setWghtary(String wghtary){
		this.wghtary = wghtary;
	}

	public void setQtyaplydtary(String qtyaplydtary){
		this.qtyaplydtary = qtyaplydtary;
	}

	public void setBasivalqtyary(String basivalqtyary){
		this.basivalqtyary = basivalqtyary;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getRdr_extncampno(){
		return this.rdr_extncampno;
	}

	public String getCampnm(){
		return this.campnm;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public long getWght(){
		return this.wght;
	}

	public String getClosdt(){
		return this.closdt;
	}

	public String getAlonpayplandt(){
		return this.alonpayplandt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getMedicdary(){
		return this.medicdary;
	}

	public String getAlonamtary(){
		return this.alonamtary;
	}

	public String getWghtary(){
		return this.wghtary;
	}

	public String getQtyaplydtary(){
		return this.qtyaplydtary;
	}

	public String getBasivalqtyary(){
		return this.basivalqtyary;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_RDR_EXTN_EXGCAMP( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_RDR_EXTN_EXGCAMPDM dm = (SS_A_RDR_EXTN_EXGCAMPDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.rdr_extncampno);
		cstmt.setString(6, dm.campnm);
		cstmt.setString(7, dm.frdt);
		cstmt.setString(8, dm.todt);
		cstmt.setLong(9, dm.wght);
		cstmt.setString(10, dm.closdt);
		cstmt.setString(11, dm.alonpayplandt);
		cstmt.setString(12, dm.remk);
		cstmt.setString(13, dm.medicdary);
		cstmt.setString(14, dm.alonamtary);
		cstmt.setString(15, dm.wghtary);
		cstmt.setString(16, dm.qtyaplydtary);
		cstmt.setString(17, dm.basivalqtyary);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_A_RDR_EXTN_EXGCAMPDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String rdr_extncampno = req.getParameter("rdr_extncampno");
if( rdr_extncampno == null){
	System.out.println(this.toString+" : rdr_extncampno is null" );
}else{
	System.out.println(this.toString+" : rdr_extncampno is "+rdr_extncampno );
}
String campnm = req.getParameter("campnm");
if( campnm == null){
	System.out.println(this.toString+" : campnm is null" );
}else{
	System.out.println(this.toString+" : campnm is "+campnm );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String wght = req.getParameter("wght");
if( wght == null){
	System.out.println(this.toString+" : wght is null" );
}else{
	System.out.println(this.toString+" : wght is "+wght );
}
String closdt = req.getParameter("closdt");
if( closdt == null){
	System.out.println(this.toString+" : closdt is null" );
}else{
	System.out.println(this.toString+" : closdt is "+closdt );
}
String alonpayplandt = req.getParameter("alonpayplandt");
if( alonpayplandt == null){
	System.out.println(this.toString+" : alonpayplandt is null" );
}else{
	System.out.println(this.toString+" : alonpayplandt is "+alonpayplandt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String medicdary = req.getParameter("medicdary");
if( medicdary == null){
	System.out.println(this.toString+" : medicdary is null" );
}else{
	System.out.println(this.toString+" : medicdary is "+medicdary );
}
String alonamtary = req.getParameter("alonamtary");
if( alonamtary == null){
	System.out.println(this.toString+" : alonamtary is null" );
}else{
	System.out.println(this.toString+" : alonamtary is "+alonamtary );
}
String wghtary = req.getParameter("wghtary");
if( wghtary == null){
	System.out.println(this.toString+" : wghtary is null" );
}else{
	System.out.println(this.toString+" : wghtary is "+wghtary );
}
String qtyaplydtary = req.getParameter("qtyaplydtary");
if( qtyaplydtary == null){
	System.out.println(this.toString+" : qtyaplydtary is null" );
}else{
	System.out.println(this.toString+" : qtyaplydtary is "+qtyaplydtary );
}
String basivalqtyary = req.getParameter("basivalqtyary");
if( basivalqtyary == null){
	System.out.println(this.toString+" : basivalqtyary is null" );
}else{
	System.out.println(this.toString+" : basivalqtyary is "+basivalqtyary );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));
String campnm = Util.checkString(req.getParameter("campnm"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String wght = Util.checkString(req.getParameter("wght"));
String closdt = Util.checkString(req.getParameter("closdt"));
String alonpayplandt = Util.checkString(req.getParameter("alonpayplandt"));
String remk = Util.checkString(req.getParameter("remk"));
String medicdary = Util.checkString(req.getParameter("medicdary"));
String alonamtary = Util.checkString(req.getParameter("alonamtary"));
String wghtary = Util.checkString(req.getParameter("wghtary"));
String qtyaplydtary = Util.checkString(req.getParameter("qtyaplydtary"));
String basivalqtyary = Util.checkString(req.getParameter("basivalqtyary"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String rdr_extncampno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncampno")));
String campnm = Util.Uni2Ksc(Util.checkString(req.getParameter("campnm")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String wght = Util.Uni2Ksc(Util.checkString(req.getParameter("wght")));
String closdt = Util.Uni2Ksc(Util.checkString(req.getParameter("closdt")));
String alonpayplandt = Util.Uni2Ksc(Util.checkString(req.getParameter("alonpayplandt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String medicdary = Util.Uni2Ksc(Util.checkString(req.getParameter("medicdary")));
String alonamtary = Util.Uni2Ksc(Util.checkString(req.getParameter("alonamtary")));
String wghtary = Util.Uni2Ksc(Util.checkString(req.getParameter("wghtary")));
String qtyaplydtary = Util.Uni2Ksc(Util.checkString(req.getParameter("qtyaplydtary")));
String basivalqtyary = Util.Uni2Ksc(Util.checkString(req.getParameter("basivalqtyary")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setRdr_extncampno(rdr_extncampno);
dm.setCampnm(campnm);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setWght(wght);
dm.setClosdt(closdt);
dm.setAlonpayplandt(alonpayplandt);
dm.setRemk(remk);
dm.setMedicdary(medicdary);
dm.setAlonamtary(alonamtary);
dm.setWghtary(wghtary);
dm.setQtyaplydtary(qtyaplydtary);
dm.setBasivalqtyary(basivalqtyary);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 05 10:29:26 KST 2003 */