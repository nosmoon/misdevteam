

package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_2301_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String rptv_posi_cd;
	public String emp_srt_seq;
	public String emp_album_clsf;
	public String gubun;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_INFO_2301_ADM(){}
	public HD_INFO_2301_ADM(String cmpy_cd, String emp_no, String rptv_posi_cd, String emp_srt_seq, String emp_album_clsf, String gubun, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.rptv_posi_cd = rptv_posi_cd;
		this.emp_srt_seq = emp_srt_seq;
		this.emp_album_clsf = emp_album_clsf;
		this.gubun = gubun;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setRptv_posi_cd(String rptv_posi_cd){
		this.rptv_posi_cd = rptv_posi_cd;
	}

	public void setEmp_srt_seq(String emp_srt_seq){
		this.emp_srt_seq = emp_srt_seq;
	}

	public void setEmp_album_clsf(String emp_album_clsf){
		this.emp_album_clsf = emp_album_clsf;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getRptv_posi_cd(){
		return this.rptv_posi_cd;
	}

	public String getEmp_srt_seq(){
		return this.emp_srt_seq;
	}

	public String getEmp_album_clsf(){
		return this.emp_album_clsf;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_2301_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_2301_ADM dm = (HD_INFO_2301_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.rptv_posi_cd);
		cstmt.setString(6, dm.emp_srt_seq);
		cstmt.setString(7, dm.emp_album_clsf);
		cstmt.setString(8, dm.gubun);
		cstmt.setString(9, dm.incmg_pers_ipadd);
		cstmt.setString(10, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_INFO_2301_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("rptv_posi_cd = [" + getRptv_posi_cd() + "]");
		System.out.println("emp_srt_seq = [" + getEmp_srt_seq() + "]");
		System.out.println("emp_album_clsf = [" + getEmp_album_clsf() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String rptv_posi_cd = req.getParameter("rptv_posi_cd");
if( rptv_posi_cd == null){
	System.out.println(this.toString+" : rptv_posi_cd is null" );
}else{
	System.out.println(this.toString+" : rptv_posi_cd is "+rptv_posi_cd );
}
String emp_srt_seq = req.getParameter("emp_srt_seq");
if( emp_srt_seq == null){
	System.out.println(this.toString+" : emp_srt_seq is null" );
}else{
	System.out.println(this.toString+" : emp_srt_seq is "+emp_srt_seq );
}
String emp_album_clsf = req.getParameter("emp_album_clsf");
if( emp_album_clsf == null){
	System.out.println(this.toString+" : emp_album_clsf is null" );
}else{
	System.out.println(this.toString+" : emp_album_clsf is "+emp_album_clsf );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String rptv_posi_cd = Util.checkString(req.getParameter("rptv_posi_cd"));
String emp_srt_seq = Util.checkString(req.getParameter("emp_srt_seq"));
String emp_album_clsf = Util.checkString(req.getParameter("emp_album_clsf"));
String gubun = Util.checkString(req.getParameter("gubun"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String rptv_posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("rptv_posi_cd")));
String emp_srt_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_srt_seq")));
String emp_album_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_album_clsf")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setRptv_posi_cd(rptv_posi_cd);
dm.setEmp_srt_seq(emp_srt_seq);
dm.setEmp_album_clsf(emp_album_clsf);
dm.setGubun(gubun);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 12 15:31:49 KST 2010 */