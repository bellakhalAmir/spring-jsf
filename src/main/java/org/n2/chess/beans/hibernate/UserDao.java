/*******************************************************************************
 * Copyright (c) 2011 Daniel Murygin.
 *
 * This program is free software: you can redistribute it and/or 
 * modify it under the terms of the GNU Lesser General Public License 
 * as published by the Free Software Foundation, either version 3 
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,    
 * but WITHOUT ANY WARRANTY; without even the implied warranty 
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. 
 * If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors:
 *     Daniel Murygin <dm[at]sernet[dot]de> - initial API and implementation
 ******************************************************************************/
package org.n2.chess.beans.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * @author Daniel Murygin <dm[at]sernet[dot]de>
 *
 */
@Repository("userDao")
public class UserDao extends CustomHibernateDaoSupport implements IUserDao {

    /* (non-Javadoc)
     * @see org.n2.chess.beans.hibernate.IUserDao#save(org.n2.chess.beans.hibernate.User)
     */
    @Override
    public void save(User user) {
        getHibernateTemplate().save(user);
    }

    /* (non-Javadoc)
     * @see org.n2.chess.beans.hibernate.IUserDao#update(org.n2.chess.beans.hibernate.User)
     */
    @Override
    public void update(User user) {
        getHibernateTemplate().update(user);
    }

    /* (non-Javadoc)
     * @see org.n2.chess.beans.hibernate.IUserDao#delete(org.n2.chess.beans.hibernate.User)
     */
    @Override
    public void delete(User user) {
        getHibernateTemplate().delete(user);
    }

    /* (non-Javadoc)
     * @see org.n2.chess.beans.hibernate.IUserDao#findByStockCode(java.lang.String)
     */
    @Override
    public User findByStockCode(String userCode) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.n2.chess.beans.hibernate.IUserDao#findAll()
     */
    @Override
    public List<User> loadAll() {
        return getHibernateTemplate().loadAll(User.class);
    }

}
