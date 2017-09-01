package br.cefetmg.games.collision;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

/**
 * Utilitário para verificação de colisão.
 *
 * @author fegemo <coutinho@decom.cefetmg.br>
 */
public class Collision {

    /**
     * Verifica se dois círculos em 2D estão colidindo.
     * @param c1 círculo 1
     * @param c2 círculo 2
     * @return true se há colisão ou false, do contrário.
     */
    public static final boolean circlesOverlap(Circle c1, Circle c2) {
        Vector2 v1 = new Vector2(c1.x,c1.y); 
        Vector2 v2 = new Vector2(c2.x,c2.y); 
        
        return v1.dst2(v2) < (c1.radius+c2.radius)*(c1.radius+c2.radius);
    }

    /**
     * Verifica se dois retângulos em 2D estão colidindo.
     * Esta função pode verificar se o eixo X dos dois objetos está colidindo
     * e então se o mesmo ocorre com o eixo Y.
     * @param r1 retângulo 1
     * @param r2 retângulo 2
     * @return true se há colisão ou false, do contrário.
     */
    public static final boolean rectsOverlap(Rectangle r1, Rectangle r2) {
        Vector3 v3 = new Vector3(r1.x,r1.y,0); 
        Vector3 v4 = new Vector3(r2.x,r2.y,0); 
        return (v3.x+r1.width) >= (v4.x) & (v3.x) <= (v4.x+r2.width) & (v3.y+r1.height) >= (v4.y) & (v3.y) <= (v4.y+r2.height);
            
    }
}
