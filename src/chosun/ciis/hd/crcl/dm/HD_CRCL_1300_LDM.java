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


package chosun.ciis.hd.crcl.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.crcl.ds.*;
import chosun.ciis.hd.crcl.rec.*;

/**
 * 
 */


public class HD_CRCL_1300_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String paty_crc_cd;
	public String emp_no;
	public String flnm;
	public String from_dt;
	public String to_dt;
	public String entr_clsf;

	public HD_CRCL_1300_LDM(){}
	public HD_CRCL_1300_LDM(String cmpy_cd, String paty_crc_cd, String emp_no, String flnm, String from_dt, String to_dt, String entr_clsf){
		this.cmpy_cd = cmpy_cd;
		this.paty_crc_cd = paty_crc_cd;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.from_dt = from_dt;
		this.to_dt = to_dt;
		this.entr_clsf = entr_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPaty_crc_cd(String paty_crc_cd){
		this.paty_crc_cd = paty_crc_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setFrom_dt(String from_dt){
		this.from_dt = from_dt;
	}

	public void setTo_dt(String to_dt){
		this.to_dt = to_dt;
	}

	public void setEntr_clsf(String entr_clsf){
		this.entr_clsf = entr_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPaty_crc_cd(){
		return this.paty_crc_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getFrom_dt(){
		return this.from_dt;
	}

	public String getTo_dt(){
		return this.to_dt;
	}

	public String getEntr_clsf(){
		return this.entr_clsf;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_CRCL_1300_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_CRCL_1300_LDM dm = (HD_CRCL_1300_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.paty_crc_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.flnm);
		cstmt.setString(7, dm.from_dt);
		cstmt.setString(8, dm.to_dt);
		cstmt.setString(9, dm.entr_clsf);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.crcl.ds.HD_CRCL_1300_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("paty_crc_cd = " + getPaty_crc_cd());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("flnm = " + getFlnm());
        System.out.println("from_dt = " + getFrom_dt());
        System.out.println("to_dt = " + getTo_dt());
        System.out.println("entr_clsf = " + getEntr_clsf());
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
String paty_crc_cd = req.getParameter("paty_crc_cd");
if( paty_crc_cd == null){
	System.out.println(this.toString+" : paty_crc_cd is null" );
}else{
	System.out.println(this.toString+" : paty_crc_cd is "+paty_crc_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String from_dt = req.getParameter("from_dt");
if( from_dt == null){
	System.out.println(this.toString+" : from_dt is null" );
}else{
	System.out.println(this.toString+" : from_dt is "+from_dt );
}
String to_dt = req.getParameter("to_dt");
if( to_dt == null){
	System.out.println(this.toString+" : to_dt is null" );
}else{
	System.out.println(this.toString+" : to_dt is "+to_dt );
}
String entr_clsf = req.getParameter("entr_clsf");
if( entr_clsf == null){
	System.out.println(this.toString+" : entr_clsf is null" );
}else{
	System.out.println(this.toString+" : entr_clsf is "+entr_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String paty_crc_cd = Util.checkString(req.getParameter("paty_crc_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String from_dt = Util.checkString(req.getParameter("from_dt"));
String to_dt = Util.checkString(req.getParameter("to_dt"));
String entr_clsf = Util.checkString(req.getParameter("entr_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String paty_crc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("paty_crc_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String from_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("from_dt")));
String to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dt")));
String entr_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("entr_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPaty_crc_cd(paty_crc_cd);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setFrom_dt(from_dt);
dm.setTo_dt(to_dt);
dm.setEntr_clsf(entr_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 19 10:56:44 KST 2009 */