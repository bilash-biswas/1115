#include<stdio.h>
int main()
{
    int x,y;
    bilash:
    scanf("%d %d",&x,&y);
    if(x!=0 && y!=0)
    {
        if(x>0 && y>0)
        {
            printf("primeiro\n");
        }
        if(x>0 && y<0)
        {
            printf("quarto\n");
        }if(x<0 && y>0)
        {
            printf("segundo\n");
        }if(x<0 && y<0)
        {
            printf("terceiro\n");
        }
        goto bilash;
    }

    return 0;
}
