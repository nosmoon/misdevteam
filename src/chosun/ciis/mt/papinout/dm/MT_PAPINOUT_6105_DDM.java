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


package chosun.ciis.mt.papinout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.ds.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_6105_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yyyymm;
	public String tax_num;
	public String tax_seq;
	public String per_id;

	public MT_PAPINOUT_6105_DDM(){}
	public MT_PAPINOUT_6105_DDM(String cmpy_cd, String yyyymm, String tax_num, String tax_seq, String per_id){
		this.cmpy_cd = cmpy_cd;
		this.yyyymm = yyyymm;
		this.tax_num = tax_num;
		this.tax_seq = tax_seq;
		this.per_id = per_id;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYyyymm(String yyyymm){
		this.yyyymm = yyyymm;
	}

	public void setTax_num(String tax_num){
		this.tax_num = tax_num;
	}

	public void setTax_seq(String tax_seq){
		this.tax_seq = tax_seq;
	}

	public void setPer_id(String per_id){
		this.per_id = per_id;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYyyymm(){
		return this.yyyymm;
	}

	public String getTax_num(){
		return this.tax_num;
	}

	public String getTax_seq(){
		return this.tax_seq;
	}

	public String getPer_id(){
		return this.per_id;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_6105_D(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_6105_DDM dm = (MT_PAPINOUT_6105_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yyyymm);
		cstmt.setString(5, dm.tax_num);
		cstmt.setString(6, dm.tax_seq);
		cstmt.setString(7, dm.per_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_6105_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yyyymm = [" + getYyyymm() + "]");
		System.out.println("tax_num = [" + getTax_num() + "]");
		System.out.println("tax_seq = [" + getTax_seq() + "]");
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
String yyyymm = req.getParameter("yyyymm");
if( yyyymm == null){
	System.out.println(this.toString+" : yyyymm is null" );
}else{
	System.out.println(this.toString+" : yyyymm is "+yyyymm );
}
String tax_num = req.getParameter("tax_num");
if( tax_num == null){
	System.out.println(this.toString+" : tax_num is null" );
}else{
	System.out.println(this.toString+" : tax_num is "+tax_num );
}
String tax_seq = req.getParameter("tax_seq");
if( tax_seq == null){
	System.out.println(this.toString+" : tax_seq is null" );
}else{
	System.out.println(this.toString+" : tax_seq is "+tax_seq );
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
String yyyymm = Util.checkString(req.getParameter("yyyymm"));
String tax_num = Util.checkString(req.getParameter("tax_num"));
String tax_seq = Util.checkString(req.getParameter("tax_seq"));
String per_id = Util.checkString(req.getParameter("per_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyymm")));
String tax_num = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_num")));
String tax_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_seq")));
String per_id = Util.Uni2Ksc(Util.checkString(req.getParameter("per_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYyyymm(yyyymm);
dm.setTax_num(tax_num);
dm.setTax_seq(tax_seq);
dm.setPer_id(per_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 21 16:58:55 KST 2009 */