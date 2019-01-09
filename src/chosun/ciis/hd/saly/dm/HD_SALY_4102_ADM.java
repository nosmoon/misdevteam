/***************************************************************************************************
* 파일명 : .java
* 기능 : 인사급여-급여관리-급여공제
* 작성일자 : 2009-07-09
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 인사급여-급여관리-급여공제
 */


public class HD_SALY_4102_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String nm_korn;
	public String lon_clsf_cd;
	public String lon_dt;
	public String bhbhyb;
	public String bogaamt;
	public String bhnosabeon;
	public String add_bogaamt;
	public String add_bhnosabeon;
	public String u_ipadd;
	public String u_id;

	public HD_SALY_4102_ADM(){}
	public HD_SALY_4102_ADM(String mode, String cmpy_cd, String emp_no, String nm_korn, String lon_clsf_cd, String lon_dt, String bhbhyb, String bogaamt, String bhnosabeon, String add_bogaamt, String add_bhnosabeon, String u_ipadd, String u_id){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.nm_korn = nm_korn;
		this.lon_clsf_cd = lon_clsf_cd;
		this.lon_dt = lon_dt;
		this.bhbhyb = bhbhyb;
		this.bogaamt = bogaamt;
		this.bhnosabeon = bhnosabeon;
		this.add_bogaamt = add_bogaamt;
		this.add_bhnosabeon = add_bhnosabeon;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setLon_clsf_cd(String lon_clsf_cd){
		this.lon_clsf_cd = lon_clsf_cd;
	}

	public void setLon_dt(String lon_dt){
		this.lon_dt = lon_dt;
	}

	public void setBhbhyb(String bhbhyb){
		this.bhbhyb = bhbhyb;
	}

	public void setBogaamt(String bogaamt){
		this.bogaamt = bogaamt;
	}

	public void setBhnosabeon(String bhnosabeon){
		this.bhnosabeon = bhnosabeon;
	}

	public void setAdd_bogaamt(String add_bogaamt){
		this.add_bogaamt = add_bogaamt;
	}

	public void setAdd_bhnosabeon(String add_bhnosabeon){
		this.add_bhnosabeon = add_bhnosabeon;
	}

	public void setU_ipadd(String u_ipadd){
		this.u_ipadd = u_ipadd;
	}

	public void setU_id(String u_id){
		this.u_id = u_id;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getLon_clsf_cd(){
		return this.lon_clsf_cd;
	}

	public String getLon_dt(){
		return this.lon_dt;
	}

	public String getBhbhyb(){
		return this.bhbhyb;
	}

	public String getBogaamt(){
		return this.bogaamt;
	}

	public String getBhnosabeon(){
		return this.bhnosabeon;
	}

	public String getAdd_bogaamt(){
		return this.add_bogaamt;
	}

	public String getAdd_bhnosabeon(){
		return this.add_bhnosabeon;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_4102_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_4102_ADM dm = (HD_SALY_4102_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.nm_korn);
		cstmt.setString(7, dm.lon_clsf_cd);
		cstmt.setString(8, dm.lon_dt);
		cstmt.setString(9, dm.bhbhyb);
		cstmt.setString(10, dm.bogaamt);
		cstmt.setString(11, dm.bhnosabeon);
		cstmt.setString(12, dm.add_bogaamt);
		cstmt.setString(13, dm.add_bhnosabeon);
		cstmt.setString(14, dm.u_ipadd);
		cstmt.setString(15, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_4102_ADataSet();
	}



    public void print(){
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("nm_korn = " + getNm_korn());
        System.out.println("lon_clsf_cd = " + getLon_clsf_cd());
        System.out.println("lon_dt = " + getLon_dt());
        System.out.println("bhbhyb = " + getBhbhyb());
        System.out.println("bogaamt = " + getBogaamt());
        System.out.println("bhnosabeon = " + getBhnosabeon());
        System.out.println("add_bogaamt = " + getAdd_bogaamt());
        System.out.println("add_bhnosabeon = " + getAdd_bhnosabeon());
        System.out.println("u_ipadd = " + getU_ipadd());
        System.out.println("u_id = " + getU_id());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String nm_korn = req.getParameter("nm_korn");
if( nm_korn == null){
	System.out.println(this.toString+" : nm_korn is null" );
}else{
	System.out.println(this.toString+" : nm_korn is "+nm_korn );
}
String lon_clsf_cd = req.getParameter("lon_clsf_cd");
if( lon_clsf_cd == null){
	System.out.println(this.toString+" : lon_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : lon_clsf_cd is "+lon_clsf_cd );
}
String lon_dt = req.getParameter("lon_dt");
if( lon_dt == null){
	System.out.println(this.toString+" : lon_dt is null" );
}else{
	System.out.println(this.toString+" : lon_dt is "+lon_dt );
}
String bhbhyb = req.getParameter("bhbhyb");
if( bhbhyb == null){
	System.out.println(this.toString+" : bhbhyb is null" );
}else{
	System.out.println(this.toString+" : bhbhyb is "+bhbhyb );
}
String bogaamt = req.getParameter("bogaamt");
if( bogaamt == null){
	System.out.println(this.toString+" : bogaamt is null" );
}else{
	System.out.println(this.toString+" : bogaamt is "+bogaamt );
}
String bhnosabeon = req.getParameter("bhnosabeon");
if( bhnosabeon == null){
	System.out.println(this.toString+" : bhnosabeon is null" );
}else{
	System.out.println(this.toString+" : bhnosabeon is "+bhnosabeon );
}
String add_bogaamt = req.getParameter("add_bogaamt");
if( add_bogaamt == null){
	System.out.println(this.toString+" : add_bogaamt is null" );
}else{
	System.out.println(this.toString+" : add_bogaamt is "+add_bogaamt );
}
String add_bhnosabeon = req.getParameter("add_bhnosabeon");
if( add_bhnosabeon == null){
	System.out.println(this.toString+" : add_bhnosabeon is null" );
}else{
	System.out.println(this.toString+" : add_bhnosabeon is "+add_bhnosabeon );
}
String u_ipadd = req.getParameter("u_ipadd");
if( u_ipadd == null){
	System.out.println(this.toString+" : u_ipadd is null" );
}else{
	System.out.println(this.toString+" : u_ipadd is "+u_ipadd );
}
String u_id = req.getParameter("u_id");
if( u_id == null){
	System.out.println(this.toString+" : u_id is null" );
}else{
	System.out.println(this.toString+" : u_id is "+u_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String nm_korn = Util.checkString(req.getParameter("nm_korn"));
String lon_clsf_cd = Util.checkString(req.getParameter("lon_clsf_cd"));
String lon_dt = Util.checkString(req.getParameter("lon_dt"));
String bhbhyb = Util.checkString(req.getParameter("bhbhyb"));
String bogaamt = Util.checkString(req.getParameter("bogaamt"));
String bhnosabeon = Util.checkString(req.getParameter("bhnosabeon"));
String add_bogaamt = Util.checkString(req.getParameter("add_bogaamt"));
String add_bhnosabeon = Util.checkString(req.getParameter("add_bhnosabeon"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String nm_korn = Util.Uni2Ksc(Util.checkString(req.getParameter("nm_korn")));
String lon_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("lon_clsf_cd")));
String lon_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lon_dt")));
String bhbhyb = Util.Uni2Ksc(Util.checkString(req.getParameter("bhbhyb")));
String bogaamt = Util.Uni2Ksc(Util.checkString(req.getParameter("bogaamt")));
String bhnosabeon = Util.Uni2Ksc(Util.checkString(req.getParameter("bhnosabeon")));
String add_bogaamt = Util.Uni2Ksc(Util.checkString(req.getParameter("add_bogaamt")));
String add_bhnosabeon = Util.Uni2Ksc(Util.checkString(req.getParameter("add_bhnosabeon")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setNm_korn(nm_korn);
dm.setLon_clsf_cd(lon_clsf_cd);
dm.setLon_dt(lon_dt);
dm.setBhbhyb(bhbhyb);
dm.setBogaamt(bogaamt);
dm.setBhnosabeon(bhnosabeon);
dm.setAdd_bogaamt(add_bogaamt);
dm.setAdd_bhnosabeon(add_bhnosabeon);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 09 20:51:59 KST 2009 */