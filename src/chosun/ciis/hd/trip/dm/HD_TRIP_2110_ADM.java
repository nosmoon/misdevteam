

package chosun.ciis.hd.trip.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.trip.ds.*;
import chosun.ciis.hd.trip.rec.*;

/**
 * 
 */


public class HD_TRIP_2110_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String biz_trip_dest;
	public String biz_trip_frdt;
	public String biz_trip_todt;
	public String biz_trip_dds;
	public String biz_trip_purp;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_TRIP_2110_ADM(){}
	public HD_TRIP_2110_ADM(String mode, String cmpy_cd, String emp_no, String occr_dt, String seq, String flnm, String dept_cd, String dty_cd, String posi_cd, String biz_trip_dest, String biz_trip_frdt, String biz_trip_todt, String biz_trip_dds, String biz_trip_purp, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.biz_trip_dest = biz_trip_dest;
		this.biz_trip_frdt = biz_trip_frdt;
		this.biz_trip_todt = biz_trip_todt;
		this.biz_trip_dds = biz_trip_dds;
		this.biz_trip_purp = biz_trip_purp;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
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

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setBiz_trip_dest(String biz_trip_dest){
		this.biz_trip_dest = biz_trip_dest;
	}

	public void setBiz_trip_frdt(String biz_trip_frdt){
		this.biz_trip_frdt = biz_trip_frdt;
	}

	public void setBiz_trip_todt(String biz_trip_todt){
		this.biz_trip_todt = biz_trip_todt;
	}

	public void setBiz_trip_dds(String biz_trip_dds){
		this.biz_trip_dds = biz_trip_dds;
	}

	public void setBiz_trip_purp(String biz_trip_purp){
		this.biz_trip_purp = biz_trip_purp;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
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

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getBiz_trip_dest(){
		return this.biz_trip_dest;
	}

	public String getBiz_trip_frdt(){
		return this.biz_trip_frdt;
	}

	public String getBiz_trip_todt(){
		return this.biz_trip_todt;
	}

	public String getBiz_trip_dds(){
		return this.biz_trip_dds;
	}

	public String getBiz_trip_purp(){
		return this.biz_trip_purp;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_TRIP_2110_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_TRIP_2110_ADM dm = (HD_TRIP_2110_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.flnm);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.dty_cd);
		cstmt.setString(11, dm.posi_cd);
		cstmt.setString(12, dm.biz_trip_dest);
		cstmt.setString(13, dm.biz_trip_frdt);
		cstmt.setString(14, dm.biz_trip_todt);
		cstmt.setString(15, dm.biz_trip_dds);
		cstmt.setString(16, dm.biz_trip_purp);
		cstmt.setString(17, dm.incmg_pers_ipadd);
		cstmt.setString(18, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_TRIP_2110_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("biz_trip_dest = [" + getBiz_trip_dest() + "]");
		System.out.println("biz_trip_frdt = [" + getBiz_trip_frdt() + "]");
		System.out.println("biz_trip_todt = [" + getBiz_trip_todt() + "]");
		System.out.println("biz_trip_dds = [" + getBiz_trip_dds() + "]");
		System.out.println("biz_trip_purp = [" + getBiz_trip_purp() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dty_cd = req.getParameter("dty_cd");
if( dty_cd == null){
	System.out.println(this.toString+" : dty_cd is null" );
}else{
	System.out.println(this.toString+" : dty_cd is "+dty_cd );
}
String posi_cd = req.getParameter("posi_cd");
if( posi_cd == null){
	System.out.println(this.toString+" : posi_cd is null" );
}else{
	System.out.println(this.toString+" : posi_cd is "+posi_cd );
}
String biz_trip_dest = req.getParameter("biz_trip_dest");
if( biz_trip_dest == null){
	System.out.println(this.toString+" : biz_trip_dest is null" );
}else{
	System.out.println(this.toString+" : biz_trip_dest is "+biz_trip_dest );
}
String biz_trip_frdt = req.getParameter("biz_trip_frdt");
if( biz_trip_frdt == null){
	System.out.println(this.toString+" : biz_trip_frdt is null" );
}else{
	System.out.println(this.toString+" : biz_trip_frdt is "+biz_trip_frdt );
}
String biz_trip_todt = req.getParameter("biz_trip_todt");
if( biz_trip_todt == null){
	System.out.println(this.toString+" : biz_trip_todt is null" );
}else{
	System.out.println(this.toString+" : biz_trip_todt is "+biz_trip_todt );
}
String biz_trip_dds = req.getParameter("biz_trip_dds");
if( biz_trip_dds == null){
	System.out.println(this.toString+" : biz_trip_dds is null" );
}else{
	System.out.println(this.toString+" : biz_trip_dds is "+biz_trip_dds );
}
String biz_trip_purp = req.getParameter("biz_trip_purp");
if( biz_trip_purp == null){
	System.out.println(this.toString+" : biz_trip_purp is null" );
}else{
	System.out.println(this.toString+" : biz_trip_purp is "+biz_trip_purp );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String biz_trip_dest = Util.checkString(req.getParameter("biz_trip_dest"));
String biz_trip_frdt = Util.checkString(req.getParameter("biz_trip_frdt"));
String biz_trip_todt = Util.checkString(req.getParameter("biz_trip_todt"));
String biz_trip_dds = Util.checkString(req.getParameter("biz_trip_dds"));
String biz_trip_purp = Util.checkString(req.getParameter("biz_trip_purp"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String biz_trip_dest = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_trip_dest")));
String biz_trip_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_trip_frdt")));
String biz_trip_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_trip_todt")));
String biz_trip_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_trip_dds")));
String biz_trip_purp = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_trip_purp")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setBiz_trip_dest(biz_trip_dest);
dm.setBiz_trip_frdt(biz_trip_frdt);
dm.setBiz_trip_todt(biz_trip_todt);
dm.setBiz_trip_dds(biz_trip_dds);
dm.setBiz_trip_purp(biz_trip_purp);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 06 13:45:29 KST 2011 */