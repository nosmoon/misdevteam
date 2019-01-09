/***************************************************************************************************
* 파일명 : SS_A_MOVM_RDRCLOSDM.java
* 기능 : 이사독자-마감-등록,수정,삭제를 위한 DM
* 작성일자 : 2004-01-09
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.move.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.move.ds.*;
import chosun.ciis.ss.sls.move.rec.*;

/**
 * 이사독자-마감-등록,수정,삭제를 위한 DM
 */

public class SS_A_MOVM_RDRCLOSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public String basidt;
	public String frdt;
	public String todt;
	public String closdt;
	public String costpaydt;
	public String remk;
	public String medicdary;
	public String alonamtary;
	public String wghtary;
	public String qtyaplydtary;
	public String basivalqtyary;

	public SS_A_MOVM_RDRCLOSDM(){}
	public SS_A_MOVM_RDRCLOSDM(String incmgpers, String accflag, String basidt, String frdt, String todt, String closdt, String costpaydt, String remk, String medicdary, String alonamtary, String wghtary, String qtyaplydtary, String basivalqtyary){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.basidt = basidt;
		this.frdt = frdt;
		this.todt = todt;
		this.closdt = closdt;
		this.costpaydt = costpaydt;
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

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setClosdt(String closdt){
		this.closdt = closdt;
	}

	public void setCostpaydt(String costpaydt){
		this.costpaydt = costpaydt;
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

	public String getBasidt(){
		return this.basidt;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getClosdt(){
		return this.closdt;
	}

	public String getCostpaydt(){
		return this.costpaydt;
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
		 return "{ call SP_SS_A_MOVM_RDRCLOS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_MOVM_RDRCLOSDM dm = (SS_A_MOVM_RDRCLOSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.basidt);
		cstmt.setString(6, dm.frdt);
		cstmt.setString(7, dm.todt);
		cstmt.setString(8, dm.closdt);
		cstmt.setString(9, dm.costpaydt);
		cstmt.setString(10, dm.remk);
		cstmt.setString(11, dm.medicdary);
		cstmt.setString(12, dm.alonamtary);
		cstmt.setString(13, dm.wghtary);
		cstmt.setString(14, dm.qtyaplydtary);
		cstmt.setString(15, dm.basivalqtyary);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.move.ds.SS_A_MOVM_RDRCLOSDataSet();
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
String basidt = req.getParameter("basidt");
if( basidt == null){
	System.out.println(this.toString+" : basidt is null" );
}else{
	System.out.println(this.toString+" : basidt is "+basidt );
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
String closdt = req.getParameter("closdt");
if( closdt == null){
	System.out.println(this.toString+" : closdt is null" );
}else{
	System.out.println(this.toString+" : closdt is "+closdt );
}
String costpaydt = req.getParameter("costpaydt");
if( costpaydt == null){
	System.out.println(this.toString+" : costpaydt is null" );
}else{
	System.out.println(this.toString+" : costpaydt is "+costpaydt );
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
String basidt = Util.checkString(req.getParameter("basidt"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String closdt = Util.checkString(req.getParameter("closdt"));
String costpaydt = Util.checkString(req.getParameter("costpaydt"));
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
String basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("basidt")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String closdt = Util.Uni2Ksc(Util.checkString(req.getParameter("closdt")));
String costpaydt = Util.Uni2Ksc(Util.checkString(req.getParameter("costpaydt")));
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
dm.setBasidt(basidt);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setClosdt(closdt);
dm.setCostpaydt(costpaydt);
dm.setRemk(remk);
dm.setMedicdary(medicdary);
dm.setAlonamtary(alonamtary);
dm.setWghtary(wghtary);
dm.setQtyaplydtary(qtyaplydtary);
dm.setBasivalqtyary(basivalqtyary);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 09 14:39:17 KST 2004 */