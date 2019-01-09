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


package chosun.ciis.hd.edu.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.edu.ds.*;
import chosun.ciis.hd.edu.rec.*;

/**
 * 
 */


public class HD_EDU_2003_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cour_obj_cd;

	public HD_EDU_2003_MDM(){}
	public HD_EDU_2003_MDM(String cmpy_cd, String cour_obj_cd){
		this.cmpy_cd = cmpy_cd;
		this.cour_obj_cd = cour_obj_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setcour_obj_cd(String cour_obj_cd){
		this.cour_obj_cd = cour_obj_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getcour_obj_cd(){
		return this.cour_obj_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EDU_2003_M(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EDU_2003_MDM dm = (HD_EDU_2003_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cour_obj_cd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.edu.ds.HD_EDU_2003_MDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("cour_obj_cd = [" + getcour_obj_cd() + "]");
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
String cour_obj_cd = req.getParameter("cour_obj_cd");
if( cour_obj_cd == null){
	System.out.println(this.toString+" : cour_obj_cd is null" );
}else{
	System.out.println(this.toString+" : cour_obj_cd is "+cour_obj_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cour_obj_cd = Util.checkString(req.getParameter("cour_obj_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cour_obj_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cour_obj_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setcour_obj_cd(cour_obj_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Oct 10 16:58:02 KST 2012 */