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


package chosun.ciis.en.comm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.comm.ds.*;
import chosun.ciis.en.comm.rec.*;

/**
 * 
 */


public class EN_COMM_1001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String search;
	public String clsf_cd;

	public EN_COMM_1001_LDM(){}
	public EN_COMM_1001_LDM(String cmpy_cd, String search, String clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.search = search;
		this.clsf_cd = clsf_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSearch(String search){
		this.search = search;
	}

	public void setClsf_cd(String clsf_cd){
		this.clsf_cd = clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSearch(){
		return this.search;
	}

	public String getClsf_cd(){
		return this.clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_COMM_1001_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_COMM_1001_LDM dm = (EN_COMM_1001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.search);
		cstmt.setString(5, dm.clsf_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.comm.ds.EN_COMM_1001_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("search = " + getSearch());
        System.out.println("clsf_cd = " + getClsf_cd());
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
String search = req.getParameter("search");
if( search == null){
	System.out.println(this.toString+" : search is null" );
}else{
	System.out.println(this.toString+" : search is "+search );
}
String clsf_cd = req.getParameter("clsf_cd");
if( clsf_cd == null){
	System.out.println(this.toString+" : clsf_cd is null" );
}else{
	System.out.println(this.toString+" : clsf_cd is "+clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String search = Util.checkString(req.getParameter("search"));
String clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String search = Util.Uni2Ksc(Util.checkString(req.getParameter("search")));
String clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSearch(search);
dm.setClsf_cd(clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 12 10:10:27 KST 2009 */