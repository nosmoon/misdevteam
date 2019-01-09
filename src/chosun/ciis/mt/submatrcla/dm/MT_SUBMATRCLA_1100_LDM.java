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


package chosun.ciis.mt.submatrcla.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrcla.ds.*;
import chosun.ciis.mt.submatrcla.rec.*;

/**
 *
 */


public class MT_SUBMATRCLA_1100_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String from_dt;
	public String dept_cd;

	public MT_SUBMATRCLA_1100_LDM(){}
	public MT_SUBMATRCLA_1100_LDM(String from_dt, String dept_cd){
		this.from_dt = from_dt;
		this.dept_cd = dept_cd;
	}

	public void setFrom_dt(String from_dt){
		this.from_dt = from_dt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public String getFrom_dt(){
		return this.from_dt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATRCLA_1100_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATRCLA_1100_LDM dm = (MT_SUBMATRCLA_1100_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.from_dt);
		cstmt.setString(4, dm.dept_cd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrcla.ds.MT_SUBMATRCLA_1100_LDataSet();
	}



    public void print(){
        System.out.println("from_dt = " + getFrom_dt());
        System.out.println("dept_cd = " + getDept_cd());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String from_dt = req.getParameter("from_dt");
if( from_dt == null){
	System.out.println(this.toString+" : from_dt is null" );
}else{
	System.out.println(this.toString+" : from_dt is "+from_dt );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String from_dt = Util.checkString(req.getParameter("from_dt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String from_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("from_dt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setFrom_dt(from_dt);
dm.setDept_cd(dept_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 05 15:08:24 KST 2009 */