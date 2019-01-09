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


public class MT_ETCPC_2201_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String addm_clsf;
	public String cmps_item_clsf;
	public String cmps_item_brand;
	public String cmps_item_spec;
	public String estb_dt;
	public String seq;
	public String mchn_mang_no;
	public String gubun;

	public MT_ETCPC_2201_ADM(){}
	public MT_ETCPC_2201_ADM(String cmpy_cd, String incmg_pers_ipaddr, String incmg_pers, String addm_clsf, String cmps_item_clsf, String cmps_item_brand, String cmps_item_spec, String estb_dt, String seq, String mchn_mang_no, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.addm_clsf = addm_clsf;
		this.cmps_item_clsf = cmps_item_clsf;
		this.cmps_item_brand = cmps_item_brand;
		this.cmps_item_spec = cmps_item_spec;
		this.estb_dt = estb_dt;
		this.seq = seq;
		this.mchn_mang_no = mchn_mang_no;
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setAddm_clsf(String addm_clsf){
		this.addm_clsf = addm_clsf;
	}

	public void setCmps_item_clsf(String cmps_item_clsf){
		this.cmps_item_clsf = cmps_item_clsf;
	}

	public void setCmps_item_brand(String cmps_item_brand){
		this.cmps_item_brand = cmps_item_brand;
	}

	public void setCmps_item_spec(String cmps_item_spec){
		this.cmps_item_spec = cmps_item_spec;
	}

	public void setEstb_dt(String estb_dt){
		this.estb_dt = estb_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMchn_mang_no(String mchn_mang_no){
		this.mchn_mang_no = mchn_mang_no;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getAddm_clsf(){
		return this.addm_clsf;
	}

	public String getCmps_item_clsf(){
		return this.cmps_item_clsf;
	}

	public String getCmps_item_brand(){
		return this.cmps_item_brand;
	}

	public String getCmps_item_spec(){
		return this.cmps_item_spec;
	}

	public String getEstb_dt(){
		return this.estb_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMchn_mang_no(){
		return this.mchn_mang_no;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCPC_2201_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCPC_2201_ADM dm = (MT_ETCPC_2201_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers_ipaddr);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.addm_clsf);
		cstmt.setString(7, dm.cmps_item_clsf);
		cstmt.setString(8, dm.cmps_item_brand);
		cstmt.setString(9, dm.cmps_item_spec);
		cstmt.setString(10, dm.estb_dt);
		cstmt.setString(11, dm.seq);
		cstmt.setString(12, dm.mchn_mang_no);
		cstmt.setString(13, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcpc.ds.MT_ETCPC_2201_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("incmg_pers_ipaddr = " + getIncmg_pers_ipaddr());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("addm_clsf = " + getAddm_clsf());
        System.out.println("cmps_item_clsf = " + getCmps_item_clsf());
        System.out.println("cmps_item_brand = " + getCmps_item_brand());
        System.out.println("cmps_item_spec = " + getCmps_item_spec());
        System.out.println("estb_dt = " + getEstb_dt());
        System.out.println("seq = " + getSeq());
        System.out.println("mchn_mang_no = " + getMchn_mang_no());
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
String addm_clsf = req.getParameter("addm_clsf");
if( addm_clsf == null){
	System.out.println(this.toString+" : addm_clsf is null" );
}else{
	System.out.println(this.toString+" : addm_clsf is "+addm_clsf );
}
String cmps_item_clsf = req.getParameter("cmps_item_clsf");
if( cmps_item_clsf == null){
	System.out.println(this.toString+" : cmps_item_clsf is null" );
}else{
	System.out.println(this.toString+" : cmps_item_clsf is "+cmps_item_clsf );
}
String cmps_item_brand = req.getParameter("cmps_item_brand");
if( cmps_item_brand == null){
	System.out.println(this.toString+" : cmps_item_brand is null" );
}else{
	System.out.println(this.toString+" : cmps_item_brand is "+cmps_item_brand );
}
String cmps_item_spec = req.getParameter("cmps_item_spec");
if( cmps_item_spec == null){
	System.out.println(this.toString+" : cmps_item_spec is null" );
}else{
	System.out.println(this.toString+" : cmps_item_spec is "+cmps_item_spec );
}
String estb_dt = req.getParameter("estb_dt");
if( estb_dt == null){
	System.out.println(this.toString+" : estb_dt is null" );
}else{
	System.out.println(this.toString+" : estb_dt is "+estb_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String mchn_mang_no = req.getParameter("mchn_mang_no");
if( mchn_mang_no == null){
	System.out.println(this.toString+" : mchn_mang_no is null" );
}else{
	System.out.println(this.toString+" : mchn_mang_no is "+mchn_mang_no );
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
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String addm_clsf = Util.checkString(req.getParameter("addm_clsf"));
String cmps_item_clsf = Util.checkString(req.getParameter("cmps_item_clsf"));
String cmps_item_brand = Util.checkString(req.getParameter("cmps_item_brand"));
String cmps_item_spec = Util.checkString(req.getParameter("cmps_item_spec"));
String estb_dt = Util.checkString(req.getParameter("estb_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String mchn_mang_no = Util.checkString(req.getParameter("mchn_mang_no"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String addm_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("addm_clsf")));
String cmps_item_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cmps_item_clsf")));
String cmps_item_brand = Util.Uni2Ksc(Util.checkString(req.getParameter("cmps_item_brand")));
String cmps_item_spec = Util.Uni2Ksc(Util.checkString(req.getParameter("cmps_item_spec")));
String estb_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("estb_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String mchn_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mchn_mang_no")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setAddm_clsf(addm_clsf);
dm.setCmps_item_clsf(cmps_item_clsf);
dm.setCmps_item_brand(cmps_item_brand);
dm.setCmps_item_spec(cmps_item_spec);
dm.setEstb_dt(estb_dt);
dm.setSeq(seq);
dm.setMchn_mang_no(mchn_mang_no);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 24 17:09:46 KST 2009 */