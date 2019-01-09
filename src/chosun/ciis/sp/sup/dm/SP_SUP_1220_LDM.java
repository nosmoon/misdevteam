/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.sp.sup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sup.ds.*;
import chosun.ciis.sp.sup.rec.*;

/**
 * 
 */


public class SP_SUP_1220_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acctregdt_fr;
	public String acctregdt_to;
	public String leaf_open_chrg_pers_clsf;
	public String leaf_open_chrg_pers;

	public SP_SUP_1220_LDM(){}
	public SP_SUP_1220_LDM(String cmpy_cd, String acctregdt_fr, String acctregdt_to, String leaf_open_chrg_pers_clsf, String leaf_open_chrg_pers){
		this.cmpy_cd = cmpy_cd;
		this.acctregdt_fr = acctregdt_fr;
		this.acctregdt_to = acctregdt_to;
		this.leaf_open_chrg_pers_clsf = leaf_open_chrg_pers_clsf;
		this.leaf_open_chrg_pers = leaf_open_chrg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcctregdt_fr(String acctregdt_fr){
		this.acctregdt_fr = acctregdt_fr;
	}

	public void setAcctregdt_to(String acctregdt_to){
		this.acctregdt_to = acctregdt_to;
	}

	public void setLeaf_open_chrg_pers_clsf(String leaf_open_chrg_pers_clsf){
		this.leaf_open_chrg_pers_clsf = leaf_open_chrg_pers_clsf;
	}

	public void setLeaf_open_chrg_pers(String leaf_open_chrg_pers){
		this.leaf_open_chrg_pers = leaf_open_chrg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcctregdt_fr(){
		return this.acctregdt_fr;
	}

	public String getAcctregdt_to(){
		return this.acctregdt_to;
	}

	public String getLeaf_open_chrg_pers_clsf(){
		return this.leaf_open_chrg_pers_clsf;
	}

	public String getLeaf_open_chrg_pers(){
		return this.leaf_open_chrg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SUP_1220_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SUP_1220_LDM dm = (SP_SUP_1220_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acctregdt_fr);
		cstmt.setString(5, dm.acctregdt_to);
		cstmt.setString(6, dm.leaf_open_chrg_pers_clsf);
		cstmt.setString(7, dm.leaf_open_chrg_pers);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sup.ds.SP_SUP_1220_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acctregdt_fr = [" + getAcctregdt_fr() + "]");
		System.out.println("acctregdt_to = [" + getAcctregdt_to() + "]");
		System.out.println("leaf_open_chrg_pers_clsf = [" + getLeaf_open_chrg_pers_clsf() + "]");
		System.out.println("leaf_open_chrg_pers = [" + getLeaf_open_chrg_pers() + "]");
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
String acctregdt_fr = req.getParameter("acctregdt_fr");
if( acctregdt_fr == null){
	System.out.println(this.toString+" : acctregdt_fr is null" );
}else{
	System.out.println(this.toString+" : acctregdt_fr is "+acctregdt_fr );
}
String acctregdt_to = req.getParameter("acctregdt_to");
if( acctregdt_to == null){
	System.out.println(this.toString+" : acctregdt_to is null" );
}else{
	System.out.println(this.toString+" : acctregdt_to is "+acctregdt_to );
}
String leaf_open_chrg_pers_clsf = req.getParameter("leaf_open_chrg_pers_clsf");
if( leaf_open_chrg_pers_clsf == null){
	System.out.println(this.toString+" : leaf_open_chrg_pers_clsf is null" );
}else{
	System.out.println(this.toString+" : leaf_open_chrg_pers_clsf is "+leaf_open_chrg_pers_clsf );
}
String leaf_open_chrg_pers = req.getParameter("leaf_open_chrg_pers");
if( leaf_open_chrg_pers == null){
	System.out.println(this.toString+" : leaf_open_chrg_pers is null" );
}else{
	System.out.println(this.toString+" : leaf_open_chrg_pers is "+leaf_open_chrg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acctregdt_fr = Util.checkString(req.getParameter("acctregdt_fr"));
String acctregdt_to = Util.checkString(req.getParameter("acctregdt_to"));
String leaf_open_chrg_pers_clsf = Util.checkString(req.getParameter("leaf_open_chrg_pers_clsf"));
String leaf_open_chrg_pers = Util.checkString(req.getParameter("leaf_open_chrg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acctregdt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("acctregdt_fr")));
String acctregdt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("acctregdt_to")));
String leaf_open_chrg_pers_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("leaf_open_chrg_pers_clsf")));
String leaf_open_chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("leaf_open_chrg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAcctregdt_fr(acctregdt_fr);
dm.setAcctregdt_to(acctregdt_to);
dm.setLeaf_open_chrg_pers_clsf(leaf_open_chrg_pers_clsf);
dm.setLeaf_open_chrg_pers(leaf_open_chrg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 20 16:17:12 KST 2012 */