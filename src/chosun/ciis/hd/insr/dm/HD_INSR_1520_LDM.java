/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.insr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.insr.ds.*;
import chosun.ciis.hd.insr.rec.*;

/**
 * 
 */


public class HD_INSR_1520_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String search_yyyymm;

	public HD_INSR_1520_LDM(){}
	public HD_INSR_1520_LDM(String cmpy_cd, String search_yyyymm){
		this.cmpy_cd = cmpy_cd;
		this.search_yyyymm = search_yyyymm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSearch_yyyymm(String search_yyyymm){
		this.search_yyyymm = search_yyyymm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSearch_yyyymm(){
		return this.search_yyyymm;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INSR_1520_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INSR_1520_LDM dm = (HD_INSR_1520_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.search_yyyymm);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.insr.ds.HD_INSR_1520_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("search_yyyymm = [" + getSearch_yyyymm() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String search_yyyymm = req.getParameter("search_yyyymm");
if( search_yyyymm == null){
	System.out.println(this.toString+" : search_yyyymm is null" );
}else{
	System.out.println(this.toString+" : search_yyyymm is "+search_yyyymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String search_yyyymm = Util.checkString(req.getParameter("search_yyyymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String search_yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("search_yyyymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSearch_yyyymm(search_yyyymm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Oct 04 14:34:47 KST 2013 */