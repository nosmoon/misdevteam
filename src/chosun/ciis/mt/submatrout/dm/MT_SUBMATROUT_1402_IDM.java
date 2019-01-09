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


package chosun.ciis.mt.submatrout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.ds.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 * 
 */


public class MT_SUBMATROUT_1402_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String matr_cd;
	public String ordr_cnt;
	public String per_ip_addr;
	public String per_id;

	public MT_SUBMATROUT_1402_IDM(){}
	public MT_SUBMATROUT_1402_IDM(String cmpy_cd, String fac_clsf, String matr_cd, String ordr_cnt, String per_ip_addr, String per_id){
		this.cmpy_cd = cmpy_cd;
		this.fac_clsf = fac_clsf;
		this.matr_cd = matr_cd;
		this.ordr_cnt = ordr_cnt;
		this.per_ip_addr = per_ip_addr;
		this.per_id = per_id;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setOrdr_cnt(String ordr_cnt){
		this.ordr_cnt = ordr_cnt;
	}

	public void setPer_ip_addr(String per_ip_addr){
		this.per_ip_addr = per_ip_addr;
	}

	public void setPer_id(String per_id){
		this.per_id = per_id;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getOrdr_cnt(){
		return this.ordr_cnt;
	}

	public String getPer_ip_addr(){
		return this.per_ip_addr;
	}

	public String getPer_id(){
		return this.per_id;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATROUT_1402_I(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATROUT_1402_IDM dm = (MT_SUBMATROUT_1402_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fac_clsf);
		cstmt.setString(5, dm.matr_cd);
		cstmt.setString(6, dm.ordr_cnt);
		cstmt.setString(7, dm.per_ip_addr);
		cstmt.setString(8, dm.per_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrout.ds.MT_SUBMATROUT_1402_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("ordr_cnt = [" + getOrdr_cnt() + "]");
		System.out.println("per_ip_addr = [" + getPer_ip_addr() + "]");
		System.out.println("per_id = [" + getPer_id() + "]");
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
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String ordr_cnt = req.getParameter("ordr_cnt");
if( ordr_cnt == null){
	System.out.println(this.toString+" : ordr_cnt is null" );
}else{
	System.out.println(this.toString+" : ordr_cnt is "+ordr_cnt );
}
String per_ip_addr = req.getParameter("per_ip_addr");
if( per_ip_addr == null){
	System.out.println(this.toString+" : per_ip_addr is null" );
}else{
	System.out.println(this.toString+" : per_ip_addr is "+per_ip_addr );
}
String per_id = req.getParameter("per_id");
if( per_id == null){
	System.out.println(this.toString+" : per_id is null" );
}else{
	System.out.println(this.toString+" : per_id is "+per_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String ordr_cnt = Util.checkString(req.getParameter("ordr_cnt"));
String per_ip_addr = Util.checkString(req.getParameter("per_ip_addr"));
String per_id = Util.checkString(req.getParameter("per_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String ordr_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_cnt")));
String per_ip_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("per_ip_addr")));
String per_id = Util.Uni2Ksc(Util.checkString(req.getParameter("per_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFac_clsf(fac_clsf);
dm.setMatr_cd(matr_cd);
dm.setOrdr_cnt(ordr_cnt);
dm.setPer_ip_addr(per_ip_addr);
dm.setPer_id(per_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 15:58:03 KST 2009 */