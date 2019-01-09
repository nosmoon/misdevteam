/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.bas.ds.*;
import chosun.ciis.tn.bas.rec.*;

/**
 * 
 */


public class TN_BAS_3002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String fundidx;
	public String parent_fundcode;
	public String depth;
	public String fund;
	public String fundcode;
	public String memo;
	public String supportidx;
	public String personreceiptcode;
	public String companyreceiptcode;
	public String displayorder;
	public String useinsert;

	public TN_BAS_3002_ADM(){}
	public TN_BAS_3002_ADM(String cmpy_cd, String incmg_pers, String fundidx, String parent_fundcode, String depth, String fund, String fundcode, String memo, String supportidx, String personreceiptcode, String companyreceiptcode, String displayorder, String useinsert){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.fundidx = fundidx;
		this.parent_fundcode = parent_fundcode;
		this.depth = depth;
		this.fund = fund;
		this.fundcode = fundcode;
		this.memo = memo;
		this.supportidx = supportidx;
		this.personreceiptcode = personreceiptcode;
		this.companyreceiptcode = companyreceiptcode;
		this.displayorder = displayorder;
		this.useinsert = useinsert;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setFundidx(String fundidx){
		this.fundidx = fundidx;
	}

	public void setParent_fundcode(String parent_fundcode){
		this.parent_fundcode = parent_fundcode;
	}

	public void setDepth(String depth){
		this.depth = depth;
	}

	public void setFund(String fund){
		this.fund = fund;
	}

	public void setFundcode(String fundcode){
		this.fundcode = fundcode;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setSupportidx(String supportidx){
		this.supportidx = supportidx;
	}

	public void setPersonreceiptcode(String personreceiptcode){
		this.personreceiptcode = personreceiptcode;
	}

	public void setCompanyreceiptcode(String companyreceiptcode){
		this.companyreceiptcode = companyreceiptcode;
	}

	public void setDisplayorder(String displayorder){
		this.displayorder = displayorder;
	}

	public void setUseinsert(String useinsert){
		this.useinsert = useinsert;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getFundidx(){
		return this.fundidx;
	}

	public String getParent_fundcode(){
		return this.parent_fundcode;
	}

	public String getDepth(){
		return this.depth;
	}

	public String getFund(){
		return this.fund;
	}

	public String getFundcode(){
		return this.fundcode;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getSupportidx(){
		return this.supportidx;
	}

	public String getPersonreceiptcode(){
		return this.personreceiptcode;
	}

	public String getCompanyreceiptcode(){
		return this.companyreceiptcode;
	}

	public String getDisplayorder(){
		return this.displayorder;
	}

	public String getUseinsert(){
		return this.useinsert;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_BAS_3002_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_BAS_3002_ADM dm = (TN_BAS_3002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.fundidx);
		cstmt.setString(6, dm.parent_fundcode);
		cstmt.setString(7, dm.depth);
		cstmt.setString(8, dm.fund);
		cstmt.setString(9, dm.fundcode);
		cstmt.setString(10, dm.memo);
		cstmt.setString(11, dm.supportidx);
		cstmt.setString(12, dm.personreceiptcode);
		cstmt.setString(13, dm.companyreceiptcode);
		cstmt.setString(14, dm.displayorder);
		cstmt.setString(15, dm.useinsert);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.bas.ds.TN_BAS_3002_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("fundidx = [" + getFundidx() + "]");
		System.out.println("parent_fundcode = [" + getParent_fundcode() + "]");
		System.out.println("depth = [" + getDepth() + "]");
		System.out.println("fund = [" + getFund() + "]");
		System.out.println("fundcode = [" + getFundcode() + "]");
		System.out.println("memo = [" + getMemo() + "]");
		System.out.println("supportidx = [" + getSupportidx() + "]");
		System.out.println("personreceiptcode = [" + getPersonreceiptcode() + "]");
		System.out.println("companyreceiptcode = [" + getCompanyreceiptcode() + "]");
		System.out.println("displayorder = [" + getDisplayorder() + "]");
		System.out.println("useinsert = [" + getUseinsert() + "]");
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String fundidx = req.getParameter("fundidx");
if( fundidx == null){
	System.out.println(this.toString+" : fundidx is null" );
}else{
	System.out.println(this.toString+" : fundidx is "+fundidx );
}
String parent_fundcode = req.getParameter("parent_fundcode");
if( parent_fundcode == null){
	System.out.println(this.toString+" : parent_fundcode is null" );
}else{
	System.out.println(this.toString+" : parent_fundcode is "+parent_fundcode );
}
String depth = req.getParameter("depth");
if( depth == null){
	System.out.println(this.toString+" : depth is null" );
}else{
	System.out.println(this.toString+" : depth is "+depth );
}
String fund = req.getParameter("fund");
if( fund == null){
	System.out.println(this.toString+" : fund is null" );
}else{
	System.out.println(this.toString+" : fund is "+fund );
}
String fundcode = req.getParameter("fundcode");
if( fundcode == null){
	System.out.println(this.toString+" : fundcode is null" );
}else{
	System.out.println(this.toString+" : fundcode is "+fundcode );
}
String memo = req.getParameter("memo");
if( memo == null){
	System.out.println(this.toString+" : memo is null" );
}else{
	System.out.println(this.toString+" : memo is "+memo );
}
String supportidx = req.getParameter("supportidx");
if( supportidx == null){
	System.out.println(this.toString+" : supportidx is null" );
}else{
	System.out.println(this.toString+" : supportidx is "+supportidx );
}
String personreceiptcode = req.getParameter("personreceiptcode");
if( personreceiptcode == null){
	System.out.println(this.toString+" : personreceiptcode is null" );
}else{
	System.out.println(this.toString+" : personreceiptcode is "+personreceiptcode );
}
String companyreceiptcode = req.getParameter("companyreceiptcode");
if( companyreceiptcode == null){
	System.out.println(this.toString+" : companyreceiptcode is null" );
}else{
	System.out.println(this.toString+" : companyreceiptcode is "+companyreceiptcode );
}
String displayorder = req.getParameter("displayorder");
if( displayorder == null){
	System.out.println(this.toString+" : displayorder is null" );
}else{
	System.out.println(this.toString+" : displayorder is "+displayorder );
}
String useinsert = req.getParameter("useinsert");
if( useinsert == null){
	System.out.println(this.toString+" : useinsert is null" );
}else{
	System.out.println(this.toString+" : useinsert is "+useinsert );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String fundidx = Util.checkString(req.getParameter("fundidx"));
String parent_fundcode = Util.checkString(req.getParameter("parent_fundcode"));
String depth = Util.checkString(req.getParameter("depth"));
String fund = Util.checkString(req.getParameter("fund"));
String fundcode = Util.checkString(req.getParameter("fundcode"));
String memo = Util.checkString(req.getParameter("memo"));
String supportidx = Util.checkString(req.getParameter("supportidx"));
String personreceiptcode = Util.checkString(req.getParameter("personreceiptcode"));
String companyreceiptcode = Util.checkString(req.getParameter("companyreceiptcode"));
String displayorder = Util.checkString(req.getParameter("displayorder"));
String useinsert = Util.checkString(req.getParameter("useinsert"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String fundidx = Util.Uni2Ksc(Util.checkString(req.getParameter("fundidx")));
String parent_fundcode = Util.Uni2Ksc(Util.checkString(req.getParameter("parent_fundcode")));
String depth = Util.Uni2Ksc(Util.checkString(req.getParameter("depth")));
String fund = Util.Uni2Ksc(Util.checkString(req.getParameter("fund")));
String fundcode = Util.Uni2Ksc(Util.checkString(req.getParameter("fundcode")));
String memo = Util.Uni2Ksc(Util.checkString(req.getParameter("memo")));
String supportidx = Util.Uni2Ksc(Util.checkString(req.getParameter("supportidx")));
String personreceiptcode = Util.Uni2Ksc(Util.checkString(req.getParameter("personreceiptcode")));
String companyreceiptcode = Util.Uni2Ksc(Util.checkString(req.getParameter("companyreceiptcode")));
String displayorder = Util.Uni2Ksc(Util.checkString(req.getParameter("displayorder")));
String useinsert = Util.Uni2Ksc(Util.checkString(req.getParameter("useinsert")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setFundidx(fundidx);
dm.setParent_fundcode(parent_fundcode);
dm.setDepth(depth);
dm.setFund(fund);
dm.setFundcode(fundcode);
dm.setMemo(memo);
dm.setSupportidx(supportidx);
dm.setPersonreceiptcode(personreceiptcode);
dm.setCompanyreceiptcode(companyreceiptcode);
dm.setDisplayorder(displayorder);
dm.setUseinsert(useinsert);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 21 10:06:25 KST 2016 */