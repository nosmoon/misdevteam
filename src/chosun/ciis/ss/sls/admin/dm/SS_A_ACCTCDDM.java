/***************************************************************************************************
* 파일명 : SS_A_ACCTCDDM.java
* 기능 : 관리자-계정코드-등록,수정,삭제를 위한 DM
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-계정코드-등록,수정,삭제를 위한 DM
 */


public class SS_A_ACCTCDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String incmgpers;
	public String acctcd;
	public String acctnm;
	public String imptexpnclsf;
	public String leaf_inyn;
	public String empadvyn;
	public String remk;

	public SS_A_ACCTCDDM(){}
	public SS_A_ACCTCDDM(String accflag, String incmgpers, String acctcd, String acctnm, String imptexpnclsf, String leaf_inyn, String empadvyn, String remk){
		this.accflag = accflag;
		this.incmgpers = incmgpers;
		this.acctcd = acctcd;
		this.acctnm = acctnm;
		this.imptexpnclsf = imptexpnclsf;
		this.leaf_inyn = leaf_inyn;
		this.empadvyn = empadvyn;
		this.remk = remk;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAcctcd(String acctcd){
		this.acctcd = acctcd;
	}

	public void setAcctnm(String acctnm){
		this.acctnm = acctnm;
	}

	public void setImptexpnclsf(String imptexpnclsf){
		this.imptexpnclsf = imptexpnclsf;
	}

	public void setLeaf_inyn(String leaf_inyn){
		this.leaf_inyn = leaf_inyn;
	}

	public void setEmpadvyn(String empadvyn){
		this.empadvyn = empadvyn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAcctcd(){
		return this.acctcd;
	}

	public String getAcctnm(){
		return this.acctnm;
	}

	public String getImptexpnclsf(){
		return this.imptexpnclsf;
	}

	public String getLeaf_inyn(){
		return this.leaf_inyn;
	}

	public String getEmpadvyn(){
		return this.empadvyn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_ACCTCD( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_ACCTCDDM dm = (SS_A_ACCTCDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.acctcd);
		cstmt.setString(6, dm.acctnm);
		cstmt.setString(7, dm.imptexpnclsf);
		cstmt.setString(8, dm.leaf_inyn);
		cstmt.setString(9, dm.empadvyn);
		cstmt.setString(10, dm.remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_A_ACCTCDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String acctcd = req.getParameter("acctcd");
if( acctcd == null){
	System.out.println(this.toString+" : acctcd is null" );
}else{
	System.out.println(this.toString+" : acctcd is "+acctcd );
}
String acctnm = req.getParameter("acctnm");
if( acctnm == null){
	System.out.println(this.toString+" : acctnm is null" );
}else{
	System.out.println(this.toString+" : acctnm is "+acctnm );
}
String imptexpnclsf = req.getParameter("imptexpnclsf");
if( imptexpnclsf == null){
	System.out.println(this.toString+" : imptexpnclsf is null" );
}else{
	System.out.println(this.toString+" : imptexpnclsf is "+imptexpnclsf );
}
String leaf_inyn = req.getParameter("leaf_inyn");
if( leaf_inyn == null){
	System.out.println(this.toString+" : leaf_inyn is null" );
}else{
	System.out.println(this.toString+" : leaf_inyn is "+leaf_inyn );
}
String empadvyn = req.getParameter("empadvyn");
if( empadvyn == null){
	System.out.println(this.toString+" : empadvyn is null" );
}else{
	System.out.println(this.toString+" : empadvyn is "+empadvyn );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String acctcd = Util.checkString(req.getParameter("acctcd"));
String acctnm = Util.checkString(req.getParameter("acctnm"));
String imptexpnclsf = Util.checkString(req.getParameter("imptexpnclsf"));
String leaf_inyn = Util.checkString(req.getParameter("leaf_inyn"));
String empadvyn = Util.checkString(req.getParameter("empadvyn"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String acctcd = Util.Uni2Ksc(Util.checkString(req.getParameter("acctcd")));
String acctnm = Util.Uni2Ksc(Util.checkString(req.getParameter("acctnm")));
String imptexpnclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("imptexpnclsf")));
String leaf_inyn = Util.Uni2Ksc(Util.checkString(req.getParameter("leaf_inyn")));
String empadvyn = Util.Uni2Ksc(Util.checkString(req.getParameter("empadvyn")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setIncmgpers(incmgpers);
dm.setAcctcd(acctcd);
dm.setAcctnm(acctnm);
dm.setImptexpnclsf(imptexpnclsf);
dm.setLeaf_inyn(leaf_inyn);
dm.setEmpadvyn(empadvyn);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 03 18:08:30 KST 2004 */