/***************************************************************************************************
 * ���ϸ� : AdBrn2000DAO.java
 * ��� : 
 * �ۼ����� : 
 * �ۼ��� : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ad.brn.dao;

import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.*;
import java.sql.*;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.ad.brn.dm.AD_BRN_2000_MDM;
import chosun.ciis.ad.brn.dm.AD_BRN_2012_LDM;
import chosun.ciis.ad.brn.dm.AD_BRN_2030_ADM;
import chosun.ciis.ad.brn.dm.AD_BRN_2040_SDM;
import chosun.ciis.ad.brn.dm.AD_BRN_2050_ADM;
import chosun.ciis.ad.brn.dm.AD_BRN_2055_ADM;
import chosun.ciis.ad.brn.dm.AD_BRN_2090_ADM;
import chosun.ciis.ad.brn.ds.AD_BRN_2000_MDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_2012_LDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_2030_ADataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_2040_SDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_2050_ADataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_2055_ADataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_2090_ADataSet;

/**
 * ��������-�����ڷ����
 */
 
public class AdBrn2000DAO {
	
    /**
     * ���Ϻ���, ���Ϻ������ �ʱ�
     * @param  AD_BRN_2000_MDM
     * @return AD_BRN_2000_MDataSet
     */
    public AD_BRN_2000_MDataSet ad_brn_2000_m(AD_BRN_2000_MDM dm) throws AppException {    	
        DBManager manager = new DBManager("MISADV");        
        AD_BRN_2000_MDataSet ds = (AD_BRN_2000_MDataSet) manager.executeCall(dm);        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }    

    /**
     * ���Ϻ��� ����������� ��ȸ
     * @param  AD_BRN_2012_LDM
     * @return AD_BRN_2012_LDataSet
     */
    public AD_BRN_2012_LDataSet ad_brn_2012_l(AD_BRN_2012_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_2012_LDataSet ds = (AD_BRN_2012_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    } 

    /**
     * ���Ϻ��� �ǰ� �Է�, ����, ����
     * @param  AD_BRN_2030_ADM
     * @return AD_BRN_2030_ADataSet
     */
	public AD_BRN_2030_ADataSet ad_brn_2030_a(AD_BRN_2030_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
		AD_BRN_2030_ADataSet ds = (AD_BRN_2030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ���Ϻ������ ����ȸ
     * @param  AD_BRN_2040_SDM
     * @return AD_BRN_2040_SDataSet
     */
	public AD_BRN_2040_SDataSet ad_brn_2040_s(AD_BRN_2040_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
		AD_BRN_2040_SDataSet ds = (AD_BRN_2040_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ���Ϻ������ �Է�, ����, ����
     * @param  AD_BRN_2050_ADM
     * @return 
     */
    public AD_BRN_2050_ADataSet ad_brn_2050_a(AD_BRN_2050_ADM dm) throws AppException {
    	AD_BRN_2050_ADataSet ds = null;
        
        // ÷�������� ������ ���  and ������ �ƴ� ��� and ÷������ ������ �ƴ� ��� => ÷�������� ������ �ӽ÷� �����Ѵ�.
    	if((dm.add_file1 != null && dm.getFile_delyn1().equals("N") ||
       		dm.add_file2 != null && dm.getFile_delyn2().equals("N") ||
       		dm.add_file3 != null && dm.getFile_delyn3().equals("N") ||
       		dm.add_file4 != null && dm.getFile_delyn4().equals("N") ||
       		dm.add_file5 != null && dm.getFile_delyn5().equals("N")) &&
      	   !dm.getFlag().equals("D")){
       		
    		String c_temp = "";     // ȸ���ڵ�(�ӽ�)
    		String r_temp = "";     // ��������(�ӽ�)
    		String m_temp = "";     // �ۼ�����(�ӽ�)
    		String r_tempSeq  = "";    // ������ȣ(�ӽ�)
    		String a_tempSeq1 = "";    // ÷�����Ϲ�ȣ(�ӽ�)
    		String a_tempSeq2 = "";    // ÷�����Ϲ�ȣ(�ӽ�)
    		String a_tempSeq3 = "";    // ÷�����Ϲ�ȣ(�ӽ�)
    		String a_tempSeq4 = "";    // ÷�����Ϲ�ȣ(�ӽ�)
    		String a_tempSeq5 = "";    // ÷�����Ϲ�ȣ(�ӽ�)
    		byte[] tempCont1;   	   // ÷������ ����(�ӽ� )
    		byte[] tempCont2;   	   // ÷������ ����(�ӽ� )
    		byte[] tempCont3;   	   // ÷������ ����(�ӽ� )
    		byte[] tempCont4;   	   // ÷������ ����(�ӽ� )
    		byte[] tempCont5;   	   // ÷������ ����(�ӽ� )
		   
    		tempCont1 = dm.add_file1;
    		tempCont2 = dm.add_file2;
    		tempCont3 = dm.add_file3;
    		tempCont4 = dm.add_file4;
    		tempCont5 = dm.add_file5;
		   
    		DBManager manager = null;
    		try {
    			System.out.println("java start!!!");
               	manager = new DBManager("MISADV");
               	manager.getConnection();
               	manager.m_conn.setAutoCommit(false);
            
               	CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
               	System.out.println("para setting!!!");
               // �Ķ���� ����
        		cstmt.registerOutParameter(1, Types.VARCHAR);
        		cstmt.registerOutParameter(2, Types.VARCHAR);
        		cstmt.setString(3, dm.cmpy_cd);
        		cstmt.setString(4, dm.rept_clsf);
        		cstmt.setString(5, dm.make_dt);
        		cstmt.setString(6, dm.rept_no);
        		cstmt.setString(7, dm.advcs_clsf);
        		cstmt.setString(8, dm.medi_clsf);
        		cstmt.setString(9, dm.chrg_pers);
        		cstmt.setString(10, dm.dlco_no);
        		cstmt.setString(11, dm.patr_chrg_pers);
        		cstmt.setString(12, dm.titl);
        		cstmt.setString(13, dm.cont);
        		cstmt.setString(14, dm.data_clsf);
        		cstmt.setString(15, dm.incmg_pers);
        		cstmt.setString(16, dm.incmg_pers_ip);
        		cstmt.setString(17, dm.add_file_no1);
        		cstmt.setString(18, dm.add_file_no2);
        		cstmt.setString(19, dm.add_file_no3);
        		cstmt.setString(20, dm.add_file_no4);
        		cstmt.setString(21, dm.add_file_no5);
        		cstmt.setString(22, dm.add_file_nm1);
        		cstmt.setString(23, dm.add_file_nm2);
        		cstmt.setString(24, dm.add_file_nm3);
        		cstmt.setString(25, dm.add_file_nm4);
        		cstmt.setString(26, dm.add_file_nm5);
        		cstmt.setBytes(27, "0101".getBytes());
        		cstmt.setBytes(28, "0101".getBytes());
        		cstmt.setBytes(29, "0101".getBytes());
        		cstmt.setBytes(30, "0101".getBytes());
        		cstmt.setBytes(31, "0101".getBytes());
        		cstmt.setString(32, dm.file_delyn1);
        		cstmt.setString(33, dm.file_delyn2);
        		cstmt.setString(34, dm.file_delyn3);
        		cstmt.setString(35, dm.file_delyn4);
        		cstmt.setString(36, dm.file_delyn5);
        		cstmt.setString(37, dm.flag);
        		cstmt.registerOutParameter(38, Types.VARCHAR);
        		cstmt.registerOutParameter(39, Types.VARCHAR);
        		cstmt.registerOutParameter(40, Types.VARCHAR);
        		cstmt.registerOutParameter(41, Types.VARCHAR);
        		cstmt.registerOutParameter(42, Types.VARCHAR);
        		cstmt.registerOutParameter(43, Types.VARCHAR);
       		   
               // ����
	    		cstmt.execute();
	    		System.out.println("proc execute!!!");
               // ���
	    		ds = (AD_BRN_2050_ADataSet)dm.createDataSetObject();               
	    		System.out.println("ds result::"+ds);
	    		ds.getValues(cstmt);
               
	    		if(!"".equals(ds.errcode)){
	    			throw new AppException(ds.errcode, ds.errmsg);
	    		}

               // ÷������ ������ ������ �����͸� ����ϰ� �������� ��´�.
               //�Է��� ��
	    		if(dm.getFlag().equals("I")){
	    			c_temp = dm.getCmpy_cd();     	// ȸ���ڵ�(�ӽ�)
	    			r_temp = dm.getRept_clsf();     	// ��������(�ӽ�)
	    			m_temp = dm.getMake_dt();     	// �ۼ�����(�ӽ�)
	    			r_tempSeq = ds.getRept_no();     // ������ȣ(�ӽ�)
	    			a_tempSeq1= ds.getAdd_file_no1(); // ÷�����Ϲ�ȣ(�ӽ�)
	    			a_tempSeq2= ds.getAdd_file_no2(); // ÷�����Ϲ�ȣ(�ӽ�)
                   	a_tempSeq3= ds.getAdd_file_no3(); // ÷�����Ϲ�ȣ(�ӽ�)
                   	a_tempSeq4= ds.getAdd_file_no4(); // ÷�����Ϲ�ȣ(�ӽ�)
                   	a_tempSeq5= ds.getAdd_file_no5(); // ÷�����Ϲ�ȣ(�ӽ�)
	    		}
               //������ ��
	    		else if(dm.getFlag().equals("U")){
	    			c_temp = dm.getCmpy_cd();     	// ȸ���ڵ�(�ӽ�)
	    			r_temp = dm.getRept_clsf();     	// ��������(�ӽ�)
	    			m_temp = dm.getMake_dt();     	// �ۼ�����(�ӽ�)
	    			r_tempSeq = dm.getRept_no();     // ������ȣ(�ӽ�)
	    			if(!"".equals(dm.add_file_no1)){
	    				a_tempSeq1 = dm.getAdd_file_no1(); // ÷�����Ϲ�ȣ(�ӽ�)	   
	    			}else{
	    				a_tempSeq1 = ds.getAdd_file_no1(); // ÷�����Ϲ�ȣ(�ӽ�)
	    			}
	    			if(!"".equals(dm.add_file_no2)){
	    				a_tempSeq2 = dm.getAdd_file_no2(); // ÷�����Ϲ�ȣ(�ӽ�)	   
	    			}else{
	    				a_tempSeq2 = ds.getAdd_file_no2(); // ÷�����Ϲ�ȣ(�ӽ�)
	    			}
	    			if(!"".equals(dm.add_file_no3)){
	    				a_tempSeq3 = dm.getAdd_file_no3(); // ÷�����Ϲ�ȣ(�ӽ�)	   
	    			}else{
                	  	a_tempSeq3 = ds.getAdd_file_no3(); // ÷�����Ϲ�ȣ(�ӽ�)
	    			}
	    			if(!"".equals(dm.add_file_no4)){
	    				a_tempSeq4 = dm.getAdd_file_no4(); // ÷�����Ϲ�ȣ(�ӽ�)	   
	    			}else{
	    				a_tempSeq4 = ds.getAdd_file_no4(); // ÷�����Ϲ�ȣ(�ӽ�)
	    			}
	    			if(!"".equals(dm.add_file_no5)){
	    				a_tempSeq5 = dm.getAdd_file_no5(); // ÷�����Ϲ�ȣ(�ӽ�)	   
	    			}else{
	    				a_tempSeq5 = ds.getAdd_file_no5(); // ÷�����Ϲ�ȣ(�ӽ�)
	    			}
	    		}
               
               	// BLOB ���ϱ�
               	Statement stmt = manager.m_conn.createStatement();
               	System.out.println("Statement!!!");
               	//ù��° ÷������
               	if(dm.add_file1 != null && dm.add_file1.length != 0 && dm.getFile_delyn1().equals("N")){
	               	String blobQuery1 =	"	SELECT 	ADD_FILE " +
		               					"  	FROM 	TAADM_DDREPTFILE " +
		               					" 	WHERE 	CMPY_CD     = '"+c_temp+"' " +
		               					"   AND 	REPT_CLSF   = '"+r_temp+"' " +
		               					"   AND 	MAKE_DT 	= '"+m_temp+"' " +
		               					"   AND 	REPT_NO     = '"+r_tempSeq+"' " +
		               					"   AND 	ADD_FILE_NO = '"+a_tempSeq1+"' " +
		               					"	FOR 	UPDATE";
	               	//System.out.println("blobQuery1::"+blobQuery1);
	               	OracleResultSet rset1 = (OracleResultSet)stmt.executeQuery(blobQuery1);	
	               	System.out.println("Blob query execute!!!"+rset1);
         	
	               	if (rset1.next()) { System.out.println("resin-BLOB-start::"+rset1); 
	               		//weblogic
	                   //weblogic.jdbc.wrapper.Blob weblogic_blob1 = (weblogic.jdbc.wrapper.Blob)rset1.getBlob(1);
	                   //BLOB oracle_blob1 = (BLOB)weblogic_blob1.getVendorObj();
	           	   		//������(ep1)
		       	   		oracle.sql.BLOB oracle_blob1 = (BLOB)rset1.getBlob(1);	
				   		
				   		OutputStream os1 = oracle_blob1.getBinaryOutputStream();
		                for (int i = 0; i < tempCont1.length; i++) {
		                  os1.write(tempCont1[i]);
		                }
		                os1.close();

	               	}
               	}
               	
               	//�ι�° ÷������
               	if(dm.add_file2 != null && dm.add_file2.length != 0 && dm.getFile_delyn2().equals("N")){
	               	String blobQuery2 = "	SELECT 	ADD_FILE " +
	 								   	"  	FROM 	TAADM_DDREPTFILE " +
	 								   	" 	WHERE 	CMPY_CD     = '"+c_temp+"' " +
	 								   	"   AND 	REPT_CLSF   = '"+r_temp+"' " +
	 								   	"   AND 	MAKE_DT 	   = '"+m_temp+"' " +
	 								   	"   AND 	REPT_NO     = '"+r_tempSeq+"' " +
	 								   	"   AND 	ADD_FILE_NO = '"+a_tempSeq2+"' " +
	 								   	"	FOR 		UPDATE";
				   	OracleResultSet rset2 = (OracleResultSet)stmt.executeQuery(blobQuery2);
				   	if (rset2.next()) {             
//				   		weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset2.getBlob(1);
//				   		BLOB oracle_blob2 = (BLOB)weblogic_blob.getVendorObj();
	           	   		//������(ep1)
	           	   		oracle.sql.BLOB oracle_blob2 = (BLOB)rset2.getBlob(1);	
				   		
				   		OutputStream os2 = oracle_blob2.getBinaryOutputStream();
				   		// ���Ϸκ��� �о BLOB �� WRITE �Ѵ�.
				   		for(int i=0; i<tempCont2.length; i++){
				   			os2.write(tempCont2[i]);
				   		}
				   		os2.close();
					}
               	}
			   	
				//����° ÷������
               	if(dm.add_file3 != null && dm.add_file3.length != 0 && dm.getFile_delyn3().equals("N")){
					String blobQuery3 = "	SELECT 	ADD_FILE " +
										"  	FROM 	TAADM_DDREPTFILE " +
										" 	WHERE 	CMPY_CD     = '"+c_temp+"' " +
										"   AND 	REPT_CLSF   = '"+r_temp+"' " +
										"   AND 	MAKE_DT 	= '"+m_temp+"' " +
										"   AND 	REPT_NO     = '"+r_tempSeq+"' " +
										"   AND	 	ADD_FILE_NO = '"+a_tempSeq3+"' " +
										"	FOR 	UPDATE";
					OracleResultSet rset3 = (OracleResultSet)stmt.executeQuery(blobQuery3);
					if (rset3.next()) {             
//						weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset3.getBlob(1);
//						BLOB oracle_blob3 = (BLOB)weblogic_blob.getVendorObj();
	           	   		//������(ep1)
	           	   		oracle.sql.BLOB oracle_blob3 = (BLOB)rset3.getBlob(1);	
						
						OutputStream os3 = oracle_blob3.getBinaryOutputStream();
						// ���Ϸκ��� �о BLOB �� WRITE �Ѵ�.
						for(int i=0; i<tempCont3.length; i++){
						os3.write(tempCont3[i]);
						}
						os3.close();
					}
               	}

               	//�׹�° ÷������
               	if(dm.add_file4 != null && dm.add_file4.length != 0 && dm.getFile_delyn4().equals("N")){
					String blobQuery4 = "	SELECT 	ADD_FILE " +
									  	"  	FROM 	TAADM_DDREPTFILE " +
									  	" 	WHERE 	CMPY_CD     = '"+c_temp+"' " +
									  	"   AND 	REPT_CLSF   = '"+r_temp+"' " +
									  	"   AND 	MAKE_DT 	  = '"+m_temp+"' " +
									  	"   AND 	REPT_NO     = '"+r_tempSeq+"' " +
									  	"   AND 	ADD_FILE_NO = '"+a_tempSeq4+"' " +
									  	"	FOR 	UPDATE";
					OracleResultSet rset4 = (OracleResultSet)stmt.executeQuery(blobQuery4);
					if (rset4.next()) {             
//						weblogic.jdbc.wrapper.Blob weblogic_blob4 = (weblogic.jdbc.wrapper.Blob)rset4.getBlob(1);
//						BLOB oracle_blob4 = (BLOB)weblogic_blob4.getVendorObj();
	           	   		//������(ep1)
	           	   		oracle.sql.BLOB oracle_blob4 = (BLOB)rset4.getBlob(1);	
						
						OutputStream os4 = oracle_blob4.getBinaryOutputStream();
						// ���Ϸκ��� �о BLOB �� WRITE �Ѵ�.
						for(int i=0; i<tempCont4.length; i++){
						os4.write(tempCont4[i]);
						}
						os4.close();
					}
               	}

               	//�ټ���° ÷������
               	if(dm.add_file5 != null && dm.add_file5.length != 0 && dm.getFile_delyn5().equals("N")){
					String blobQuery5 =	"	SELECT 	ADD_FILE " +
									  	"  	FROM 	TAADM_DDREPTFILE " +
									  	" 	WHERE 	CMPY_CD     = '"+c_temp+"' " +
									  	"   AND		REPT_CLSF   = '"+r_temp+"' " +
									  	"   AND 	MAKE_DT 	  = '"+m_temp+"' " +
									  	"   AND 	REPT_NO     = '"+r_tempSeq+"' " +
									  	"   AND 	ADD_FILE_NO = '"+a_tempSeq5+"' " +
									  	"	FOR 	UPDATE";
					OracleResultSet rset5 = (OracleResultSet)stmt.executeQuery(blobQuery5);
					if (rset5.next()) {             
//						weblogic.jdbc.wrapper.Blob weblogic_blob5 = (weblogic.jdbc.wrapper.Blob)rset5.getBlob(1);
//						BLOB oracle_blob5 = (BLOB)weblogic_blob5.getVendorObj();
	           	   		//������(ep1)
	           	   		oracle.sql.BLOB oracle_blob5 = (BLOB)rset5.getBlob(1);	
						
						OutputStream os5 = oracle_blob5.getBinaryOutputStream();
						// ���Ϸκ��� �о BLOB �� WRITE �Ѵ�.
						for(int i=0; i<tempCont5.length; i++){
						os5.write(tempCont5[i]);
						}
						os5.close();
					}
               	}    
				manager.m_conn.commit();
				manager.m_conn.setAutoCommit(true);               	
               stmt.close();
               manager.disConnection();
               //System.out.println("java end!!!!");
           } catch (Exception e) {
        	   try{
        		   manager.m_conn.rollback();
        	   }catch(SQLException se){
        		   throw new SysException(se);
        	   }
            manager.disConnection();
            throw new SysException(e);
           }
        }else{        	
        	DBManager manager = new DBManager("MISADV");
        	ds = (AD_BRN_2050_ADataSet) manager.executeCall(dm);
        	if(!"".equals(ds.errcode)){
        		throw new AppException(ds.errcode, ds.errmsg);
        	}
        }
        return ds;
    }	
	
    /**
     * ���Ϻ������ ��������
     * @param  AD_BRN_2055_ADM
     * @return AD_BRN_2055_ADataSet
     */
	public AD_BRN_2055_ADataSet ad_brn_2055_a(AD_BRN_2055_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
		AD_BRN_2055_ADataSet ds = (AD_BRN_2055_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �߱����� �Է�, ����, ����
     * @param  AD_BRN_2090_ADM
     * @return AD_BRN_2090_ADataSet
     */
	public AD_BRN_2090_ADataSet ad_brn_2090_a(AD_BRN_2090_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
		AD_BRN_2090_ADataSet ds = (AD_BRN_2090_ADataSet) manager.executeCall(dm);		
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}