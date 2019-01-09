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


package chosun.ciis.mt.etcpc.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcpc.ds.*;
import chosun.ciis.mt.etcpc.rec.*;

/**
 * 
 */


public class MT_ETCPC_2000_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String modl_kind;
	public String modl_mang_no;
	public String mchn_mang_no;
	public String use_pers_flnm;

	public MT_ETCPC_2000_LDM(){}
	public MT_ETCPC_2000_LDM(String cmpy_cd, String modl_kind, String modl_mang_no, String mchn_mang_no, String use_pers_flnm){
		this.cmpy_cd = cmpy_cd;
		this.modl_kind = modl_kind;
		this.modl_mang_no = modl_mang_no;
		this.mchn_mang_no = mchn_mang_no;
		this.use_pers_flnm = use_pers_flnm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setModl_kind(String modl_kind){
		this.modl_kind = modl_kind;
	}

	public void setModl_mang_no(String modl_mang_no){
		this.modl_mang_no = modl_mang_no;
	}

	public void setMchn_mang_no(String mchn_mang_no){
		this.mchn_mang_no = mchn_mang_no;
	}

	public void setUse_pers_flnm(String use_pers_flnm){
		this.use_pers_flnm = use_pers_flnm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getModl_kind(){
		return this.modl_kind;
	}

	public String getModl_mang_no(){
		return this.modl_mang_no;
	}

	public String getMchn_mang_no(){
		return this.mchn_mang_no;
	}

	public String getUse_pers_flnm(){
		return this.use_pers_flnm;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCPC_2000_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCPC_2000_LDM dm = (MT_ETCPC_2000_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.modl_kind);
		cstmt.setString(5, dm.modl_mang_no);
		cstmt.setString(6, dm.mchn_mang_no);
		cstmt.setString(7, dm.use_pers_flnm);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcpc.ds.MT_ETCPC_2000_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("modl_kind = [" + getModl_kind() + "]");
		System.out.println("modl_mang_no = [" + getModl_mang_no() + "]");
		System.out.println("mchn_mang_no = [" + getMchn_mang_no() + "]");
		System.out.println("use_pers_flnm = [" + getUse_pers_flnm() + "]");
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
String modl_kind = req.getParameter("modl_kind");
if( modl_kind == null){
	System.out.println(this.toString+" : modl_kind is null" );
}else{
	System.out.println(this.toString+" : modl_kind is "+modl_kind );
}
String modl_mang_no = req.getParameter("modl_mang_no");
if( modl_mang_no == null){
	System.out.println(this.toString+" : modl_mang_no is null" );
}else{
	System.out.println(this.toString+" : modl_mang_no is "+modl_mang_no );
}
String mchn_mang_no = req.getParameter("mchn_mang_no");
if( mchn_mang_no == null){
	System.out.println(this.toString+" : mchn_mang_no is null" );
}else{
	System.out.println(this.toString+" : mchn_mang_no is "+mchn_mang_no );
}
String use_pers_flnm = req.getParameter("use_pers_flnm");
if( use_pers_flnm == null){
	System.out.println(this.toString+" : use_pers_flnm is null" );
}else{
	System.out.println(this.toString+" : use_pers_flnm is "+use_pers_flnm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String modl_kind = Util.checkString(req.getParameter("modl_kind"));
String modl_mang_no = Util.checkString(req.getParameter("modl_mang_no"));
String mchn_mang_no = Util.checkString(req.getParameter("mchn_mang_no"));
String use_pers_flnm = Util.checkString(req.getParameter("use_pers_flnm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String modl_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("modl_kind")));
String modl_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("modl_mang_no")));
String mchn_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mchn_mang_no")));
String use_pers_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("use_pers_flnm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setModl_kind(modl_kind);
dm.setModl_mang_no(modl_mang_no);
dm.setMchn_mang_no(mchn_mang_no);
dm.setUse_pers_flnm(use_pers_flnm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 01 20:19:46 KST 2009 */