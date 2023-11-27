package com.knot.customer.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.ThreadLocalRandom;

import com.knot.customer.dbutil.DBConnection;
import com.knot.customer.inter.Customer_Inter;
import com.knot.customer.model.Address;
import com.knot.customer.model.Customer;

public class Customer_Service_Impl implements Customer_Inter{
	
	Customer cust = new Customer();
	int Cust_Id = ThreadLocalRandom.current().nextInt(); 
	static int execute;
	static boolean b;
	Address add = new Address();
	@Override
	public String insertCustomerDetails(Customer cust) {
		Connection con = DBConnection.DBconn();
		PreparedStatement pst = null;
	
	 	
		try {
			pst = con.prepareStatement("insert into Customer values(?,?,?,?,?,?,?,?)");
			pst.setInt(1, Math.abs(Cust_Id));
			pst.setString(2,cust.getFirstName());
			pst.setString(3, cust.getLastName());
			pst.setString(4, cust.getdOB());
			pst.setString(5, cust.getTitle());
			pst.setString(6, cust.getMarital_Status());
			pst.setString(7, cust.getOccupation());
			pst.setString(8, cust.getGender());
			execute = pst.executeUpdate();
			con.close();
			pst.close();
			} catch (SQLException e) {
			 e.printStackTrace();
		}
		finally {
		    
		    if (pst != null) {
		        try {
		            pst.close();
		        } catch (SQLException e) { /* Ignored */}
		    }
		    if (con!= null) {
		        try {
		            con.close();
		        } catch (SQLException e) { /* Ignored */}
		    }
		if(execute<1) {
			return "An Exception Occured Customer Details  are Not Inserted";
		}
		}
		
		
		return "Your Customer Id = "+Math.abs(Cust_Id);
	}
	
		@Override
		public Customer getCustomerById(String id) {
			Connection con = DBConnection.DBconn();
			PreparedStatement pst = null;
			ResultSet res;
			try {
				pst = con.prepareStatement("select * from Customer where Customer_id = ?");
				pst.setString(1, id);
				res = pst.executeQuery();
				while (res.next()) {{
					cust.setCustomerId(res.getString("Customer_Id"));
					cust.setFirstName(res.getString("firstName"));
					cust.setLastName(res.getString("lastName"));
					cust.setdOB(res.getString("dOB"));
					cust.setTitle(res.getString("title"));
					cust.setMarital_Status(res.getString("marital_Status"));
					cust.setOccupation(res.getString("occupation"));
					cust.setGender(res.getString("gender"));
				}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
			    
			    if (pst != null) {
			        try {
			            pst.close();
			        } catch (SQLException e) { /* Ignored */}
			    }
			    if (con!= null) {
			        try {
			            con.close();
			        } catch (SQLException e) { /* Ignored */}
			    }
			}
			return cust;
		}
		@Override
		public String insertCustomerAddress(Address add) {
			int Add_Id = ThreadLocalRandom.current().nextInt(); 
			Connection con = DBConnection.DBconn();
			PreparedStatement pst = null;
			try {
				
				//ResultSet res;
				pst = con.prepareStatement("insert into Customer_Address  values(?,?,?,?,?,?,?,?)");
			 	pst.setInt(1, Math.abs(Add_Id));
				pst.setString(2, add.getLine1());
				pst.setString(3, add.getLine2());
				pst.setString(4, add.getStreet());
				pst.setString(5, add.getCity());
				pst.setString(6, add.getState());
				pst.setString(7, add.getZip_Code());
				pst.setString(8, add.getCustomerId());
				 execute =pst.executeUpdate();
				
				} catch (SQLException e) {
				 e.printStackTrace();
			}
			finally {
			    
			    if (pst != null) {
			        try {
			            pst.close();
			        } catch (SQLException e) {System.out.println("Pst in Insert Address");}
			    }
			    if (con!= null) {
			        try {
			            con.close();
			        } catch (SQLException e) { /* Ignored */}
			    }
			}
			if(execute<1) {
				System.out.println("Exception");
				return "Please Check the Customer_Id Address Details are Not Inserted  ";
			}
			return "Your Address Id = "+Math.abs(Add_Id);
			
		}
		@Override
		public Address getAddressDetailsById(String id) {
			Connection con = DBConnection.DBconn();
			PreparedStatement pst = null;
			ResultSet res;
			try {
				
				pst = con.prepareStatement("Select  * from Customer_Address where Address_id  = ?");
				pst.setString(1, id);
				res = pst.executeQuery();
				while(res.next()) {
					add.setAddress_Id(res.getString("Address_id"));
					add.setLine1(res.getString("line1"));
					add.setLine2(res.getString("line2"));
					add.setStreet(res.getString("street"));
					add.setCity(res.getString("city"));
					add.setState(res.getString("state"));
					add.setZip_Code(res.getString("zip_Code"));
					con.close();
					pst.close();
					res.close();
				//	Address_id , line1 ,  line2 ,  street ,  city ,  state ,  zip_Code
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
			    
			    if (pst != null) {
			        try {
			            pst.close();
			        } catch (SQLException e) {}
			    }
			    if (con!= null) {
			        try {
			            con.close();
			        } catch (SQLException e) { /* Ignored */}
			    }
			}
			return add;
		}

		@Override
		public Customer getCustomerByIdWithDelay(String id) {

			Connection con = DBConnection.DBconn();
			PreparedStatement pst = null;
			ResultSet res;
			try {
				pst = con.prepareStatement("select * from Customer where Customer_id = ?");
				pst.setString(1, id);
				res = pst.executeQuery();
				while (res.next()) {{
					cust.setCustomerId(res.getString("Customer_Id"));
					cust.setFirstName(res.getString("firstName"));
					cust.setLastName(res.getString("lastName"));
					cust.setdOB(res.getString("dOB"));
					cust.setTitle(res.getString("title"));
					cust.setMarital_Status(res.getString("marital_Status"));
					cust.setOccupation(res.getString("occupation"));
					cust.setGender(res.getString("gender"));
				}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
			    
			    if (pst != null) {
			        try {
			            pst.close();
			        } catch (SQLException e) { /* Ignored */}
			    }
			    if (con!= null) {
			        try {
			            con.close();
			        } catch (SQLException e) { /* Ignored */}
			    }
			}
			
			try {
				Thread.sleep(5000);
				System.out.println("Thread Executed");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			if(!b) {
				System.out.println("The Customer with this Customer-Id is Not Available");
			}
			return cust;
			
		}
//		@Override
//		public List<Customer> getAllCustomer() {
//		
//			try {
//				pst = con.prepareStatement("select * from Customer");
//				res = pst.executeQuery();
//				while (res.next()) {{
//					cust.setCustomerId(res.getString("customer_id"));
//					cust.setFirstName(res.getString("firstName"));
//					cust.setLastName(res.getString("lastName"));
//					cust.setdOB(res.getString("dOB"));
//					cust.setTitle(res.getString("title"));
//					cust.setMarital_Status(res.getString("marital_Status"));
//					cust.setOccupation(res.getString("occupation"));
//					cust.setGender(res.getString("gender"));
//					lst.add(cust);
//				}
//				}
//			} catch (SQLException e) {
//				
//				e.printStackTrace();
//			}
//			
//			return lst;
//		}
	}


