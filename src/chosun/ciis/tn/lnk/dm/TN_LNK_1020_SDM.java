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


package chosun.ciis.tn.lnk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_1020_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String onl_memb_idx;
	public String onl_prms_idx;
	public String onl_pmnt_idx;

	public TN_LNK_1020_SDM(){}
	public TN_LNK_1020_SDM(String cmpy_cd, String onl_memb_idx, String onl_prms_idx, String onl_pmnt_idx){
		this.cmpy_cd = cmpy_cd;
		this.onl_memb_idx = onl_memb_idx;
		this.onl_prms_idx = onl_prms_idx;
		this.onl_pmnt_idx = onl_pmnt_idx;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOnl_memb_idx(String onl_memb_idx){
		this.onl_memb_idx = onl_memb_idx;
	}

	public void setOnl_prms_idx(String onl_prms_idx){
		this.onl_prms_idx = onl_prms_idx;
	}

	public void setOnl_pmnt_idx(String onl_pmnt_idx){
		this.onl_pmnt_idx = onl_pmnt_idx;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOnl_memb_idx(){
		return this.onl_memb_idx;
	}

	public String getOnl_prms_idx(){
		return this.onl_prms_idx;
	}

	public String getOnl_pmnt_idx(){
		return this.onl_pmnt_idx;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_1020_S(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_1020_SDM dm = (TN_LNK_1020_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.onl_memb_idx);
		cstmt.setString(5, dm.onl_prms_idx);
		cstmt.setString(6, dm.onl_pmnt_idx);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
		cstmt.registerOutParameter(21, Types.VARCHAR);
		cstmt.registerOutParameter(22, Types.VARCHAR);
		cstmt.registerOutParameter(23, Types.VARCHAR);
		cstmt.registerOutParameter(24, Types.VARCHAR);
		cstmt.registerOutParameter(25, Types.VARCHAR);
		cstmt.registerOutParameter(26, Types.VARCHAR);
		cstmt.registerOutParameter(27, Types.VARCHAR);
		cstmt.registerOutParameter(28, Types.VARCHAR);
		cstmt.registerOutParameter(29, Types.VARCHAR);
		cstmt.registerOutParameter(30, Types.VARCHAR);
		cstmt.registerOutParameter(31, Types.VARCHAR);
		cstmt.registerOutParameter(32, Types.VARCHAR);
		cstmt.registerOutParameter(33, Types.VARCHAR);
		cstmt.registerOutParameter(34, Types.VARCHAR);
		cstmt.registerOutParameter(35, Types.VARCHAR);
		cstmt.registerOutParameter(36, Types.VARCHAR);
		cstmt.registerOutParameter(37, Types.VARCHAR);
		cstmt.registerOutParameter(38, Types.VARCHAR);
		cstmt.registerOutParameter(39, Types.VARCHAR);
		cstmt.registerOutParameter(40, Types.VARCHAR);
		cstmt.registerOutParameter(41, Types.VARCHAR);
		cstmt.registerOutParameter(42, Types.VARCHAR);
		cstmt.registerOutParameter(43, Types.VARCHAR);
		cstmt.registerOutParameter(44, Types.VARCHAR);
		cstmt.registerOutParameter(45, Types.VARCHAR);
		cstmt.registerOutParameter(46, Types.VARCHAR);
		cstmt.registerOutParameter(47, Types.VARCHAR);
		cstmt.registerOutParameter(48, Types.VARCHAR);
		cstmt.registerOutParameter(49, Types.VARCHAR);
		cstmt.registerOutParameter(50, Types.VARCHAR);
		cstmt.registerOutParameter(51, Types.VARCHAR);
		cstmt.registerOutParameter(52, Types.VARCHAR);
		cstmt.registerOutParameter(53, Types.VARCHAR);
		cstmt.registerOutParameter(54, Types.VARCHAR);
		cstmt.registerOutParameter(55, Types.VARCHAR);
		cstmt.registerOutParameter(56, Types.VARCHAR);
		cstmt.registerOutParameter(57, Types.VARCHAR);
		cstmt.registerOutParameter(58, Types.VARCHAR);
		cstmt.registerOutParameter(59, Types.VARCHAR);
		cstmt.registerOutParameter(60, Types.VARCHAR);
		cstmt.registerOutParameter(61, Types.VARCHAR);
		cstmt.registerOutParameter(62, Types.VARCHAR);
		cstmt.registerOutParameter(63, Types.VARCHAR);
		cstmt.registerOutParameter(64, Types.VARCHAR);
		cstmt.registerOutParameter(65, Types.VARCHAR);
		cstmt.registerOutParameter(66, Types.VARCHAR);
		cstmt.registerOutParameter(67, Types.VARCHAR);
		cstmt.registerOutParameter(68, Types.VARCHAR);
		cstmt.registerOutParameter(69, Types.VARCHAR);
		cstmt.registerOutParameter(70, Types.VARCHAR);
		cstmt.registerOutParameter(71, Types.VARCHAR);
		cstmt.registerOutParameter(72, Types.VARCHAR);
		cstmt.registerOutParameter(73, Types.VARCHAR);
		cstmt.registerOutParameter(74, Types.VARCHAR);
		cstmt.registerOutParameter(75, Types.VARCHAR);
		cstmt.registerOutParameter(76, Types.VARCHAR);
		cstmt.registerOutParameter(77, Types.VARCHAR);
		cstmt.registerOutParameter(78, Types.VARCHAR);
		cstmt.registerOutParameter(79, Types.VARCHAR);
		cstmt.registerOutParameter(80, Types.VARCHAR);
		cstmt.registerOutParameter(81, Types.VARCHAR);
		cstmt.registerOutParameter(82, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_1020_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("onl_memb_idx = [" + getOnl_memb_idx() + "]");
		System.out.println("onl_prms_idx = [" + getOnl_prms_idx() + "]");
		System.out.println("onl_pmnt_idx = [" + getOnl_pmnt_idx() + "]");
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
String onl_memb_idx = req.getParameter("onl_memb_idx");
if( onl_memb_idx == null){
	System.out.println(this.toString+" : onl_memb_idx is null" );
}else{
	System.out.println(this.toString+" : onl_memb_idx is "+onl_memb_idx );
}
String onl_prms_idx = req.getParameter("onl_prms_idx");
if( onl_prms_idx == null){
	System.out.println(this.toString+" : onl_prms_idx is null" );
}else{
	System.out.println(this.toString+" : onl_prms_idx is "+onl_prms_idx );
}
String onl_pmnt_idx = req.getParameter("onl_pmnt_idx");
if( onl_pmnt_idx == null){
	System.out.println(this.toString+" : onl_pmnt_idx is null" );
}else{
	System.out.println(this.toString+" : onl_pmnt_idx is "+onl_pmnt_idx );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String onl_memb_idx = Util.checkString(req.getParameter("onl_memb_idx"));
String onl_prms_idx = Util.checkString(req.getParameter("onl_prms_idx"));
String onl_pmnt_idx = Util.checkString(req.getParameter("onl_pmnt_idx"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String onl_memb_idx = Util.Uni2Ksc(Util.checkString(req.getParameter("onl_memb_idx")));
String onl_prms_idx = Util.Uni2Ksc(Util.checkString(req.getParameter("onl_prms_idx")));
String onl_pmnt_idx = Util.Uni2Ksc(Util.checkString(req.getParameter("onl_pmnt_idx")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOnl_memb_idx(onl_memb_idx);
dm.setOnl_prms_idx(onl_prms_idx);
dm.setOnl_pmnt_idx(onl_pmnt_idx);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 24 16:01:40 KST 2016 */