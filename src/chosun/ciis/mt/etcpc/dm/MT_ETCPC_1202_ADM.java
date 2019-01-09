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


public class MT_ETCPC_1202_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String modl_mang_no_h;
	public String seq_h;
	public String cmps_item_h;
	public String spec_clsf_h;
	public String brand_sw_h;
	public String spec_h;
	public String gubun_h;
	public String endgbn_h;
	public String modl_mang_no_s;
	public String seq_s;
	public String cmps_item_s;
	public String spec_clsf_s;
	public String brand_sw_s;
	public String spec_s;
	public String gubun_s;
	public String endgbn_s;

	public MT_ETCPC_1202_ADM(){}
	public MT_ETCPC_1202_ADM(String cmpy_cd, String incmg_pers_ipaddr, String incmg_pers, String modl_mang_no_h, String seq_h, String cmps_item_h, String spec_clsf_h, String brand_sw_h, String spec_h, String gubun_h, String endgbn_h, String modl_mang_no_s, String seq_s, String cmps_item_s, String spec_clsf_s, String brand_sw_s, String spec_s, String gubun_s, String endgbn_s){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.modl_mang_no_h = modl_mang_no_h;
		this.seq_h = seq_h;
		this.cmps_item_h = cmps_item_h;
		this.spec_clsf_h = spec_clsf_h;
		this.brand_sw_h = brand_sw_h;
		this.spec_h = spec_h;
		this.gubun_h = gubun_h;
		this.endgbn_h = endgbn_h;
		this.modl_mang_no_s = modl_mang_no_s;
		this.seq_s = seq_s;
		this.cmps_item_s = cmps_item_s;
		this.spec_clsf_s = spec_clsf_s;
		this.brand_sw_s = brand_sw_s;
		this.spec_s = spec_s;
		this.gubun_s = gubun_s;
		this.endgbn_s = endgbn_s;
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

	public void setModl_mang_no_h(String modl_mang_no_h){
		this.modl_mang_no_h = modl_mang_no_h;
	}

	public void setSeq_h(String seq_h){
		this.seq_h = seq_h;
	}

	public void setCmps_item_h(String cmps_item_h){
		this.cmps_item_h = cmps_item_h;
	}

	public void setSpec_clsf_h(String spec_clsf_h){
		this.spec_clsf_h = spec_clsf_h;
	}

	public void setBrand_sw_h(String brand_sw_h){
		this.brand_sw_h = brand_sw_h;
	}

	public void setSpec_h(String spec_h){
		this.spec_h = spec_h;
	}

	public void setGubun_h(String gubun_h){
		this.gubun_h = gubun_h;
	}

	public void setEndgbn_h(String endgbn_h){
		this.endgbn_h = endgbn_h;
	}

	public void setModl_mang_no_s(String modl_mang_no_s){
		this.modl_mang_no_s = modl_mang_no_s;
	}

	public void setSeq_s(String seq_s){
		this.seq_s = seq_s;
	}

	public void setCmps_item_s(String cmps_item_s){
		this.cmps_item_s = cmps_item_s;
	}

	public void setSpec_clsf_s(String spec_clsf_s){
		this.spec_clsf_s = spec_clsf_s;
	}

	public void setBrand_sw_s(String brand_sw_s){
		this.brand_sw_s = brand_sw_s;
	}

	public void setSpec_s(String spec_s){
		this.spec_s = spec_s;
	}

	public void setGubun_s(String gubun_s){
		this.gubun_s = gubun_s;
	}

	public void setEndgbn_s(String endgbn_s){
		this.endgbn_s = endgbn_s;
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

	public String getModl_mang_no_h(){
		return this.modl_mang_no_h;
	}

	public String getSeq_h(){
		return this.seq_h;
	}

	public String getCmps_item_h(){
		return this.cmps_item_h;
	}

	public String getSpec_clsf_h(){
		return this.spec_clsf_h;
	}

	public String getBrand_sw_h(){
		return this.brand_sw_h;
	}

	public String getSpec_h(){
		return this.spec_h;
	}

	public String getGubun_h(){
		return this.gubun_h;
	}

	public String getEndgbn_h(){
		return this.endgbn_h;
	}

	public String getModl_mang_no_s(){
		return this.modl_mang_no_s;
	}

	public String getSeq_s(){
		return this.seq_s;
	}

	public String getCmps_item_s(){
		return this.cmps_item_s;
	}

	public String getSpec_clsf_s(){
		return this.spec_clsf_s;
	}

	public String getBrand_sw_s(){
		return this.brand_sw_s;
	}

	public String getSpec_s(){
		return this.spec_s;
	}

	public String getGubun_s(){
		return this.gubun_s;
	}

	public String getEndgbn_s(){
		return this.endgbn_s;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCPC_1202_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCPC_1202_ADM dm = (MT_ETCPC_1202_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers_ipaddr);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.modl_mang_no_h);
		cstmt.setString(7, dm.seq_h);
		cstmt.setString(8, dm.cmps_item_h);
		cstmt.setString(9, dm.spec_clsf_h);
		cstmt.setString(10, dm.brand_sw_h);
		cstmt.setString(11, dm.spec_h);
		cstmt.setString(12, dm.gubun_h);
		cstmt.setString(13, dm.endgbn_h);
		cstmt.setString(14, dm.modl_mang_no_s);
		cstmt.setString(15, dm.seq_s);
		cstmt.setString(16, dm.cmps_item_s);
		cstmt.setString(17, dm.spec_clsf_s);
		cstmt.setString(18, dm.brand_sw_s);
		cstmt.setString(19, dm.spec_s);
		cstmt.setString(20, dm.gubun_s);
		cstmt.setString(21, dm.endgbn_s);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcpc.ds.MT_ETCPC_1202_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("incmg_pers_ipaddr = " + getIncmg_pers_ipaddr());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("modl_mang_no_h = " + getModl_mang_no_h());
        System.out.println("seq_h = " + getSeq_h());
        System.out.println("cmps_item_h = " + getCmps_item_h());
        System.out.println("spec_clsf_h = " + getSpec_clsf_h());
        System.out.println("brand_sw_h = " + getBrand_sw_h());
        System.out.println("spec_h = " + getSpec_h());
        System.out.println("gubun_h = " + getGubun_h());
        System.out.println("endgbn_h = " + getEndgbn_h());
        System.out.println("modl_mang_no_s = " + getModl_mang_no_s());
        System.out.println("seq_s = " + getSeq_s());
        System.out.println("cmps_item_s = " + getCmps_item_s());
        System.out.println("spec_clsf_s = " + getSpec_clsf_s());
        System.out.println("brand_sw_s = " + getBrand_sw_s());
        System.out.println("spec_s = " + getSpec_s());
        System.out.println("gubun_s = " + getGubun_s());
        System.out.println("endgbn_s = " + getEndgbn_s());
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
String modl_mang_no_h = req.getParameter("modl_mang_no_h");
if( modl_mang_no_h == null){
	System.out.println(this.toString+" : modl_mang_no_h is null" );
}else{
	System.out.println(this.toString+" : modl_mang_no_h is "+modl_mang_no_h );
}
String seq_h = req.getParameter("seq_h");
if( seq_h == null){
	System.out.println(this.toString+" : seq_h is null" );
}else{
	System.out.println(this.toString+" : seq_h is "+seq_h );
}
String cmps_item_h = req.getParameter("cmps_item_h");
if( cmps_item_h == null){
	System.out.println(this.toString+" : cmps_item_h is null" );
}else{
	System.out.println(this.toString+" : cmps_item_h is "+cmps_item_h );
}
String spec_clsf_h = req.getParameter("spec_clsf_h");
if( spec_clsf_h == null){
	System.out.println(this.toString+" : spec_clsf_h is null" );
}else{
	System.out.println(this.toString+" : spec_clsf_h is "+spec_clsf_h );
}
String brand_sw_h = req.getParameter("brand_sw_h");
if( brand_sw_h == null){
	System.out.println(this.toString+" : brand_sw_h is null" );
}else{
	System.out.println(this.toString+" : brand_sw_h is "+brand_sw_h );
}
String spec_h = req.getParameter("spec_h");
if( spec_h == null){
	System.out.println(this.toString+" : spec_h is null" );
}else{
	System.out.println(this.toString+" : spec_h is "+spec_h );
}
String gubun_h = req.getParameter("gubun_h");
if( gubun_h == null){
	System.out.println(this.toString+" : gubun_h is null" );
}else{
	System.out.println(this.toString+" : gubun_h is "+gubun_h );
}
String endgbn_h = req.getParameter("endgbn_h");
if( endgbn_h == null){
	System.out.println(this.toString+" : endgbn_h is null" );
}else{
	System.out.println(this.toString+" : endgbn_h is "+endgbn_h );
}
String modl_mang_no_s = req.getParameter("modl_mang_no_s");
if( modl_mang_no_s == null){
	System.out.println(this.toString+" : modl_mang_no_s is null" );
}else{
	System.out.println(this.toString+" : modl_mang_no_s is "+modl_mang_no_s );
}
String seq_s = req.getParameter("seq_s");
if( seq_s == null){
	System.out.println(this.toString+" : seq_s is null" );
}else{
	System.out.println(this.toString+" : seq_s is "+seq_s );
}
String cmps_item_s = req.getParameter("cmps_item_s");
if( cmps_item_s == null){
	System.out.println(this.toString+" : cmps_item_s is null" );
}else{
	System.out.println(this.toString+" : cmps_item_s is "+cmps_item_s );
}
String spec_clsf_s = req.getParameter("spec_clsf_s");
if( spec_clsf_s == null){
	System.out.println(this.toString+" : spec_clsf_s is null" );
}else{
	System.out.println(this.toString+" : spec_clsf_s is "+spec_clsf_s );
}
String brand_sw_s = req.getParameter("brand_sw_s");
if( brand_sw_s == null){
	System.out.println(this.toString+" : brand_sw_s is null" );
}else{
	System.out.println(this.toString+" : brand_sw_s is "+brand_sw_s );
}
String spec_s = req.getParameter("spec_s");
if( spec_s == null){
	System.out.println(this.toString+" : spec_s is null" );
}else{
	System.out.println(this.toString+" : spec_s is "+spec_s );
}
String gubun_s = req.getParameter("gubun_s");
if( gubun_s == null){
	System.out.println(this.toString+" : gubun_s is null" );
}else{
	System.out.println(this.toString+" : gubun_s is "+gubun_s );
}
String endgbn_s = req.getParameter("endgbn_s");
if( endgbn_s == null){
	System.out.println(this.toString+" : endgbn_s is null" );
}else{
	System.out.println(this.toString+" : endgbn_s is "+endgbn_s );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String modl_mang_no_h = Util.checkString(req.getParameter("modl_mang_no_h"));
String seq_h = Util.checkString(req.getParameter("seq_h"));
String cmps_item_h = Util.checkString(req.getParameter("cmps_item_h"));
String spec_clsf_h = Util.checkString(req.getParameter("spec_clsf_h"));
String brand_sw_h = Util.checkString(req.getParameter("brand_sw_h"));
String spec_h = Util.checkString(req.getParameter("spec_h"));
String gubun_h = Util.checkString(req.getParameter("gubun_h"));
String endgbn_h = Util.checkString(req.getParameter("endgbn_h"));
String modl_mang_no_s = Util.checkString(req.getParameter("modl_mang_no_s"));
String seq_s = Util.checkString(req.getParameter("seq_s"));
String cmps_item_s = Util.checkString(req.getParameter("cmps_item_s"));
String spec_clsf_s = Util.checkString(req.getParameter("spec_clsf_s"));
String brand_sw_s = Util.checkString(req.getParameter("brand_sw_s"));
String spec_s = Util.checkString(req.getParameter("spec_s"));
String gubun_s = Util.checkString(req.getParameter("gubun_s"));
String endgbn_s = Util.checkString(req.getParameter("endgbn_s"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String modl_mang_no_h = Util.Uni2Ksc(Util.checkString(req.getParameter("modl_mang_no_h")));
String seq_h = Util.Uni2Ksc(Util.checkString(req.getParameter("seq_h")));
String cmps_item_h = Util.Uni2Ksc(Util.checkString(req.getParameter("cmps_item_h")));
String spec_clsf_h = Util.Uni2Ksc(Util.checkString(req.getParameter("spec_clsf_h")));
String brand_sw_h = Util.Uni2Ksc(Util.checkString(req.getParameter("brand_sw_h")));
String spec_h = Util.Uni2Ksc(Util.checkString(req.getParameter("spec_h")));
String gubun_h = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun_h")));
String endgbn_h = Util.Uni2Ksc(Util.checkString(req.getParameter("endgbn_h")));
String modl_mang_no_s = Util.Uni2Ksc(Util.checkString(req.getParameter("modl_mang_no_s")));
String seq_s = Util.Uni2Ksc(Util.checkString(req.getParameter("seq_s")));
String cmps_item_s = Util.Uni2Ksc(Util.checkString(req.getParameter("cmps_item_s")));
String spec_clsf_s = Util.Uni2Ksc(Util.checkString(req.getParameter("spec_clsf_s")));
String brand_sw_s = Util.Uni2Ksc(Util.checkString(req.getParameter("brand_sw_s")));
String spec_s = Util.Uni2Ksc(Util.checkString(req.getParameter("spec_s")));
String gubun_s = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun_s")));
String endgbn_s = Util.Uni2Ksc(Util.checkString(req.getParameter("endgbn_s")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setModl_mang_no_h(modl_mang_no_h);
dm.setSeq_h(seq_h);
dm.setCmps_item_h(cmps_item_h);
dm.setSpec_clsf_h(spec_clsf_h);
dm.setBrand_sw_h(brand_sw_h);
dm.setSpec_h(spec_h);
dm.setGubun_h(gubun_h);
dm.setEndgbn_h(endgbn_h);
dm.setModl_mang_no_s(modl_mang_no_s);
dm.setSeq_s(seq_s);
dm.setCmps_item_s(cmps_item_s);
dm.setSpec_clsf_s(spec_clsf_s);
dm.setBrand_sw_s(brand_sw_s);
dm.setSpec_s(spec_s);
dm.setGubun_s(gubun_s);
dm.setEndgbn_s(endgbn_s);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 13 09:02:52 KST 2009 */