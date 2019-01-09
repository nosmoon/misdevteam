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


public class MT_ETCPC_1105_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String modl_mang_no;
	public String modl_nm;
	public String modl_kind;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String gubun;

	public MT_ETCPC_1105_ADM(){}
	public MT_ETCPC_1105_ADM(String cmpy_cd, String modl_mang_no, String modl_nm, String modl_kind, String incmg_pers_ipaddr, String incmg_pers, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.modl_mang_no = modl_mang_no;
		this.modl_nm = modl_nm;
		this.modl_kind = modl_kind;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setModl_mang_no(String modl_mang_no){
		this.modl_mang_no = modl_mang_no;
	}

	public void setModl_nm(String modl_nm){
		this.modl_nm = modl_nm;
	}

	public void setModl_kind(String modl_kind){
		this.modl_kind = modl_kind;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getModl_mang_no(){
		return this.modl_mang_no;
	}

	public String getModl_nm(){
		return this.modl_nm;
	}

	public String getModl_kind(){
		return this.modl_kind;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCPC_1105_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCPC_1105_ADM dm = (MT_ETCPC_1105_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.modl_mang_no);
		cstmt.setString(5, dm.modl_nm);
		cstmt.setString(6, dm.modl_kind);
		cstmt.setString(7, dm.incmg_pers_ipaddr);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.setString(9, dm.gubun);
			
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcpc.ds.MT_ETCPC_1105_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("modl_mang_no = " + getModl_mang_no());
        System.out.println("modl_nm = " + getModl_nm());
        System.out.println("modl_kind = " + getModl_kind());
        System.out.println("incmg_pers_ipaddr = " + getIncmg_pers_ipaddr());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("gubun = " + getGubun());
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
String modl_mang_no = req.getParameter("modl_mang_no");
if( modl_mang_no == null){
	System.out.println(this.toString+" : modl_mang_no is null" );
}else{
	System.out.println(this.toString+" : modl_mang_no is "+modl_mang_no );
}
String modl_nm = req.getParameter("modl_nm");
if( modl_nm == null){
	System.out.println(this.toString+" : modl_nm is null" );
}else{
	System.out.println(this.toString+" : modl_nm is "+modl_nm );
}
String modl_kind = req.getParameter("modl_kind");
if( modl_kind == null){
	System.out.println(this.toString+" : modl_kind is null" );
}else{
	System.out.println(this.toString+" : modl_kind is "+modl_kind );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String modl_mang_no = Util.checkString(req.getParameter("modl_mang_no"));
String modl_nm = Util.checkString(req.getParameter("modl_nm"));
String modl_kind = Util.checkString(req.getParameter("modl_kind"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String modl_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("modl_mang_no")));
String modl_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("modl_nm")));
String modl_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("modl_kind")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setModl_mang_no(modl_mang_no);
dm.setModl_nm(modl_nm);
dm.setModl_kind(modl_kind);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 11 21:31:27 KST 2009 */