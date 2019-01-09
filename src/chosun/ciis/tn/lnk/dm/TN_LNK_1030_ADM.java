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


public class TN_LNK_1030_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String flag;
	public String onl_memb_idx;
	public String onl_prms_idx;
	public String onl_pmnt_idx;

	public TN_LNK_1030_ADM(){}
	public TN_LNK_1030_ADM(String cmpy_cd, String flag, String onl_memb_idx, String onl_prms_idx, String onl_pmnt_idx){
		this.cmpy_cd = cmpy_cd;
		this.flag = flag;
		this.onl_memb_idx = onl_memb_idx;
		this.onl_prms_idx = onl_prms_idx;
		this.onl_pmnt_idx = onl_pmnt_idx;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFlag(String flag){
		this.flag = flag;
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

	public String getFlag(){
		return this.flag;
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
		 return "{ call MISTNN.SP_TN_LNK_1030_A(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_1030_ADM dm = (TN_LNK_1030_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.flag);
		cstmt.setString(5, dm.onl_memb_idx);
		cstmt.setString(6, dm.onl_prms_idx);
		cstmt.setString(7, dm.onl_pmnt_idx);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_1030_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("flag = [" + getFlag() + "]");
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
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
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
String flag = Util.checkString(req.getParameter("flag"));
String onl_memb_idx = Util.checkString(req.getParameter("onl_memb_idx"));
String onl_prms_idx = Util.checkString(req.getParameter("onl_prms_idx"));
String onl_pmnt_idx = Util.checkString(req.getParameter("onl_pmnt_idx"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String onl_memb_idx = Util.Uni2Ksc(Util.checkString(req.getParameter("onl_memb_idx")));
String onl_prms_idx = Util.Uni2Ksc(Util.checkString(req.getParameter("onl_prms_idx")));
String onl_pmnt_idx = Util.Uni2Ksc(Util.checkString(req.getParameter("onl_pmnt_idx")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFlag(flag);
dm.setOnl_memb_idx(onl_memb_idx);
dm.setOnl_prms_idx(onl_prms_idx);
dm.setOnl_pmnt_idx(onl_pmnt_idx);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 04 19:33:36 KST 2016 */