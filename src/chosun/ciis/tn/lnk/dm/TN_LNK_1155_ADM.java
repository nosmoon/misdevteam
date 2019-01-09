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


public class TN_LNK_1155_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String flag;
	public String excl_pmnt_idx;
	public String title;

	public TN_LNK_1155_ADM(){}
	public TN_LNK_1155_ADM(String cmpy_cd, String flag, String excl_pmnt_idx, String title){
		this.cmpy_cd = cmpy_cd;
		this.flag = flag;
		this.excl_pmnt_idx = excl_pmnt_idx;
		this.title = title;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setExcl_pmnt_idx(String excl_pmnt_idx){
		this.excl_pmnt_idx = excl_pmnt_idx;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getExcl_pmnt_idx(){
		return this.excl_pmnt_idx;
	}

	public String getTitle(){
		return this.title;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_1155_A(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_1155_ADM dm = (TN_LNK_1155_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.flag);
		cstmt.setString(5, dm.excl_pmnt_idx);
		cstmt.setString(6, dm.title);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_1155_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("excl_pmnt_idx = [" + getExcl_pmnt_idx() + "]");
		System.out.println("title = [" + getTitle() + "]");
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
String excl_pmnt_idx = req.getParameter("excl_pmnt_idx");
if( excl_pmnt_idx == null){
	System.out.println(this.toString+" : excl_pmnt_idx is null" );
}else{
	System.out.println(this.toString+" : excl_pmnt_idx is "+excl_pmnt_idx );
}
String title = req.getParameter("title");
if( title == null){
	System.out.println(this.toString+" : title is null" );
}else{
	System.out.println(this.toString+" : title is "+title );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String flag = Util.checkString(req.getParameter("flag"));
String excl_pmnt_idx = Util.checkString(req.getParameter("excl_pmnt_idx"));
String title = Util.checkString(req.getParameter("title"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String excl_pmnt_idx = Util.Uni2Ksc(Util.checkString(req.getParameter("excl_pmnt_idx")));
String title = Util.Uni2Ksc(Util.checkString(req.getParameter("title")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFlag(flag);
dm.setExcl_pmnt_idx(excl_pmnt_idx);
dm.setTitle(title);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 28 11:50:54 KST 2016 */